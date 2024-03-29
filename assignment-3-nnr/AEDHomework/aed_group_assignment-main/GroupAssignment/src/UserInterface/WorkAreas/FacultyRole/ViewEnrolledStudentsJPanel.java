/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.FacultyRole;

import Model.CourseDetails;
import Model.CourseDetailsDirectory;
import Model.StudentDetails;
import Model.StudentDetailsDirectory;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohan
 */
public class ViewEnrolledStudentsJPanel extends javax.swing.JPanel {
    
    private CourseDetailsDirectory coursedetailsdirectory;
    private JPanel container;
    private CourseDetails coursedetails;
    private StudentDetails studentdetails;
    private StudentDetailsDirectory studentDetailsDirectory;
    private javax.swing.JTable tableCourseCatalog;


    /**
     * Creates new form ViewAndManageCourseJPanel
     */
//    public ViewEnrolledStudentsJPanel() {
//        
//        
//    }

    ViewEnrolledStudentsJPanel(JPanel container, StudentDetailsDirectory studentDetailsDirectory,StudentDetails studentDetails) {
        initComponents();
        
        this.studentDetailsDirectory = studentDetailsDirectory;
//        this.coursedetailsdirectory = coursedetailsdirectory;
//        System.out.println(this.coursedetailsdirectory);
        this.studentdetails = studentDetails;
        this.container =  container;
        tableCourseCatalog = new javax.swing.JTable();
        populateTable();
//        DefaultTableModel dtm = (DefaultTableModel) tableCourseCatalog.getModel();
//        System.out.println(studentDetailsDirectory);
        
        
        
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ViewRegisteredStudents = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1500, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View and Manage Courses");

        ViewRegisteredStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Student Name", "Course Code", "Course Name", "Intake", "Scheduled Day", "Scheduled Time", "Mode"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ViewRegisteredStudents);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Save");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(500, 500, 500)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addComponent(jButton1)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jButton1)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ViewRegisteredStudents;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel dtm = (DefaultTableModel) ViewRegisteredStudents.getModel();
        dtm.setRowCount(0);
        for (StudentDetails sd : studentDetailsDirectory.getStudentcourseList()) {
            Object[] row = new Object[7];
            row[0]=sd.getStudentName();
            row[1]=sd.getCourseCode();
            row[2]=sd.getCourseName();
            row[3]=sd.getIntake();
            row[4]=sd.getCourseScheduleDate();
            row[5]=sd.getCourseScheduleTime();
            row[6]=sd.getMode();
//            System.out.println(studentDetailsDirectory);
            
            dtm.addRow(row);    
        }
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
