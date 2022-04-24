/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travaux;

import java.util.Vector;

/**
 *
 * @author Nohch
 */
public class travailEnCours extends travail{

    @Override
    public boolean equals(Object obj) {
        if(!super.equals(obj))return false;// travailEnCours == travail + numPont
        if(!(obj instanceof travailEnCours))return false;
        travailEnCours t = (travailEnCours)obj;
        if(!(t.getNumPont() == this.getNumPont()))
            return false;
        return true;
    }

    public travailEnCours(Vector v) {
        super(v);
        this.numPont = Integer.parseInt(v.get(6).toString());
        
    }
    
    private int numPont;
    public travailEnCours(Vector v, int pont) {
        super(v);
        numPont = pont;
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
