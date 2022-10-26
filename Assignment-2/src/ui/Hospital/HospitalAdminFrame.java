/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui.Hospital;

import javax.swing.table.DefaultTableModel;
import model.City;
import model.Hospital;
import model.HospitalDirectory;
import ui.Community.AddCityPanel;
import ui.HomeFrame;

/**
 *
 * @author Sindhura Bandaru
 */
public class HospitalAdminFrame extends javax.swing.JFrame {

    /**
     * Creates new form HospitalAdminFrame
     */
    Hospital hospital;
    DefaultTableModel tblModel;
    HospitalDirectory listOfHospitals = new HospitalDirectory();
    public void setCityCombobox(){
        jComboBoxHospitalCity.removeAllItems();
        for(City city: AddCityPanel.cities){
            jComboBoxHospitalCity.addItem(city.getCityName());
        }
    }
    public HospitalAdminFrame() {
        initComponents();
        setCityCombobox();
        tblModel = (DefaultTableModel)tableHospitals.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelAddHospitals = new javax.swing.JPanel();
        jLabelHospitalName = new javax.swing.JLabel();
        jLabelHospitalCommunity = new javax.swing.JLabel();
        jLabelHospitalCity = new javax.swing.JLabel();
        jLabelHospitalPostalCode = new javax.swing.JLabel();
        jLabelHospitalCode = new javax.swing.JLabel();
        tfHospitalCode = new javax.swing.JTextField();
        tfHospitalCommunity = new javax.swing.JTextField();
        tfHospitalName = new javax.swing.JTextField();
        tfHospitalPostalCode = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableHospitals = new javax.swing.JTable();
        jComboBoxHospitalCity = new javax.swing.JComboBox<>();
        jPaneladdDoctors = new javax.swing.JPanel();
        jLabelDoctoreName = new javax.swing.JLabel();
        jLabelDoctorId = new javax.swing.JLabel();
        jLabelAge = new javax.swing.JLabel();
        jLabelGender = new javax.swing.JLabel();
        jLabelHospitalNameDoctorPanel = new javax.swing.JLabel();
        jLabelDepartment = new javax.swing.JLabel();
        jLabelPhoneNum = new javax.swing.JLabel();
        tfDoctorId = new javax.swing.JTextField();
        tfDoctorName = new javax.swing.JTextField();
        tfAge = new javax.swing.JTextField();
        tfHospitalNameDoctorPanel = new javax.swing.JTextField();
        tfDepartment = new javax.swing.JTextField();
        tfPhoneNumber = new javax.swing.JTextField();
        rdbuttonMale = new javax.swing.JRadioButton();
        rdButtonFemale = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanelAddPatients = new javax.swing.JPanel();
        jPanelAddEncounters = new javax.swing.JPanel();
        btnLogoutHospitalAdminFrame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelHospitalName.setText("Hospital Name");

        jLabelHospitalCommunity.setText("Hospital Community");

        jLabelHospitalCity.setText("Hospital City");

        jLabelHospitalPostalCode.setText("Hospital Postal Code");

        jLabelHospitalCode.setText("Hospital Code");

        tfHospitalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalCodeActionPerformed(evt);
            }
        });

        tfHospitalCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalCommunityActionPerformed(evt);
            }
        });

        tfHospitalPostalCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHospitalPostalCodeActionPerformed(evt);
            }
        });

        jButton1.setText("Add Hospital");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tableHospitals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Community", "Code", "City", "Postal Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableHospitals);

        jComboBoxHospitalCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanelAddHospitalsLayout = new javax.swing.GroupLayout(jPanelAddHospitals);
        jPanelAddHospitals.setLayout(jPanelAddHospitalsLayout);
        jPanelAddHospitalsLayout.setHorizontalGroup(
            jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAddHospitalsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelHospitalCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelHospitalCommunity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabelHospitalPostalCode)
                    .addComponent(jLabelHospitalCode, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tfHospitalName, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                        .addComponent(tfHospitalCode)
                        .addComponent(tfHospitalCommunity)
                        .addComponent(tfHospitalPostalCode))
                    .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jComboBoxHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelAddHospitalsLayout.setVerticalGroup(
            jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAddHospitalsLayout.createSequentialGroup()
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHospitalName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHospitalCode)
                            .addComponent(tfHospitalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHospitalCommunity)
                            .addComponent(tfHospitalCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHospitalCity)
                            .addComponent(jComboBoxHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAddHospitalsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfHospitalPostalCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelHospitalPostalCode)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Hospital", jPanelAddHospitals);

        jLabelDoctoreName.setText("Doctor name");

        jLabelDoctorId.setText("Doctor Id");

        jLabelAge.setText("Age");

        jLabelGender.setText("Gender");

        jLabelHospitalNameDoctorPanel.setText("Hospital Name");

        jLabelDepartment.setText("Department");

        jLabelPhoneNum.setText("Phone Number");

        buttonGroup1.add(rdbuttonMale);
        rdbuttonMale.setSelected(true);
        rdbuttonMale.setText("Male");
        rdbuttonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbuttonMaleActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdButtonFemale);
        rdButtonFemale.setText("Female");
        rdButtonFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdButtonFemaleActionPerformed(evt);
            }
        });

        jButton2.setText("Add Doctor");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Id", "Age", "Gender", "Hospital name", "Department", "Phone Number"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout jPaneladdDoctorsLayout = new javax.swing.GroupLayout(jPaneladdDoctors);
        jPaneladdDoctors.setLayout(jPaneladdDoctorsLayout);
        jPaneladdDoctorsLayout.setHorizontalGroup(
            jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jButton2))
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                .addComponent(jLabelPhoneNum)
                                .addGap(18, 18, 18)
                                .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelDoctorId)
                                    .addComponent(jLabelDoctoreName)
                                    .addComponent(jLabelAge)
                                    .addComponent(jLabelGender)
                                    .addComponent(jLabelHospitalNameDoctorPanel)
                                    .addComponent(jLabelDepartment))
                                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tfDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tfHospitalNameDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                                                .addComponent(rdbuttonMale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(rdButtonFemale)))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPaneladdDoctorsLayout.setVerticalGroup(
            jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPaneladdDoctorsLayout.createSequentialGroup()
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDoctoreName)
                            .addComponent(tfDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDoctorId)
                            .addComponent(tfDoctorId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelAge)
                            .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelGender)
                            .addComponent(rdbuttonMale)
                            .addComponent(rdButtonFemale))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelHospitalNameDoctorPanel)
                            .addComponent(tfHospitalNameDoctorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDepartment)
                            .addComponent(tfDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPaneladdDoctorsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPhoneNum)
                            .addComponent(tfPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doctor", jPaneladdDoctors);

        javax.swing.GroupLayout jPanelAddPatientsLayout = new javax.swing.GroupLayout(jPanelAddPatients);
        jPanelAddPatients.setLayout(jPanelAddPatientsLayout);
        jPanelAddPatientsLayout.setHorizontalGroup(
            jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanelAddPatientsLayout.setVerticalGroup(
            jPanelAddPatientsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Patient", jPanelAddPatients);

        javax.swing.GroupLayout jPanelAddEncountersLayout = new javax.swing.GroupLayout(jPanelAddEncounters);
        jPanelAddEncounters.setLayout(jPanelAddEncountersLayout);
        jPanelAddEncountersLayout.setHorizontalGroup(
            jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 827, Short.MAX_VALUE)
        );
        jPanelAddEncountersLayout.setVerticalGroup(
            jPanelAddEncountersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Encounter", jPanelAddEncounters);

        btnLogoutHospitalAdminFrame.setText("Logout");
        btnLogoutHospitalAdminFrame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutHospitalAdminFrameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 827, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogoutHospitalAdminFrame)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnLogoutHospitalAdminFrame)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1090, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(9, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 757, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfHospitalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalCodeActionPerformed

    private void tfHospitalCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalCommunityActionPerformed

    private void tfHospitalPostalCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHospitalPostalCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHospitalPostalCodeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String name = tfHospitalName.getText();
        Long code = Long.valueOf(tfHospitalCode.getText());
        String community = tfHospitalCommunity.getText();
        //String city = tfHospitalCity.getText();
        String city = (String) jComboBoxHospitalCity.getSelectedItem();
        Long postalCode = Long.valueOf(tfHospitalPostalCode.getText());
        hospital = new Hospital(name, community, code, city, postalCode);
        listOfHospitals.getListOfHospitals().add(hospital);
        Object[] data = {name, community, code, city, postalCode};
        tblModel.addRow(data);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdbuttonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbuttonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbuttonMaleActionPerformed

    private void rdButtonFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdButtonFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdButtonFemaleActionPerformed

    private void btnLogoutHospitalAdminFrameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutHospitalAdminFrameActionPerformed

        this.dispose();
        HomeFrame hf = new HomeFrame();
        hf.setVisible(true);
    }//GEN-LAST:event_btnLogoutHospitalAdminFrameActionPerformed

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
            java.util.logging.Logger.getLogger(HospitalAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospitalAdminFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospitalAdminFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogoutHospitalAdminFrame;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBoxHospitalCity;
    private javax.swing.JLabel jLabelAge;
    private javax.swing.JLabel jLabelDepartment;
    private javax.swing.JLabel jLabelDoctorId;
    private javax.swing.JLabel jLabelDoctoreName;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelHospitalCity;
    private javax.swing.JLabel jLabelHospitalCode;
    private javax.swing.JLabel jLabelHospitalCommunity;
    private javax.swing.JLabel jLabelHospitalName;
    private javax.swing.JLabel jLabelHospitalNameDoctorPanel;
    private javax.swing.JLabel jLabelHospitalPostalCode;
    private javax.swing.JLabel jLabelPhoneNum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAddEncounters;
    private javax.swing.JPanel jPanelAddHospitals;
    private javax.swing.JPanel jPanelAddPatients;
    private javax.swing.JPanel jPaneladdDoctors;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton rdButtonFemale;
    private javax.swing.JRadioButton rdbuttonMale;
    private javax.swing.JTable tableHospitals;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfDepartment;
    private javax.swing.JTextField tfDoctorId;
    private javax.swing.JTextField tfDoctorName;
    private javax.swing.JTextField tfHospitalCode;
    private javax.swing.JTextField tfHospitalCommunity;
    private javax.swing.JTextField tfHospitalName;
    private javax.swing.JTextField tfHospitalNameDoctorPanel;
    private javax.swing.JTextField tfHospitalPostalCode;
    private javax.swing.JTextField tfPhoneNumber;
    // End of variables declaration//GEN-END:variables
}
