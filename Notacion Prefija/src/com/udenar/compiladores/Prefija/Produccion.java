package com.udenar.compiladores.Prefija;

import java.util.ArrayList;

/**
 *
 * @author Diego EG
 */
public class Produccion {
    
    private NT nt;
    private ArrayList<Contenido> contenido;
    
    public Produccion(NT nt, ArrayList<Contenido> contenido){
        this.nt = nt;
        this.contenido = contenido;
    }

    /**
     * @return the nt
     */
    public NT getNt() {
        return nt;
    }

    /**
     * @return the contenido
     */
    public ArrayList<Contenido> getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        
        
        
        return "" + nt + " -> " + contenido ;
    }

    
    
}
