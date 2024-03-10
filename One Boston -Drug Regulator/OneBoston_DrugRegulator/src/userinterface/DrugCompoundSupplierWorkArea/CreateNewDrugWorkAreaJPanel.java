package userinterface.DrugCompoundSupplierWorkArea;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.BioChemicalCompound.BioChemicalCompound;
import Business.Doctor.Patient;
import Business.DrugRegulator.DrugRegulator;
import Business.EcoSystem;
import Business.DrugCompounds.DrugCompounds;
import Business.Network.Network;
import Business.Organization.DrugOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanatpopli
 *
 */
public class CreateNewDrugWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewDrugWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Patient patient;
    private DrugOrganization drugOrg;
    private UserAccount userAccount;
    private Network network;
    private EcoSystem biz;

    public CreateNewDrugWorkAreaJPanel(JPanel userProcessContainer, Patient patient, DrugOrganization drugOrg, UserAccount userAccount, Network network,EcoSystem biz) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.patient = patient;
        this.drugOrg = drugOrg;
        this.userAccount = userAccount;
        this.network = network;
        this.biz = biz;
        txtPatientName.setText(patient.getPatientName());
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * redrugrated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        tblNewDrug = new javax.swing.JTable();
        lblPatientName = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        lblTittle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAddNewDrug = new javax.swing.JButton();
        txtNewDrug = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblNewDrug.setBackground(new java.awt.Color(255, 255, 153));
        tblNewDrug.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        tblNewDrug.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Compound", "Chemical Compound"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNewDrug.setRowHeight(30);
        jScrollPane.setViewportView(tblNewDrug);

        add(jScrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 650, 240));

        lblPatientName.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblPatientName.setText("Patient Name :");
        add(lblPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 200, 30));

        txtPatientName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 24)); // NOI18N
        txtPatientName.setEnabled(false);
        add(txtPatientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 294, 30));

        lblTittle.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        lblTittle.setText("New Drug Compound");
        add(lblTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 270, -1));

        btnBack.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 560, 170, -1));

        btnAddNewDrug.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnAddNewDrug.setText("Add New Drug");
        btnAddNewDrug.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewDrugActionPerformed(evt);
            }
        });
        add(btnAddNewDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 480, 220, 41));
        add(txtNewDrug, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 480, 267, 41));
    }// </editor-fold>//GEN-END:initComponents

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblNewDrug.getModel();

        List<String> newDiseaseDrug = new ArrayList<String>();
        for (DrugCompounds drug : patient.getDrugHistory().getDrugCompoundHistory()) {
            newDiseaseDrug.add(drug.getDrugCompound());
        }

        int i = 0;
        Map<String, String> DrugChem = new TreeMap<String, String>((String.CASE_INSENSITIVE_ORDER));
        for (DrugRegulator d : biz.getDrugList().getDrugList()) {

            for (i = 0; i < d.getBioChemList().getBioChemicalCompoundList().size(); i++) {

                BioChemicalCompound c = d.getBioChemList().getBioChemicalCompoundList().get(i);
                DrugCompounds g = d.getDrugCompoundList().getDrugCompoundHistory().get(i);
                DrugChem.put(g.getDrugCompound(), c.getBioChemicalCompound());
            }

        }

        Map<String, String> newDrugFinal = new TreeMap<String, String>((String.CASE_INSENSITIVE_ORDER));
        for (String s : newDiseaseDrug) {

            if (DrugChem.containsKey(s)) {

                newDrugFinal.put(s, DrugChem.get(s));
            }
        }

        for (Map.Entry<String, String> entry : newDrugFinal.entrySet()) {
            String key = entry.getKey();
            String values = entry.getValue();
            Object[] row = new Object[2];
            row[0] = key;
            row[1] = values;
            dtm.addRow(row);
        }

    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component comp = componentArray[componentArray.length - 1];
        LabReportsWorkAreaJPanel lrwjp = (LabReportsWorkAreaJPanel) comp;
        lrwjp.tblPopulateData();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddNewDrugActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewDrugActionPerformed
        // TODO add your handling code here:
        String drugName = txtNewDrug.getText().trim();
        if(drugName.isEmpty())
        {
            JOptionPane.showMessageDialog(null, "Please enter the drug name");
            return;
        }
        ArrayList<String>drugCheck = new ArrayList<>();
        for(DrugRegulator d:biz.getDrugList().getDrugList())
        {
            drugCheck.add(d.getDrug().toLowerCase());
        }
        if(drugCheck.contains(drugName))
        {
             JOptionPane.showMessageDialog(null, " Drug name already exists ");
            return;
        }
        DrugRegulator d = biz.getDrugList().addDrugList();
        d.setDrug(drugName);
        patient.setDrugNewCompound(drugName);
        int count = tblNewDrug.getRowCount();
        for (int i = 0; i < count; i++) {
            String s = tblNewDrug.getValueAt(i, 0).toString();
            d.getDrugCompoundList().addDrugCompoundList().setDrugCompound(s);
            String t = tblNewDrug.getValueAt(i, 1).toString();
            d.getBioChemList().addChemicalList().setBioChemicalCompound(t);

        }
        JOptionPane.showMessageDialog(null,"New Drug is added succesfully");


    }//GEN-LAST:event_btnAddNewDrugActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewDrug;
    private javax.swing.JButton btnBack;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblTittle;
    private javax.swing.JTable tblNewDrug;
    private javax.swing.JTextField txtNewDrug;
    private javax.swing.JTextField txtPatientName;
    // End of variables declaration//GEN-END:variables
}
