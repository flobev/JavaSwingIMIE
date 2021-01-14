/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compagnieaerienneswing.principal;

/**
 *
 * @author flo
 */
public interface IVol {
 
    void vols(Vol vol);
    Aeroport getAeroport();
    Reservation geReservation();
    Compagnie geCompagnie();
}
