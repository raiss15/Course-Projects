/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.ManageCustomerProfile;

import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.SalesManagement.SalesPersonProfile;
import javax.swing.JPanel;

/**
 *
 * @author DELL
 */
public class ManageCustomerProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageCustomerProfileJPanel
     */
    JPanel workArea;
    Business business;
    SalesPersonProfile salesPerson;
    CustomerProfile selectedCustomer;
    public ManageCustomerProfileJPanel(JPanel workArea,Business business,CustomerProfile selectedCustomer,SalesPersonProfile salesPerson) {
        initComponents();
        this.workArea = workArea; 
        this.business = business;
        this.salesPerson = salesPerson;
        this.selectedCustomer = selectedCustomer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1152, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 648, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
