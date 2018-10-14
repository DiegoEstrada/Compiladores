package com.udenar.compiladores.Prefija;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Diego EG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creacion de la nueva gramatica
        Gramatica prefija = new Gramatica("Notacion Prefija");
        
        /*
            Para crear producciones, primero se crea el lado derecho de cada
            produccion, esto se logra con la clase Contenido
            Y posteriormente se instancia un objeto de tipo Podroduccion, que 
            recibe como parametros el nombre del No Terminal del lado izquierdo
            y todo el contenido del lado derecho (Contenido)
        */
        
        ArrayList<Contenido> c1 = new ArrayList();
        //Creando el Simbolo de Accion
        c1.add(new Contenido(new NT("E")));
        c1.add(new Contenido(new SimboloAccion("Respuesta")));
        
        
        
        //Creando la primer producccion
        Produccion p1 = new Produccion(new NT("S"), c1);
        
        //Creando el lado derecho de la segunda produccion
        
        ArrayList<Contenido> c2 = new ArrayList();
        c2.add(new Contenido(new NT("+")));
        c2.add(new Contenido(new NT("E")));
        c2.add(new Contenido(new NT("E")));
        c2.add(new Contenido(new SimboloAccion("Suma")));
        
        //Creando la segunda produccion 
        Produccion p2 = new Produccion(new NT("E"), c2);
        
        //Creando el lado derecho de la tercer produccion
        
        ArrayList<Contenido> c3 = new ArrayList();
        c3.add(new Contenido(new T("*")));
        c3.add(new Contenido(new NT("E")));
        c3.add(new Contenido(new NT("E")));
        c3.add(new Contenido(new SimboloAccion("Multiplicacion")));
        
        //Creando la tercer produccion 
        Produccion p3 = new Produccion(new NT("E"), c3);
        
        //Creando el lado derecho de la cuarta produccion
        
        ArrayList<Contenido> c4 = new ArrayList();
        c4.add(new Contenido(new T("0")));
        ArrayList<Contenido> c5 = new ArrayList();
        c5.add(new Contenido(new T("1")));
        ArrayList<Contenido> c6 = new ArrayList();
        c6.add(new Contenido(new T("2")));
        ArrayList<Contenido> c7 = new ArrayList();
        c7.add(new Contenido(new T("3")));
        ArrayList<Contenido> c8 = new ArrayList();
        c8.add(new Contenido(new T("4")));
        ArrayList<Contenido> c9 = new ArrayList();
        c9.add(new Contenido(new T("5")));
        ArrayList<Contenido> c10 = new ArrayList();
        c10.add(new Contenido(new T("6")));
        ArrayList<Contenido> c11 = new ArrayList();
        c11.add(new Contenido(new T("7")));
        ArrayList<Contenido> c12 = new ArrayList();
        c12.add(new Contenido(new T("8")));
        ArrayList<Contenido> c13 = new ArrayList();
        c13.add(new Contenido(new T("9")));
        

        
        //Creando la cuarta produccion 
        Produccion p4 = new Produccion(new NT("E"), c4);
        Produccion p5 = new Produccion(new NT("E"), c5);
        Produccion p6 = new Produccion(new NT("E"), c6);
        Produccion p7 = new Produccion(new NT("E"), c7);
        Produccion p8 = new Produccion(new NT("E"), c8);
        Produccion p9 = new Produccion(new NT("E"), c9);
        Produccion p10 = new Produccion(new NT("E"), c10);
        Produccion p11 = new Produccion(new NT("E"), c11);
        Produccion p12 = new Produccion(new NT("E"), c12);
        Produccion p13 = new Produccion(new NT("E"), c13);
        
        //Creando el mapeo de las produccciones
        
        Map<Integer,Produccion> producciones = new HashMap();
        
        producciones.put(1, p1);
        producciones.put(2, p2);
        producciones.put(3, p3);
        producciones.put(4, p4);
        producciones.put(5, p5);
        producciones.put(6, p6);
        producciones.put(7, p7);
        producciones.put(8, p8);
        producciones.put(9, p9);
        producciones.put(10, p10);
        producciones.put(11, p11);
        producciones.put(12, p12);
        producciones.put(13, p13);
        
        
        prefija.setProducciones(producciones);
        
        // ########################################################  //
        
        System.out.println("AQUI TERMINA LA DECLARACION DE LA GRAMATICA");
        
        
        System.out.println(prefija);
    }
    
}
