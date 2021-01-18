/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.compagnieaerienneswing.principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author flo
 */
public class JfReservations extends javax.swing.JFrame {
    
    Connection con;
    PreparedStatement pst;
    
    /**
     * Creates new form JfReservations
     */
    public JfReservations() {
        initComponents();
        tableUpdate();
    }
    
    public void tableUpdate(){
        
        int cpt;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3307/airbabouche", "root","");
            pst=con.prepareStatement("select * from reservation");
            ResultSet rs = pst.executeQuery();
            
            ResultSetMetaData rsmd = rs.getMetaData(); //Recupération des données sql
            
            cpt = rsmd.getColumnCount();
            
            DefaultTableModel dtm = (DefaultTableModel)tableReservation.getModel();
            
            dtm.setRowCount(0);
            
            while(rs.next()) {
                
                Vector vect = new Vector();
                
                for (int i = 0; i < cpt; i++) {
                    vect.add(rs.getString("idvol"));
                    vect.add(rs.getString("client_idPersonne"));
                    vect.add(rs.getString("confirmation"));
                    vect.add(rs.getString("personne_idpersonne"));
                }
                dtm.addRow(vect);
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputIdVol = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputIdClient = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputConfirmationReservations = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputIdPersonneReservation = new javax.swing.JTextField();
        btnAjouterReservation = new javax.swing.JButton();
        btnModifierReservation = new javax.swing.JButton();
        btnSupprimerReservation = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableReservation = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(java.awt.Color.gray);

        jLabel1.setText("idVol");

        jLabel2.setText("IdClient");

        jLabel3.setText("Confirmation");

        jLabel4.setText("idPersonne");

        btnAjouterReservation.setText("Ajouter");
        btnAjouterReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterReservationActionPerformed(evt);
            }
        });

        btnModifierReservation.setText("Modifier");
        btnModifierReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierReservationActionPerformed(evt);
            }
        });

        btnSupprimerReservation.setText("Supprimer");
        btnSupprimerReservation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerReservationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jLabel1)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(inputIdVol, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                            .addComponent(inputConfirmationReservations))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputIdPersonneReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btnAjouterReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnModifierReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnSupprimerReservation, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputIdVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(inputIdClient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(inputConfirmationReservations, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(inputIdPersonneReservation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouterReservation)
                    .addComponent(btnModifierReservation)
                    .addComponent(btnSupprimerReservation))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        tableReservation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "idVol", "idPersonne", "Confirmation", "idPersonne"
            }
        ));
        tableReservation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableReservationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableReservation);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAjouterReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterReservationActionPerformed
        // TODO add your handling code here:
        if(inputIdVol.getText().equals("") || inputIdClient.getText().equals("") || inputConfirmationReservations.getText().equals("")|| inputIdPersonneReservation.getText().equals("")){
            JOptionPane.showMessageDialog(this, "Vous devez remplir les champs !", "ATTENTION", JOptionPane.INFORMATION_MESSAGE);;
            inputIdVol.requestFocus();
            inputIdClient.requestFocus();
            inputConfirmationReservations.requestFocus();
            inputIdPersonneReservation.requestFocus();
        } else {
            String idVol = inputIdVol.getText();
            String idClient = inputIdClient.getText();
            String confirmation = inputConfirmationReservations.getText();
            String idPersonne = inputIdPersonneReservation.getText();

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3307/airbabouche", "root","");
                pst=con.prepareStatement("insert into aeroport (idvol, client_idpersonne, confirmation, personne_idpersonne) values (?,?,?,?)");
                pst.setString(1,idVol);
                pst.setString(2,idClient);
                pst.setString(3,confirmation);
                pst.setString(4,idPersonne);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Données enregistrées !");
                
                inputIdVol.setText("");
                inputIdClient.setText("");
                inputConfirmationReservations.setText("");
                inputIdPersonneReservation.setText("");

                tableUpdate();

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAjouterReservationActionPerformed

    private void btnModifierReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierReservationActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tableReservation.getModel();
        int selectedIndex = tableReservation.getSelectedRow();
        
        try {
            
            int idVol = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
            int idClient = Integer.parseInt(dtm.getValueAt(selectedIndex, 1).toString());
            String confirmationReservation = inputConfirmationReservations.getText();
            String idPersonneReservation = inputIdPersonneReservation.getText(); 
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3307/airbabouche", "root","");
            pst=con.prepareStatement("update reservation set confirmation = ?, personne_idpersonne = ? where idvol = ? AND client_idpersonne=?");
            
            pst.setString(1, confirmationReservation);
            pst.setString(2, idPersonneReservation);
            pst.setInt(3, idClient);
            pst.setInt(4, idVol);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Données mises à jour !");
            
            inputConfirmationReservations.setText("");
            inputIdPersonneReservation.setText("");
            
            tableUpdate();
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnModifierReservationActionPerformed

    private void btnSupprimerReservationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerReservationActionPerformed
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tableReservation.getModel();
        int selectedIndex = tableReservation.getSelectedRow();
            
        int idVol = Integer.parseInt(dtm.getValueAt(selectedIndex, 0).toString());
        int idClient = Integer.parseInt(dtm.getValueAt(selectedIndex, 1).toString());
        int dialogResult = JOptionPane.showConfirmDialog(null, "Voulez-vous supprimer cette donnée ?", "Attention !", JOptionPane.YES_NO_OPTION);

        if(dialogResult==JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con= DriverManager.getConnection("jdbc:mysql://localhost:3307/airbabouche", "root","");
                pst=con.prepareStatement("delete from reservation where idvol=? AND client_idpersonne=?");

                pst.setInt(1, idVol);
                pst.setInt(2, idClient);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Donnée supprimée!");

                inputConfirmationReservations.setText("");
                inputIdPersonneReservation.setText("");

                tableUpdate();
            } catch (ClassNotFoundException ex) {
            Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(JfReservations.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSupprimerReservationActionPerformed

    private void tableReservationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableReservationMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel)tableReservation.getModel();
        int selectedIndex = tableReservation.getSelectedRow();
        
        inputIdVol.setText(dtm.getValueAt(selectedIndex, 1).toString());
        inputIdClient.setText(dtm.getValueAt(selectedIndex, 2).toString());
        inputConfirmationReservations.setText(dtm.getValueAt(selectedIndex, 3).toString());
        inputIdPersonneReservation.setText(dtm.getValueAt(selectedIndex, 4).toString());
    }//GEN-LAST:event_tableReservationMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JfReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JfReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JfReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JfReservations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JfReservations().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAjouterReservation;
    private javax.swing.JButton btnModifierReservation;
    private javax.swing.JButton btnSupprimerReservation;
    private javax.swing.JTextField inputConfirmationReservations;
    private javax.swing.JTextField inputIdClient;
    private javax.swing.JTextField inputIdPersonneReservation;
    private javax.swing.JTextField inputIdVol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableReservation;
    // End of variables declaration//GEN-END:variables
}
