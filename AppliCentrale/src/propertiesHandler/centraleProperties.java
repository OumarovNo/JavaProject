/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propertiesHandler;

import java.io.*;
import java.util.*;
/**
 *
 * @author Nohch
 */
public class centraleProperties {
    
    private static Properties prop = null;

    public static Properties getProp() {
        return prop;
    }

    public static void setProp(Properties prop) {
        centraleProperties.prop = prop;
    }
    
    public static String getNomCompletFichierConfig() 
    { 
        String nomFichier = System.getProperty("user.dir") + System.getProperty("file.separator") 
        + "src" + System.getProperty("file.separator") 
        + new centraleProperties().getClass().getPackage().getName()+ System.getProperty("file.separator") + "config.properties"; 
        return nomFichier; 
    }

    public centraleProperties()
    {
        
    }
    public static void load()
    {
        FileInputStream fis = null;
        try
        {
            fis = new FileInputStream(getNomCompletFichierConfig());
            prop = new Properties();
            prop.load(fis);
            
        }
        catch(FileNotFoundException fnfe)
        {
             fnfe.printStackTrace();
        } catch(IOException ioe)
        {
             ioe.printStackTrace();
        }
        finally 
        {
            try
            {
               fis.close();
            }
            catch(Exception ex)
            {
                System.out.println("Erreur dans load :: " + ex.getMessage());
            }
      }
      
   
    }
}
