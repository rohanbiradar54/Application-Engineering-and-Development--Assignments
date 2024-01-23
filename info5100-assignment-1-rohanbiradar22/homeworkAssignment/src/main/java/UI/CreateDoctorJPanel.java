/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Doctor;
import javax.swing.JOptionPane;

/**
 *
 * @author rohan
 */
public class CreateDoctorJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateDoctorJPanel
     */
    Doctor doc1;
    
    public CreateDoctorJPanel(Doctor paramDoc) {
        initComponents();
        this.doc1=paramDoc;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelCreateDoctor = new javax.swing.JLabel();
        labelDoctorName = new javax.swing.JLabel();
        labelMedicalSchool = new javax.swing.JLabel();
        labelOfficeAddress = new javax.swing.JLabel();
        labelDoctorID = new javax.swing.JLabel();
        labelSpeciality = new javax.swing.JLabel();
        labelExperience = new javax.swing.JLabel();
        labelMedicalLicenseNumber = new javax.swing.JLabel();
        textDoctorName = new javax.swing.JTextField();
        textOfficeAddress = new javax.swing.JTextField();
        textDoctorID = new javax.swing.JTextField();
        textSpeciality = new javax.swing.JTextField();
        textMedicalSchool = new javax.swing.JTextField();
        textExperience = new javax.swing.JTextField();
        textMedicalLicenseNumber = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();

        labelCreateDoctor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelCreateDoctor.setText("Doctor details");

        labelDoctorName.setText("Doctor Name");

        labelMedicalSchool.setText("Medical School");

        labelOfficeAddress.setText("Office Address");

        labelDoctorID.setText("Doctor ID");

        labelSpeciality.setText("Speciality");

        labelExperience.setText("Experience");

        labelMedicalLicenseNumber.setText("Medical License Number");

        textDoctorName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDoctorNameActionPerformed(evt);
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
                        .addGap(447, 447, 447)
                        .addComponent(labelCreateDoctor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSpeciality)
                            .addComponent(labelExperience)
                            .addComponent(labelMedicalSchool)
                            .addComponent(labelMedicalLicenseNumber)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelOfficeAddress)
                                    .addComponent(labelDoctorID)
                                    .addComponent(labelDoctorName))
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textMedicalLicenseNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textExperience, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(textMedicalSchool, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textSpeciality, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textDoctorID)
                                        .addComponent(textOfficeAddress, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(textDoctorName, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(178, 178, 178)
                                .addComponent(buttonSave)))))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(labelCreateDoctor)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoctorName)
                    .addComponent(textDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelOfficeAddress)
                    .addComponent(textOfficeAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDoctorID)
                    .addComponent(textDoctorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSpeciality)
                    .addComponent(textSpeciality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMedicalSchool)
                    .addComponent(textMedicalSchool, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelExperience)
                    .addComponent(textExperience, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMedicalLicenseNumber)
                    .addComponent(textMedicalLicenseNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(205, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textDoctorNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDoctorNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDoctorNameActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
        // TODO add your handling code here:
        
        doc1.setDoctorName(textDoctorName.getText());
        doc1.setOfficeAddress(textOfficeAddress.getText());
        doc1.setDoctorID(textDoctorName.getText());
        doc1.setMedicalSchool(textMedicalSchool.getText());
        doc1.setExperience(textExperience.getText());
        doc1.setMedicalLicenseNumber(textMedicalLicenseNumber.getText());
        
        
        
        
        
        JOptionPane.showMessageDialog(this, "Doctor Information Saved");
        
    }//GEN-LAST:event_buttonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSave;
    private javax.swing.JLabel labelCreateDoctor;
    private javax.swing.JLabel labelDoctorID;
    private javax.swing.JLabel labelDoctorName;
    private javax.swing.JLabel labelExperience;
    private javax.swing.JLabel labelMedicalLicenseNumber;
    private javax.swing.JLabel labelMedicalSchool;
    private javax.swing.JLabel labelOfficeAddress;
    private javax.swing.JLabel labelSpeciality;
    private javax.swing.JTextField textDoctorID;
    private javax.swing.JTextField textDoctorName;
    private javax.swing.JTextField textExperience;
    private javax.swing.JTextField textMedicalLicenseNumber;
    private javax.swing.JTextField textMedicalSchool;
    private javax.swing.JTextField textOfficeAddress;
    private javax.swing.JTextField textSpeciality;
    // End of variables declaration//GEN-END:variables
}