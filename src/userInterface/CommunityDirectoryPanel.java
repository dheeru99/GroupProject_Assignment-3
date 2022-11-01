/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import attributes.City;
import attributes.CityHistory;
import attributes.Community;
import attributes.CommunityAdmin;
import attributes.CommunityAdminDirectory;
import attributes.CommunityHistory;
import attributes.DoctorDirectory;
import attributes.House;
import attributes.HouseHistory;
import attributes.PatientDirectory;
import attributes.PersonDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dheer
 */
public class CommunityDirectoryPanel extends javax.swing.JPanel {

    /**
     * Creates new form CommunityDirectoryPanel
     */
    JPanel rightLayout;
    DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    CommunityHistory communityHistory;
    CityHistory cityHistory;
    PersonDirectory personDirectory;
    CommunityAdminDirectory communityAdminDirectory;
    HouseHistory houseHistory;
    public CommunityDirectoryPanel(JPanel rightLayout,PersonDirectory personDirectory, DoctorDirectory doctorDirectory, PatientDirectory patientDirectory) {
        this.rightLayout=rightLayout;
        this.doctorDirectory=doctorDirectory;
        this.personDirectory=personDirectory;
        this.patientDirectory=patientDirectory;
        initComponents();

          this.communityHistory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCommunity().getCommunityHistory();
          this.cityHistory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCityHistory();
           this.communityAdminDirectory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCommunity().getCommunityAdminDirectory();
           this.houseHistory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCommunity().getHouse().getHouseHistory();
        table();
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
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        txt2 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        txt3 = new javax.swing.JLabel();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community Id", "City Id", "Community Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("BACK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("UPDATE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7jButton1ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("DELETE");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton2ActionPerformed(evt);
            }
        });

        txt2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel43.setText("Community Name");

        txt1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt1MouseClicked(evt);
            }
        });

        jLabel44.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel44.setText(":");

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("Community Id");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText(":");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText(":");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("City Id");

        jButton5.setBackground(new java.awt.Color(102, 51, 255));
        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("       House Portal  >>>");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(51, 204, 0));
        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("           Hospital Details  >>>");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        txt3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 919, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        int selected =table.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(this, "No Row has been selected");
            return;
        }
        DefaultTableModel tbl= (DefaultTableModel)table.getModel();
        Community selectedCommunity= (Community)tbl.getValueAt(selected, 0);
        txt1.setText(selectedCommunity.getCommunityName());
        txt2.setText("CM00"+selectedCommunity.getCommunityId());
        txt3.setText("C00"+selectedCommunity.getCityId());

        // TODO add your handling code here:
    }//GEN-LAST:event_tableMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CommunityPanel doc = new CommunityPanel(rightLayout, doctorDirectory);
        rightLayout.add("CommunityPanel",doc);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        rightLayout.remove(this);
        CardLayout layout = (CardLayout) rightLayout.getLayout();
        layout.previous(rightLayout);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7jButton1ActionPerformed
        DefaultTableModel tbl= (DefaultTableModel)table.getModel();
        int selected =table.getSelectedRow();
        if(selected<0){
            JOptionPane.showMessageDialog(this, "No Row has been selected");
            return;
        }
        Community selectedCity= (Community)tbl.getValueAt(selected, 0);

      String name=  txt1.getText();
        String id= txt2.getText().replace("CM00","");
        String cityId= txt3.getText().replace("C00", "");
         int co=0;
        for(Community c1: communityHistory.getCommunityHistory()){
            if(cityId.equalsIgnoreCase(c1.getCityId()) ) {
                if(name.equalsIgnoreCase(c1.getCommunityName()) && !name.equalsIgnoreCase(selectedCity.getCommunityName())){
                    co++;
                }
            }
        }
        if(name.equals("")){
            JOptionPane.showMessageDialog(this, "Community Name is Mandatory..!!");
        }else if(cityId.equals("")){
            JOptionPane.showMessageDialog(this, "City Id is Mandatory..!!");
        }else if (!name.matches("^[a-zA-z ]*$")){
            JOptionPane.showMessageDialog(this, "Please Enter a Valid Community Name");
        }else if (co>0){
            JOptionPane.showMessageDialog(this, "Community you have Entered is already present in the city");
        }else if(cityHistory.getCityHistory() .isEmpty() && !cityId.matches("")){
            JOptionPane.showMessageDialog(this, "No City is Available to Add Community");
        }else{
                
            
             int city=0;
            for(City c: cityHistory.getCityHistory() ){
                String c1=c.getCityId();
                if(cityId.equalsIgnoreCase(c1) || (cityId.isEmpty())){
                    city++;
                }
            }
            if(city<=0){
                JOptionPane.showMessageDialog(this, "City Id doesn't Matches with any City Id. Please Enter Valid CityId...!!");
            }else{

                
                String s=selectedCity.getCommunityName();
                String co1=selectedCity.getCityId();
                
                
                 String newCity= "";
         for(City ci: cityHistory.getCityHistory()){
              if(selectedCity.getCityId().equalsIgnoreCase(ci.getCityId())){
                  newCity= ci.getCityName();
              }
         }
                for(CommunityAdmin ca: communityAdminDirectory.getCommunityAdminDirectory()){
             if(s.equalsIgnoreCase(ca.getCommunity()) && newCity.equalsIgnoreCase(ca.getCity())){
                 ca.setCommunity(name);
             }
                }
 
         
                
            selectedCity.setCommunityId(id);
            selectedCity.setCommunityName(name);
            selectedCity.setCityId(cityId);
            JOptionPane.showMessageDialog(this, ""+name+" Community Updated Successfully..!!");
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            table();
        }}
    }//GEN-LAST:event_jButton7jButton1ActionPerformed

    private void jButton8jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton2ActionPerformed
        int selected =table.getSelectedRow();

        if(selected<0){

            JOptionPane.showMessageDialog(this, "No Row has been selected");
            return;
        }

        DefaultTableModel tbl= (DefaultTableModel)table.getModel();

        Community selectedCommunity= (Community)tbl.getValueAt(selected, 0);
       
        ArrayList<House> arr= new ArrayList<>();
        for(House h1: houseHistory.getHouseHistory()){
            if(selectedCommunity.getCommunityId().equalsIgnoreCase(h1.getCommunityId())){
                arr.add(h1);
            }
            
        }
          String newCity= "";
         for(City ci: cityHistory.getCityHistory()){
              if(selectedCommunity.getCityId().equalsIgnoreCase(ci.getCityId())){
                  newCity= ci.getCityName();
              }
         }
        ArrayList<CommunityAdmin> h= new ArrayList<>();
        for(CommunityAdmin ca: communityAdminDirectory.getCommunityAdminDirectory()){
            if(selectedCommunity.getCommunityName().equalsIgnoreCase(ca.getCommunity()) && newCity.equalsIgnoreCase(ca.getCity())){
               h.add(ca);
            }
        }
        for(House h2: arr){
        houseHistory.delete(h2);
        }
        for(CommunityAdmin ca:h){
        communityAdminDirectory.delete(ca);
        }
        
        communityHistory.delete(selectedCommunity);
        JOptionPane.showMessageDialog(this, "Community Deleted Successfully..!!");
        txt1.setText("");
        txt2.setText("");

        table();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8jButton2ActionPerformed

    private void txt1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt1MouseClicked
      
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        HouseDirectoryPanel doc = new HouseDirectoryPanel(rightLayout,personDirectory, doctorDirectory,patientDirectory);
        rightLayout.add("HouseDirectoryPanel",doc);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        HospitalDirectoryPanel doc = new HospitalDirectoryPanel(rightLayout, doctorDirectory,patientDirectory);
        rightLayout.add("HospitalDirectoryPanel",doc);
        CardLayout layout = (CardLayout)rightLayout.getLayout();
        layout.next(rightLayout);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txt1;
    private javax.swing.JLabel txt2;
    private javax.swing.JLabel txt3;
    // End of variables declaration//GEN-END:variables
public void table() {
         DefaultTableModel tbl = (DefaultTableModel)table.getModel();
      tbl.setRowCount(0);
      
        for(Community ci: communityHistory.getCommunityHistory()){
          Object[] r =new Object[6];
          r[0]=ci;
          r[1]="C00"+ci.getCityId();
          r[2]=ci.getCommunityName();
          
          tbl.addRow(r);
    }

}}

