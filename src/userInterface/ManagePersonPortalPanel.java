/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.DoctorDirectory;
import attributes.PatientDirectory;
import attributes.PersonDirectory;
import attributes.SystemAdmin;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JPanel;

/**
 *
 * @author dheer
 */
public class ManagePersonPortalPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePersonPortalPanel
     */
    JPanel rightLayout;
    SystemAdmin systemAdmin;
     DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    PersonDirectory personDirectory;
    public ManagePersonPortalPanel(JPanel rightLayout,SystemAdmin systemAdmin) {
        this.rightLayout=rightLayout;
        this.systemAdmin=systemAdmin;
        patientDirectory=systemAdmin.getPatientDirectory();
      doctorDirectory= systemAdmin.getDoctorDirectory();
      personDirectory= systemAdmin.getPersonDirectory();
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SEARCH HOSPITALS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("ADD PERSON");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(652, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            PersonPanel1 d= new PersonPanel1(rightLayout,doctorDirectory,personDirectory, patientDirectory);
        rightLayout.add("PatientPanel",d);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SearchHospitalPanel d= new SearchHospitalPanel(rightLayout,systemAdmin);
        rightLayout.add("SearchHospitalPanel",d);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}