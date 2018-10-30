package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Contenido;
import com.udenar.compiladores.Prefija.Gramatica;
import com.udenar.compiladores.Prefija.NT;




/**
 *
 * @author Diego EG
 */
public class MainGramaticaInfija {
    private static final String CADENA_PRUEBA = "8+9F";
    private String n1="",n2="";
    
    public static void main(String[] args) {
        
        Pila pila = new Pila();
        
        
        //Creando la pila inicial 
        pila.push(new Contenido(new NT("VACIA")));
        pila.push(new Contenido(new NT("S")));
        int indiceCP = 0;
        final GramaticaInfija infija = new GramaticaInfija("Notacion Infija");
        final Gramatica gramatica = infija.getInfija();
        Functions f = new Functions(gramatica, pila);
        
        //System.out.println("AQUI ESTAMOS "+infija.getInfija().getProduccion(5));
        
        for ( indiceCP = 0; indiceCP < CADENA_PRUEBA.length();) {
            //System.out.println("CARACTER "+CADENA_PRUEBA.charAt(indiceCP));
            
            //System.out.println(""+pila);
            String topePila = pila.top().toString();
            
            
           // System.out.println("GRAMATICA ");
            
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
                                    case '(':
                                        pila = f.funcion(1);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                        indiceCP++;
                                            break;
                                    default:
                                            System.out.println("ERROR GRAVE"); //Lanzar excepcion
                                            break;
                                }
                                    break;
                            case "<E>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                        pila = f.funcion(2);
                                            break;
                                    case '1':
                                        pila = f.funcion(2);
                                            break;
                                    case '2':
                                        pila = f.funcion(2);
                                            break;
                                    case '3':
                                        pila = f.funcion(2);
                                            break;
                                    case '4':
                                        pila = f.funcion(2);
                                            break;
                                    case '5':
                                        pila = f.funcion(2);
                                            break;
                                    case '6':
                                        pila = f.funcion(2);
                                            break;        
                                    case '7':
                                        pila = f.funcion(2);
                                            break;
                                    case '8':
                                        pila = f.funcion(2);
                                            break;
                                    case '9':
                                        pila = f.funcion(2);
                                            break;
                                    case '(':
                                        pila = f.funcion(2);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            System.out.println("SIMBOLO DE ENTRADA NO PERMITIDO "); //Lanzar excepcion
                                            break;
                                }
                                //indiceCP++;
                                    break;
                            case "<F>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                        pila = f.pop();
                                            break;
                                    case '1':
                                        pila = f.pop();
                                            break;
                                    case '2':
                                        pila = f.pop();
                                            break;
                                    case '3':
                                        pila = f.pop();
                                            break;
                                    case '4':
                                        pila = f.pop();
                                            break;
                                    case '5':
                                        pila = f.pop();
                                            break;
                                    case '6':
                                        pila = f.pop();
                                            break;        
                                    case '7':
                                        pila = f.pop();
                                            break;
                                    case '8':
                                        pila = f.pop();
                                            break;
                                    case '9':
                                        pila = f.pop();
                                            break;
                                    case '(':
                                        pila = f.funcion(18);
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
                            case "<T>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                        pila = f.funcion(5);
                                            break;
                                    case '1':
                                        pila = f.funcion(5);
                                            break;
                                    case '2':
                                        pila = f.funcion(5);
                                            break;
                                    case '3':
                                        pila = f.funcion(5);
                                            break;
                                    case '4':
                                        pila = f.funcion(5);
                                            break;
                                    case '5':
                                        pila = f.funcion(5);
                                            break;
                                    case '6':
                                        pila = f.funcion(5);
                                            break;        
                                    case '7':
                                        pila = f.funcion(5);
                                            break;
                                    case '8':
                                        pila = f.funcion(5);
                                            break;
                                    case '9':
                                        pila = f.funcion(5);
                                            break;
                                    case '(':
                                        pila = f.funcion(5);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            System.out.println("SIMBOLO DE ENTRADA NO PERMITIDO "); //Lanzar excepcion
                                            break;
                                }
                                    break;
                            case "<E-L>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '+' :
                                        pila = f.funcion(3);
                                        indiceCP++;
                                            break;
                                    case ')':
                                        pila = f.pop();
                                            break;
                                    case 'F':
                                        pila = f.pop();
                                            break;
                                    default:
                                            System.out.println("SIMBOLO DE ENTRADA NO PERMITIDO "); //Lanzar excepcion
                                            break;
                                }
                                    break;
                            case "<T-L>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '+' :
                                        pila = f.pop();
                                            break;
                                    case '*':
                                        pila = f.funcion(6);
                                        indiceCP++;
                                            break;
                                    case ')':
                                        pila = f.pop();
                                            break;
                                    case 'F':
                                        pila = f.pop();
                                            break;
                                    default:
                                            System.out.println("SIMBOLO DE ENTRADA NO PERMITIDO "); //Lanzar excepcion
                                            break;
                                }
                                    break;

                            case ")":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case ')' :
                                        pila = f.pop();
                                        indiceCP++;
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            System.out.println("SIMBOLO DE ENTRADA NO PERMITIDO "); //Lanzar excepcion
                                            break;
                                }
                                    break;

                            case "{Suma}":
                                f.pop();
                                    break;
                            case "{Mult}":
                                f.pop();
                                    break;
                            case "{Respuesta}":
                                f.pop();
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
    }
}
