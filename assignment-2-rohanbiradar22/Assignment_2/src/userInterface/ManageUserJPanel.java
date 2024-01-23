/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userInterface;

import userManagement.User;
import userManagement.Directory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rohan
 */
public class ManageUserJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private Directory directory;
    /**
     * Creates new form ManageUserJPanel
     */

    ManageUserJPanel(JPanel userProcessContainer, Directory directory) {
      initComponents();
      this.userProcessContainer = userProcessContainer;
      this.directory = directory;
      displayTable();
    }

    private void displayTable(){
    DefaultTableModel dtm = (DefaultTableModel) tableUsers.getModel();
    dtm.setRowCount(0);
    for (User user: directory.getUserArrayList()){
        Object[] row = new Object[7];
        //row[0] = user;
        row[0] = user.getUsername();
        row[1] = user.getPassword();
        row[2] = user.getNUID();
        row[3] = user.getUserID();
        row[4] = user.getName();
        row[5] = user.getEmailID();
        row[6] = user.getContactNumber();
        
        dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tableUsers = new javax.swing.JTable();
        buttonSearchUser = new javax.swing.JButton();
        buttonDeleteUser = new javax.swing.JButton();
        textNUID = new javax.swing.JTextField();
        buttonBack = new javax.swing.JButton();
        labelManageUser = new javax.swing.JLabel();
        labelDescription = new javax.swing.JLabel();

        tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "User Name", "Password", "NUID", "User ID", "Name", "Email", "Contact Number"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableUsers);
        if (tableUsers.getColumnModel().getColumnCount() > 0) {
            tableUsers.getColumnModel().getColumn(0).setResizable(false);
            tableUsers.getColumnModel().getColumn(2).setResizable(false);
            tableUsers.getColumnModel().getColumn(3).setResizable(false);
            tableUsers.getColumnModel().getColumn(4).setResizable(false);
            tableUsers.getColumnModel().getColumn(5).setResizable(false);
            tableUsers.getColumnModel().getColumn(6).setResizable(false);
        }

        buttonSearchUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonSearchUser.setText("Search User");
        buttonSearchUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSearchUserActionPerformed(evt);
            }
        });

        buttonDeleteUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonDeleteUser.setText("Delete User");
        buttonDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDeleteUserActionPerformed(evt);
            }
        });

        buttonBack.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buttonBack.setText("Back");
        buttonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBackActionPerformed(evt);
            }
        });

        labelManageUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelManageUser.setText("Manage User");

        labelDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        labelDescription.setText("(Enter NU ID)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(401, 401, 401)
                        .addComponent(labelManageUser))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(buttonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(buttonDeleteUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(buttonSearchUser, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(83, 83, 83)
                        .addComponent(textNUID, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(labelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 706, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(labelManageUser)
                .addGap(45, 45, 45)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonSearchUser)
                    .addComponent(textNUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelDescription)
                    .addComponent(buttonBack))
                .addGap(18, 18, 18)
                .addComponent(buttonDeleteUser)
                .addContainerGap(218, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_buttonBackActionPerformed

    private void buttonDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDeleteUserActionPerformed
        // TODO add your handling code here:
                                             
    int selectedRow = tableUsers.getSelectedRow();

    if (selectedRow >= 0) {
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Would you like to delete the user details?", "Warning", dialogButton);
        
        if (dialogResult == JOptionPane.YES_OPTION) {
            // Retrieve relevant information from the selected row
            String username = tableUsers.getValueAt(selectedRow, 0).toString();
            
            // Locate and delete the user in the directory
            User userToDelete = directory.findUserByUsername(username);
            if (userToDelete != null) {
                directory.deleteUser(userToDelete);
                displayTable();
            } else {
                JOptionPane.showMessageDialog(null, "User not found in the directory.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
    }

    }//GEN-LAST:event_buttonDeleteUserActionPerformed

    private void buttonSearchUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSearchUserActionPerformed
        // TODO add your handling code here:
        User result = directory.searchUser(textNUID.getText());
        if(result == null){
        JOptionPane.showMessageDialog(null, "User number you entered does not exist","Information",JOptionPane.INFORMATION_MESSAGE); 
        }
        else {
        SearchandUpdateUserJPanel panel = new SearchandUpdateUserJPanel(userProcessContainer, result);
        userProcessContainer.add("ViewUserJPanel",panel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
            
    }//GEN-LAST:event_buttonSearchUserActionPerformed
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBack;
    private javax.swing.JButton buttonDeleteUser;
    private javax.swing.JButton buttonSearchUser;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelDescription;
    private javax.swing.JLabel labelManageUser;
    private javax.swing.JTable tableUsers;
    private javax.swing.JTextField textNUID;
    // End of variables declaration//GEN-END:variables
}
