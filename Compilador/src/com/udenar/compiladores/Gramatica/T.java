package com.udenar.compiladores.Gramatica;

import java.util.ArrayList;

/**
 *
 * @author Diego EG
 */
public class T extends Elemento{
    private static final ArrayList<String> CONJUNTO_DE_TERMINALES = Simbolos.getSimbolos();
    private static final ArrayList<String> CONJUNTO_DE_VARIABLES= Simbolos.getVARIABLES();
    private static final ArrayList<String> CONJUNTO_DE_NUMEROS= Simbolos.getNUMEROS();
    private Integer atributo;
    
    /*
        Defininedo un bloque estatico que inicializa los simbolos terminales 
        antes de llamar al constructor
    */
    /*
    {
      this.CONJUNTO_DE_TERMINALES.add(" ");
      this.CONJUNTO_DE_TERMINALES.add("0");
      this.CONJUNTO_DE_TERMINALES.add("1");
      this.CONJUNTO_DE_TERMINALES.add("2");
      this.CONJUNTO_DE_TERMINALES.add("3");
      this.CONJUNTO_DE_TERMINALES.add("4");
      this.CONJUNTO_DE_TERMINALES.add("5");
      this.CONJUNTO_DE_TERMINALES.add("6");
      this.CONJUNTO_DE_TERMINALES.add("7");
      this.CONJUNTO_DE_TERMINALES.add("8");
      this.CONJUNTO_DE_TERMINALES.add("9");
      this.CONJUNTO_DE_TERMINALES.add("+");
      this.CONJUNTO_DE_TERMINALES.add("-");
      this.CONJUNTO_DE_TERMINALES.add("*");
      this.CONJUNTO_DE_TERMINALES.add("/");
      this.CONJUNTO_DE_TERMINALES.add("^");
      this.CONJUNTO_DE_TERMINALES.add("=");
      this.CONJUNTO_DE_TERMINALES.add("(");
      this.CONJUNTO_DE_TERMINALES.add(")");
      this.CONJUNTO_DE_TERMINALES.add("{");
      this.CONJUNTO_DE_TERMINALES.add("}");
      this.CONJUNTO_DE_TERMINALES.add("a");
      this.CONJUNTO_DE_TERMINALES.add("b");
      this.CONJUNTO_DE_TERMINALES.add("c");
      this.CONJUNTO_DE_TERMINALES.add("d");
      this.CONJUNTO_DE_TERMINALES.add("var");
      this.CONJUNTO_DE_TERMINALES.add("main");
      this.CONJUNTO_DE_TERMINALES.add("$");
      this.CONJUNTO_DE_TERMINALES.add("ID");
      this.CONJUNTO_DE_TERMINALES.add("write");
      this.CONJUNTO_DE_TERMINALES.add("read");
      this.CONJUNTO_DE_TERMINALES.add("begin");
      this.CONJUNTO_DE_TERMINALES.add("INTLITERAL");
      this.CONJUNTO_DE_TERMINALES.add("end");
      this.CONJUNTO_DE_TERMINALES.add("int");
      this.CONJUNTO_DE_TERMINALES.add("boolean");
      this.CONJUNTO_DE_TERMINALES.add("float");
      this.CONJUNTO_DE_TERMINALES.add("if");
      this.CONJUNTO_DE_TERMINALES.add("else");
      this.CONJUNTO_DE_TERMINALES.add(",");
      this.CONJUNTO_DE_TERMINALES.add(";");
      this.CONJUNTO_DE_TERMINALES.add("print");
    }

    */
    public T(String nombre) {
        super(nombre);
        if(CONJUNTO_DE_TERMINALES.contains(nombre))
            this.atributo=0;
        else
            System.out.println("CARACTER TERMINAL NO VALIDO"); //Lanzar una excepcion 
        
    }
    
    public boolean hasAtributo(){
        return this.atributo!=null;
    }

    /**
     * @return the atributo
     */
    public int getAtributo() {
        return atributo;
    }

    /**
     * @param atributo the atributo to set
     */
    public void setAtributo(int atributo) {
        this.atributo = atributo;
    }
    
   
    /**
     * @return the CONJUNTO_DE_TERMINALES
     */
    public static ArrayList<String> getCONJUNTO_DE_TERMINALES() {
        return CONJUNTO_DE_TERMINALES;
    }
    
    public static ArrayList<String> getCONJUNTO_DE_VARIABLES() {
        return CONJUNTO_DE_VARIABLES;
    }
       
    
    /**
     * @return the CONJUNTO_DE_NUMEROS
     */
    public static ArrayList<String> getCONJUNTO_DE_NUMEROS() {
        return CONJUNTO_DE_NUMEROS;
    }


    
    @Override
    public String toString() {
        return   ""+super.getNombre() ;
    }

    
    
}
