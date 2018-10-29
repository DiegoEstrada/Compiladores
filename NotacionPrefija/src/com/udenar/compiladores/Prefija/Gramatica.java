package com.udenar.compiladores.Prefija;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego EG
 */
public class Gramatica {
    
    private String nombre;
    private Map<Integer,Produccion> producciones;
    
    public Gramatica(String nombre){
        this.nombre = nombre;
        this.producciones = new HashMap();
    }
    public Gramatica(String nombre, Map<Integer,Produccion> producciones){
        this.producciones = producciones;
    }
    
    public Contenido conjuntoSeleccion(){
        Contenido c = new Contenido();
        return c;
    }
    
    public boolean esFormaSimpleDeAsignacion(){
        return true;
    }
    
    public void setProducciones(Map<Integer,Produccion> p){
        this.producciones = p;
    }
    
    public Produccion getProduccion(Integer i){
        return this.producciones.get(i);
    }
    
    public int numeroProducciones(){
        return this.producciones.size();
    }
    
    @Override
    public String toString() {
        String prods = "";
        for(Map.Entry<Integer,Produccion> entrada : producciones.entrySet() ){
            prods += entrada.getKey()+ ".- "+entrada.getValue()+"\n";
        }
        
        return "Gramatica:"  + nombre + ".\n Producciones\n" + prods;
    }
    
    
}
