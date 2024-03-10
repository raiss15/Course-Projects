/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BioChemicalCompound;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.ChemicalOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ChemicalWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sohni
 */
public class BioChemicalWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BioChemicalWorkAreaJPanel
     *
     */
    private JPanel workArea;
    private EcoSystem biz;
    private UserAccount userAccount;
    private ChemicalOrganization chemicalOrg;
    private Enterprise ep;
    private Network network;

    public BioChemicalWorkAreaJPanel(JPanel workArea, UserAccount userAccount, ChemicalOrganization chemicalOrg, Enterprise ep, EcoSystem business, Network network) {

        initComponents();
        this.workArea = workArea;
        this.userAccount = userAccount;
        this.chemicalOrg = chemicalOrg;
        this.ep = ep;
        this.network = network;
        this.biz = business;
        tblPopulateData();
    }

    public void tblPopulateData() {
        DefaultTableModel dtm = (DefaultTableModel) tblWorkRequest.getModel();
        dtm.setRowCount(0);

        ArrayList<WorkRequest> workRequestList = chemicalOrg.getWorkQueue().getWorkRequestList();
        for (WorkRequest request : workRequestList) {
            ChemicalWorkRequest req = (ChemicalWorkRequest) request;
            String row2 = request.getSender().getEmployee().getName();
            String row3 = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            String row4 = request.getStatus();
            String row5 = ((ChemicalWorkRequest) request).getDeliveryTime();
            Object[] row = new Object[6];
            row[0] = req;
            row[1] = req.getQuantity();
            row[2] = row2;
            row[3] = row3;
            row[4] = row4;
            row[5] = row5;

            dtm.addRow(row);
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

        lblDrugSupplier = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDrugSupplier.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        lblDrugSupplier.setText("CHEMICAL SUPPLIER WORK SPACE");
        add(lblDrugSupplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, 53));

        tblWorkRequest.setBackground(new java.awt.Color(255, 255, 153));
        tblWorkRequest.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblWorkRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Name", "Quantity", "Sender", "Receiver", "Status", "Delivery Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblWorkRequest.setRowHeight(30);
        jScrollPane2.setViewportView(tblWorkRequest);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 1340, 330));

        btnAssign.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnAssign.setText("Assign to me");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 580, -1, -1));

        btnProcess.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 580, 189, -1));

        btnRefresh.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 580, 169, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed

        int index = tblWorkRequest.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "Please Select a Row");
            return;
        }
        if (tblWorkRequest.getValueAt(index, 4) != null) {

            if (((tblWorkRequest.getValueAt(index, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Request is already completed");
                return;
            }
        }
        if (tblWorkRequest.getValueAt(index, 4) != null) {

            if (tblWorkRequest.getValueAt(index, 4).equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Request is already assigned");
                return;
            }
        }
        if (tblWorkRequest.getValueAt(index, 3) != null) {

            if (!tblWorkRequest.getValueAt(index, 3).equals(userAccount.getUsername())) {
                JOptionPane.showMessageDialog(null, "Request is already assigned");
                return;
            }
        }

        int check = 0;
        for (WorkRequest request : chemicalOrg.getWorkQueue().getWorkRequestList()) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Assigned") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                check = 1;
            }
        }
        if (check == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        int check1 = 0;
        ArrayList<WorkRequest> workRequestList = chemicalOrg.getWorkQueue().getWorkRequestList();
        for (WorkRequest request : workRequestList) {

            if (request.getStatus() == null) {
                continue;
            }
            if (request.getStatus().equals("Processing") && userAccount.getUsername().equalsIgnoreCase(request.getReceiver().toString())) {
                check1 = 1;
            }
        }
        if (check1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest req = (WorkRequest) tblWorkRequest.getValueAt(index, 0);
        req.setReceiver(userAccount);
        req.setStatus("Assigned");
        tblPopulateData();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed

        int idx = tblWorkRequest.getSelectedRow();

        if (idx < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        ChemicalWorkRequest req = (ChemicalWorkRequest) tblWorkRequest.getValueAt(idx, 0);
        if (tblWorkRequest.getValueAt(idx, 4) != null) {

            if (((tblWorkRequest.getValueAt(idx, 4).equals("Completed")))) {

                JOptionPane.showMessageDialog(null, "Request is already completed");
                return;
            }
        }

        if (tblWorkRequest.getValueAt(idx, 4) == null) {
            JOptionPane.showMessageDialog(null, "Request is not assigned to you for process");
            return;
        }
        int check = 0;

        if (tblWorkRequest.getValueAt(idx, 4).equals("Processing") && userAccount.getUsername().equalsIgnoreCase(req.getReceiver().toString())) {

            check = 1;
        }
        if (check != 1) {
            if (tblWorkRequest.getValueAt(idx, 4) != null) {

                if (!(((tblWorkRequest.getValueAt(idx, 4).equals("Assigned"))) && userAccount.getUsername().equalsIgnoreCase(req.getReceiver().toString()))) {
                    JOptionPane.showMessageDialog(null, "Request is not assigned to you for process");
                    return;
                }
            }
        }

        req.setStatus("Processing");

        BioChemicalRequestWorkAreaJPanel panel = new BioChemicalRequestWorkAreaJPanel(workArea, req);
        workArea.add("BioChemicalRequestWorkAreaJPanel", panel);
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.next(workArea);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed

        tblPopulateData();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblDrugSupplier;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}