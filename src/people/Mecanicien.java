/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;
import javax.swing.JOptionPane;


/**
 *
 * @author Nohch
 */
public class Mecanicien extends PersonnelGarage implements Serializable{

    private static String specialite = "Mecanicien";
    @Override
    public void setUsername(String username) {
        super.setUsername(username); //To change body of generated methods, choose Tools | Templates.
    }


    
    @Override
    public boolean validatte() { // boolean mais faut traiter + que 2 cas ..
        /*if(super.getUsername().equals(userTable.get(super.getMdp())))// appel a validate en instanciant un objet mecanicien 
        {
            //TRUE
            System.out.print("LOGIN SUCCESS!");
            return true;   
        }
        else
            if(userTable.contains(super.getUsername()))
            {
                
                JOptionPane.showMessageDialog(null,"Mot de passe incorrect!");
            }
        else
                JOptionPane.showMessageDialog(null,"User pas trouvé!");*/
        return false;
    }

    @Override
    public boolean isValid() {
        return super.isValid(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMatricule(int matricule) {
        super.setMatricule(matricule); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Mecanicien(){
    this("null","null","null","null","null",0);} 
    public Mecanicien(String nom, String prenom, String num, String adresse,String specialite, int matricule) {
        super(nom,prenom,num,adresse,matricule);
        this.specialite = specialite;
    }
    

    @Override
    public int getId() {
        return matricule;
    }

    @Override
    public void setId(int s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
