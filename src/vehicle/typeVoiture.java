/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author t-goo-N-Oum
 */
public class typeVoiture {

     private String Marque;
     private String Type;
     private String Modele;
     private String Motorisation;
     private int NbPortes;

    public typeVoiture(String Marque, String Type, String Modele, String Motorisation, int NbPortes) throws MissingTradeMarkException {
        if(Marque != null)
            this.Marque = Marque;
        else
            throw new MissingTradeMarkException("Marque invalide!");
        this.Type = Type;
        this.Modele = Modele;
        this.Motorisation = Motorisation;
        this.NbPortes = NbPortes;
    }

    public typeVoiture(String Type) {
        this.Type = Type;
    }
     
    
     
    public typeVoiture() {
        this.Type = null;
        this.Modele = null;
        this.Motorisation = null;
        this.NbPortes = 0;
    }
    
    public String getMarque()
    {
        return Marque;
    }
    
    public String getType()
    {
        return Type;
    }
     
    public String getModele()
    {
        return Modele;
    }
      
    public String getMotorisation() 
    {
        return Motorisation;
    }
    
    public int getNbPortes()
    {
        return NbPortes;
    }
    
    public void setMarque(String Marque) 
    {
        this.Marque = Marque;
    }
    
    public void setModele(String Modele) 
    {
        this.Modele = Modele;
    }
    public void setMotorisation(String Motorisation) 
    {
        this.Motorisation = Motorisation;
    }
    public void setNbPortes(int NbPortes) 
    {
        this.NbPortes = NbPortes;
    }
    public void setType(String Type) 
    {
        this.Type = Type;
    }
    @Override
    public String toString() {
        return Type ;
    }
    
    
   
}
