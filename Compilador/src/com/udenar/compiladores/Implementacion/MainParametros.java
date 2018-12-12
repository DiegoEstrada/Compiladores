/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Gramatica.Gramatica;
import com.udenar.compiladores.Gramatica.T;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Diego EG
 */
public class MainParametros {
   
    
    public static void main(String[] args) throws ScriptException   {
        

        Traduccion objeto= new Traduccion();
        String PROGRMA= objeto.getFuente(args[0]);
        String JS = "";
        ArrayList<String> LEXEMAS = new ArrayList();
        ArrayList<String> TERMINALES = T.getCONJUNTO_DE_TERMINALES();
        ArrayList<String> VARIABLES = T.getCONJUNTO_DE_VARIABLES();
        ArrayList<String> NUMEROS = T.getCONJUNTO_DE_NUMEROS();
        
        Gramatica compilador = new Compilador("compilador");
        System.out.println("Producciones "+compilador);
        Funciones f = new Funciones(compilador);
        
        int indiceR = 0;
        String leyendo = "";
        final char BLANCO = ' ';
        final char IGUAL = '=';
        final char PCERRADO = ')';
        final char PABIERTO = '(';
        final char PCOMA = ';';
        
        
        for ( indiceR = 0; indiceR < PROGRMA.length();) {
            
            leyendo+=PROGRMA.charAt(indiceR);
            
            for (String lex : TERMINALES) {
                
                if((lex.equals(leyendo.trim()) ) ){
                    LEXEMAS.add(leyendo.trim());
                    
                    if(leyendo.trim().equals("int")){
                        indiceR = indiceR+1;
                        
                        String variable = "";
                        
                        while(PROGRMA.charAt(indiceR) == BLANCO){
                            indiceR = indiceR+1;
                        }
                        
                        //System.out.println("COMENZAMOS CON "+PROGRMA.charAt(indiceR));
                        variable+= PROGRMA.charAt(indiceR);
                        
                       if( PROGRMA.charAt(indiceR+1) == IGUAL){
                           
                       }else{
                            indiceR = indiceR+1;
                            while(PROGRMA.charAt(indiceR) != BLANCO && PROGRMA.charAt(indiceR) != IGUAL){
                            //System.out.println("SI");
                            variable+= PROGRMA.charAt(indiceR);
                            indiceR = indiceR+1;
                            }
                       }
                       
                        
                        //System.out.println("TERMINALEMOS CON "+PROGRMA.charAt(indiceR));
                        if(variable.length()!=1){
                            indiceR = indiceR - 1;
                        }
                        
                        LEXEMAS.add(variable);
                        
                        leyendo="";
                        
                    }else if(leyendo.trim().equals("=")){ //IDENRIFICANDO VARIABLES O NUMEROS 
                        
                        
                        String numeroOvariable = "";
                        indiceR = indiceR + 1;
                        
                        
                        
                        
                        numeroOvariable+= PROGRMA.charAt(indiceR);

                        indiceR = indiceR + 1;
                        while(PROGRMA.charAt(indiceR) != BLANCO && PROGRMA.charAt(indiceR)!= PCOMA && !TERMINALES.contains(""+PROGRMA.charAt(indiceR))){
                            numeroOvariable+= PROGRMA.charAt(indiceR);
                            indiceR = indiceR+1;
                            
                        }
                        //System.out.println("TERMINO con "+PROGRMA.charAt(indiceR));
                        //System.out.println("NUMERO O VARIANLE "+numeroOvariable);
                        indiceR = indiceR - 1;
                        LEXEMAS.add(numeroOvariable.trim());
                        
                        leyendo="";
                        
                    }else if(leyendo.trim().equals("+")){ // IDENTIFICANDO EL NUMERO O LA VARIABLE DESPUES DEL SIGNO MAS
                        String numeroOvariable = "";
                        indiceR = indiceR + 1;
                        //System.out.println("Iniciando con "+PROGRMA.charAt(indiceR));
                        numeroOvariable+= PROGRMA.charAt(indiceR);

                        indiceR = indiceR + 1;
                        while(PROGRMA.charAt(indiceR) != BLANCO && PROGRMA.charAt(indiceR)!= PCOMA && !TERMINALES.contains(""+PROGRMA.charAt(indiceR))){
                            numeroOvariable+= PROGRMA.charAt(indiceR);
                            indiceR = indiceR+1;
                            
                        }
                        //System.out.println("TERMINO con "+PROGRMA.charAt(indiceR));
                        //System.out.println("NUMERO O VARIANLE "+numeroOvariable);
                        indiceR = indiceR - 1;
                        LEXEMAS.add(numeroOvariable.trim());
                        
                        leyendo="";
                        
                    }else if(leyendo.trim().equals("-")){ // IDENTIFICANDO EL NUMERO O VARIABLE DESPUES DE -
                        String numeroOvariable = "";
                        indiceR = indiceR + 1;
                        //System.out.println("Iniciando con "+PROGRMA.charAt(indiceR));
                        numeroOvariable+= PROGRMA.charAt(indiceR);

                        indiceR = indiceR + 1;
                        while(PROGRMA.charAt(indiceR) != BLANCO && PROGRMA.charAt(indiceR)!= PCOMA && !TERMINALES.contains(""+PROGRMA.charAt(indiceR))){
                            numeroOvariable+= PROGRMA.charAt(indiceR);
                            indiceR = indiceR+1;
                            
                        }
                        //System.out.println("TERMINO con "+PROGRMA.charAt(indiceR));
                        //System.out.println("NUMERO O VARIANLE "+numeroOvariable);
                        indiceR = indiceR - 1;
                        LEXEMAS.add(numeroOvariable.trim());
                        
                        leyendo="";
                        
                    }else if(leyendo.trim().equals("*")){ // IDENTIFICANDO LA VARIABLE O NUMERO DESPUES DE  *
                        String numeroOvariable = "";
                        indiceR = indiceR + 1;
                        //System.out.println("Iniciando con "+PROGRMA.charAt(indiceR));
                        numeroOvariable+= PROGRMA.charAt(indiceR);

                        indiceR = indiceR + 1;
                        while(PROGRMA.charAt(indiceR) != BLANCO && PROGRMA.charAt(indiceR)!= PCOMA && !TERMINALES.contains(""+PROGRMA.charAt(indiceR))){
                            numeroOvariable+= PROGRMA.charAt(indiceR);
                            indiceR = indiceR+1;
                            
                        }
                        //System.out.println("TERMINO con "+PROGRMA.charAt(indiceR));
                        //System.out.println("NUMERO O VARIANLE "+numeroOvariable);
                        indiceR = indiceR - 1;
                        LEXEMAS.add(numeroOvariable.trim());
                        leyendo="";
                        
                    }else if(leyendo.trim().equals("/")){ // IDENTIFICANDO LOS PARAMETROS DE ( ) LOS PARENTESIS
                         String numeroOvariable = "";
                        indiceR = indiceR + 1;
                        //System.out.println("Iniciando con "+PROGRMA.charAt(indiceR));
                        numeroOvariable+= PROGRMA.charAt(indiceR);

                        indiceR = indiceR + 1;
                        while(PROGRMA.charAt(indiceR) != BLANCO && PROGRMA.charAt(indiceR)!= PCOMA && !TERMINALES.contains(""+PROGRMA.charAt(indiceR))){
                            numeroOvariable+= PROGRMA.charAt(indiceR);
                            indiceR = indiceR+1;
                            
                        }
                        //System.out.println("TERMINO con "+PROGRMA.charAt(indiceR));
                        //System.out.println("NUMERO O VARIANLE "+numeroOvariable);
                        indiceR = indiceR - 1;
                        LEXEMAS.add(numeroOvariable.trim());
                        
                        leyendo="";
                        
                    }else if(leyendo.trim().equals("(")){ // IDENTIFICANDO LOS PARAMETROS DE ( ) LOS PARENTESIS
                        String id = "";
                        indiceR = indiceR+1;
                        //System.out.println("Se comienza con "+ PROGRMA.charAt(indiceR));
                        while(PROGRMA.charAt(indiceR) != PCERRADO){
                            id+= PROGRMA.charAt(indiceR);
                            indiceR = indiceR + 1;
                        }
                        indiceR = indiceR - 1;
                        //System.out.println("IDENTIFICADO "+id);
                        LEXEMAS.add(id);
                        leyendo="";
                    }
                    
                    leyendo = ""; 
                     
                }
            }
            indiceR++;
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
                                
                                f.funcion(25);
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
                                f.funcion(2);
                                //i++;
                                break;
                            case "read":
                                f.funcion(2);
                                //i++;
                                break;
                            case "write":
                                f.funcion(2);
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
                                
                            case "read":
                                f.funcion(7); 
                                JS += " "; //AUN NO IMPLEMENTADA
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
                            case "read":
                                f.funcion(3);
                                break;
                                
                            case "int":
                                f.funcion(3);
                                break;
                                
                            case "end":
                                f.pop(); 
                                //i++;
                                break;

                            default :
                                break;
                        }
                        break;
                        
                        case "<EXPRESSION>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        
                        if(VARIABLES.contains(lexema)){
                            f.funcion(15);
                                
                        }else
                            if(NUMEROS.contains(lexema)){
                                f.funcion(15);
                                
                        } else if(lexema.equals("(")){
                            f.funcion(15);
                        }
                        
                        break;
                        
                        case "<ID LIST>":
                            
                        System.out.println("\tIdentifica "+lexema);
                        
                            if(VARIABLES.contains(lexema)){
                                f.funcion(9);
                                
                            }
                            
                        break;
                        
                        case "<EXPR LIST>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        if(VARIABLES.contains(lexema)){
                            f.funcion(12);
                        }else
                            if(NUMEROS.contains(lexema)){
                                f.funcion(12);
                            }else 
                                if(lexema.equals("(")){
                                f.funcion(12);
                            }
                        
