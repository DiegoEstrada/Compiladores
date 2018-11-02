package com.udenar.compiladores.Prefija;

/**
 *
 * @author Diego EG
 */
public interface Operaciones {

    public static int suma(int a, int b){return a+b;};
    public static int resta(int a, int b, int c){return a-b;};
    public static int multiplicacion(int a, int b){return a*b;};
    public static int division(int a, int b, int c){return a/b;};
    public static int exponente(int a, int b, int c){return(int)Math.pow(a,b);};
    public static void respuesta(int a){System.out.println("RESULTADO = "+a);};
    
    
}
