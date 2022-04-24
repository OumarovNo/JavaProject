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
public class travail {



    public travail(travail t) {
        this.typeVoiture = t.getTypeVoiture();
        this.immatriculation = t.getImmatriculation();
        this.belge = t.getBelge();
        this.proprio = t.getProprio();
        this.typeTrav = t.getTypeTrav();
        this.instructionPart = t.getInstructionPart();
    }
    
   
    private String typeVoiture;
    private String immatriculation;
    private String belge;
    private String proprio;
    private String typeTrav;
    private String instructionPart;

    public String getTypeVoiture() {
        return typeVoiture;
    }

    public void setTypeVoiture(String typeVoiture) {
        this.typeVoiture = typeVoiture;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getBelge() {
        return belge;
    }

    public void setBelge(String belge) {
        this.belge = belge;
    }

    public String getProprio() {
        return proprio;
    }

    public void setProprio(String proprio) {
        this.proprio = proprio;
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
        
        this.typeVoiture = v.get(0).toString();
        this.immatriculation = v.get(1).toString();
        this.belge = v.get(2).toString();
        this.proprio = v.get(3).toString();
        this.typeTrav = v.get(4).toString();
        this.instructionPart = v.get(5).toString();
    }
    
    public void afficheTravail()
    {
        System.out.println("typeVoiture =" + typeVoiture);
        System.out.println("immatriculation = "+immatriculation);
        System.out.println("belge = "+belge);
        System.out.println("proprio = "+proprio);
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
        if(!(this.getTypeVoiture().equals(t.getTypeVoiture())))return false;
        if(!(this.getImmatriculation().equals(t.getImmatriculation())))return false;
        if(!(this.getProprio().equals(t.getProprio())))return false;
        if(!(this.getBelge().equals(t.getBelge())))return false;
        if(!(this.getTypeTrav().equals(t.getTypeTrav())))return false;
        if(!(this.getInstructionPart().equals(t.getInstructionPart())))return false;
        return true;
    }


}
