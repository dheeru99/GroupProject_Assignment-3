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
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author dheer
 */
public class HousePanel extends javax.swing.JPanel {

    /**
     * Creates new form HousePanel
     */
     JPanel rightLayout;
    DoctorDirectory doctorDirectory;
    CityHistory cityHistory;
    CommunityHistory communityHistory;
    HouseHistory houseHistory;
    CommunityAdminDirectory communityAdminDirectory;
    public HousePanel(JPanel rightLayout,DoctorDirectory doctorDirectory) {
        this.doctorDirectory=doctorDirectory;
        this.rightLayout= rightLayout;
        initComponents();
        this.cityHistory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCityHistory();
         this.houseHistory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCommunity().getHouse().getHouseHistory();
           this.communityHistory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCommunity().getCommunityHistory();
           this.communityAdminDirectory=doctorDirectory.getDoctor().getHospitalDirectory().getCity().getCommunity().getCommunityAdminDirectory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        txt1 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("CLEAR");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8jButton2ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("BACK");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9jButton1ActionPerformed(evt);
            }
        });

        txt1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel45.setText("House Number");

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel46.setText(":");

        jButton7.setBackground(new java.awt.Color(51, 102, 255));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("SAVE");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7jButton1ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel32.setText("                                                   Add New House");

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel47.setText(":");

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel48.setText("Community Id");

        txt2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel47)
                        .addGap(18, 18, 18)
                        .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel46)
                        .addGap(18, 18, 18)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(230, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8jButton2ActionPerformed
        txt1.setText("");
      
        txt2.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8jButton2ActionPerformed

    private void jButton9jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9jButton1ActionPerformed
        rightLayout.remove(this);
        Component [] componentArray = rightLayout.getComponents();
        Component c = componentArray[componentArray.length-1];
        HouseDirectoryPanel ms = (HouseDirectoryPanel) c;
        ms.table();
        CardLayout layout = (CardLayout) rightLayout.getLayout();
        layout.previous(rightLayout);
    }//GEN-LAST:event_jButton9jButton1ActionPerformed

    private void jButton7jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7jButton1ActionPerformed
       
        String id= txt1.getText().replace("H0","");
        String communityId= txt2.getText().replace("CM00", "");
         if(communityId.equals("")){
            JOptionPane.showMessageDialog(this, "Community Id is Mandatory..!!");
        }else if(communityHistory.getCommunityHistory() .isEmpty() && !communityId.matches("")){
            JOptionPane.showMessageDialog(this, "No Community is Available to Add House");
        }else{

            int community=0;
            for(Community c: communityHistory.getCommunityHistory() ){
                String c1=c.getCommunityId();
                if(communityId.matches(c1) || (communityId.isEmpty())){
                    community++;
                }
            }
            if(community<=0){
                JOptionPane.showMessageDialog(this, "Community Id doesn't Matches with any Community Id. Please Enter Valid CommunityId...!!");
            }else{
                House c= houseHistory.addHouse();
                c.setCommunityId(communityId);
                c.setHouseNumber(id);
                
            CommunityAdmin ca= communityAdminDirectory.addCommuintyAdmin();
             ca.setHouseNumber(id);
           for(Community co1: communityHistory.getCommunityHistory()){
               if(communityId.equalsIgnoreCase(co1.getCommunityId())){
                   ca.setCommunity(co1.getCommunityName());
                   for(City ci: cityHistory.getCityHistory()){
                       if(co1.getCityId().matches(ci.getCityId())){
                          ca.setCity(ci.getCityName());
                       }
                   }
               }       
    }           
           
                
                JOptionPane.showMessageDialog(this, "H0"+id+" House Added Successfully..!!");
                txt1.setText("");
              
                txt2.setText("");
            }}
    }//GEN-LAST:event_jButton7jButton1ActionPerformed

    private void txt2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt2MouseClicked
         int z=0;
        String id =null;
        House y = new House();
        if(y.getHouseNumber() == null){
            txt1.setText("H0"+"1");
        }
        for(House info1: houseHistory.getHouseHistory()){
            if(info1.getHouseNumber().isEmpty()){
                txt1.setText("H0"+"1");
            }
            id=info1.getHouseNumber();
            z= Integer.parseInt(id);
        }

        txt1.setText("H0"+String.valueOf(++z));
            

        // TODO add your handling code here:
    }//GEN-LAST:event_txt2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel txt1;
    private javax.swing.JTextField txt2;
    // End of variables declaration//GEN-END:variables
}