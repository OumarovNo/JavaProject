/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

import java.util.Objects;

/**
 *
 * @author Nohch
 */
public class voiture {
    
    private String proprio;
    private typeVoiture typeVoiture;
    private String plaqueImma;
    private boolean plaqueBelge;

    public voiture(String proprio, typeVoiture typeVoiture, String plaqueImma, boolean plaqueBelge) {
        this.proprio = proprio;
        this.typeVoiture = typeVoiture;
        this.plaqueImma = plaqueImma;
        this.plaqueBelge = plaqueBelge;
    }

    @Override
    public String toString() {
        return "voiture{" + "proprio=" + proprio + ", typeVoiture=" + typeVoiture + ", plaqueImma=" + plaqueImma + '}';
    }

    public voiture(voiture v)
    {
        this.proprio = new String(v.getProprio());
        this.plaqueImma = new String(v.getPlaqueImma());
        this.plaqueBelge = v.isPlaqueBelge();
        this.typeVoiture = v.getTypeVoiture();
    }
    public String getProprio() {
        return proprio;
    }

    public void setProprio(String proprio) {
        this.proprio = proprio;
    }

    public typeVoiture getTypeVoiture() {
        return typeVoiture;
    }

    public void setTypeVoiture(typeVoiture typeVoiture) {
        this.typeVoiture = typeVoiture;
    }

    public String getPlaqueImma() {
        return plaqueImma;
    }

    public void setPlaqueImma(String plaqueImma) {
        this.plaqueImma = plaqueImma;
    }

    public boolean isPlaqueBelge() {
        return plaqueBelge;
    }

    public void setPlaqueBelge(boolean plaqueBelge) {
        this.plaqueBelge = plaqueBelge;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        System.out.println("TEST6");

        if (getClass() != obj.getClass()) {
            return false;
        }
        System.out.println("TEST7");

        final voiture other = (voiture) obj;
        if (!Objects.equals(this.proprio, other.proprio)) {
            return false;
        }
        System.out.println("TEST8 this plaque :"+this.plaqueImma + "otherplaque " +other.plaqueImma);
        if (!Objects.equals(this.plaqueImma, other.plaqueImma)) {
            return false;
        }
        System.out.println("TEST9");
        return true;
    }
    
    

}
