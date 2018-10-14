package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Contenido;
import com.udenar.compiladores.Prefija.Gramatica;
import com.udenar.compiladores.Prefija.Produccion;
import java.util.ArrayList;

/**
 *
 * @author Diego EG
 */
public  class Funciones {
    
    private Gramatica gramatica;
    private Pila pila;
    
    public Funciones(Gramatica g, Pila p){
        this.gramatica = g;
        this.pila = p;
    }
    
    public Pila funcion(int i){
        Produccion p = gramatica.getProduccion(i);
        
        ArrayList<Contenido> c = p.getContenido();
        
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
   
    
    public  Pila cuatro(){
        pila.pop();
        return this.pila;
    }
}
