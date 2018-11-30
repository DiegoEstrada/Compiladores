/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;


/**
 *
 * @author Diego EG
 */
public class Compilador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, ClassNotFoundException, ScriptException {
        // TODO code application logic here
        ScriptEngineManager factory = new ScriptEngineManager();
        ScriptEngine engine = factory.getEngineByName("JavaScript");
        engine.eval("  var f = 'gol';  for(i = 0; i<5; i++){ print('Hi') } print(''+f) ");
    }
}
