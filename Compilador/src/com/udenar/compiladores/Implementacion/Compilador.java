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
        c1.add(new Contenido(new T("begin")));
        c1.add(new Contenido(new NT("statement list")));
        c1.add(new Contenido(new T("end")));


        
        p.add(new Produccion(new NT("program"), c1));
//      ---------------------------------------------------
        ArrayList<Contenido> c2 = new ArrayList();
        c2.add(new Contenido(new NT("statement")));
        c2.add(new Contenido(new NT("statement tail")));

        p.add(new Produccion(new NT("statement list"), c2));
//      ---------------------------------------------------        
        ArrayList<Contenido> c3 = new ArrayList();
        c3.add(new Contenido(new NT("statement")));
        c3.add(new Contenido(new NT("statement tail")));

        p.add(new Produccion(new NT("statement tail"), c3));
       
//      ---------------------------------------------------   
        ArrayList<Contenido> c4 = new ArrayList();        
        c4.add(new Contenido(new T("ε")));

        p.add(new Produccion(new NT("statement tail"), c4));
        

//      ---------------------------------------------------   
        ArrayList<Contenido> c5 = new ArrayList();
        c5.add(new Contenido(new NT("ID")));        
        c5.add(new Contenido(new T("=")));
        c5.add(new Contenido(new NT("expression")));
        c5.add(new Contenido(new T(";")));

        p.add(new Produccion(new NT("statement"), c5));
      
        
//      ---------------------------------------------------   
        ArrayList<Contenido> c999 = new ArrayList();
        c999.add(new Contenido(new T("int")));
        //c999.add(new Contenido(new T(" ")));
        c999.add(new Contenido(new NT("ID")));        
        c999.add(new Contenido(new T("=")));
        c999.add(new Contenido(new NT("expression")));
        c999.add(new Contenido(new T(";")));

        p.add(new Produccion(new NT("statement"), c999));
      

//      ---------------------------------------------------   
        ArrayList<Contenido> c6 = new ArrayList();
        c6.add(new Contenido(new T("read")));
        c6.add(new Contenido(new T("(")));
        c6.add(new Contenido(new NT("id list")));
        c6.add(new Contenido(new T(")")));
        c6.add(new Contenido(new T(";")));

       
        p.add(new Produccion(new NT("statement"), c6));
        
        
//      ---------------------------------------------------   
        ArrayList<Contenido> c7 = new ArrayList();
        c7.add(new Contenido(new T("write")));
        c7.add(new Contenido(new T("(")));
        c7.add(new Contenido(new NT("expr list")));
        c7.add(new Contenido(new T(")")));
        c7.add(new Contenido(new T(";")));

       
        p.add(new Produccion(new NT("statement"), c7));
        
//      ---------------------------------------------------   
        ArrayList<Contenido> c8 = new ArrayList();
		c8.add(new Contenido(new NT("ID")));
		c8.add(new Contenido(new NT("id tail")));
        
        p.add(new Produccion(new NT("id list"), c8));
//      ---------------------------------------------------         
        ArrayList<Contenido> c9 = new ArrayList();
		c9.add(new Contenido(new T(",")));		
		c9.add(new Contenido(new NT("ID")));
		c9.add(new Contenido(new NT("id tail")));
        
        p.add(new Produccion(new NT("id tail"), c9));
            
//      ---------------------------------------------------   

        ArrayList<Contenido> c10 = new ArrayList();
        c10.add(new Contenido(new T("ε")));
       
        p.add(new Produccion(new NT("id tail"), c10));
//      ---------------------------------------------------        
        ArrayList<Contenido> c11 = new ArrayList();
        c11.add(new Contenido(new NT("expression")));
        c11.add(new Contenido(new NT("expr tail")));

        p.add(new Produccion(new NT("expr list"), c11));  
//      ---------------------------------------------------     

        ArrayList<Contenido> c12 = new ArrayList();
		
		c12.add(new Contenido(new T(",")));		
		c12.add(new Contenido(new NT("expression")));
        c12.add(new Contenido(new NT("expr tail")));

        p.add(new Produccion(new NT("expr tail"), c12));
//      ---------------------------------------------------     

        ArrayList<Contenido> c13 = new ArrayList();
        c13.add(new Contenido(new T("ε")));        

        p.add(new Produccion(new NT("expr tail"), c13)); 

//      ---------------------------------------------------     

        ArrayList<Contenido> c14 = new ArrayList();
        c14.add(new Contenido(new NT("primary")));        
        c14.add(new Contenido(new NT("primary tail"))); 

        p.add(new Produccion(new NT("expression"), c14));

//      ---------------------------------------------------     

        ArrayList<Contenido> c15 = new ArrayList();
        c15.add(new Contenido(new NT("op")));        
		c15.add(new Contenido(new NT("primary")));               
		c15.add(new Contenido(new NT("primary tail")));               

        p.add(new Produccion(new NT("primary tail"), c15));

//      ---------------------------------------------------     

        ArrayList<Contenido> c16 = new ArrayList();
        c16.add(new Contenido(new T("ε")));        
               

        p.add(new Produccion(new NT("primary tail"), c16));



//      ---------------------------------------------------     

        ArrayList<Contenido> c17 = new ArrayList();
        c17.add(new Contenido(new T("(")));
        c17.add(new Contenido(new NT("expression")));                       
		c17.add(new Contenido(new T(")")));

        p.add(new Produccion(new NT("primary"), c17));

//      ---------------------------------------------------        
        ArrayList<Contenido> c18 = new ArrayList();      
        c18.add(new Contenido(new NT("ID")));        
        

        p.add(new Produccion(new NT("primary"), c18)); 


//      ---------------------------------------------------        
        ArrayList<Contenido> c19 = new ArrayList();      
        c19.add(new Contenido(new NT("INTLITERAL")));        
        

        p.add(new Produccion(new NT("primary"), c19));  


//      ---------------------------------------------------        
        ArrayList<Contenido> c20 = new ArrayList();      
        c20.add(new Contenido(new T("+")));        
        

        p.add(new Produccion(new NT("op"), c20)); 

//      ---------------------------------------------------        

        ArrayList<Contenido> c21 = new ArrayList();      
        c21.add(new Contenido(new T("-")));        
        

        p.add(new Produccion(new NT("op"), c21));

//      ---------------------------------------------------  

        ArrayList<Contenido> c22 = new ArrayList();      
        c22.add(new Contenido(new T("*")));        
        

        p.add(new Produccion(new NT("op"), c22));

//      ---------------------------------------------------  

        ArrayList<Contenido> c23 = new ArrayList();      
        c23.add(new Contenido(new T("/")));        
        

        p.add(new Produccion(new NT("op"), c23));

//      ---------------------------------------------------  

        ArrayList<Contenido> c24 = new ArrayList();      
        c24.add(new Contenido(new NT("PROGRAM")));
        c24.add(new Contenido(new T("$")));                			//fin de cadena
        

        p.add(new Produccion(new NT("INICIO"), c24)); 


        // Creando y Agregando las producciones a la gramatica 
        
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
        return "Compilador{"  + super.toString() + '}';
    }
    
    
    
}


/*
Notaciones:
Las producciones nulas, el lado derecho esta como terminal vacio "" aunque esas no se aplica, porque para la maquina de pila
se usa "pop retiene", en esos casos.
En la producción 5 la asignación se hizo con el terminal "="
*/