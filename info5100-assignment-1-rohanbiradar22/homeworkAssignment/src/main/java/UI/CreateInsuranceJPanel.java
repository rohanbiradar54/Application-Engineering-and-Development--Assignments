/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Insurance;
import javax.swing.JOptionPane;

/**
 *
 * @author rohan
 */
public class CreateInsuranceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateInsuranceJPanel
     */
    
    Insurance insurance1;
    public CreateInsuranceJPanel(Insurance paramInsurance) {
        initComponents();
        this.insurance1=paramInsurance;
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        labelCompanyName = new javax.swing.JLabel();
        labelCompanyAddress = new javax.swing.JLabel();
        labelCorporateID = new javax.swing.JLabel();
        labelPremium = new javax.swing.JLabel();
        labelDeductable = new javax.swing.JLabel();
        labelBenefits = new javax.swing.JLabel();
        textCompanyName = new javax.swing.JTextField();
        textCompanyAddress = new javax.swing.JTextField();
        textCorporateID = new javax.swing.JTextField();
        textPremium = new javax.swing.JTextField();
        textDeductable = new javax.swing.JTextField();
        textBenefits = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Insurance Details");

        labelCompanyName.setText("Company Name");

        labelCompanyAddress.setText("Company Address");

        labelCorporateID.setText("Corporate ID");

        labelPremium.setText("Premium");

        labelDeductable.setText("Deductable");

        labelBenefits.setText("Benefits");

        textCompanyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCompanyNameActionPerformed(evt);
            }
        });

        buttonSave.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        buttonSave.setText("Save");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCompanyName)
                            .addComponent(labelCompanyAddress)
                            .addComponent(labelCorporateID)
                            .addComponent(labelPremium)
                            .addComponent(labelDeductable)
                            .addComponent(labelBenefits))
                        .addGap(211, 211, 211)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textCompanyName, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(textCompanyAddress)
                            .addComponent(textCorporateID)
                            .addComponent(textPremium)
                            .addComponent(textDeductable)
                            .addComponent(textBenefits)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(buttonSave)))
                .addContainerGap(449, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCompanyName)
                    .addComponent(textCompanyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCompanyAddress)
                    .addComponent(textCompanyAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCorporateID)
                    .addComponent(textCorporateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPremium)
                    .addComponent(textPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDeductable)
                    .addComponent(textDeductable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBenefits)
                    .addComponent(textBenefits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(buttonSave)
                .addContainerGap(124, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        
        insurance1.setCompanyName(textCompanyName.getText());
        insurance1.setCompanyAddress(textCompanyAddress.getText());
        insurance1.setCorporateID(textCorporateID.getText());
        insurance1.setPremium(textPremium.getText());
        insurance1.setDeductable(textDeductable.getText());
        insurance1.setBenefits(textBenefits.getText());
        
        
        
        
        
        JOptionPane.showMessageDialog(this, "Insurance Information Saved");
    }//GEN-LAST:event_buttonSaveActionPerformed

    private void textCompanyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCompanyNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCompanyNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel labelBenefits;
    private javax.swing.JLabel labelCompanyAddress;
    private javax.swing.JLabel labelCompanyName;
    private javax.swing.JLabel labelCorporateID;
    private javax.swing.JLabel labelDeductable;
    private javax.swing.JLabel labelPremium;
    private javax.swing.JTextField textBenefits;
    private javax.swing.JTextField textCompanyAddress;
    private javax.swing.JTextField textCompanyName;
    private javax.swing.JTextField textCorporateID;
    private javax.swing.JTextField textDeductable;
    private javax.swing.JTextField textPremium;
    // End of variables declaration//GEN-END:variables
}
