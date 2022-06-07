/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

import java.io.Serializable;


/**
 *
 * @author Nohch
 */
public abstract class PersonnelGarage extends Personne implements authenticate.Identifiable, authenticate.AValider {

    int matricule;
    String username;
    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }


   
    
    public PersonnelGarage(String nom, String prenom, String num, String adresse, int matricule)
    {
        super(nom,prenom,num,adresse);
        this.matricule = matricule;
    }
    public PersonnelGarage(){}


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validatte() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
