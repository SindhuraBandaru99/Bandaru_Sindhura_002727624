/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.Doctor;
import model.Patient;
import ui.Community.CommunityAdminFrame;
import ui.Doctor.DoctorFrame;
import ui.Doctor.DoctorPanel;
import ui.Hospital.HospitalAdminFrame;
import ui.Patient.PatientFrame;
import ui.Patient.PatientPanel;
import ui.SystemAdmin.SystemAdminFrame;

/**
 *
 * @author Sindhura Bandaru
 */
public class HomeFrame extends javax.swing.JFrame {

    /**
     * Creates new form HomeFrame
     */
    public HomeFrame() {
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

        jPanelMainFrame = new javax.swing.JPanel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        cmbBoxRole = new javax.swing.JComboBox<>();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelMainFrame.setBackground(new java.awt.Color(0, 153, 153));

        lblUserName.setText("UserName");

        lblPassword.setText("Password");

        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRole.setText("Select Role");

        cmbBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sys Admin", "Community Admin", "Hospital Admin", "Doctor", "Patient" }));
        cmbBoxRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoxRoleActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(102, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("HOSPITAL MANAGEMENT SYSTEM");

        javax.swing.GroupLayout jPanelMainFrameLayout = new javax.swing.GroupLayout(jPanelMainFrame);
        jPanelMainFrame.setLayout(jPanelMainFrameLayout);
        jPanelMainFrameLayout.setHorizontalGroup(
            jPanelMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainFrameLayout.createSequentialGroup()
                .addContainerGap(261, Short.MAX_VALUE)
                .addGroup(jPanelMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelMainFrameLayout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelMainFrameLayout.createSequentialGroup()
                            .addGroup(jPanelMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPassword)
                                .addComponent(lblUserName))
                            .addGap(50, 50, 50)
                            .addGroup(jPanelMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMainFrameLayout.createSequentialGroup()
                            .addComponent(lblRole)
                            .addGap(47, 47, 47)
                            .addComponent(cmbBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))))
                .addGap(283, 283, 283))
        );
        jPanelMainFrameLayout.setVerticalGroup(
            jPanelMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMainFrameLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanelMainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelMainFrameLayout.createSequentialGroup()
                        .addComponent(lblRole)
                        .addGap(32, 32, 32)
                        .addComponent(lblUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPassword)
                        .addGap(6, 6, 6))
                    .addGroup(jPanelMainFrameLayout.createSequentialGroup()
                        .addComponent(cmbBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(btnLogin)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelMainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelMainFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbBoxRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoxRoleActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbBoxRoleActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        char[] password = txtPassword.getPassword();
        String passwordString = String.valueOf(password);
        String role = (String)(cmbBoxRole.getSelectedItem());
        this.setVisible(false);
        if(userName.isEmpty() || password.length == 0) {
            this.setVisible(true);
            JOptionPane.showMessageDialog(this,
                "Enter username & password",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
        }
        else {
            this.setVisible(false);
            if(role.equals("Community Admin")
                && userName.equals("commadmin")
                && passwordString.equals("commadmin")) {
                CommunityAdminFrame communityAdminFrame = new CommunityAdminFrame();
                communityAdminFrame.setVisible(true);
            }
            else if (role.equals("Hospital Admin")
                && userName.equals("hadmin")
                && passwordString.equals("hadmin")) {
                HospitalAdminFrame hospitalAdminFrame = new HospitalAdminFrame();
                hospitalAdminFrame.setVisible(true);
            }
            else if (role.equals("Patient")) {
                for(Patient p: HospitalAdminFrame.patients) {
                    if(userName.equals(p.getUserName()) && passwordString.equals(p.getPassWord())) {
                        PatientFrame patientFrame = new PatientFrame();
                        PatientPanel patientPanel = new PatientPanel(p);
                        patientFrame.setContentPane(patientPanel);
                        patientFrame.setVisible(true);
                    }
                }
            }
            else if (role.equals("Doctor")) {
                for(Doctor d: HospitalAdminFrame.doctors) {
                    if(userName.equals(d.getUserName()) && passwordString.equals(d.getPassWord())) {
                        DoctorFrame doctorFrame = new DoctorFrame();
                        DoctorPanel doctorPanel = new DoctorPanel(d);
                        doctorFrame.setContentPane(doctorPanel);
                        doctorFrame.setVisible(true);
                    }
                }
            }
            else if (role.equals("Sys Admin")
                && userName.equals("sadmin")
                && passwordString.equals("sadmin")) {
                SystemAdminFrame systemAdminFrame = new SystemAdminFrame();
                systemAdminFrame.setVisible(true);
            }
            else {
                this.setVisible(true);
                JOptionPane.showMessageDialog(this,
                "Invalid Credentials",
                "Try Again",
                JOptionPane.ERROR_MESSAGE);
            }
            revalidate();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox<String> cmbBoxRole;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanelMainFrame;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
