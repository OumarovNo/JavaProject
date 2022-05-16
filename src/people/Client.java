/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package people;

/**
 *
 * @author Nohch
 */
public class Client extends Personne implements authenticate.Identifiable{

    private int ClientId;
    
    
    @Override
    public int getId() {
        return ClientId;
    }

    @Override
    public void setId(int i) {
        this.ClientId = i; 
    }
    public Client(String prop) {
        
        this.setNom(prop);
    }

    @Override
    public String toString() {
        return  nom + prenom;
    }
    public Client(long idClient) {
        
        this.idClient = idClient;
    }
    long idClient;
    public Client() {
    }
    
}
