/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Gramatica.Gramatica;
import com.udenar.compiladores.Gramatica.Simbolos;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import com.udenar.compiladores.Gramatica.T;
import java.util.ArrayList;


/**
 *
 * @author Diego EG
 */
public class Main {

   
    private static StringBuilder marca = new StringBuilder("");
    private final static String PROGRMA = "begin int a=5; write(l); end $";
    private static String JS = "";
    private static ArrayList<String> LEXEMAS = new ArrayList();
    private  static ArrayList<String> TERMINALES = T.getCONJUNTO_DE_TERMINALES();
    private static ArrayList<String> VARIABLES = T.getCONJUNTO_DE_VARIABLES();
    private static ArrayList<String> NUMEROS = T.getCONJUNTO_DE_NUMEROS();
   //DEBE SER ESTE ORDEN PORQUE SINO SE ALYERAN LOS TAMANIOS VER LOS SIZES
    
    
    public static void main(String[] args) throws ScriptException   {
        // TODO code application logic here
        
        
        Gramatica compilador = new Compilador("compilador");
        System.out.println("Producciones "+compilador);
        Funciones f = new Funciones(compilador);
        
        int indiceR = 0;
        //System.out.println("TAM "+TERMINALES.size());
        
        
        
        for ( indiceR = 0; indiceR < PROGRMA.length(); indiceR++) {
            /*
                Relaizando el reonocimiento de los lexemas con un StringBuilder 
                y una cadena para ir evaluando lo que se va leyendo 
            */
            marca.append(PROGRMA.charAt(indiceR));
            String ca = new String(marca);
            
            //Se evalua si lo que se esta leyendo pertenece a los lexemas  && PROGRMA.charAt(indiceR+1) == ' ' 
            for (String lex : TERMINALES) {
                if((lex.equals(ca.trim()) ) ){
                    
                    
                   
                        //System.out.println(" hit "+marca);
                        if(ca.equals(" ")){
                            System.out.println("YES");
                        }
                    LEXEMAS.add(ca.trim());
                    marca = marca.delete(0, marca.length());
                    
                    
                    
                    
                     
                }
            }
            /*
            if(TERMINALES.contains(ca.trim())  && PROGRMA.charAt(indiceR+1)!= ' ' && PROGRMA.charAt(indiceR+1)!= '$'){
                //De ser asi se imprime y aqui es donde se eimplementa la maquina de pila
                System.out.println(" hit "+marca);
                LEXEMAS.add(ca.trim());
                
                
              marca = marca.delete(0, marca.length());
            }
            */
            
        }
        
        //limpiando los espacios de los lexemas
        System.out.println("LEXEMAS "+LEXEMAS.size());
        for (int a=0; a<LEXEMAS.size();a++ ) {
        
        String k = LEXEMAS.get(a);
        
            
             System.out.println("LEX "+k );
        }
        
        
        
        //Implementando la maquina de pila con los lexemas identificados en ese orden
        
        for(int i = 0; i<LEXEMAS.size();){
            
            String lexema = LEXEMAS.get(i).trim();
            
            String topePila = f.top().toString();
            
                switch(topePila){
                    case "<INICIO>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            case "begin":
                                
                                f.funcion(23);
                                break;
                            default :
                                break;
                        }
                        break;
                        
                    case "<PROGRAM>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            case "begin":
                                f.funcion(1);
                                i++;
                                break;
                            default :
                                break;
                        }
                        break;
                    case "<STATEMENT LIST>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            case "int":
                                f.funcion(3);
                                //i++;
                                break;
                            case "ID": //OJO
                                f.funcion(3);
                                //i++;
                                break;
                           
                            default :
                                break;
                        }
                        break;
                        
                        
                        case "<STATEMENT>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            case "int":
                                f.funcion(6); 
                                JS += "var ";
                                i++;
                                break;
                                
                            case "write":
                                f.funcion(8); 
                                JS += "print ";
                                i++;
                                break;
                            case "ID": //OJO
                                f.funcion(3);
                                //i++;
                                break;
                            
