/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;
import java.util.Hashtable;


/**
 *
 * @author Nohch
 */
public abstract class PersonnelGarage extends Personne implements authenticate.Identifiable, authenticate.AValider {

    long matricule;
    String mdp;
    String username;
    public void setMatricule(long matricule) {
        this.matricule = matricule;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
   
    
    public PersonnelGarage(String nom, String prenom, String num, String adresse, long matricule)
    {
        super(nom,prenom,num,adresse);
        this.matricule = matricule;
    }
    public PersonnelGarage(){}

    public String getMdp() {
        return mdp;
    }
    

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    static public Hashtable<String,String> userTable = new Hashtable<>();    
    static
    {
        userTable.put("Oumarov","Nohcho");
        userTable.put("Goossens","Thomas");
    }
    @Override
    public boolean isValid() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validate() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
