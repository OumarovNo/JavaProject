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
public class Entretien extends travail{

   // private String code;
    
    public Entretien(int idMecanicienEnCharge, voiture gova, String instructions) {
        super(idMecanicienEnCharge, gova, instructions);
        
    }

    public Entretien(Vector v) {
        super(v);
    }
    


    
    
}
