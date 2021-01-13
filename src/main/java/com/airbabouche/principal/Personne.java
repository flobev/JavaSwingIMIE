/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.airbabouche.principal;

import java.util.Date;

/**
 *
 * @author flo
 */
public class Personne {
    
    private int idpersonne;
    private String nom;
    private String prenom;
    private Date dateNaiss;
    private String adresse;
    private String ville;
    private String zipcode;
    private int pays_idPays;

    public Personne(int idpersonne, String nom, String prenom, Date dateNaiss, String adresse, String ville, String zipcode, int pays_idPays) {
        this.idpersonne = idpersonne;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaiss = dateNaiss;
        this.adresse = adresse;
        this.ville = ville;
        this.zipcode = zipcode;
        this.pays_idPays = pays_idPays;
    }

    public int getIdpersonne() {
        return idpersonne;
    }

    public void setIdpersonne(int idpersonne) {
        this.idpersonne = idpersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaiss() {
        return dateNaiss;
    }

    public void setDateNaiss(Date dateNaiss) {
        this.dateNaiss = dateNaiss;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public int getPays_idPays() {
        return pays_idPays;
    }

    public void setPays_idPays(int pays_idPays) {
        this.pays_idPays = pays_idPays;
    }
    
}
