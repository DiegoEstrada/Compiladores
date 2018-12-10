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
             //CONJUNTO_DE_TERMINALES.add(numeros[i]);
         }
         
         for (int i = 1; i < numeros.length; i++) {
             
             for (int j = 0; j < numeros.length; j++) {
                 getNUMEROS().add(numeros[i]+numeros[j]);
             //CONJUNTO_DE_TERMINALES.add(numeros[i]+numeros[j]);
             }
             
         }
         
         for (int i = 1; i < numeros.length; i++) {
             
             for (int j = 0; j < numeros.length; j++) {
                 
                 for (int k = 0; k < 10; k++) {
                      getNUMEROS().add(numeros[i]+numeros[j]+numeros[k]);
                    //CONJUNTO_DE_TERMINALES.add(numeros[i]+numeros[j]+numeros[k]);
                 }
             }
             
         }
         
         for (int i = 1; i < numeros.length; i++) {
             
             for (int j = 0; j < numeros.length; j++) {
                 
                 for (int k = 0; k < 10; k++) {
                     
                     for (int l = 0; l < 10; l++) {
                         getNUMEROS().add(numeros[i]+numeros[j]+numeros[k]+numeros[l]);
                    //CONJUNTO_DE_TERMINALES.add(numeros[i]+numeros[j]+numeros[k]+numeros[l]);
                     }
                      
                 }
             }
             
         }
          for (int i = 1; i < numeros.length; i++) {
             
             for (int j = 0; j < numeros.length; j++) {
                 
                 for (int k = 0; k < numeros.length; k++) {
                     
                     for (int l = 0; l < numeros.length; l++) {
                         
                         for (int m = 0; m < numeros.length; m++) {
                              getNUMEROS().add(numeros[i]+numeros[j]+numeros[k]+numeros[l]+numeros[m]);
                              //CONJUNTO_DE_TERMINALES.add(numeros[i]+numeros[j]+numeros[k]+numeros[l]);
                         }
                        
                     }
                      
                 }
             }
             
         }
   
         System.out.println("SIZE N "+getNUMEROS().size());
     }
     
     
      public static void getVariables(){
         String numeros[] = {"0","1","2","3","4","5","6","7","8","9"};
         String letras [] = {"a","b","c","d","e"};
         for (int i = 0; i < letras.length; i++) {
             getVARIABLES().add(letras[i]);
             //CONJUNTO_DE_TERMINALES.add(letras[i]);
         }
         
         
         for (int i = 0; i < letras.length; i++) {
             for (int j = 0; j < letras.length; j++) {
                 getVARIABLES().add(letras[i]+letras[j]);
             }

         }
         
         for (int i = 0; i < letras.length; i++) {
             for (int j = 0; j < letras.length; j++) {
                 for (int k = 0; k < letras.length; k++) {
                     getVARIABLES().add(letras[i]+letras[j]+letras[k]);
                 }
             }

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
