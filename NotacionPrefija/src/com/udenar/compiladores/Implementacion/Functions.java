package com.udenar.compiladores.Implementacion;

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
        String copiaE = " ";
        String copiaF = " ";
        try{
            if(cadena.contains("^"))
            {
                while(copia.contains("^")){
                    
                    int pos = copia.indexOf("^");
                    System.out.println(" pos "+pos);
                    char base = copia.charAt(pos-1);
                    char exponente = copia.charAt(pos+1);
                    copiaE = copia.substring(pos+2, copia.length());
                    copia = copia.substring(pos, pos+1);
                    copia = copia.replace("^", "Math.pow("+base+","+exponente+")");
                    System.out.println(" "+copia+copiaE);
                }
                resultado = engine.eval(copia+copiaE).toString();
            }else
                resultado = engine.eval(cadena.substring(0, cadena.length()-1)).toString();
            }catch(ScriptException e){e.printStackTrace();}
        return resultado;
    }
}