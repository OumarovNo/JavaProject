/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activites;

import java.util.Objects;
import java.util.Vector;

import vehicle.*;

/**
 *
 * @author Nohch
 */
/*
public class travail {



    public travail(travail t) {
       
        this.belge = t.getBelge();
        this.typeTrav = t.getTypeTrav();
        this.instructionPart = t.getInstructionPart();
    }
    
   
    private voiture voiture;
    private String belge;
    private String typeTrav;
    private String instructionPart;

    public voiture getVoiture() {
        return voiture;
    }

    public void setVoiture(voiture voiture) {
        this.voiture = voiture;
    }
    
    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

   

    public String getTypeTrav() {
        return typeTrav;
    }

    public void setTypeTrav(String typeTrav) {
        this.typeTrav = typeTrav;
    }

    public String getInstructionPart() {
        return instructionPart;
    }

    public void setInstructionPart(String instructionPart) {
        this.instructionPart = instructionPart;
    }


    
    public travail(Vector v) {
        this.voiture = new voiture(v);
        this.belge = v.get(1).toString();  
        this.typeTrav = v.get(4).toString();
        this.instructionPart = v.get(5).toString();
    }
    
    public void afficheTravail()
    {
        
        System.out.println("belge = "+belge);
        System.out.println("typeTrav = "+typeTrav);
        System.out.println("instructPart = "+instructionPart);
        
    }
    
    
    @Override
    public boolean equals(Object obj) { // regarde si deux obj sont ==
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof travail)){
            System.out.println("NOT SAME CLASS");
            return false;
        }
        travail t = (travail)obj;
        
        if(!(this.getBelge().equals(t.getBelge())))return false;
        if(!(this.getTypeTrav().equals(t.getTypeTrav())))return false;
        if(!(this.getInstructionPart().equals(t.getInstructionPart())))return false;
        return true;
    }


}
*/

public class travail
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
        return "travail{" + voit.toString() + ", typeTravail=" + typeTravail + '}';
    }



    @Override
    public boolean equals(Object obj) {
        System.out.println("TEST1");
        if (obj == null) {
            return false;
        }
        System.out.println("TEST2");
        System.out.println(obj.getClass());
        System.out.println(this.getClass());

        /*travailEnCours tEc = new travailEnCours();
        if (getClass() != obj.getClass() && obj.getClass() != tEc.getClass()) {
            return false;
        }*/
        System.out.println("TEST3");
        final travail other = (travail) obj;
        System.out.println("TEST4");
        if (! this.getVoit().equals(other.getVoit())) {
            return false;
        }
        System.out.println("TEST5");
        return true;
    }
    
        public void afficheTravail()
    {
        
        System.out.println("belge = "+getVoit().isPlaqueBelge());
        System.out.println("typeTrav = "+getTypeTravail());
        System.out.println("instructPart = "+getInstructions());
        
    }
    
}