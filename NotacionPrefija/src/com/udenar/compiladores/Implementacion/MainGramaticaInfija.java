package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Gramatica;


/**
 *
 * @author Diego EG
 */
public class MainGramaticaInfija {
    private static final String CADENA_PRUEBA = "((9*9+1*7))F";
    private static boolean errorEncontrado = false;
    private String n1="",n2="";
    
    public static void main(String[] args) {
        
     
        
        
        //Creando la pila inicial 
        
        int indiceCP = 0;
        Gramatica infija = new GramaticaInfija("Notacion Infija");
        Functions f = new Functions(infija);
        
        System.out.println(""+infija);
        
        for ( indiceCP = 0; indiceCP < CADENA_PRUEBA.length();) {
          
            if(errorEncontrado){
                break;
            }
            
            //System.out.println(""+pila);
            String topePila = f.top().toString();
            
            
           // System.out.println("GRAMATICA ");

            switch(topePila){
              
                            case "<S>":
                                //Produccion p1 = gramatica.getProduccion(1);
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                        
                                         f.funcion(1);
                                            break;
                                    case '1':
                                        
                                        f.funcion(1);
                                            break;
                                    case '2':
                                        
                                        f.funcion(1);
                                            break;
                                    case '3':
                                        
                                        f.funcion(1);
                                            break;
                                    case '4':
                                        
                                         f.funcion(1);
                                            break;
                                    case '5':
                                       
                                         f.funcion(1);
                                            break;
                                    case '6':
                                        
                                         f.funcion(1);
                                            break;        
                                    case '7':
                                        
                                         f.funcion(1);
                                            break;
                                    case '8':
                                        
                                         f.funcion(1);
                                            break;
                                    case '9':
                                        
                                         f.funcion(1);
                                            break;
                                    case '(':
                                        
                                         f.funcion(1);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                        indiceCP++;
                                            break;
                                    default:
                                            errorEncontrado = true;
                                            System.out.println("RECHACE"); //Lanzar excepcion
                                            indiceCP++;
                                            break;
                                }
                                    break;
                            case "<E>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                        
                                         f.funcion(2);
                                            break;
                                    case '1':
                                        
                                         f.funcion(2);
                                            break;
                                    case '2':
                                        
                                         f.funcion(2);
                                            break;
                                    case '3':
                                        
                                         f.funcion(2);
                                            break;
                                    case '4':
                                        
                                         f.funcion(2);
                                            break;
                                    case '5':
                                        
                                         f.funcion(2);
                                            break;
                                    case '6':
                                        
                                         f.funcion(2);
                                            break;        
                                    case '7':
                                        
                                         f.funcion(2);
                                            break;
                                    case '8':
                                        
                                         f.funcion(2);
                                            break;
                                    case '9':
                                        
                                         f.funcion(2);
                                            break;
                                    case '(':
                                        
                                         f.funcion(2);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            errorEncontrado = true;
                                            System.out.println("RECHACE "); //Lanzar excepcion
                                            indiceCP++;
                                            break;
                                }
                                //indiceCP++;
                                    break;
                            case "<F>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                         f.pop();
                                            break;
                                    case '1':
                                         f.pop();
                                            break;
                                    case '2':
                                         f.pop();
                                            break;
                                    case '3':
                                         f.pop();
                                            break;
                                    case '4':
                                         f.pop();
                                            break;
                                    case '5':
                                         f.pop();
                                            break;
                                    case '6':
                                         f.pop();
                                            break;        
                                    case '7':
                                         f.pop();
                                            break;
                                    case '8':
                                         f.pop();
                                            break;
                                    case '9':
                                         f.pop();
                                            break;
                                    case '(':
                                         f.funcion(18);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            errorEncontrado = true;
                                            System.out.println("RECHACE "); //Lanzar excepcion
                                            indiceCP++;
                                            break;
                                   
                                }
                                    indiceCP++; 
                                    break;
                            case "<T>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '0' :
                                         f.funcion(5);
                                            break;
                                    case '1':
                                         f.funcion(5);
                                            break;
                                    case '2':
                                         f.funcion(5);
                                            break;
                                    case '3':
                                         f.funcion(5);
                                            break;
                                    case '4':
                                         f.funcion(5);
                                            break;
                                    case '5':
                                         f.funcion(5);
                                            break;
                                    case '6':
                                         f.funcion(5);
                                            break;        
                                    case '7':
                                         f.funcion(5);
                                            break;
                                    case '8':
                                         f.funcion(5);;
                                            break;
                                    case '9':
                                         f.funcion(5);
                                            break;
                                    case '(':
                                         f.funcion(5);
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            errorEncontrado = true;
                                            System.out.println("RECHACE "); //Lanzar excepcion
                                            indiceCP++;
                                            break;
                                }
                                    break;
                            case "<E-L>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '+' :
                                         f.funcion(3);
                                        indiceCP++;
                                            break;
                                    case ')':
                                         f.pop();
                                            break;
                                    case 'F':
                                         f.pop();
                                            break;
                                    default:
                                            errorEncontrado = true;
                                            System.out.println("RECHACE "); //Lanzar excepcion
                                            indiceCP++;
                                            break;
                                }
                                    break;
                            case "<T-L>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '+' :
                                         f.pop();
                                            break;
                                    case '*':
                                         f.funcion(6);
                                        indiceCP++;
                                            break;
                                    case ')':
                                         f.pop();
                                            break;
                                    case 'F':
                                         f.pop();
                                            break;
                                    default:
                                            errorEncontrado = true;
                                            System.out.println("RECHACE "); //Lanzar excepcion
                                            indiceCP++;
                                            break;
                                }
                                    break;

                            case ")":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case ')' :
                                         f.pop();
                                        indiceCP++;
                                            break;
                                    case 'F':
                                        System.out.println("RECHACE");
                                            break;
                                    default:
                                            errorEncontrado = true;
                                            System.out.println("RECHACE "); //Lanzar excepcion
                                            indiceCP++;
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
                                    errorEncontrado = true;
                                    System.out.println("RECHACE "); //Lanzar excepcion
                                    indiceCP++;
                                    break;
            }   
        }
    }
}