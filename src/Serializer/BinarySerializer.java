/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializer;

import forms.containerListe;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OptionalDataException;
import javax.swing.JOptionPane;

/**
 *
 * @author Nohch
 */
public class BinarySerializer {
    private final static String atelierPath;
    
    static{
        atelierPath = "data"+System.getProperty("file.separator")+ " atelier.dat";
    }
    
    public static void serializeAtelier(containerListe atelier) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(atelierPath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(atelier);
    }
    
    public static void deserializeAtelier(containerListe atelier)throws FileNotFoundException, IOException, OptionalDataException
    {        
        try
        {
            FileInputStream fileInputStream = new FileInputStream(atelierPath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            forms.containerListe deserializedUser = (forms.containerListe) objectInputStream.readObject();
            atelier.setTravauxAFaire(deserializedUser.getTravauxAFaire());
            atelier.setTravauxEnCours(deserializedUser.getTravauxEnCours());
            atelier.setTravauxTermines(deserializedUser.getTravauxTermines());
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Erreur deserialize : Fichier pas trouvé ::" + ex.getMessage());
            
            try 
            {
                System.out.println("Tentative de création fichier ");
            
                File myObj = new File(atelierPath);
                if (myObj.createNewFile())
                {
                    System.out.println("File created: " + myObj.getName());
                } 
                else
                {
                    System.out.println("File already exists.");
                }
            } catch (IOException e)
            {
              System.out.println("An error occurred.");
              e.printStackTrace();
            }
            
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("Erreur deserialize : Classe pas trouvée ::" + ex.getMessage());
        }
        catch(OptionalDataException ex)
        {
            System.out.println("Erreur deserialize : OptionalDataException::" + ex.getMessage());
        }
        catch(Exception ex)
        {
            System.out.println("Erreur deserialize : Exception non identifée  ::" + ex.getMessage());
        }
    }
}
