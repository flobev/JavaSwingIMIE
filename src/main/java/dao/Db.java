/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author flo
 */
public class Db {
    
    Connection con;
    PreparedStatement pst;

    public Db(Connection con, PreparedStatement pst) {
        this.con = con;
        this.pst = pst;
    }
    
    public void Connection(){
        //A voir mais à utiliser pour faire une connection à la BDD
    }

}
