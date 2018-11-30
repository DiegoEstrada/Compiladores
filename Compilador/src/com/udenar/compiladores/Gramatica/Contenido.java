package com.udenar.compiladores.Gramatica;

/**
 *
 * @author Diego EG
 */
public class Contenido {
    private T terminal;
    private NT noTerminal;
    private SimboloAccion simboloAccion;
    
    public Contenido(){ //Constructor vacio para considerar e (cadena vacia)
        
    }
    
    public Contenido(T t){
        this.terminal = t;
    }
    
    public Contenido(NT nt){
        this.noTerminal = nt;
    }
    
    public Contenido(SimboloAccion s){
        this.simboloAccion = s;
    }

    /**
     * @return the terminal
     */
    public T getTerminal() {
        return terminal;
    }

    /**
     * @return the noTerminal
     */
    public NT getNoTerminal() {
        return noTerminal;
    }
    
    /**
     * @return the simboloAccion
     */
    public SimboloAccion getSimboloAccion() {
        return simboloAccion;
    }

    @Override
    public String toString() {
        String ret = "";
        String t = (this.terminal!=null)?this.terminal.toString():"";
        String nt = (this.noTerminal!=null)?this.noTerminal.toString():"";
        String sa = (this.simboloAccion!=null)?this.simboloAccion.toString():"";
       
        String contenido;
        
        if(t.isEmpty() && nt.isEmpty() && sa.isEmpty()){
            contenido = "";
        }else{
            if(t.isEmpty() && nt.isEmpty()){
                contenido = sa;
            }else{
                if(nt.isEmpty() && sa.isEmpty()){
                    contenido = t;
                }
                else{
                    contenido = nt;
                }
            }
        }
            ret = ""+ contenido+"";
        return ret;
        //return "Contenido{" + "terminal=" + terminal + ", noTerminal=" + noTerminal + '}';
    }
    
    
}
