/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;
import authenticate.Identifiable;
import authenticate.AValider;
import java.util.Hashtable;
import javax.swing.JOptionPane;

/**
 *
 * @author Nohch
 */
public class TechnicienExterieur extends Personne implements Identifiable, AValider{

    String mdp;
    String username;

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

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
    public boolean validate() {
        if(getUsername().equals(userExtTable.get(getMdp())))// appel a validate en instanciant un objet mecanicien 
        {
            //TRUE
            System.out.print("LOGIN SUCCESS!");
            return true;   
        }else
            if(userExtTable.contains(getUsername()))
            {
                
                JOptionPane.showMessageDialog(null,"Mot de passe incorrect!");
            }
        else
                JOptionPane.showMessageDialog(null,"User pas trouvé!");
        return false;
    }

    @Override
    public String getId() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setId(String s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static public Hashtable<String,String> userExtTable = new Hashtable<>();    
    static
    {
        userExtTable.put("123","abc");
        userExtTable.put("456","xyz");
    }
    public TechnicienExterieur() {
    }

    public TechnicienExterieur(String nom, String prenom, String numTel, String adresse) {
        super(nom, prenom, numTel, adresse);
    }
    
    
}
