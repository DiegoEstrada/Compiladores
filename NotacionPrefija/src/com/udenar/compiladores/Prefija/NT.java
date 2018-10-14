package com.udenar.compiladores.Prefija;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego EG
 */
public class NT extends Elemento {
    
    private Map<String,Integer> atributos;
    
    public NT(String nombre){
        super(nombre);
        atributos = new HashMap();
    }
    
 

    /**
     * @return the atributos
     */
    public Map<String,Integer> getAtributos() {
        return atributos;
    }
    
    public void agregarAtributo(String nombre, int valor){
        atributos.put(nombre, valor);
    }

    @Override
    public String toString() {
        return "<" + super.getNombre().toUpperCase()+">";
    }
    
    
    
}
