/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.BioChemicalCompound;

import Business.WorkQueue.ChemicalWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sohni
 */
public class BioChemicalRequestWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form BioChemicalRequestWorkAreaJPanel
     */
    JPanel workArea;
    ChemicalWorkRequest req;
    public BioChemicalRequestWorkAreaJPanel(JPanel workArea, ChemicalWorkRequest req) {
        initComponents();
        this.workArea = workArea;
        this.req = req;
        dateOfDay.setMinSelectableDate(new Date());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblProcess = new javax.swing.JLabel();
        btnDateDelivered = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        dateOfDay = new com.toedter.calendar.JDateChooser();
        backBtn = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblProcess.setFont(new java.awt.Font("SansSerif", 1, 48)); // NOI18N
        lblProcess.setText("PROCESSING MEDICO SUPPLIER REQUEST ");
        add(lblProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 53));

        btnDateDelivered.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        btnDateDelivered.setText("Delivery Date:");
        add(btnDateDelivered, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 190, 41));

        txtDate.setEditable(false);
        txtDate.setFont(new java.awt.Font("Microsoft JhengHei UI Light", 0, 20)); // NOI18N
        add(txtDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(502, 272, 261, 41));
        add(dateOfDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(835, 272, 156, 41));

        backBtn.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(114, 401, -1, 33));

        btnUpdate.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        btnUpdate.setText("UPDATE STATUS ");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 261, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/progress.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 90, 110, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:

        workArea.remove(this);
        Component[] componentArray = workArea.getComponents();
        Component component = componentArray[componentArray.length - 1];
        BioChemicalWorkAreaJPanel panel = (BioChemicalWorkAreaJPanel) component;
        panel.tblPopulateData();
        CardLayout layout = (CardLayout) workArea.getLayout();
        layout.previous(workArea);
    }//GEN-LAST:event_backBtnActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        req.setStatus("Completed");
        try{
        Calendar calendar = dateOfDay.getCalendar();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        String result = year + "-" + month + "-" + day;
        ((ChemicalWorkRequest) req).setDeliveryTime(result);
        txtDate.setText(result);
        JOptionPane.showMessageDialog(null, "Request updated successfully!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null , "please enter the valid date");
            return;
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel btnDateDelivered;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JDateChooser dateOfDay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblProcess;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
