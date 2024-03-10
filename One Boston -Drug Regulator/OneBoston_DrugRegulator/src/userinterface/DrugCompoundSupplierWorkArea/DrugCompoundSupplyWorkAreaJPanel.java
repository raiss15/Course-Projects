package userinterface.DrugCompoundSupplierWorkArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DrugWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bhagyatrivedi
 */
public class DrugCompoundSupplyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugCompoundSupplyWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem es;
    private UserAccount userAccount;
    private DrugOrganization drugOrg;
    private Enterprise erp;
    private Network network;
    private static final String CLASS_NAME = DrugCompoundSupplyWorkAreaJPanel.class.getName();

    public DrugCompoundSupplyWorkAreaJPanel(JPanel userProcessContainer, EcoSystem es, UserAccount userAccount, Organization drugOrg, Enterprise erp, Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.es = es;
        this.erp = erp;
        this.network = network;
        this.drugOrg = (DrugOrganization) drugOrg;
        tblPopulateData();
    }

    public void tblPopulateData() {

        DefaultTableModel dtm = (DefaultTableModel) tblWorkRequest.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wrequest : drugOrg.getWorkQueue().getWorkRequestList()) {
            if (((DrugWorkRequest) wrequest).getPatient() == null) {
                Object[] row = new Object[6];
                row[0] = ((DrugWorkRequest) wrequest);
                row[1] = ((DrugWorkRequest) wrequest).getQuantity();
                row[2] = wrequest.getSender().getEmployee().getName();
                row[3] = wrequest.getReceiver() == null ? null : wrequest.getReceiver().getEmployee().getName();
                row[4] = wrequest.getStatus();
                row[5] = ((DrugWorkRequest) wrequest).getDeliveryTime();

                dtm.addRow(row);
            }
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

        lblTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblWorkRequest = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        btnRequestChemical = new javax.swing.JButton();
        btnProcess = new javax.swing.JButton();
        btnLabRequest = new javax.swing.JButton();
        btnAddDrug = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitle.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        lblTitle.setText("DRUG SUPPLIER WORK AREA ");
        add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 390, 53));

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
                false, false, false, false, false, false
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 166, 1240, 290));

        btnAssign.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnAssign.setText("Assign Task");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 220, -1));

        btnRequestChemical.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnRequestChemical.setText("Request Chemical Compound");
        btnRequestChemical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestChemicalActionPerformed(evt);
            }
        });
        add(btnRequestChemical, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 630, -1, 62));

        btnProcess.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnProcess.setText("Process");
        btnProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcessActionPerformed(evt);
            }
        });
        add(btnProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 530, 210, -1));

        btnLabRequest.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnLabRequest.setText("View Lab Requests");
        btnLabRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLabRequestActionPerformed(evt);
            }
        });
        add(btnLabRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 640, 280, 50));

        btnAddDrug.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnAddDrug.setText("Add Drug");
        btnAddDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddDrugActionPerformed(evt);
            }
        });
        add(btnAddDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 640, 190, 50));

        btnRefresh.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        add(btnRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 169, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int index = tblWorkRequest.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "please select a row ");
            return;
        }
        //to check whether the the task is already assigned list 
        if (tblWorkRequest.getValueAt(index, 4) != null) {

            if (tblWorkRequest.getValueAt(index, 4).equals("Assigned")) {
                JOptionPane.showMessageDialog(null, "Task is already assigned");
                return;
            }
        }
        //to set the falg if already theere existing job
        int check = 0;
        for (WorkRequest wrequest : drugOrg.getWorkQueue().getWorkRequestList()) {

            if (wrequest.getStatus() == null) {
                continue;
            }
            if (wrequest.getStatus().equals("Assigned")) {
                if (wrequest.getReceiver() != null) {
                    if (userAccount.getUsername().equalsIgnoreCase(wrequest.getReceiver().toString())) {
                        check = 1;
                    }
                }
            }
        }
        if (check == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }
        int check1 = 0;
        for (WorkRequest wrequest : drugOrg.getWorkQueue().getWorkRequestList()) {

            if (wrequest.getStatus() == null) {
                continue;
            }
            if (wrequest.getStatus().equals("Processing")) {
                if (wrequest.getReceiver() != null) {
                    if (userAccount.getUsername().equalsIgnoreCase(wrequest.getReceiver().toString())) {
                        check1 = 1;
                    }
                }
            }
        }
        if (check1 == 1) {
            JOptionPane.showMessageDialog(null, "Please complete the existing request before taking a new request");
            return;

        }

        WorkRequest request = (WorkRequest) tblWorkRequest.getValueAt(index, 0);
        request.setReceiver(userAccount);
        request.setStatus("Assigned");
        tblPopulateData();
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRequestChemicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestChemicalActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewChemicalsRequestJPanel", new DisplayChemicalCompoundRequestWorkAreaJPanel(userProcessContainer, userAccount, erp, drugOrg, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnRequestChemicalActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
        // TODO add your handling code here:
        int index = tblWorkRequest.getSelectedRow();

        if (index < 0) {
            JOptionPane.showMessageDialog(null, "please select a row");
            return;
        }

        DrugWorkRequest dwrequest = (DrugWorkRequest) tblWorkRequest.getValueAt(index, 0);
        if (tblWorkRequest.getValueAt(index, 4) == null) {
            JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
            return;
        }
        int check = 0;

        if (tblWorkRequest.getValueAt(index, 4).equals("Processing") && userAccount.getUsername().equalsIgnoreCase(dwrequest.getReceiver().toString())) {

            check = 1;
        }
        if (check != 1) {
            if (tblWorkRequest.getValueAt(index, 4) != null) {

                if (!(((tblWorkRequest.getValueAt(index, 4).equals("Assigned"))) && (userAccount.getUsername().equalsIgnoreCase(dwrequest.getReceiver().toString())))) {
                    JOptionPane.showMessageDialog(null, "Task is not assigned to you for process");
                    return;
                }
            }
        }

        dwrequest.setStatus("Processing");

        DrugCompoundRequestAreaWorkAreaJPanel WorkRequestJPanel = new DrugCompoundRequestAreaWorkAreaJPanel(userProcessContainer, dwrequest);
        userProcessContainer.add("WorkRequestJPanel", WorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnLabRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLabRequestActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("LabResultsJPanel", new LabReportsWorkAreaJPanel(userProcessContainer, userAccount, erp, drugOrg, network, es));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_btnLabRequestActionPerformed

    private void btnAddDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddDrugActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("AddDrugJPanel", new DrugCompoundWorkAreaJPanel(userProcessContainer, es, userAccount, drugOrg, erp, network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddDrugActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        tblPopulateData();
    }//GEN-LAST:event_btnRefreshActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddDrug;
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnLabRequest;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRequestChemical;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblWorkRequest;
    // End of variables declaration//GEN-END:variables
}