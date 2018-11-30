package com.udenar.compiladores.Gramatica;

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
    
    public void editarAtributo(String nombre, int valor){
       if(this.atributos.replace(nombre, valor) == null)
            System.out.println("No se pudo modificar el valor del atributo "+nombre);
    }

    public boolean hasAtributos(){
        return this.atributos.isEmpty();
    }
    
    @Override
    public String toString() {
        String attrb = "";
        if(hasAtributos()){
            for(Map.Entry<String,Integer> entrada : atributos.entrySet() ){
                attrb += " Atributo "+entrada.getKey() +" = "+entrada.getValue();
            }
            return "<" + super.getNombre().toUpperCase()+">";
        }
        else
            return "<" + super.getNombre().toUpperCase()+">";
        
        
        
        
    }
    
    
    
}
