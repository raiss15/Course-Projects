/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import model.*;
/**
 *
 * @author Admin
 */
public class MainJFrame extends javax.swing.JFrame {

    Person user;
    PersonList userList;
    /**
     * Creates new form UserJFrame
     */
    public MainJFrame() {
        initComponents();
        btnCreateUser.setVisible(false);
        btnSearch.setVisible(false);
        btnViewUsers.setVisible(false);
        btnSearch.setVisible(false);
        btnManage.setVisible(false);
        userList= new PersonList();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        workjpanel = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnViewUsers = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        btnCreateUser = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        actionjpanel = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerSize(4);

        workjpanel.setBackground(new java.awt.Color(255, 51, 51));
        workjpanel.setMaximumSize(new java.awt.Dimension(3600, 3600));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLogin.setText("Log In");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnViewUsers.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnViewUsers.setText("View Users");
        btnViewUsers.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnViewUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewUsersActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSearch.setText("Search User");
        btnSearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnCreateUser.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnCreateUser.setText("Create User");
        btnCreateUser.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        btnManage.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnManage.setText("Manage User");
        btnManage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout workjpanelLayout = new javax.swing.GroupLayout(workjpanel);
        workjpanel.setLayout(workjpanelLayout);
        workjpanelLayout.setHorizontalGroup(
            workjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workjpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(workjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        workjpanelLayout.setVerticalGroup(
            workjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(workjpanelLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnLogin)
                .addGap(33, 33, 33)
                .addComponent(btnCreateUser)
                .addGap(33, 33, 33)
                .addComponent(btnViewUsers)
                .addGap(32, 32, 32)
                .addComponent(btnSearch)
                .addGap(33, 33, 33)
                .addComponent(btnManage)
                .addContainerGap(249, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(workjpanel);

        actionjpanel.setBackground(new java.awt.Color(255, 255, 255));
        actionjpanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actionjpanel.setForeground(new java.awt.Color(255, 255, 255));

        heading.setBackground(new java.awt.Color(255, 51, 51));
        heading.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 51, 51));
        heading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        heading.setText("Welcome Husky!!");

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 0, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Northeastern University");

        jTextField2.setText("Click on Login to proceed further");

        javax.swing.GroupLayout actionjpanelLayout = new javax.swing.GroupLayout(actionjpanel);
        actionjpanel.setLayout(actionjpanelLayout);
        actionjpanelLayout.setHorizontalGroup(
            actionjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionjpanelLayout.createSequentialGroup()
                .addGroup(actionjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actionjpanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actionjpanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(actionjpanelLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        actionjpanelLayout.setVerticalGroup(
            actionjpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actionjpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(actionjpanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        btnCreateUser.setVisible(false);
        btnSearch.setVisible(false);
        btnViewUsers.setVisible(false);
        btnSearch.setVisible(false);
        btnManage.setVisible(false);
        LoginPersonjPanel loginJPanel = new LoginPersonjPanel(userList,this,jSplitPane1,workjpanel,actionjpanel,btnSearch,btnViewUsers,btnCreateUser,btnManage);
        jSplitPane1.setRightComponent(loginJPanel);
      //  btnSearch.setVisible(true);
       // btnViewUsers.setVisible(true);
       // btnSearch.setVisible(true);
        //btnCreateUser.setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        // TODO add your handling code here:
        ManagePersonJPanel manageJPanel = new ManagePersonJPanel(userList);
        jSplitPane1.setRightComponent(manageJPanel);
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        // TODO add your handling code here:
        CreatePersonJPanel createUserJPanel = new CreatePersonJPanel(userList);
        jSplitPane1.setRightComponent(createUserJPanel);
        
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void btnViewUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewUsersActionPerformed
        // TODO add your handling code here:
        ViewPersonJPanel userViewJPanel = new ViewPersonJPanel(userList);
         jSplitPane1.setRightComponent(userViewJPanel);
    }//GEN-LAST:event_btnViewUsersActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
         SearchPersonJPanel searchUserJPanel = new SearchPersonJPanel(userList);
         jSplitPane1.setRightComponent(searchUserJPanel);
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    public void logIn(){
    
    this.removeAll();
    this.add(jSplitPane1);
    jSplitPane1.setLeftComponent(actionjpanel);
    jSplitPane1.setRightComponent(actionjpanel);
    
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actionjpanel;
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnViewUsers;
    private javax.swing.JLabel heading;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel workjpanel;
    // End of variables declaration//GEN-END:variables
}