/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PharmaWorkArea;

import Business.Enterprise.Enterprise;
import Business.MedicalInventory.MedicalInventory;
import Business.MedicalInventory.MedicalInventoryList;
import Business.Organization.Organization;
import Business.Organization.PharmaOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sanatpopli
 */
public class DisplayDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayDetailsJPanel
     */
    JPanel workArea;
    private UserAccount uA;
    private Enterprise ep;
    private MedicalInventoryList mil;
    private Organization org;
    private PharmaOrganization pog;
    private MedicalInventory miv;
    private static final String CLASS_NAME = DisplayDetailsJPanel.class.getName();

    public DisplayDetailsJPanel(JPanel workArea, UserAccount uA, Enterprise ep, MedicalInventory mi) {
        initComponents();
        this.workArea = workArea;
        this.uA = uA;
        this.ep = ep;
        this.pog = pog;
        this.miv = mi;

        txtSerialNumber.setText(String.valueOf(mi.getSerialNumber()));
        txtAvailability.setText(String.valueOf(mi.getAvailQuantity()));
        txtDrugName.setText(mi.getMedicineName());
        btnSave.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblSerialNumber = new javax.swing.JLabel();
        txtSerialNumber = new javax.swing.JTextField();
        lblMedicineName = new javax.swing.JLabel();
        txtDrugName = new javax.swing.JTextField();
        lblAvailable = new javax.swing.JLabel();
        txtAvailability = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        lblMedicineDetail = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSerialNumber.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblSerialNumber.setText("SERIAL NUMBER:");
        add(lblSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 281, -1, 30));

        txtSerialNumber.setEditable(false);
        txtSerialNumber.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtSerialNumber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtSerialNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 283, 207, -1));

        lblMedicineName.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblMedicineName.setText("Medicine Name:");
        add(lblMedicineName, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 379, -1, 30));

        txtDrugName.setEditable(false);
        txtDrugName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDrugName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add(txtDrugName, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 383, 207, -1));

        lblAvailable.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        lblAvailable.setText("Availability:");
        add(lblAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 476, -1, 30));

        txtAvailability.setEditable(false);
        txtAvailability.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtAvailability.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtAvailability.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvailabilityActionPerformed(evt);
            }
        });
        add(txtAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 479, 207, -1));

        btnUpdate.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 580, 136, -1));

        btnSave.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 580, 136, -1));

        backButton.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 580, 136, -1));

        lblMedicineDetail.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        lblMedicineDetail.setText("View Medicine Info");
        add(lblMedicineDetail, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtAvailabilityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvailabilityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvailabilityActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed

        txtDrugName.setEditable(true);
        txtSerialNumber.setEditable(true);
        txtAvailability.setEditable(true);
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        if(txtDrugName.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"please enter a valid drug name");
            return;
        }
        miv.setMedicineName(txtDrugName.getText());
        try{
        int availableQuantity = Integer.parseInt(txtAvailability.getText());
          miv.setAvailQuantity(availableQuantity);
        }
        catch(NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "serial number must be integer only");
            return;
        }
      try
      {
        int sNo = Integer.parseInt(txtSerialNumber.getText());
        miv.setSerialNumber(sNo);
      }
      catch(NumberFormatException e)
      {
          JOptionPane.showMessageDialog(null, "serial number must be integer only");
          return;
      }
        
        txtDrugName.setEditable(false);
        txtSerialNumber.setEditable(false);
        txtAvailability.setEditable(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);

        JOptionPane.showMessageDialog(null, "Medicine updated Successfully", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        workArea.remove(this);
        Component[] cA = workArea.getComponents();
        Component component = cA[cA.length - 1];
        PharmaWorkAreaJPanel panel = (PharmaWorkAreaJPanel) component;
        panel.tblReorder();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblMedicineDetail;
    private javax.swing.JLabel lblMedicineName;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JTextField txtAvailability;
    private javax.swing.JTextField txtDrugName;
    private javax.swing.JTextField txtSerialNumber;
    // End of variables declaration//GEN-END:variables
}