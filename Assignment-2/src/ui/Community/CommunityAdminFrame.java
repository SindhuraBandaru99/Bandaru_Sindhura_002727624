/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Community;

import model.City;
import model.Community;
import model.House;
import ui.HomeFrame;

/**
 *
 * @author Sindhura Bandaru
 */
public class CommunityAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
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
        jSplitPaneCommunity1 = new javax.swing.JSplitPane();
        jPanel2 = new javax.swing.JPanel();
        jButtonLogoutCommunityAdminPanel = new javax.swing.JButton();
        jButtonAddCommunity = new javax.swing.JButton();
        jButtonAddHouse = new javax.swing.JButton();
        jButtonAddCity = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonLogoutCommunityAdminPanel.setText("LogOut");
        jButtonLogoutCommunityAdminPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogoutCommunityAdminPanelActionPerformed(evt);
            }
        });

        jButtonAddCommunity.setText("Add Community");
        jButtonAddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCommunityActionPerformed(evt);
            }
        });

        jButtonAddHouse.setText("Add House");
        jButtonAddHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddHouseActionPerformed(evt);
            }
        });

        jButtonAddCity.setText("Add City");
        jButtonAddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCityActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonLogoutCommunityAdminPanel)
                    .addComponent(jButtonAddHouse)
                    .addComponent(jButtonAddCity)
                    .addComponent(jButtonAddCommunity))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonLogoutCommunityAdminPanel)
                .addGap(172, 172, 172)
                .addComponent(jButtonAddCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAddCommunity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAddHouse)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        jSplitPaneCommunity1.setLeftComponent(jPanel2);

        jLabel2.setText("Welcome!");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel2)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jLabel2)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        jSplitPaneCommunity1.setRightComponent(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneCommunity1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPaneCommunity1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLogoutCommunityAdminPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogoutCommunityAdminPanelActionPerformed
        // TODO add your handling code here:
        this.dispose();
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_jButtonLogoutCommunityAdminPanelActionPerformed

    private void jButtonAddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCommunityActionPerformed
        // TODO add your handling code here:
        AddCommunityPanel addCommunityPanel = new AddCommunityPanel();
        jSplitPaneCommunity1.setRightComponent(addCommunityPanel);
        
        addCommunityPanel.tblModel.setRowCount(0);
        for(Community c: AddCommunityPanel.communities){
            Object[] data = {c.getCommunityName(), c.getCityName(), c.getPostalCode()};
            addCommunityPanel.tblModel.addRow(data);
        }
    }//GEN-LAST:event_jButtonAddCommunityActionPerformed

    private void jButtonAddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCityActionPerformed
        // TODO add your handling code here:
        AddCityPanel addCityPanel = new AddCityPanel();
        jSplitPaneCommunity1.setRightComponent(addCityPanel);
        
        addCityPanel.tblModel.setRowCount(0);
        for(City c: AddCityPanel.cities){
            Object[] data = {c.getCityName(), c.getCityState()};
            addCityPanel.tblModel.addRow(data);
        }
    }//GEN-LAST:event_jButtonAddCityActionPerformed

    private void jButtonAddHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddHouseActionPerformed
        // TODO add your handling code here:
        AddHousePanel addHousePanel = new AddHousePanel();
        jSplitPaneCommunity1.setRightComponent(addHousePanel);
        
        addHousePanel.tblModel.setRowCount(0);
        for(House h : addHousePanel.houses){
            Object[]  data = {h.getHouseNo(),h.getCityName(),h.getCommunityName(),h.getPostalCode()};
            addHousePanel.tblModel.addRow(data);
        }
    }//GEN-LAST:event_jButtonAddHouseActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommunityAdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCity;
    private javax.swing.JButton jButtonAddCommunity;
    private javax.swing.JButton jButtonAddHouse;
    private javax.swing.JButton jButtonLogoutCommunityAdminPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSplitPane jSplitPaneCommunity1;
    // End of variables declaration//GEN-END:variables
}
