/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compagnieaerienneswing.principal;

import java.util.Date;

/**
 *
 * @author flo
 */
public class Passager extends Personne {
    private int idpassager;
    private int personne_idpersonne;

    public Passager(int idpassager, int personne_idpersonne, int idpersonne, String nom, String prenom, Date dateNaiss, String adresse, String ville, String zipcode, int pays_idPays) {
        super(idpersonne, nom, prenom, dateNaiss, adresse, ville, zipcode, pays_idPays);
        this.idpassager = idpassager;
        this.personne_idpersonne = idpersonne;
    }

    public int getIdpassager() {
        return idpassager;
    }

    public void setIdpassager(int idpassager) {
        this.idpassager = idpassager;
    }

    public int getIdpersonne() {
        return personne_idpersonne;
    }

    public void setIdpersonne(int idpersonne) {
        this.personne_idpersonne = idpersonne;
    }
    
}
