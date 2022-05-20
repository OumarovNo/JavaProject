package MyVariousUtils;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nohch
 */
public class commande implements Serializable {
    private String priorite;
    private String libelle;
    private String type;
    private int quantite;

    public commande(String priorite, String libelle, String type, int quantite) {
        this.priorite = priorite;
        this.libelle = libelle;
        this.type = type;
        this.quantite = quantite;
    }

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "commande{" + "priorite=" + priorite + ", libelle=" + libelle + ", type=" + type + ", quantite=" + quantite + '}';
    }

    
    
    
}
