/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author Admin
 */
public class PersonUpdateJPanel extends javax.swing.JPanel {

    PersonList userList;
    Person user;
    PasswordHistoryList passwordHistoryList;
    EncryptionDecryption EncryptionDecryption = new EncryptionDecryption();

    /**
     * Creates new form UserUpdateJPanel
     */
    public PersonUpdateJPanel(PersonList userList,Person user) {
        initComponents();
        this.userList = userList;
        this.user = user;
         passwordHistoryList = new PasswordHistoryList();
        populatePasswordList(this.userList);
        
        populateForm(user);
    }
public void populatePasswordList(PersonList userList){
    
        for(Person u : userList.getUser()){
        
           PasswordHistory passwordHistory = new PasswordHistory();
           passwordHistory.setNeuId(u.getNuId());
           passwordHistory.setPassword(EncryptionDecryption.decrypt(u.getPassword(),"secrete"));
           passwordHistoryList.addPasswordHistory(passwordHistory);
        }      
    }
    public void populateForm(Person u){
    
       //  Person user = userList.searchUser(u.getNuId());
        if(user!= null){
        txtNeuId.setText(user.getNuId());
        txtUserName.setText(user.getUserName());
        txtPassword.setText(EncryptionDecryption.decrypt(user.getPassword(),"secrete"));
        txtUserID.setText(user.getUserId());
        txtCourse.setText(user.getCourse());
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
        jPanel2 = new javax.swing.JPanel();
        userjLabel = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        nuidjlabel = new javax.swing.JLabel();
        txtNeuId = new javax.swing.JTextField();
        uidjlabel = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        pwdjlabel = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        coursejlabel = new javax.swing.JLabel();
        headingjlabel = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        userjLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userjLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        userjLabel.setText("User Name");

        txtUserName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        nuidjlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nuidjlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nuidjlabel.setText("NEU ID");

        txtNeuId.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNeuId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNeuIdActionPerformed(evt);
            }
        });

        uidjlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        uidjlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        uidjlabel.setText("User Id");

        txtUserID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtUserID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserIDActionPerformed(evt);
            }
        });

        pwdjlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        pwdjlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pwdjlabel.setText("Password");

        txtPassword.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        coursejlabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        coursejlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        coursejlabel.setText("Area of Study");

        headingjlabel.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        headingjlabel.setForeground(new java.awt.Color(255, 51, 51));
        headingjlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headingjlabel.setText("Update / View");

        txtCourse.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headingjlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(207, Short.MAX_VALUE)
                        .addComponent(uidjlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(coursejlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(userjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(179, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pwdjlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nuidjlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtPassword)
                        .addComponent(txtUserID)
                        .addComponent(txtUserName)
                        .addComponent(txtNeuId)
                        .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(headingjlabel)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNeuId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuidjlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userjLabel)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uidjlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwdjlabel))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(coursejlabel)
                    .addComponent(txtCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnUpdate)
                .addGap(63, 63, 63))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNeuIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNeuIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNeuIdActionPerformed

    private void txtUserIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserIDActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        System.out.println("User Update List Size"+userList.getUser().size());
        userList.deleteUser(user);
        System.out.println("User Update After List Size"+userList.getUser().size());
        Person user0 = new Person();
        user0.setNuId(txtNeuId.getText());
        user0.setUserId(txtUserID.getText());
        user0.setUserName(txtUserName.getText());
        PasswordHistory password = passwordHistoryList.searchOldPassword(txtNeuId.getText());
        System.out.print("");
        if(!password.getPassword().equals(String.valueOf(txtPassword.getPassword()))){
        user0.setPassword(EncryptionDecryption.encrypt(String.valueOf(txtPassword.getPassword()),"secrete"));
        }
        else{
            JOptionPane.showMessageDialog(this, "Password same as Old password. Use new password");
            return;
        }

        
        //user0.setPassword(user0.hashPassword(new String(txtPassword.getPassword())));
        user0.setCourse(txtCourse.getText());
        user0.setEnabled("YES");
        userList.addUser(user0);
        
        JOptionPane.showMessageDialog(this, "Person Information Updated");
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel coursejlabel;
    private javax.swing.JLabel headingjlabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nuidjlabel;
    private javax.swing.JLabel pwdjlabel;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtNeuId;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserID;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel uidjlabel;
    private javax.swing.JLabel userjLabel;
    // End of variables declaration//GEN-END:variables
}