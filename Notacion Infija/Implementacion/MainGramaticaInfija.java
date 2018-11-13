package com.udenar.compiladores.Implementacion;

import com.udenar.compiladores.Prefija.Gramatica;
import com.udenar.compiladores.Prefija.Operaciones;


/**
 *
 * @author Diego EG
 */
public class MainGramaticaInfija {
    private static final String CADENA_PRUEBA = "2^2-4^2-6F";
    private static boolean errorEncontrado = false;
    private static Integer op1, op2, res;
    
    public static void main(String[] args) {
        
     
        
        
        //Creando la pila inicial 
        
        int indiceCP = 0;
        Gramatica infija = new GramaticaInfija("Notacion Infija");
        Functions f = new Functions(infija);
        
        System.out.println(""+infija);
        
        for ( indiceCP = 0; indiceCP < CADENA_PRUEBA.length();) {
          
            
            
            //System.out.println(""+pila);
            String topePila = f.top().toString();
            
            
           // System.out.println("GRAMATICA ");

           if(!errorEncontrado){
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
                                         if(op1 == null){
                                             op1 = new Integer(0);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(0);
                                             }
                                         }
                                            break;
                                    case '1':
                                         f.pop();
                                         if(op1 == null){
                                             op1 = new Integer(1);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(1);
                                             }
                                         }
                                            break;
                                    case '2':
                                         f.pop();
                                         if(op1 == null){
                                             op1 = new Integer(2);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(2);
                                             }
                                         }
                                            break;
                                    case '3':
                                         f.pop();
                                         if(op1 == null){
                                             op1 = new Integer(3);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(3);
                                             }
                                         }
                                            break;
                                    case '4':
                                        f.pop();
                                        if(op1 == null){
                                             op1 = new Integer(4);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(4);
                                             }
                                         }
                                            break;
                                    case '5':
                                        f.pop();
                                        if(op1 == null){
                                             op1 = new Integer(5);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(5);
                                             }
                                         }
                                            break;
                                    case '6':
                                         f.pop();
                                         if(op1 == null){
                                             op1 = new Integer(6);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(6);
                                             }
                                         }
                                            break;        
                                    case '7':
                                         f.pop();
                                         if(op1 == null){
                                             op1 = new Integer(7);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(7);
                                             }
                                         }
                                            break;
                                    case '8':
                                         f.pop();
                                         if(op1 == null){
                                             op1 = new Integer(8);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(8);
                                             }
                                         }
                                            break;
                                    case '9':
                                         f.pop();
                                         if(op1 == null){
                                             op1 = new Integer(9);
                                         }else{
                                             if(op2 == null){
                                                 op2 = new Integer(9);
                                             }
                                         }
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
                                    case '-' :
                                         f.funcion(19);
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
                                    case '-' :
                                         f.pop();
                                            break;
                                    case '*':
                                         f.funcion(6);
                                        indiceCP++;
                                            break;
                                    case '/':
                                         f.funcion(20);
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
                            case "<P-L>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '+':
                                        f.pop();
                                        break;
                                     case '-':
                                        f.pop();
                                        break;
                                    case '*':
                                        f.pop();
                                        break;
                                    case '/':
                                        f.pop();
                                        break;
                                    case ')':
                                        f.pop();
                                        break;
                                    case '^':
                                        f.funcion(22);
                                        indiceCP++;
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
                            case "<P>":
                                switch(CADENA_PRUEBA.charAt(indiceCP)){
                                    case '(':
                                        f.funcion(21);
                                        break;                                        
                                    case '0' :
                                         f.funcion(21);
                                            break;
                                    case '1':
                                         f.funcion(21);
                                            break;
                                    case '2':
                                         f.funcion(21);
                                            break;
                                    case '3':
                                         f.funcion(21);
                                            break;
                                    case '4':
                                         f.funcion(21);
                                            break;
                                    case '5':
                                         f.funcion(21);
                                            break;
                                    case '6':
                                         f.funcion(21);
                                            break;        
                                    case '7':
                                         f.funcion(21);
                                            break;
                                    case '8':
                                         f.funcion(21);;
                                            break;
                                    case '9':
                                         f.funcion(21);
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
                                
                                if(op1 == null){
                                    res = new Integer(Operaciones.suma(res, op2));
                                }else
                                res = new Integer(Operaciones.suma(op1, op2));
                                op1 = null;
                                op2 = res;
                                f.pop();
                                    break;
                            case "{Mult}":
                                
                                if(op1 == null){
                                    res = new Integer(Operaciones.multiplicacion(res, op2));
                                }else
                                res = new Integer(Operaciones.multiplicacion(op1, op2));
                                op1 = null;
                                op2 = res;
                                f.pop();
                                    break;
                            case "{Div}":
                                if(op1 == null){
                                    res = new Integer(Operaciones.division(res, op2));
                                }else
                                res = new Integer(Operaciones.division(op1, op2));
                                op1 = null;
                                op2 = res;
                                f.pop();
                                    break;
                            case "{Resta}":
                                
                                if(op1 == null){
                                    res = new Integer(Operaciones.resta(res, op2));
                                }else{
                                res = new Integer(Operaciones.resta(op1, op2));
                                op1 = null;
                                op2 = res;
                                }
                                
                                f.pop();
                                    break;
                            case "{Exponente}":
                                
                                if(op1 == null){
                                    res = new Integer(Operaciones.exponente(res, op2));
                                }else
                                res = new Integer(Operaciones.exponente(op1, op2));
                                op1 = null;
                                op2 = res;
                                f.pop();
                                    break;
                                    
                            case "{Respuesta}":
                                //Operaciones.respuesta(res);
                                f.pop();
                                    break;
                                    
                            case "<VACIA>":
                                if(CADENA_PRUEBA.charAt(indiceCP)=='F'){
                                    System.out.println("ACEPTE");
                                    System.out.println("Resultado = "+f.s(CADENA_PRUEBA));
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
           }else
               break;
        }
    }
}