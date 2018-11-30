package com.udenar.compiladores.Gramatica;

/**
 *
 * @author Diego EG
 */
public class Elemento {
    private String nombre;

    public Elemento(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        //return "Elemento{" + "nombre=" + nombre + '}';
        return nombre;
    }
    
    
    
}
