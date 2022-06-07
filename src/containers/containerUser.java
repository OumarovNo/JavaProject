/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import java.io.Serializable;


/**
 *
 * @author Nohch
 */
public class containerUser implements Serializable {
    private boolean flagExterieur;
    private Object user;
    
    public containerUser(boolean flagExterieur, Object user) {
        this.flagExterieur = flagExterieur;
        this.user = user;
    }

    public boolean isFlagExterieur() {
        return flagExterieur;
    }

    public void setFlagExterieur(boolean flagExterieur) {
        this.flagExterieur = flagExterieur;
    }

    public Object getUser() {
        return user;
    }

    public void setUser(Object user) {
        this.user = user;
    }
    
    
}
