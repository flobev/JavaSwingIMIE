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
public class Escale {
    private int vol_idvol;
    private int aeroport_idaeroport;
    private Date date_depart;
    private Date date_arrive;

    public Escale(int vol_idvol, int aeroport_idaeroport, Date date_depart, Date date_arrive) {
        this.vol_idvol = vol_idvol;
        this.aeroport_idaeroport = aeroport_idaeroport;
        this.date_depart = date_depart;
        this.date_arrive = date_arrive;
    }

    public int getVol_idvol() {
        return vol_idvol;
    }

    public void setVol_idvol(int vol_idvol) {
        this.vol_idvol = vol_idvol;
    }

    public int getAeroport_idaeroport() {
        return aeroport_idaeroport;
    }

    public void setAeroport_idaeroport(int aeroport_idaeroport) {
        this.aeroport_idaeroport = aeroport_idaeroport;
    }

    public Date getDate_depart() {
        return date_depart;
    }

    public void setDate_depart(Date date_depart) {
        this.date_depart = date_depart;
    }

    public Date getDate_arrive() {
        return date_arrive;
    }

    public void setDate_arrive(Date date_arrive) {
        this.date_arrive = date_arrive;
    }
}
