package com.udenar.compiladores.Gramatica;

/**
 *
 * @author Diego EG
 */
public interface Operaciones {

    public static int suma(int a, int b){return a+b;};
    public static int resta(int a, int b){return a-b;};
    public static int multiplicacion(int a, int b){return a*b;};
    public static int division(int a, int b){return a/b;};
    public static int exponente(int a, int b){return(int)Math.pow(a,b);};
    public static void respuesta(String a){System.out.println("RESULTADO = "+a);};
    
    
}
