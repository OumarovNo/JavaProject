/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serializer;

import MyVariousUtils.commande;
import containers.*;
import people.*;
import java.io.*;
import java.util.LinkedList;


/**
 *
 * @author Nohch
 */
public class BinarySerializer {
    private final static String atelierPath;
    private final static String commandePath;
    private final static String usersPath;
    static{
        commandePath = "data"+System.getProperty("file.separator")+ "commande.dat";
        atelierPath = "data"+System.getProperty("file.separator")+ " atelier.dat";
        usersPath = "data"+System.getProperty("file.separator")+ "usersPath.dat";
    }
    
    public static void serializeAtelier(containerListe atelier) throws IOException  // CHANGE PARAM EN INTERFACE SERIALIZABLE
    {
        FileOutputStream fileOutputStream = new FileOutputStream(atelierPath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(atelier);
        fileOutputStream.close();
    }
    
    public static void deserializeAtelier(containerListe atelier)throws FileNotFoundException, IOException, OptionalDataException
    {        
        try
        {
            FileInputStream fileInputStream = new FileInputStream(atelierPath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            containers.containerListe deserializedUser = (containers.containerListe) objectInputStream.readObject();
            atelier.setTravauxAFaire(deserializedUser.getTravauxAFaire());
            atelier.setTravauxEnCours(deserializedUser.getTravauxEnCours());
            atelier.setTravauxTermines(deserializedUser.getTravauxTermines());
            fileInputStream.close();
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
            System.out.println("Erreur deserialize : Exception non identifée (Le fichier est peut être vide)  ::" + ex.getMessage());
        }
    }   
    public static void serializeCommande(LinkedList<commande> com) throws IOException
    {
        FileOutputStream fileOutputStream = new FileOutputStream(commandePath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(com);
        fileOutputStream.close();
    }
    
    public static LinkedList<commande> deserializeCommande(LinkedList<commande> com)throws FileNotFoundException, IOException, OptionalDataException
    {        
        try
        {
            FileInputStream fileInputStream = new FileInputStream(commandePath);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            LinkedList<commande> deserializedCommande = (LinkedList<commande>) objectInputStream.readObject();
            com = deserializedCommande;
            fileInputStream.close();
        }
        catch(FileNotFoundException ex)
        {
            System.out.println("Erreur deserialize : Fichier pas trouvé ::" + ex.getMessage());
            
            try 
            {
                System.out.println("Tentative de création fichier ");
            
                File myObj = new File(commandePath);
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
            System.out.println("Erreur deserialize : Exception non identifée (Le fichier est peut être vide) ::" + ex.getMessage());
        }
    return com;
    }
    
    public static void serializeUser(containerUser userContainer) throws IOException  // CHANGE PARAM EN INTERFACE SERIALIZABLE
    {
        FileOutputStream fileOutputStream = new FileOutputStream(usersPath);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        if(userContainer.isFlagExterieur())
            objectOutputStream.writeObject((TechnicienExterieur)userContainer.getUser());
        else
            objectOutputStream.writeObject((Mecanicien)userContainer.getUser());
        
        fileOutputStream.close();
    }
}

