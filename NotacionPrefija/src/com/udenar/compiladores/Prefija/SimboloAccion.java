package com.udenar.compiladores.Prefija;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego EG
 */
public  class  SimboloAccion extends Elemento implements Operaciones{
    
    private Map<String, Integer> atributos;
    
    public SimboloAccion(String nombre){
        super(nombre);
        this.atributos = new HashMap();
    }
   
    /**
     * @return the atributos
     */
    public Map<String, Integer> getAtributos() {
        return atributos;
    }
    
    public void agregarAtributo(String nombre, int valor){
        this.getAtributos().put(nombre, valor);
    }
    
    /*
        El sigueinte metodo esta pensado para recibir un conjunto de parameteos
        en los simbolos de acion, por si se llegan a utilizar en un futuro
        
    */
    //public abstract void funcion(Map<String,Integer> parametros);

    @Override
    public String toString() {
        return "" + super.getNombre();
    }
    
    
}
