/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;

import Model.CourseDetails;
import Model.CourseDetailsDirectory;
import Model.EmployerDetails;
import Model.StudentDetails;
import Model.StudentDetailsDirectory;
import UserInterface.WorkAreas.EmployerRole.TranscriptJPanel;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rohan
 */
public class StudentGradDeclaration extends javax.swing.JPanel {
    private CourseDetailsDirectory coursedetailsdirectory;
//    private StudentDetailsDirectory studentdetailsdirectory;
    private JPanel container;
    private CourseDetails coursedetails;
    private javax.swing.JTable tblCourseCatalog;
//    private CourseDetails coursedetails;
    private EmployerDetails employerdetails;
//     private Object declareGraduation;
     private EmployerDetails StudentGraduationFlag;
    private StudentDetailsDirectory studentDetailsDirectory;
    private CourseDetailsDirectory courseDetailsDirectory;
    private StudentDetails graduatingStudent;
    private javax.swing.JTable tbltranscripts;
    private  StudentDetails studentDetails;
    


    StudentGradDeclaration(JPanel container, CourseDetailsDirectory coursedetailsdirectory, CourseDetails coursedetails, StudentDetailsDirectory studentdetailsdirectory, EmployerDetails employerdetails,JTable tbltranscripts, StudentDetails sd) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        initComponents();
        this.coursedetailsdirectory = coursedetailsdirectory;
        this.coursedetails = coursedetails;
        this.container =  container;
        this.studentDetailsDirectory = studentdetailsdirectory;
        this.employerdetails = employerdetails;
        this.StudentGraduationFlag = new EmployerDetails();
        this.studentDetails =sd;
        this.tbltranscripts=tbltranscripts;

       
//        System.out.println(this.tbltranscripts);
//        System.out.println(this.studentDetailsDirectory);
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonStudentLogout = new javax.swing.JButton();
        labelStudentDashboard = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbStudentDeclareGraduation = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jTranscriptStatus = new javax.swing.JTextField();
        btnViewTranscript = new javax.swing.JButton();
        btnRequestTranscript = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtStudentNameGd = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        buttonStudentLogout.setBackground(new java.awt.Color(153, 153, 153));
        buttonStudentLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonStudentLogout.setForeground(new java.awt.Color(255, 255, 255));
        buttonStudentLogout.setText("Logout");
        buttonStudentLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonStudentLogoutActionPerformed(evt);
            }
        });

        labelStudentDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelStudentDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelStudentDashboard.setText("Hello Student");
        labelStudentDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel1.setText("Would you like to declare graduation :");

        cmbStudentDeclareGraduation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Yes", "No" }));
        cmbStudentDeclareGraduation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStudentDeclareGraduationActionPerformed(evt);
            }
        });

        jLabel2.setText("Transcript Status :");

        jTranscriptStatus.setEditable(false);
        jTranscriptStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTranscriptStatusActionPerformed(evt);
            }
        });

        btnViewTranscript.setText("View Transcript");
        btnViewTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewTranscriptActionPerformed(evt);
            }
        });

        btnRequestTranscript.setText("Request Transcript");
        btnRequestTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestTranscriptActionPerformed(evt);
            }
        });

        jLabel3.setText("Student Name :");

        txtStudentNameGd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStudentNameGdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelStudentDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(1093, Short.MAX_VALUE)
                .addComponent(buttonStudentLogout)
                .addGap(289, 289, 289))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(373, 373, 373)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(jLabel3)))
                                .addGap(30, 30, 30)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTranscriptStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                            .addComponent(cmbStudentDeclareGraduation, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudentNameGd)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(btnRequestTranscript))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(503, 503, 503)
                        .addComponent(btnViewTranscript)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelStudentDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtStudentNameGd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStudentDeclareGraduation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRequestTranscript)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTranscriptStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnViewTranscript, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(buttonStudentLogout)
                .addContainerGap(90, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonStudentLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonStudentLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonStudentLogoutActionPerformed

    private void cmbStudentDeclareGraduationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStudentDeclareGraduationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStudentDeclareGraduationActionPerformed

    private void jTranscriptStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTranscriptStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTranscriptStatusActionPerformed

    private void btnViewTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewTranscriptActionPerformed
        // TODO add your handling code here:
        TranscriptJPanel courseCreate= new TranscriptJPanel(container,courseDetailsDirectory,coursedetails,studentDetailsDirectory,employerdetails);
//        TranscriptJPanel courseCreate= new TranscriptJPanel();
        container.add("TranscriptJPanel", courseCreate);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);

    }//GEN-LAST:event_btnViewTranscriptActionPerformed

    private void btnRequestTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestTranscriptActionPerformed
       // TODO add your handling code here:
    String declareGraduation = cmbStudentDeclareGraduation.getSelectedItem().toString();
    String studentNameGd = txtStudentNameGd.getText();
//    System.out.println(studentNameGd);
    
    // Assuming selectedDeclareFlag is an instance of EmployeeDetails
    if (declareGraduation.equals("Yes")) {
        StudentGraduationFlag.setStudentGraduationFlag("Yes");
        StudentDetails graduatingStudent = studentDetailsDirectory.searchStudentName(studentNameGd);
//        System.out.println(graduatingStudent);
       
//         StudentDetails gs = studentDetailsDirectory.searchStudentName(studentNameGd);

//         System.out.println(graduatingStudent.getStudentName());
         if (graduatingStudent != null) {
        //graduatingStudent = gs; // Store the selected professor
        populateTable2(); // Pass the professor to the populateTable method
         } else {
        JOptionPane.showMessageDialog(null, "Does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
         }
       } 
//    StudentDetails gs = studentDetailsDirectory.searchStudentName(studentNameGd);
//
//    if (gs != null) {
//        //graduatingStudent = gs; // Store the selected professor
//        populateTable2(); // Pass the professor to the populateTable method
//    } else {
//        JOptionPane.showMessageDialog(null, "Does not exist", "Information", JOptionPane.INFORMATION_MESSAGE);
//    }
    
    

//    System.out.println(declareGraduation); // Print the selected value
    }//GEN-LAST:event_btnRequestTranscriptActionPerformed

    private void txtStudentNameGdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStudentNameGdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStudentNameGdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRequestTranscript;
    private javax.swing.JButton btnViewTranscript;
    private javax.swing.JButton buttonStudentLogout;
    private javax.swing.JComboBox<String> cmbStudentDeclareGraduation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTranscriptStatus;
    private javax.swing.JLabel labelStudentDashboard;
    private javax.swing.JTextField txtStudentNameGd;
    // End of variables declaration//GEN-END:variables

    private void populateTable2() {
        
        DefaultTableModel dtm = (DefaultTableModel) tbltranscripts.getModel();
        dtm.setRowCount(0);
        for (StudentDetails sd : studentDetailsDirectory.getStudentcourseList()) {
            Object[] row = new Object[5];
            row[0]=sd.getStudentName();
            row[1]=sd.getCourseCode();
            row[2]=sd.getCourseName();
            row[3]=sd.getIntake();
            row[4]= "8" ; 
           
            
            dtm.addRow(row);    
        }
       
    }

  
}
