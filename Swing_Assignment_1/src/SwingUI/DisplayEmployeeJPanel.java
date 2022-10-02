/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SwingUI;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class DisplayEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayEmployeeJPanel
     */
    EmployeeData empDisplay;
    public DisplayEmployeeJPanel() {
        initComponents();
        empDisplay=new EmployeeData();
        displayEmployeeDetails();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        empTable = new javax.swing.JTable();

        empTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee Name", "Employee ID", "Age", "Gender", "Level", "Team Info", "Positiion Title", "Cell Phone", "Emai ID"
            }
        ));
        jScrollPane1.setViewportView(empTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public void displayEmployeeDetails(){
         DefaultTableModel tableModel = (DefaultTableModel)empTable.getModel();
          ArrayList<EmployeeData> empDisplayObjs = CreateEmployeeJPanel.empDataObjs;
          String employeeName, employeeID, age, gender, level, teamInfo, positionTitle, cellPhone, email;
          for(EmployeeData emp: empDisplayObjs) {
           employeeName = emp.getEmployeeName();
           employeeID = emp.getEmployeeID();
           age = emp.getAge();
           gender = emp.getGender();
           //startdate
           level = emp.getLevel();
           teamInfo = emp.getTeamInfo();
           positionTitle = emp.getPositionTitle();
           cellPhone = emp.getCellPhone();
           email = emp.getEmailID();
           
           String[] empData = {employeeName, employeeID, age, gender, level, teamInfo, positionTitle, cellPhone, email};
           tableModel.addRow(empData);
          }
    }
          

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable empTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
