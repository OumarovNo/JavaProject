/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializer;

import java.io.*;
import java.util.*;
/**
 *
 * @author Nohch
 */
public class propertiesGarage {
    
    private static Properties prop = null;

    public static Properties getProp() {
        return prop;
    }

    public static void setProp(Properties prop) {
        propertiesGarage.prop = prop;
    }
    
    public static String getNomCompletFichierEmploye() 
    { 
        String nomFichier = System.getProperty("user.dir") + System.getProperty("file.separator") 
        + "src" + System.getProperty("file.separator") 
        + new propertiesGarage().getClass().getPackage().getName()+ System.getProperty("file.separator") + "usersEmploye.properties"; 
        return nomFichier; 
    }
    public static String getNomCompletFichierTiers() 
    { 
        String nomFichier = System.getProperty("user.dir") + System.getProperty("file.separator") 
        + "src" + System.getProperty("file.separator") 
        + new propertiesGarage().getClass().getPackage().getName()+ System.getProperty("file.separator") + "usersTiers.properties"; 
        return nomFichier; 
    }
    public propertiesGarage()
    {
        
    }
    public static void load(int roleDistinguisher)
    {
        FileInputStream fis = null;
        try
        {
            if(roleDistinguisher == 0)
            {
                fis = new FileInputStream(getNomCompletFichierEmploye());
            }
            else
            {
                fis = new FileInputStream(getNomCompletFichierTiers());

            }
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
