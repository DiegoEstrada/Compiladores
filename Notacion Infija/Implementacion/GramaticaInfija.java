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
    

    
    public GramaticaInfija(String nombre){
        super(nombre);
        ArrayList<Produccion> p = new ArrayList();
        
        
        //          Produccion 1         //
        ArrayList<Contenido> c1 = new ArrayList();
        NT nt1 =new NT("E");
        nt1.agregarAtributo("s", 0);
        
        SimboloAccion sb1 = new SimboloAccion("Respuesta");
        sb1.agregarAtributo("i", 0);
        
        c1.add(new Contenido(nt1));
        c1.add(new Contenido(sb1));
        
        NT nt11 = new NT("S");
        
        p.add(new Produccion(nt11, c1));
        //                //            //
        
        
        //          Produccion 2         //
        ArrayList<Contenido> c2 = new ArrayList();
        
        NT nt21 = new NT("T");
        nt21.agregarAtributo("p", 0);
        
        NT nt22 = new NT("E-L");
        nt22.agregarAtributo("r", 0);
        nt22.agregarAtributo("s", 0);
        
        NT nt23 = new NT("E");
        nt23.agregarAtributo("p", 0);
        
        
        c2.add(new Contenido(nt21));
        c2.add(new Contenido(nt22));
       
        p.add(new Produccion(nt23, c2));
        //                //            //
        
        //          Produccion 3         //
        ArrayList<Contenido> c3 = new ArrayList();
        c3.add(new Contenido(new T("+")));
        c3.add(new Contenido(new NT("T")));
        c3.add(new Contenido(new SimboloAccion("Suma")));
        c3.add(new Contenido(new NT("E-L")));
        
        p.add(new Produccion(new NT("E-L"), c3));
        //c3.clear();
        //                //            //
        
        //          Produccion 4         //
        ArrayList<Contenido> c4 = new ArrayList();
        c4.add(new Contenido());
        
       
        p.add(new Produccion(new NT("E-L"), c4));
        //c4.clear();
        //                //            //
        
        //          Produccion 5         //
        ArrayList<Contenido> c5 = new ArrayList();
        c5.add(new Contenido(new NT("P")));
        c5.add(new Contenido(new NT("T-L")));
       
        p.add(new Produccion(new NT("T"), c5));
        //c5.clear();
        //                //            //
        
        //          Produccion 6         //
        
        ArrayList<Contenido> c6 = new ArrayList();
        c6.add(new Contenido(new T("*")));
        c6.add(new Contenido(new NT("P")));
        c6.add(new Contenido(new SimboloAccion("Mult")));
        c6.add(new Contenido(new NT("T-L")));
        
        p.add(new Produccion(new NT("T-L"), c6));
        
        
        //c6.clear();
        //                //            //
        
        //          Produccion 7         //
        ArrayList<Contenido> c7 = new ArrayList();
        c7.add(new Contenido());
       
        p.add(new Produccion(new NT("T-L"), c7));
        //c7.clear();
        //                //            //
        /*
        //          Produccion 8         //
        ArrayList<Contenido> c8 = new ArrayList();
        c8.add(new Contenido(new T("^")));
        c8.add(new Contenido(new NT("P")));
        c8.add(new Contenido(new NT("F_LISTA")));
        
        p.add(new Produccion(new NT("F"), c8));
        //c8.clear();
        //                //            //
        
        //          Produccion 9         //
        ArrayList<Contenido> c9 = new ArrayList();
        c9.add(new Contenido());

        p.add(new Produccion(new NT("F_LISTA"), c9));
        //c9.clear();
        //                //            //
        */
        
        
        //          Produccion 8         //
        ArrayList<Contenido> c111 = new ArrayList();
        c111.add(new Contenido(new T("0")));
        p.add(new Produccion(new NT("F"), c111));
        //c.clear;
        
        //          Produccion 9        //        
        ArrayList<Contenido> c112 = new ArrayList();
        
        NT nt91 = new NT("F");
        nt91.agregarAtributo("p", 1);
        c112.add(new Contenido(new T("1")));
        p.add(new Produccion(nt91, c112));
        
        ArrayList<Contenido> c113 = new ArrayList();
        c113.add(new Contenido(new T("2")));
        p.add(new Produccion(new NT("F"), c113));
        //c.clear();
        //                //            //
        
        
        ArrayList<Contenido> c114 = new ArrayList();
        c114.add(new Contenido(new T("3")));
        p.add(new Produccion(new NT("F"), c114));
        //c.clear();
        //                //            //
        
        ArrayList<Contenido> c115 = new ArrayList();
        c115.add(new Contenido(new T("4")));
        p.add(new Produccion(new NT("F"), c115));
        //c.clear();
        //                //            //
        
        ArrayList<Contenido> c116 = new ArrayList();
        c116.add(new Contenido(new T("5")));
        p.add(new Produccion(new NT("F"), c116));
        //c.clear();
        //                //            //
        
        ArrayList<Contenido> c117 = new ArrayList();
        c117.add(new Contenido(new T("6")));
        p.add(new Produccion(new NT("F"), c117));
        //c.clear();
        //                //            //
        
        ArrayList<Contenido> c118 = new ArrayList();
        c118.add(new Contenido(new T("7")));
        p.add(new Produccion(new NT("F"), c118));
        //c.clear();
        //                //            //
        
        ArrayList<Contenido> c119 = new ArrayList();
        c119.add(new Contenido(new T("8")));
        p.add(new Produccion(new NT("F"), c119));
        //c.clear();
        //                //            //
        
        ArrayList<Contenido> c1120 = new ArrayList();
        c1120.add(new Contenido(new T("9")));
        p.add(new Produccion(new NT("F"), c1120));
        //c.clear();
        //                //            //
        
        //          Produccion 18         //
        ArrayList<Contenido> c10 = new ArrayList();
        c10.add(new Contenido(new T("(")));
        c10.add(new Contenido(new NT("E")));
        c10.add(new Contenido(new T(")")));

        p.add(new Produccion(new NT("F"), c10));
        

        //          Produccion 19         //
        ArrayList<Contenido> c11 = new ArrayList();
        c11.add(new Contenido(new T("-")));
        c11.add(new Contenido(new NT("T")));
        c11.add(new Contenido(new SimboloAccion("Resta")));   
       	c11.add(new Contenido(new NT("E-L")));  

        p.add(new Produccion(new NT("E-L"), c11));


        //          Produccion 20         //
        ArrayList<Contenido> c12 = new ArrayList();
        c12.add(new Contenido(new T("/")));
        c12.add(new Contenido(new NT("P")));        
        c12.add(new Contenido(new SimboloAccion("Div")));        	
        c12.add(new Contenido(new NT("T-L")));

        p.add(new Produccion(new NT("T-L"), c12));

        
        //          Produccion 21         //
        ArrayList<Contenido> c21 = new ArrayList();
        c21.add(new Contenido(new NT("F")));
        c21.add(new Contenido(new NT("P-L")));
 

        p.add(new Produccion(new NT("P"), c21));


        //          Produccion 22         //
        ArrayList<Contenido> c22 = new ArrayList();
        c22.add(new Contenido(new T("^")));
        c22.add(new Contenido(new NT("F")));
        c22.add(new Contenido(new SimboloAccion("Exponente")));
        c22.add(new Contenido(new NT("P-L")));

        p.add(new Produccion(new NT("P-L"), c22));



        //          Produccion 23         //
        ArrayList<Contenido> c23 = new ArrayList();
        c23.add(new Contenido());
       
        p.add(new Produccion(new NT("P-L"), c23));      
        
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
