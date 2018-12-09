package com.udenar.compiladores.Gramatica;

import java.util.ArrayList;

/**
 *
 * @author Diego EG
 */
public  class Simbolos {
    
    private static final ArrayList<String> CONJUNTO_DE_TERMINALES = new ArrayList();
    private static final ArrayList<String> NUMEROS = new ArrayList(); //SOLO SE SOPORTARAN NUMEROS DE 5 CIFRAS
    private static  final ArrayList<String> VARIABLES = new ArrayList(); //SOLO SE SOPORTARAN VARIABLES DE LONGITUD 10
    private static final int LONGITUD_NUMERO = 5;
    private static final int LONGITUD_VARIABLE = 10;
    
     
     public static ArrayList<String>  getSimbolos(){
      CONJUNTO_DE_TERMINALES.add("ε");
      CONJUNTO_DE_TERMINALES.add("+");
      CONJUNTO_DE_TERMINALES.add("-");
      CONJUNTO_DE_TERMINALES.add("*");
      CONJUNTO_DE_TERMINALES.add("/");
      CONJUNTO_DE_TERMINALES.add("^");
      CONJUNTO_DE_TERMINALES.add("=");
      CONJUNTO_DE_TERMINALES.add("(");
      CONJUNTO_DE_TERMINALES.add(")");
      CONJUNTO_DE_TERMINALES.add("{");
      CONJUNTO_DE_TERMINALES.add("}");
      //CONJUNTO_DE_TERMINALES.add("a");
      //CONJUNTO_DE_TERMINALES.add("b");
      //CONJUNTO_DE_TERMINALES.add("c");
      //CONJUNTO_DE_TERMINALES.add("d");
      CONJUNTO_DE_TERMINALES.add("var");
      CONJUNTO_DE_TERMINALES.add("main");
      CONJUNTO_DE_TERMINALES.add("$");
      CONJUNTO_DE_TERMINALES.add("ID");
      CONJUNTO_DE_TERMINALES.add("write");
      CONJUNTO_DE_TERMINALES.add("read");
      CONJUNTO_DE_TERMINALES.add("begin");
      CONJUNTO_DE_TERMINALES.add("INTLITERAL");
      CONJUNTO_DE_TERMINALES.add("end");
      CONJUNTO_DE_TERMINALES.add("int");
      CONJUNTO_DE_TERMINALES.add("boolean");
      CONJUNTO_DE_TERMINALES.add("float");
      CONJUNTO_DE_TERMINALES.add("if");
      CONJUNTO_DE_TERMINALES.add("else");
      CONJUNTO_DE_TERMINALES.add(",");
      CONJUNTO_DE_TERMINALES.add(";");
      CONJUNTO_DE_TERMINALES.add("print");
      getNumeros();
      getVariables();
      
         System.out.println("TOT "+CONJUNTO_DE_TERMINALES.size());
         
         return CONJUNTO_DE_TERMINALES;
     }
     
     private static void getNumeros(){
         String numeros[] = {"0","1","2","3","4","5","6","7","8","9"};
         
         for (int i = 0; i < numeros.length; i++) {
             
             getNUMEROS().add(numeros[i]);
             CONJUNTO_DE_TERMINALES.add(numeros[i]);
         }
   
         System.out.println("SIZE N "+getNUMEROS().size());
     }
     
     
      public static void getVariables(){
         String numeros[] = {"0","1","2","3","4","5","6","7","8","9"};
         String letras [] = {"a","c","l"};
         for (int i = 0; i < letras.length; i++) {
             
             getVARIABLES().add(letras[i]);
             CONJUNTO_DE_TERMINALES.add(letras[i]);
         }
         
        
         System.out.println("SIZE V "+getVARIABLES().size());
     }

    /**
     * @return the NUMEROS
     */
    public static ArrayList<String> getNUMEROS() {
        return NUMEROS;
    }

    /**
     * @return the VARIABLES
     */
    public static ArrayList<String> getVARIABLES() {
        return VARIABLES;
    }
    
    
}
