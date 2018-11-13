package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Contenido;
import com.udenar.compiladores.Prefija.Gramatica;
import com.udenar.compiladores.Prefija.NT;
import com.udenar.compiladores.Prefija.Produccion;
import com.udenar.compiladores.Prefija.T;



/**
 *
 * @author Diego EG
 */
public class Main {
    private static final String CADENA_PRUEBA = "+8884F";
    
    public static void main(String[] args) {
        
        Pila pila = new Pila();
        
        /*
            PROBANDO FUNCIONAMIENTO DE LA PILA
        
        NT s = new NT("S");
        NT n1 = new NT("A");
        NT n2 = new NT("B");
        NT n3 = new NT("C");
        T t1 = new T("1");
        T t2 = new T("2");
        T t3 = new T("3");
        SimboloAccion s1 = new SimboloAccion("Respuesta");
        
        pila.push(s);
        pila.push(n1);
        pila.push(t1);
        
        
        pila.pop();
        pila.pop();
        
        ArrayList<Object> a = new ArrayList();
        a.add(n2); a.add(t2);  a.add(s1);
        pila.remplaceInversa(a);
        System.out.println(""+ pila);
        System.out.println("Tope de la pila "+pila.top());
        
        */
        
        //Creando la pila inicial 
        pila.push(new Contenido(new NT("VACIA")));
        pila.push(new Contenido(new NT("S")));
        int indiceCP = 0;
        GramaticaPrefija prefija = new GramaticaPrefija("Notacion Prefija");
        Gramatica gramatica = prefija.getPrefija();
        
        Funciones f = new Funciones(gramatica, pila);
        

        
        for ( indiceCP = 0; indiceCP < CADENA_PRUEBA.length();) {
            //System.out.println("CARACTER "+CADENA_PRUEBA.charAt(indiceCP));
            System.out.println(""+pila);
            String topePila = pila.top().toString();
            
            System.out.println("TOPE PILA "+topePila);
            
            
            switch(topePila){
                            case "<S>":
                                //Produccion p1 = gramatica.getProduccion(1);
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                        pila = f.funcion(1);
                                            break;
                                    case '1':
                                        pila = f.funcion(1);
                                            break;
                                    case '2':
                                        pila = f.funcion(1);
                                            break;
                                    case '3':
                                        pila = f.funcion(1);
                                            break;
                                    case '4':
                                        pila = f.funcion(1);
                                            break;
                                    case '5':
                                        pila = f.funcion(1);
                                            break;
                                    case '6':
                                        pila = f.funcion(1);
                                            break;        
                                    case '7':
                                        pila = f.funcion(1);
                                            break;
                                    case '8':
                                        pila = f.funcion(1);
                                            break;
                                    case '9':
                                        pila = f.funcion(1);
                                            break;
                                    case ' ':
                                        pila = f.funcion(1);
                                            break;
                                    case '+':
                                        pila = f.funcion(1);
                                            break;
                                    case '*':
                                        pila = f.funcion(1);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            System.out.println("ERROR GRAVE"); //Lanzar excepcion
                                            break;
                                }
                                    break;
                            case "<E>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                        pila = f.cuatro();
                                            break;
                                    case '1':
                                        pila = f.cuatro();
                                            break;
                                    case '2':
                                        pila = f.cuatro();
                                            break;
                                    case '3':
                                        pila = f.cuatro();
                                            break;
                                    case '4':
                                        pila = f.cuatro();
                                            break;
                                    case '5':
                                        pila = f.cuatro();
                                            break;
                                    case '6':
                                        pila = f.cuatro();
                                            break;        
                                    case '7':
                                        pila = f.cuatro();
                                            break;
                                    case '8':
                                        pila = f.cuatro();
                                            break;
                                    case '9':
                                        pila = f.cuatro();
                                            break;
                                    case ' ':
                                        pila = f.cuatro();
                                            break;
                                    case '+':
                                        pila = f.funcion(2);
                                            break;
                                    case '*':
                                        pila = f.funcion(3);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            System.out.println("SIMBOLO DE ENTRADA NO PERMITIDO "); //Lanzar excepcion
                                            break;
                                }
                                indiceCP++;
                                    break;
                            case "<F>":
                                //No usado hasta el momento 
                                    break;
                            case "Suma":
                                f.cuatro();
                                    break;
                            case "Multiplicacion":
                                f.cuatro();
                                    break;
                            case "Respuesta":
                                f.cuatro();
                                    break;
                            case "<VACIA>":
                                if(CADENA_PRUEBA.charAt(indiceCP)=='F'){
                                    System.out.println("ACEPTE");
                                    indiceCP++;
                                }  
                                else
                                    System.out.println("RECHACE");
                                indiceCP++;
                                    break;
                            default:
                                    System.out.println("CARACTER NO VALIDO EN "
                                            + "LA PILA"); //Lanzar excepcion
                                    break;
            }

            
            
            
            
            
            
        }
        
        //while(CADENA_PRUEBA.charAt(indiceCP) =! null){
            
        //}
    }
}
