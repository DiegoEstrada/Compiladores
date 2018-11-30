package com.udenar.compiladores.Gramatica;

import java.util.ArrayList;

/**
 *
 * @author Diego EG
 */
public class T extends Elemento{
    private final ArrayList<String> CONJUNTO_DE_TERMINALES = new ArrayList();
    private Integer atributo;
    
    /*
        Defininedo un bloque estatico que inicializa los simbolos terminales 
        antes de llamar al constructor
    */
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
      this.CONJUNTO_DE_TERMINALES.add("main");
      this.CONJUNTO_DE_TERMINALES.add("int");
      this.CONJUNTO_DE_TERMINALES.add("boolean");
      this.CONJUNTO_DE_TERMINALES.add("float");
      this.CONJUNTO_DE_TERMINALES.add("if");
      this.CONJUNTO_DE_TERMINALES.add("else");
      this.CONJUNTO_DE_TERMINALES.add(",");
      this.CONJUNTO_DE_TERMINALES.add(";");
    }

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
    


    @Override
    public String toString() {
        return   ""+super.getNombre() ;
    }
    
    
    
}
