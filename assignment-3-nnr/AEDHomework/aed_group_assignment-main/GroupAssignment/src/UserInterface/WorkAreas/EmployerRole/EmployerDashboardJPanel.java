/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.EmployerRole;

import Model.EmployerDetails;
import Model.CourseDetailsDirectory;
import Model.CourseDetails;
import Model.StudentDetailsDirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author rohan
 */
public class EmployerDashboardJPanel extends javax.swing.JPanel {
   
    private JPanel container;
    private EmployerDetails employerdetails;
    private CourseDetails courseDetails;
    private CourseDetailsDirectory courseDetailsDirectory;
    private StudentDetailsDirectory studentDetailsDirectory;
    
    private javax.swing.JTable tblCourseCatalog;

    /**
     * Creates new form EmployerDashboardJPanel
     */
//    public EmployerDashboardJPanel(JPanel container, EmployerDetails employerdetails) {
//       
//    }

    public EmployerDashboardJPanel(JPanel container, JPasswordField textEmployerLoginPassword, JTextField textEmployerLoginUsername, EmployerDetails employerdetails, CourseDetailsDirectory coursedetailsdirectory,CourseDetails courseDetails,StudentDetailsDirectory studentDetailsDirectory) {
         initComponents();
        
       
        this.employerdetails = employerdetails;
        this.courseDetailsDirectory= coursedetailsdirectory;
        this.studentDetailsDirectory=studentDetailsDirectory;
        this.container =  container;
        this.courseDetails=courseDetails;
        System.out.println(this.studentDetailsDirectory);
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelEmployerDashboard = new javax.swing.JLabel();
        btnFacultyRatings = new javax.swing.JButton();
        buttonEmployerManageTranscript = new javax.swing.JButton();
        buttonEmployerLogout = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 204));

        labelEmployerDashboard.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelEmployerDashboard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelEmployerDashboard.setText("Hello Employer");
        labelEmployerDashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnFacultyRatings.setBackground(new java.awt.Color(153, 153, 153));
        btnFacultyRatings.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnFacultyRatings.setForeground(new java.awt.Color(255, 255, 255));
        btnFacultyRatings.setText("Faculty Ratings");
        btnFacultyRatings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultyRatingsActionPerformed(evt);
            }
        });

        buttonEmployerManageTranscript.setBackground(new java.awt.Color(153, 153, 153));
        buttonEmployerManageTranscript.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonEmployerManageTranscript.setForeground(new java.awt.Color(255, 255, 255));
        buttonEmployerManageTranscript.setText("Manage Transcript");
        buttonEmployerManageTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEmployerManageTranscriptActionPerformed(evt);
            }
        });

        buttonEmployerLogout.setBackground(new java.awt.Color(153, 153, 153));
        buttonEmployerLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonEmployerLogout.setForeground(new java.awt.Color(255, 255, 255));
        buttonEmployerLogout.setText("Logout");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonEmployerLogout)
                .addGap(753, 753, 753))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(buttonEmployerManageTranscript)
                        .addGap(76, 76, 76)
                        .addComponent(btnFacultyRatings))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelEmployerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 1455, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(labelEmployerDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(264, 582, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFacultyRatings)
                    .addComponent(buttonEmployerManageTranscript))
                .addGap(127, 127, 127)
                .addComponent(buttonEmployerLogout)
                .addContainerGap(245, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEmployerManageTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEmployerManageTranscriptActionPerformed
        // TODO add your handling code here:
        
//        TranscriptJPanel courseCreate= new TranscriptJPanel();
//        container.add("TranscriptJPanel", courseCreate);
//        CardLayout layout = (CardLayout) container.getLayout();
//        layout.next(container);
        
        TranscriptJPanel panel = new TranscriptJPanel(container, courseDetailsDirectory, courseDetails, studentDetailsDirectory, employerdetails);
        container.add("TranscriptJPanel",panel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);

        
    }//GEN-LAST:event_buttonEmployerManageTranscriptActionPerformed

    private void btnFacultyRatingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultyRatingsActionPerformed
        // TODO add your handling code here:
        EmployerSearchAndRateJPanel prof_search = new EmployerSearchAndRateJPanel(container,courseDetailsDirectory,courseDetails,studentDetailsDirectory);
        container.add("EmployerSearchAndRateJPanel", prof_search);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        
    }//GEN-LAST:event_btnFacultyRatingsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFacultyRatings;
    private javax.swing.JButton buttonEmployerLogout;
    private javax.swing.JButton buttonEmployerManageTranscript;
    private javax.swing.JLabel labelEmployerDashboard;
    // End of variables declaration//GEN-END:variables
}
