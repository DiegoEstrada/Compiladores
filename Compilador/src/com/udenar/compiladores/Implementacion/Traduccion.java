
package com.udenar.compiladores.Implementacion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class Traduccion 
{    
    public String getFuente(String nombreArchivo){
        String pseudocodigo="";     
        File archivo;
        FileReader fr;
        BufferedReader br;
        try{
            
            archivo = new File(nombreArchivo);
            fr=new FileReader(archivo);
            br= new BufferedReader(fr);
            
            String linea;            
            while((linea=br.readLine())!=null)
            {
                pseudocodigo=pseudocodigo+linea;               
            }
            
            fr.close();
            br.close();
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de lectura de código fuente"+e);
        }
        return pseudocodigo;
    }
    
    public void setTraduccion(String nombreArchivo,String codigoJS)
    {
        File archivo;
        FileWriter fw;
        BufferedWriter bw;
        PrintWriter wr;
        
        try 
        {
            archivo=new File(nombreArchivo);
            fw= new FileWriter(archivo);
            bw=new BufferedWriter(fw);
            wr=new PrintWriter(bw);
            /*
            wr.write("linea1");
            wr.append("linea2");
            wr.append("\nlinea3");
            */
            wr.write(codigoJS);
                    
            wr.close();
            bw.close();            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de escritura de código traducido"+e);

        }
    }
}


