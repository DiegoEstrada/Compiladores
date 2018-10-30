package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Contenido;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author Diego EG
 */

/*
    El metodo top de la pila arroja una excepcion cuando la pila se encuentra 
    vacia, es decir, cuando remuevo todos los elementos o tengo una pila vacia
    y aplico el metodo top
*/
public class Pila {
    private Stack<Contenido> pila;
    
    public Pila(){
        this.pila = new Stack();
       
    }
    
    public Contenido push(Contenido o){
       return pila.push(o);
    }
     
    public Contenido pop(){
        return this.pila.pop();
    }
    
    public Contenido top(){
        return this.pila.peek();
    }
    
    public void remplace(ArrayList<Contenido> objs){
        this.pila.pop();
        for(Contenido o : objs){
            this.push(o);
        }
        
    }
    public void remplaceInversa(ArrayList<Contenido> objs){
        this.pila.pop();
        
        ArrayList<Contenido> copia =new ArrayList();
        int j = objs.size()-1;
        
        for(int i = objs.size()-1; i>=0; i--){
            copia.add(objs.get(i));
        }
        
        
        //Collections.reverse(objs);
        /*
            Cuidado con este metodo, lo que hace es modificar todo el contendio 
            que se le describa aun cunado sea final 
        */
        for(Contenido o : copia){
            this.push(o);
        }
    }

    /**
     * @return the pila
     */
    public Stack getPila() {
        return pila;
    }

    @Override
    public String toString() {
        return "Contenido de la pila "+pila;
    }
    
    
    
    
}
