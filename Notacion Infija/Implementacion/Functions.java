package com.udenar.compiladores.Implementacion;

import com.fathzer.soft.javaluator.DoubleEvaluator;
import com.udenar.compiladores.Prefija.Contenido;
import com.udenar.compiladores.Prefija.Gramatica;
import com.udenar.compiladores.Prefija.NT;
import com.udenar.compiladores.Prefija.Produccion;
import java.util.ArrayList;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 *
 * @author Diego EG
 */
public  class Functions {
    
 
    private Pila pila;
    private final Gramatica g;
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    
    public Functions(Gramatica g ){
        this.g = g;
        this.pila = new Pila();
        this.pila.push(new Contenido(new NT("VACIA")));
        this.pila.push(new Contenido(new NT("S")));
    }
    
    public Pila funcion(int numeroProduccion){
        
        
        Produccion p = this.g.getProduccion(numeroProduccion);
        ArrayList<Contenido> c = p.getContenido();
        System.out.println("Aplicando produccion "+numeroProduccion+
                " =  "+p);
        /* 
            Revisar que el primer elemento de la produccion no se Terminal
            Y si es terminal, borrarlo para realizar el remplace
        */
         /*
            En un futuro aqui podria haber excepciones lanzadas cuando se maneje
            con la cadena vacia r
        */
         
         Contenido inicial = c.get(0);
         
         if(inicial.getTerminal()!= null){
             c.remove(0);
         }
         
         
        pila.remplaceInversa(c);
        return this.pila;
    }
   
    public Contenido top(){
        System.out.println("\t  "+pila);
        return this.pila.top();
    }
    
    public  Pila pop(){
        pila.pop();
        return this.pila;
    }
    
    public String r(String cadena){
        String resultado = "";
        String copia = cadena.substring(0,cadena.length()-1);
        String copiaI = " ";
        String copiaF = " ";
        try{
            if(cadena.contains("^"))
            {
                while(copia.contains("^")){
                    
                    int pos = copia.indexOf("^");
                    //System.out.println(" pos "+pos);
                    char base = copia.charAt(pos-1);
                    char exponente = copia.charAt(pos+1);
                    
                    String p1 = copia.substring(0,pos-1);
                    String p2 = copia.substring(pos+1,copia.length());
                    System.out.println(" PATRTES "+p1 + " DOS "+p2);
                    
                    if(copia.charAt(pos+2)=='^'){
                        String segcopia = p2;
                        while(segcopia.contains("^")){
                            copia = p1+"Math.pow("+base+",";
                        }
                        
                    }
                    
                    copia = copia.replaceFirst("[/^]", "Math.pow()");
                    
                    
                    System.out.println(copia);
                }       
                //resultado = String.valueOf((int)Double.parseDouble(engine.eval(copiaF+copia+copiaE).toString()));
                resultado = "";
            }else
                resultado = engine.eval(cadena.substring(0, cadena.length()-1)).toString();
            }catch(ScriptException e){e.printStackTrace();}
        return resultado;
    }
    
    public String s(String cadena){
        String copia = cadena.substring(0,cadena.length()-1);
        Double resultado = new DoubleEvaluator().evaluate(copia);
        
        return String.valueOf(resultado.intValue());
        
    }
    
    private char getBase(String cadena){
        int pos = cadena.indexOf("^");
        char b = cadena.charAt(pos-1);
        return b;
    }
    private char getExp(String cadena){
        int pos = cadena.indexOf("^");
        char e = cadena.charAt(pos+1);
        return e;
    }
}