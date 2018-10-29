package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Gramatica;

/**
 *
 * @author Diego EG
 */
public class MainGramaticaInfija {
    private Gramatica infija;
    
    public static void main(String[] args) {
        GramaticaInfija infija = new GramaticaInfija("Infija");
        System.out.println(infija);
    }
    
}
