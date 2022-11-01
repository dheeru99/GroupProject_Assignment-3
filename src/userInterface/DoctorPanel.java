/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.Doctor;
import attributes.DoctorDirectory;
import attributes.Hospital;
import attributes.HospitalDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dheer
 */
public class DoctorPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorPanel1
     */
   JPanel rightLayout;
   DoctorDirectory doctorDirectory;
   HospitalDirectory hospitalDirectory;
    public DoctorPanel(JPanel rightLayout,DoctorDirectory doctorDirectory) {
       this.doctorDirectory=doctorDirectory;
       this.rightLayout= rightLayout;
        initComponents();
         this.hospitalDirectory= doctorDirectory.getDoctor().getHospitalDirectory();
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt4 = new javax.swing.JSpinner();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txt3 = new com.toedter.calendar.JDateChooser();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setText("Experience");

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setText(":");

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("SAVE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7jButton1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("CLEAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton2ActionPerformed(evt);
            }
        });

        txt3.setDateFormatString("yyyy-MM-dd");

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel28.setText("Joining Date");

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel29.setText(":");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel34.setText("Doctor Id");

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setText(":");

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel35.setText(":");

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel33.setText("NAME");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("                                                   Add New Doctor");

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9jButton1ActionPerformed(evt);
            }
        });

        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });

        txt5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt5MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel37.setText(":");

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setText("Hospital Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addGap(18, 18, 18)
                        .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel29)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel36)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel35)
                                        .addGap(18, 18, 18)
                                        .addComponent(txt1))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(453, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(203, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7jButton1ActionPerformed
        String name = txt1.getText();
        String id = (txt2.getText()).replace("D00","");
        String date = String.valueOf(txt3.getDate());
        String experience = String.valueOf(txt4.getValue());
        String hospitalId= txt5.getText().replace("H00", "");
        if(name.equals("")){
                JOptionPane.showMessageDialog(this, "Doctor Name is Mandatory..!!");
        }else if(id.equals("")){
                JOptionPane.showMessageDialog(this, "Doctor Id is Mandatory..!!");
        }else if(hospitalId.equals("")){
                JOptionPane.showMessageDialog(this, "Hospital Id is Mandatory..!!");
        }else if(date.equals("")){
                JOptionPane.showMessageDialog(this, "Doctor's Joining Date is Mandatory..!!");
        }else if(experience.equals("0")){
                JOptionPane.showMessageDialog(this, "Doctor's Experience is Mandatory..!!");
        }else{
            Date date1=null;
                   try{
                 date1= new Date(date);
                }catch(Exception e){
                        JOptionPane.showMessageDialog(this, "Doctor's Joining Date is Mandatory..!!");
                    }
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                String regDate=f.format(date1);
                LocalDate newDate = LocalDate.now();
                String newDate1 = String.valueOf(newDate);
              Integer year = Integer.parseInt(regDate.substring(0,4));
              Integer month = Integer.parseInt(regDate.substring(5,7));
              Integer day = Integer.parseInt(regDate.substring(8,10));
              
              Integer newYear = Integer.parseInt(newDate1.substring(0,4));
              Integer newMonth = Integer.parseInt(newDate1.substring(5,7));
              Integer newDay = Integer.parseInt(newDate1.substring(8,10));
              
             Integer exp= Integer.parseInt(experience);
            
              if (!name.matches("^[a-zA-z ]*$")){
                 JOptionPane.showMessageDialog(this, "Please Enter a Valid Doctor Name");
              }else if(year>newYear){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
              }else if(year<=newYear && month>newMonth){
                    JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
              }else if(year>newYear && month>newMonth){
                          JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
              }else if(year.equals(newYear) && month.equals(newMonth) && day>newDay){
                          JOptionPane.showMessageDialog(this, "Please Enter a Valid Date");
              }else if(exp<0 || exp>100 ){
                 JOptionPane.showMessageDialog(this, "Please Enter a Valid Doctor Experience");
              }else{
                  int ho=0;
                  for(Hospital h: hospitalDirectory.getHospitalDirectory()){
                      if(hospitalId.matches(h.getHospitalId())){
                          ho++;
                      }
                  }if(ho<=0){
                       JOptionPane.showMessageDialog(this, "Please Enter a Valid Hospital Id");
                  }else{
                   
        Doctor d =doctorDirectory.addDoctor();
        d.setDoctorName(name);
        d.setDoctorId(id);
        d.setHosiptalId(hospitalId);
        d.setJoiningDate(new Date(date)); 
        d.setExperience(Integer.parseInt(experience));
        JOptionPane.showMessageDialog(this, ""+name+"'s Doctor Profile has been Created successfully..!!");
        
        txt1.setText("");
        txt2.setText("");
        txt5.setText("");
        txt3.setDate(null);
       txt4.setValue(0);
                  }             
        }}
    }//GEN-LAST:event_jButton7jButton1ActionPerformed

    private void jButton8jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton2ActionPerformed
        txt1.setText("");
        txt2.setText("");
        txt3.setDate(null);
       txt4.setValue(0);
               txt5.setText("");
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton8jButton2ActionPerformed

    private void jButton9jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9jButton1ActionPerformed
        rightLayout.remove(this);
        Component [] componentArray = rightLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        DoctorDirectoryPanel ms = (DoctorDirectoryPanel) c;
        ms.table();
        CardLayout layout = (CardLayout) rightLayout.getLayout();
        layout.previous(rightLayout);
       
    }//GEN-LAST:event_jButton9jButton1ActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
               int z=0;
        String docId1 =null;
       Doctor y = new Doctor();
       if(y.getDoctorId() == null){
           txt2.setText("D00"+"1");
       }
           for(Doctor info1: doctorDirectory.getDoctorDirectory()){
                  if(info1.getDoctorId().isEmpty()){
                       txt2.setText("D00"+"1"); 
                  }
                  docId1=info1.getDoctorId();
                   z= Integer.parseInt(docId1);
                }
         
              txt2.setText("D00"+String.valueOf(++z));
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1MouseClicked

    private void txt5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txt5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JTextField txt1;
    private javax.swing.JLabel txt2;
    private com.toedter.calendar.JDateChooser txt3;
    private javax.swing.JSpinner txt4;
    private javax.swing.JTextField txt5;
    // End of variables declaration//GEN-END:variables
}
