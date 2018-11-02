package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Contenido;
import com.udenar.compiladores.Prefija.Gramatica;
import com.udenar.compiladores.Prefija.NT;
import com.udenar.compiladores.Prefija.Produccion;
import java.util.ArrayList;

/**
 *
 * @author Diego EG
 */
public  class Functions {
    
 
    private Pila pila;
    private final Gramatica g;
    
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
                " =  "+c);
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
}