/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Community;

import javax.swing.JPanel;
import model.City;
import model.Community;
import ui.HomeFrame;

/**
 *
 * @author Sindhura Bandaru
 */
public class CommunityAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form CommunityAdminFrame
     */
    HomeFrame homeFrame;
    public CommunityAdminFrame() {
        initComponents();
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
        jSplitPaneCommunity = new javax.swing.JSplitPane();
        jPanelCommunity = new javax.swing.JPanel();
        jButtonAddCommunity = new javax.swing.JButton();
        jButtonAddCity = new javax.swing.JButton();
        btnLogoutCommunityAdminPanel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonAddCommunity.setText("Add Community");
        jButtonAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCommunityActionPerformed(evt);
            }
        });

        jButtonAddCity.setText("Add City");
        jButtonAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCityActionPerformed(evt);
            }
        });

        btnLogoutCommunityAdminPanel.setText("Logout");
        btnLogoutCommunityAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutCommunityAdminPanelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCommunityLayout = new javax.swing.GroupLayout(jPanelCommunity);
        jPanelCommunity.setLayout(jPanelCommunityLayout);
        jPanelCommunityLayout.setHorizontalGroup(
            jPanelCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCommunityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButtonAddCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAddCommunity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanelCommunityLayout.createSequentialGroup()
                .addComponent(btnLogoutCommunityAdminPanel)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelCommunityLayout.setVerticalGroup(
            jPanelCommunityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCommunityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogoutCommunityAdminPanel)
                .addGap(136, 136, 136)
                .addComponent(jButtonAddCity)
                .addGap(18, 18, 18)
                .addComponent(jButtonAddCommunity)
                .addContainerGap(279, Short.MAX_VALUE))
        );

        jSplitPaneCommunity.setTopComponent(jPanelCommunity);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, 810, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSplitPaneCommunity)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 514, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCommunityActionPerformed
        // TODO add your handling code here:
        AddCommunityPanel addCommunityPanel = new AddCommunityPanel();
        jSplitPaneCommunity.setRightComponent(addCommunityPanel);
    }//GEN-LAST:event_jButtonAddCommunityActionPerformed

    private void jButtonAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCityActionPerformed
        // TODO add your handling code here:
        AddCityPanel addCityPanel = new AddCityPanel();
        jSplitPaneCommunity.setRightComponent(addCityPanel);
    }//GEN-LAST:event_jButtonAddCityActionPerformed

    private void btnLogoutCommunityAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutCommunityAdminPanelActionPerformed

        this.dispose();
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnLogoutCommunityAdminPanelActionPerformed

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
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CommunityAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogoutCommunityAdminPanel;
    private javax.swing.JButton jButtonAddCity;
    private javax.swing.JButton jButtonAddCommunity;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelCommunity;
    private javax.swing.JSplitPane jSplitPaneCommunity;
    // End of variables declaration//GEN-END:variables
}