                            default :
                                break;
                        }
                        break;
                        
                        
                        case "<EXPR LIST>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        if(VARIABLES.contains(lexema)){
                            f.funcion(12);
                        }
                        
                        
                        
                        
                        
                        
                         case "(" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            case "(":
                                f.pop();
                                JS += "( ";
                                i++;
                                break;
                           
                            default :
                                break;
                        }
                        break;
                        
                        case "<STATEMENT TAIL>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                            //  System.out.println("HERE");
                        switch(lexema){
                            
                            case "write":
                                f.funcion(3);
                                break;
                            case "end":
                                f.pop(); 
                                //i++;
                                break;
                            case "$":
                                f.pop(); 
                                //i++;
                                break;
                           
                            
                            default :
                                break;
                        }
                        break;
                        
                        
                        case "write" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            
                            case "write" : //PARA CUALQUIER VALOR QUE TENGA ID
                                f.pop();
                                //JS+= "print";
                                i++;
                                break;
                        }
                        break;
                        
                        case "<ID TAIL>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        if(lexema == ","){
                            f.funcion(10);
                        }else 
                            if(VARIABLES.contains(lexema)){
                            f.pop();
                            
                        }else if(lexema == ")"){
                            f.pop();
                            i++;
                        }
                        
                            
                        break;
                        
                        case "<ID>" :
                        
                            System.out.println("\tIdentifica ID "+lexema);

                            if(VARIABLES.contains(lexema)){
                                f.pop();
                                System.out.println("HAY LETRA");
                                    JS+= " "+lexema;
                                    i++;
                            }else
                                if(NUMEROS.contains(lexema)){
                                    f.pop();
                                    JS+= " "+lexema;
                                    i++;
                            }

                        break;
                        
                        
                        case "=" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        //i++;
                        switch(lexema){
                            
                            case "=": //IDENTIFICA = 
                                f.pop();
                                JS+= " = ";
                                i++;
                                break;
                                
                            default : 
                                
                                break;
                        }
                        break;
                        
                        
                        case ")" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            
                            case ")": //IDENTIFICA = 
                                f.pop();
                                JS+= " ) ";
                                i++;
                                break;
                                
                            default : 
                                
                                break;
                        }
                        break;
                        
                         case "<EXPRESSION>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        
                        if(VARIABLES.contains(lexema)){
                            f.funcion(15);
                                //JS+= " "+lexema;
                                //i++;
                        }else
                            if(NUMEROS.contains(lexema)){
                                
                                f.funcion(15);
                                JS += ""+lexema;
                        }
                        
                        
                       
                        break;
                        
                        
                        case "<EXPR TAIL>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            
                            case ",": //VARIABLE IDENTIFICADA 
                                f.funcion(13);
                                //i++;
                                break;
                            case ")": //VARIABLE IDENTIFICADA 
                                f.pop();
                                
                               //i++;
                                break;
                            default :
                                //f.funcion(15);
                                break;
                        }
                        break;
                        
                        case "<PRIMARY>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        if(VARIABLES.contains(lexema)){
                            //IDENTOFICACION DE 
                            f.funcion(19);
                        }else if(NUMEROS.contains(lexema)){
                            f.pop();
                                
                                i++;
                        }else
                        
                        {
                            switch(lexema){
                            
                            case "(": 
                                f.funcion(18);
                                //i++;
                                break;
                                
                            case ";": 
                                f.pop();
                                //i++;
                                break;
                                
                            
                            
                            default :
                                //f.funcion(15);
                                break;
                        }
                        }
                        
                        
                        
                        break;
                        
                        case "<PRIMARY TAIL>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        if( NUMEROS.contains(lexema)){
                            f.pop();
                        }
                        
                        switch(lexema){
                            
                            case ";": 
                                f.pop();
                                //i++;
                                break;
                                
                            case ")": 
                                f.pop();
                                //i++;
                                break;
                                
                            
                             
                            case "(": 
                                f.funcion(18);
                                //i++;
                                break;
                                
                            case "+": 
                                f.funcion(16);
                                i++;
                                break;
                                
                            case "-": 
                                f.funcion(16);
                                i++;
                                break;
                            
                            case "*": 
                                f.funcion(16);
                                i++;
                                break;
                                
                            case "/": 
                                f.funcion(16);
                                i++;
                                break;
                                
                            default :
                                
                                break;
                        }
                        break;
                        
                        
                        case ";" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            
                            case ";": 
                                f.pop();
                                i++;
                                JS+= ";";
                                break;
                                
                            
                            default :
                                break;
                        }
                        break;
                        
                        
                        case "end" :
                        
                        System.out.println("\tIdentifica "+lexema);
                            
                        switch(lexema){
                            
                            case "end": 
                                f.pop();
                                i++;
                                break;
                             case "$": 
                                f.pop();
                                //i++;
                                break;   
                            
                            default :
                                break;
                        }
                        break;
                        
                        case "$" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                            switch(lexema){

                                case "$": 
                                    f.pop();
                                    //i++;
                                    break;



                                default :
                                    break;
                            }
                        break;
                        
                      
                        
                        case "<VACIA>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            
                            case "$": 
                                f.pop();
                                i++;
                                System.out.println("SIN ERRORES DE CODIGO "+JS );
                                
                                ScriptEngineManager factory = new ScriptEngineManager();
                                ScriptEngine engine = factory.getEngineByName("JavaScript");
                                //engine.eval("  var f = 6; var y =9;  for(i = 0; i<5; i++){ print(i) } print(f+y); ");
                                engine.eval(JS);
                                break;
                                
                            
                            default :
                                break;
                        }
                        break;
                        
                     default :
                         System.out.println("DEFAULT ");
                         //i++;
                        break;
                        
                    
                }
        }
        
    }
   
}
