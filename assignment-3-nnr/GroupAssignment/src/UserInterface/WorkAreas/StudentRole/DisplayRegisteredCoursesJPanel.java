/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole;

import Model.CourseDetails;
import Model.CourseDetailsDirectory;
import Model.StudentDetailsDirectory;
import Model.StudentDetails;
import UserInterface.WorkAreas.FacultyRole.*;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohan
 */
public class DisplayRegisteredCoursesJPanel extends javax.swing.JPanel {
    private JPanel container;
    private CourseDetails coursedetails;
    private CourseDetailsDirectory courseDetailsDirectory;
    private CourseDetailsDirectory coursedirectory;
    private StudentDetailsDirectory studentdetailsdirectory;
    private StudentDetails studentDetails;
    //private CourseDetailsDirectory coursedetailsdirectory;
    /**
     * Creates new form ViewAndManageCourseJPanel
     */
   /* public DisplayRegisteredCoursesJPanel() {
        initComponents();
        this.container = container;
        this.coursedirectory = coursedirectory;
        this.studentdetailsdirectory = studentdetailsdirectory;
        populateTable();
    }*/

    DisplayRegisteredCoursesJPanel(JPanel container, StudentDetails sd, StudentDetailsDirectory studentdetailsdirectory, CourseDetailsDirectory courseDetailsDirectory) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        initComponents();
        this.container = container;
        this.courseDetailsDirectory = courseDetailsDirectory;
        this.studentDetails=sd;
        this.studentdetailsdirectory = studentdetailsdirectory;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelDsiplayCoursesTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCourseCatalogStudent = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1500, 600));

        labelDsiplayCoursesTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelDsiplayCoursesTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDsiplayCoursesTitle.setText("Courses Available");
        labelDsiplayCoursesTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        tableCourseCatalogStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mode", "Couse Code", "Course Name", "Intake", "Scheduled Days", "Scheduled Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCourseCatalogStudent);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Note: Each Course carries 4 credits");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(labelDsiplayCoursesTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(514, 514, 514)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(332, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(labelDsiplayCoursesTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDsiplayCoursesTitle;
    private javax.swing.JTable tableCourseCatalogStudent;
    // End of variables declaration//GEN-END:variables

        private void populateTable() {

        DefaultTableModel dtm = (DefaultTableModel) tableCourseCatalogStudent.getModel();
        dtm.setRowCount(0);
        for (StudentDetails sd : studentdetailsdirectory.getStudentcourseList()) {
            Object[] row = new Object[6];
            row[0]=sd.getMode();
            row[1]=sd.getCourseCode();
            row[2]=sd.getCourseName();
            row[3]=sd.getIntake();
            row[4]=sd.getCourseScheduleDate();
            row[5]=sd.getCourseScheduleTime();
            
            dtm.addRow(row);    
        }
      
    }
}