                        break;

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
                        
                        if(lexema.equals(",")){
                            f.funcion(10);
                        }
                            else if(lexema.equals(")")){
                            f.pop();
                            i++;
                        }
                        
                            
                        break;
                        
                        case "<ID>" :
                        
                            System.out.println("\tIdentifica ID "+lexema);

                            if(VARIABLES.contains(lexema)){
                                f.pop();
                                //System.out.println("HAY LETRA");
                                    JS+= " "+lexema;
                                    i++;
                            }
                                //i++;
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
                        
                         
                        
                        
                        case "<EXPR TAIL>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        switch(lexema){
                            
                            case ",": 
                                f.funcion(13);

                                break;
                            case ")": 
                                f.pop();
                                
                                break;
                            default :
                                //f.funcion(15);
                                break;
                        }
                        break;
                        
                        case "<INTLITERAL>" :
                        
                        System.out.println("\tIdentifica NUM "+lexema);
                        
                        if(NUMEROS.contains(lexema)){
                                f.pop();
                                //System.out.println("HAY NUMERO");
                                    JS+= " "+lexema;
                                    i++;
                            }
                        
                        break;
                        
                        case "<PRIMARY>" :
                        
                        System.out.println("\tIdentifica "+lexema);
                        
                        if(VARIABLES.contains(lexema)){
                            f.funcion(19);
                        }else if(NUMEROS.contains(lexema)){
                            f.funcion(20);

                        }else
                        
                        {
                            switch(lexema){
                            
                            case "(": 
                                f.funcion(18);
                                //i++;
                                break;
                                

                            default :
                               
                                break;
                            }
                        }

                        break;
                        
                        case "<PRIMARY TAIL>" :
                        
                        System.out.println("\tIdentifica "+lexema);

                        switch(lexema){
                            
                            case ";": 
                                f.pop();

                                break;
                             
                            case ",": 
                                f.pop();

                                break;
                                
                            case ")": 
                                f.pop();
                                break;

                            case "+": 
                                f.funcion(16);
                                //i++;
                                break;
                                
                            case "-": 
                                f.funcion(16);
                                //i++;
                                break;
                            
                            case "*": 
                                f.funcion(16);
                                //i++;
                                break;
                                
                            case "/": 
                                f.funcion(16);
                                //i++;
                                break;
                                
                            default :
                                
                                break;
                        }
                        break;
                        
                        case "<OP>":
                            System.out.println("\tIdentifica "+lexema);
                            
                            switch(lexema){
                                case "+":
                                    f.pop();
                                    i++;
                                    JS += "+";
                                 break;
                                    
                                 case "-":
                                    f.pop();
                                    i++;
                                    JS += "-";
                                 break;
                                
                                 case "*":
                                    f.pop();
                                    i++;
                                    JS += "*";
                                 break;
                                
                                 case "/":
                                    f.pop();
                                    i++;
                                    JS += "/";
                                 break;
                                 
                                 default:
                                     
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
                                objeto.setTraduccion("salida.js",JS);
                                ScriptEngineManager factory = new ScriptEngineManager();
                                ScriptEngine engine = factory.getEngineByName("JavaScript");
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
