/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activites;

import java.util.Vector;
import vehicle.typeVoiture;
import vehicle.voiture;

/**
 *
 * @author Nohch
 */

public class travailEnCours extends travail{

    
    private int numPont;

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj))return false;// travailEnCours == travail + numPont
        if(obj instanceof travailEnCours)
        {
            travailEnCours t = (travailEnCours)obj;
            if(!(t.getNumPont() == this.getNumPont()))
                return false;
            return true;
        }
        
        if(!(obj instanceof travail) /*|| !(obj instanceof Entretien) || !(obj instanceof Reparation) */)return false;
        else return true;
    }

    public travailEnCours(Vector v, int numPont) {
        if(v!= null)
        {
            boolean plaqueB;
            if(v.get(2).toString().equals("true"))
                plaqueB = true;
            else
                plaqueB = false;
            
            this.setVoit(new voiture(v.get(3).toString(),new typeVoiture(v.get(0).toString()),v.get(1).toString(),plaqueB));
            this.setTypeTravail(v.get(4).toString());
            this.setInstructions(v.get(5).toString());
        }else
            System.out.println("v == null");
        if(numPont == -1)
            this.numPont = Integer.parseInt(v.get(6).toString());
        else
            this.numPont = numPont;
        
    }

    public travailEnCours() {
    }
    



    public int getNumPont() {
        return numPont;
    }

    public void setNumPont(int numPont) {
        this.numPont = numPont;
    }
    public travailEnCours(travail t, int pont) {
        super(t);
        numPont = pont;
    }

    @Override
    public void afficheTravail()
    {
        super.afficheTravail();
        System.out.println("numPont ="+getNumPont());
    }

    
}


