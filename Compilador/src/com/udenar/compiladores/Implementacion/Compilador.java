package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Gramatica.Contenido;
import com.udenar.compiladores.Gramatica.Gramatica;
import com.udenar.compiladores.Gramatica.NT;
import com.udenar.compiladores.Gramatica.Produccion;
import com.udenar.compiladores.Gramatica.T;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Compilador extends Gramatica {
    
    public Compilador(String nombre) {
        super(nombre);
        ArrayList<Produccion> p = new ArrayList();
        
//      ---------------------------------------------------
        ArrayList<Contenido> c1 = new ArrayList();
        c1.add(new Contenido(new T("main")));
        c1.add(new Contenido(new T("{")));
        c1.add(new Contenido(new NT("declaraciones")));
        c1.add(new Contenido(new NT("sentencias")));
        c1.add(new Contenido(new T("}")));

        
        p.add(new Produccion(new NT("programa"), c1));
//      ---------------------------------------------------
        ArrayList<Contenido> c2 = new ArrayList();
        c2.add(new Contenido(new NT("declaracion")));
       
        p.add(new Produccion(new NT("declaraciones"), c2));
//      ---------------------------------------------------        
        ArrayList<Contenido> c3 = new ArrayList();
        c3.add(new Contenido(new NT("declaracion")));
        c3.add(new Contenido(new NT("declaraciones")));

        p.add(new Produccion(new NT("declaraciones"), c3));
       
//      ---------------------------------------------------   
        ArrayList<Contenido> c4 = new ArrayList();
        
        c4.add(new Contenido(new NT("clase")));
        c4.add(new Contenido(new NT("identificadores")));
        c4.add(new Contenido(new T(";")));


        p.add(new Produccion(new NT("declaracion"), c4));
        

//      ---------------------------------------------------   
        ArrayList<Contenido> c5 = new ArrayList();
        c5.add(new Contenido(new NT("clase_escalar")));
       
        p.add(new Produccion(new NT("clase"), c5));
      

//      ---------------------------------------------------   
        ArrayList<Contenido> c6 = new ArrayList();
        c6.add(new Contenido(new NT("tipo")));
       
        p.add(new Produccion(new NT("clase_escalar"), c6));
        
        
//      ---------------------------------------------------   
        ArrayList<Contenido> c7 = new ArrayList();
        c7.add(new Contenido(new T("int")));
        
        p.add(new Produccion(new NT("tipo"), c7));
        

//      ---------------------------------------------------   
        ArrayList<Contenido> c8 = new ArrayList();
        c8.add(new Contenido(new T("boolean")));
        
        p.add(new Produccion(new NT("tipo"), c8));
//      ---------------------------------------------------         
        ArrayList<Contenido> c9 = new ArrayList();
        c9.add(new Contenido(new T("float")));
        
        p.add(new Produccion(new NT("tipo"), c9));
            
//      ---------------------------------------------------   

        ArrayList<Contenido> c10 = new ArrayList();
        c10.add(new Contenido(new NT("identificador")));
       
        p.add(new Produccion(new NT("identificadores"), c10));
//      ---------------------------------------------------        
        ArrayList<Contenido> c11 = new ArrayList();
        c11.add(new Contenido(new NT("identificador")));
        c11.add(new Contenido(new T(",")));        
        c11.add(new Contenido(new NT("identificadores")));

        p.add(new Produccion(new NT("identificadores"), c11));  
//      ---------------------------------------------------     

        ArrayList<Contenido> c12 = new ArrayList();
        c12.add(new Contenido(new NT("sentencia")));
       
        p.add(new Produccion(new NT("sentencias"), c12));
//      ---------------------------------------------------     

        ArrayList<Contenido> c13 = new ArrayList();
        c13.add(new Contenido(new NT("sentencia")));        
        c13.add(new Contenido(new NT("sentencias")));

        p.add(new Produccion(new NT("sentencias"), c13)); 

//      ---------------------------------------------------     

        ArrayList<Contenido> c14 = new ArrayList();
        c14.add(new Contenido(new NT("sentencia_simple")));        
        c14.add(new Contenido(new T(";")));        

        p.add(new Produccion(new NT("sentencia"), c14));

//      ---------------------------------------------------     

        ArrayList<Contenido> c15 = new ArrayList();
        c15.add(new Contenido(new NT("bloque")));        
               

        p.add(new Produccion(new NT("sentencia"), c15));

//      ---------------------------------------------------     

        ArrayList<Contenido> c16 = new ArrayList();
        c16.add(new Contenido(new NT("asignacion")));        
               

        p.add(new Produccion(new NT("sentencia_simple"), c16));



//      ---------------------------------------------------     

        ArrayList<Contenido> c17 = new ArrayList();
        c17.add(new Contenido(new NT("condicional")));                       

        p.add(new Produccion(new NT("bloque"), c17));

//      ---------------------------------------------------        
        ArrayList<Contenido> c18 = new ArrayList();
        c18.add(new Contenido(new NT("identificador")));
        c18.add(new Contenido(new T("=")));        
        c18.add(new Contenido(new NT("exp")));

        p.add(new Produccion(new NT("asignacion"), c18)); 


//      ---------------------------------------------------        
        ArrayList<Contenido> c19 = new ArrayList();
        c19.add(new Contenido(new T("if")));        
        c19.add(new Contenido(new T("(")));
        c19.add(new Contenido(new NT("exp")));
        c19.add(new Contenido(new T(")")));
        c19.add(new Contenido(new T("{")));
        c19.add(new Contenido(new NT("sentencias")));
        c19.add(new Contenido(new T("}")));

        p.add(new Produccion(new NT("condicional"), c19)); 


//      ---------------------------------------------------        
        ArrayList<Contenido> c20 = new ArrayList();
        c20.add(new Contenido(new T("if")));        
        c20.add(new Contenido(new T("(")));
        c20.add(new Contenido(new NT("exp")));
        c20.add(new Contenido(new T(")")));
        c20.add(new Contenido(new T("{")));
        c20.add(new Contenido(new NT("sentencias")));
        c20.add(new Contenido(new T("}")));
        c20.add(new Contenido(new T("else")));
        c20.add(new Contenido(new T("{")));
        c20.add(new Contenido(new NT("sentencias")));
        c20.add(new Contenido(new T("}")));

        p.add(new Produccion(new NT("condicional"), c20)); 


        // Creando y Agregando las producciones a la gramatica //
        
        Map<Integer,Produccion> producciones = new HashMap();
        int i = 1;
        for(Produccion produccion : p){
            producciones.put(i, produccion);
                    i++;
        }
        
        super.setProducciones(producciones);
    }
    
    @Override
    public String toString() {
        return "Gramatica Infija{"  + super.toString() + '}';
    }
    
}
