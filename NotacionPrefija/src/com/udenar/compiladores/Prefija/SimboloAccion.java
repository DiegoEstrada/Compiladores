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
   
    public boolean hasAtributos(){
        return this.atributos.isEmpty();
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
    
    public void editarAtributo(String nombre, int valor){
       if(this.atributos.replace(nombre, valor) == null)
            System.out.println("No se pudo modificar el valor del atributo "+nombre);
    }
    
    /*
        El sigueinte metodo esta pensado para recibir un conjunto de parameteos
        en los simbolos de acion, por si se llegan a utilizar en un futuro
        
    */
    //public abstract void funcion(Map<String,Integer> parametros);

    @Override
    public String toString() {
        String attrb = "";
        if(hasAtributos()){
            for(Map.Entry<String,Integer> entrada : atributos.entrySet() ){
                attrb += " Atributo "+entrada.getKey() +" = "+entrada.getValue();
            }
            return "{" + super.getNombre()+"}";
        }
        else
            return "{" + super.getNombre()+"}";
    }
    
    
}
