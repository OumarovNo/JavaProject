/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyVariousUtils;

import java.util.Vector;
import java.io.*;
import java.nio.file.Path;
import java.util.Date;
/**
 *
 * @author Nohch
 */
public class FichierLog {
    
    private String path;
    private File file;
    public FichierLog(String pathToFile)
    {
        path = pathToFile;
        try
        {
            file = new File(path);
            if(!file.exists())
            {
                file.createNewFile();
            }
        }
        catch(IOException ex)
        {
            System.out.println("Erreur Constructor FichierLog :: "+ex.getMessage());
        }
    }
    

    
    public String getName() 
    {
        return file.getName();
    }


    public void writeLine(String line)
    {
        try 
        { 
            FileWriter f = new FileWriter(path, true); 
            BufferedWriter bf = new BufferedWriter(f); 
            bf.write("["+new Date() + "] : " + line); 
            bf.newLine(); 
            bf.close(); 
        } 
        catch (IOException e) 
        { 
            System.out.println(e.getMessage()); 
        }
    }
    
    
    public int getNumberOfRows()
    {
       int numberOfRows = 0;
       try
       {
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            /* read log line by line */
            while ((strLine = br.readLine()) != null)   {
                 /* parse strLine to obtain what you want */
                 numberOfRows++;
                 System.out.println (strLine);
       }
       fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
       return numberOfRows;
    }
    public Vector listRows()
    {
        Vector v = new Vector();
        try
        {
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            /* read log line by line */
            while ((strLine = br.readLine()) != null)
            {
                 /* parse strLine to obtain what you want */
                 v.add(strLine);
                 System.out.println (strLine);
            }
            fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return v;
    }
    public Vector listRows(String chaineQuiDoitFigurerDansLesLignesRetenues)
    {
        Vector v = new Vector();
        try
        {
            FileInputStream fstream = new FileInputStream(path);
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            /* read log line by line */
            while ((strLine = br.readLine()) != null)
            {
                if(strLine.equals(chaineQuiDoitFigurerDansLesLignesRetenues))
                    v.add(strLine);
                 /* parse strLine to obtain what you want */
                 System.out.println (strLine);
            }
            fstream.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        return v;
    }
}
