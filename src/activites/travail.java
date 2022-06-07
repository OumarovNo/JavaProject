/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activites;

import java.io.Serializable;
import java.util.Vector;

import vehicle.*;


public class travail implements Serializable
{
    private int idMecanicienEnCharge;
    private voiture voit;
    private String instructions;
    private String typeTravail;
    

    public travail(travail t)
    {
        this.idMecanicienEnCharge = t.getIdMecanicienEnCharge();
        this.voit = new voiture(t.getVoit());
        this.instructions = t.getInstructions();
        this.typeTravail = t.getTypeTravail();
    }
    public travail(int idMecanicienEnCharge, voiture gova, String instructions) {
        this.idMecanicienEnCharge = idMecanicienEnCharge;
        this.voit = gova;
        this.instructions = instructions;
    }
    
  
    
    
    public travail(Vector v){
        if(v!= null)
        {
            boolean plaqueB;
            if(v.get(1).toString().equals("true"))
                plaqueB = true;
            else
                plaqueB = false;
            
            this.voit = new voiture(v.get(3).toString(),new typeVoiture(v.get(0).toString()),v.get(2).toString(),plaqueB);
            this.setTypeTravail(v.get(5).toString());
            this.setInstructions(v.get(6).toString());
        }else
            System.out.println("v == null");
    }
    public travail()
    {
        
    }

    public int getIdMecanicienEnCharge() {
        return idMecanicienEnCharge;
    }

    public void setIdMecanicienEnCharge(int idMecanicienEnCharge) {
        this.idMecanicienEnCharge = idMecanicienEnCharge;
    }

    public voiture getVoit() {
        return voit;
    }

    public void setVoit(voiture voit) {
        this.voit = voit;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getTypeTravail() {
        return typeTravail;
    }

    public void setTypeTravail(String typeTravail) {
        this.typeTravail = typeTravail;
    }

    @Override
    public String toString() {
        return getVoit().getTypeVoiture().toString() + "(" + getVoit().getProprio() + ")";
    }



    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        final travail other = (travail) obj;

        if (! this.getVoit().equals(other.getVoit())) {
            return false;
        }
        return true;
    }
    
        public void afficheTravail()
    {
        
        System.out.println("belge = "+getVoit().isPlaqueBelge());
        System.out.println("typeTrav = "+getTypeTravail());
        System.out.println("instructPart = "+getInstructions());
        
    }
    
}