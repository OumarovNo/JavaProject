/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossierjava;

import activites.travail;
import activites.travailEnCours;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Nohch
 */
public class containerListe implements Serializable {
    private List<travail> travauxAFaire;

    public List<travail> getTravauxAFaire() {
        return travauxAFaire;
    }

    public void setTravauxAFaire(List<travail> travauxAFaire) {
        this.travauxAFaire = travauxAFaire;
    }

    public List<travailEnCours> getTravauxEnCours() {
        return travauxEnCours;
    }

    public void setTravauxEnCours(List<travailEnCours> travauxEnCours) {
        this.travauxEnCours = travauxEnCours;
    }

    public List<travailEnCours> getTravauxTermines() {
        return travauxTermines;
    }

    public void setTravauxTermines(List<travailEnCours> travauxTermines) {
        this.travauxTermines = travauxTermines;
    }
    private List<travailEnCours> travauxEnCours,travauxTermines;

    public containerListe(List<travail> travauxAFaire, List<travailEnCours> travauxEnCours, List<travailEnCours> travauxTermines) {
        this.travauxAFaire = travauxAFaire;
        this.travauxEnCours = travauxEnCours;
        this.travauxTermines = travauxTermines;
    }
    
    public containerListe()
    {
        travauxAFaire = new LinkedList();
        travauxEnCours = new LinkedList();
        travauxTermines = new LinkedList();
    }
}
