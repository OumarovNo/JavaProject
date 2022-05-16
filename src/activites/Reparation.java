/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activites;

import java.util.Vector;
import vehicle.voiture;

/**
 *
 * @author Nohch
 */
public class Reparation extends travail {

    //Ajouter quelque chose
    private float coutEstime;

    public float getCoutEstime() {
        return coutEstime;
    }

    public void setCoutEstime(float coutEstime) {
        this.coutEstime = coutEstime;
    }

    public float getTempsEstime() {
        return tempsEstime;
    }

    public void setTempsEstime(float tempsEstime) {
        this.tempsEstime = tempsEstime;
    }
    private float tempsEstime;
    public Reparation(int idMecanicienEnCharge, voiture gova, String instructions) {
        super(idMecanicienEnCharge, gova, instructions);
    }

    public Reparation(float coutEstime, float tempsEstime, int idMecanicienEnCharge, voiture gova, String instructions) {
        super(idMecanicienEnCharge, gova, instructions);
        this.coutEstime = coutEstime;
        this.tempsEstime = tempsEstime;
    }
    
    public Reparation(Vector v)
    {
        super(v);
    }
    
    
}
