package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Contenido;
import com.udenar.compiladores.Prefija.Gramatica;
import com.udenar.compiladores.Prefija.NT;
import com.udenar.compiladores.Prefija.Produccion;
import com.udenar.compiladores.Prefija.SimboloAccion;
import com.udenar.compiladores.Prefija.T;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego EG
 */
public class GramaticaInfija extends Gramatica {
    

    
    public GramaticaInfija(String nombre,Map<Integer,Produccion> p){
        super(nombre,p);
        
        //               //             //
    }

    

    @Override
    public String toString() {
        return "Gramatica Infija{"  + super.toString() + '}';
    }
    
    
    
}
