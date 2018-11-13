package com.udenar.compiladores.Prefija;

import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Diego EG
 */
public class StactTest {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Sal");
        stack.push(new NT("A"));
        stack.push(new T("2"));
        System.out.println(""+stack);
        stack.pop();
        
        
        
        System.out.println(""+stack);
        
    }
}
