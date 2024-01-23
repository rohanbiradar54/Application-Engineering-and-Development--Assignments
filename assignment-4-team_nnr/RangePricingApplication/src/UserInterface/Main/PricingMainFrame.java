/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Main;

import MarketingManagement.MarketingPersonProfile;
import TheBusiness.Business.Business;
import TheBusiness.CustomerManagement.CustomerProfile;
import TheBusiness.OrderManagement.MasterOrderList;
import TheBusiness.OrderManagement.Order;
import TheBusiness.Personnel.EmployeeProfile;
import TheBusiness.Personnel.Profile;
import TheBusiness.SalesManagement.SalesPersonDirectory;
import TheBusiness.SalesManagement.SalesPersonProfile;
import TheBusiness.UserAccountManagement.UserAccount;
import TheBusiness.UserAccountManagement.UserAccountDirectory;
import UserInterface.Main.WorkSpaceProfiles.BusinessManagerWorkAreaJPanel;
import UserInterface.Main.WorkSpaceProfiles.MarketingManagerWorkAreaJPanel1;
import UserInterface.Main.WorkSpaceProfiles.SalesPersonWorkAreaJPanel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import javax.swing.JPanel;

/**
 *
 * @author kal bugrara
 */
public class PricingMainFrame extends javax.swing.JFrame {

    
    private void displayquestion2() {
    ArrayList<CustomerProfile> topCustomers = business.findTopCustomersAboveTarget();

           System.out.println("------------------------------------------------- Question 2 ----------------------------------------------------------------------------------------------");
           System.out.println("Our 3 best customers (customers who buy about target price)\n");
    for (int i = 0; i < topCustomers.size(); i++) {
        System.out.println((i + 1) + ". Customer ID: " + topCustomers.get(i).getPerson().getPersonId());

        // Print information about each order associated with the customer
        for (Order order : topCustomers.get(i).getOrders()) {
            System.out.println("   Order: " + order.getOrderTotal());
            System.out.println("   Order Price Performance: " + order.getOrderPricePerformance());
            System.out.println("   Number of Items Above Target: " + order.getNumberOfOrderItemsAboveTarget());
        }
        System.out.println();
    }
}
    
    
    

    Business business;
    MasterOrderList masterOrderList;
    //Channel channel;

    /**
     * Creates new form PricingMainFrame
     */

    public PricingMainFrame() {
        initComponents();
        business = ConfigureABusiness.initialize();
        
        masterOrderList = business.getMasterOrderList();
      
        business.getTop3NegotiatedSolutionsByMarketSegment();
        
        SalesPersonDirectory salesPersonDirectory = business.getSalesPersonDirectory();

         displayquestion2();

       ArrayList<SalesPersonProfile> salespeople = salesPersonDirectory.getSalespersonlist();

        // Calculate and store the total sales revenue for each salesperson
        Map<SalesPersonProfile, Double> salesPerformanceMap = new HashMap<>();

        for (SalesPersonProfile salesperson : salespeople) {
            double totalSalesRevenue = calculateTotalSalesRevenue(salesperson);
            salesPerformanceMap.put(salesperson, totalSalesRevenue);
        }

        // Sort the salespeople based on sales performance (descending order)
        ArrayList<Map.Entry<SalesPersonProfile, Double>> sortedSalesPerformance = (ArrayList<Map.Entry<SalesPersonProfile, Double>>) salesPerformanceMap.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toList());

        // Display the top 3 salespeople
        System.out.println("\n------------------------------------------------- Question 3 ----------------------------------------------------------------------------------------------");
        System.out.println("Our top 3 best sales people (sell higher that target)\n");
        for (int i = 0; i < Math.min(3, sortedSalesPerformance.size()); i++) {
            Map.Entry<SalesPersonProfile, Double> entry = sortedSalesPerformance.get(i);
            SalesPersonProfile salesperson = entry.getKey();
            double totalSalesRevenue = entry.getValue();

            System.out.println((i + 1) + ". Salesperson: " + salesperson.getPerson().getPersonId());
            System.out.println("   Sales Performance: " + totalSalesRevenue);
        }
         
         
     // processOrdersAndPrintResults();
    }
    
    private static double calculateTotalSalesRevenue(SalesPersonProfile salesperson) {
    
        System.out.println("Calculating total sales revenue for salesperson: " + salesperson.getPerson().getPersonId());

    double totalRevenue = 0.0;

    for (Order order : salesperson.getSalesorders()) {
        System.out.println("Order ID: " + order.getOrderID() + ", Total Revenue: " + order.calculateTotalRevenue());
        totalRevenue += order.calculateTotalRevenue();
    }

    System.out.println("Total Sales Revenue for salesperson: " + salesperson.getPerson().getPersonId() + ": " + totalRevenue);
     System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------\n");

    return totalRevenue;
    
}


    public void insert(JPanel jpanel) {

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitHomeArea = new javax.swing.JSplitPane();
        actionsidejpanel = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UserNameTextField = new javax.swing.JTextField();
        PasswordTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CardSequencePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        actionsidejpanel.setBackground(new java.awt.Color(0, 153, 153));
        actionsidejpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });
        actionsidejpanel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 70, 30));

        jLabel1.setText("User Name");
        actionsidejpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        UserNameTextField.setText("sales");
        actionsidejpanel.add(UserNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, -1));

        PasswordTextField.setText("XXXX");
        actionsidejpanel.add(PasswordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 130, -1));

        jLabel2.setText("Password");
        actionsidejpanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 20));

        SplitHomeArea.setLeftComponent(actionsidejpanel);

        CardSequencePanel.setLayout(new java.awt.CardLayout());
        SplitHomeArea.setRightComponent(CardSequencePanel);

        getContentPane().add(SplitHomeArea, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        //      WorkAreaJPanel ura = new WorkAreaJPanel(workareajpanl);

        String un = UserNameTextField.getText();
        String pw = PasswordTextField.getText();

        UserAccountDirectory uad = business.getUserAccountDirectory();
        UserAccount useraccount = uad.AuthenticateUser(un, pw);
        if (useraccount == null) {
            return;
        }
        SalesPersonWorkAreaJPanel salesworkarea;
        MarketingManagerWorkAreaJPanel1 marketingworkarea;
        BusinessManagerWorkAreaJPanel bzmanagerworkarea;
        String r = useraccount.getRole();
        Profile profile = useraccount.getAssociatedPersonProfile();
        //       if (r.equalsIgnoreCase("sales")) {
        
        if (profile instanceof SalesPersonProfile) {

            SalesPersonProfile spp = (SalesPersonProfile) profile;
            //displayquestion1();
           // displayquestion2();
            salesworkarea = new SalesPersonWorkAreaJPanel(business, spp, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Sales", salesworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }

        if (profile instanceof MarketingPersonProfile) {
            marketingworkarea = new MarketingManagerWorkAreaJPanel1(business, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Marketing", marketingworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }

        if (profile instanceof EmployeeProfile) {

            bzmanagerworkarea = new BusinessManagerWorkAreaJPanel(business, CardSequencePanel);
            CardSequencePanel.removeAll();
            CardSequencePanel.add("Admin", bzmanagerworkarea);
            ((java.awt.CardLayout) CardSequencePanel.getLayout()).next(CardSequencePanel);

        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PricingMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PricingMainFrame().setVisible(true);
            }
        });
        
  
        
        //PricingMainFrame m = new PricingMainFrame();
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardSequencePanel;
    private javax.swing.JTextField PasswordTextField;
    private javax.swing.JSplitPane SplitHomeArea;
    private javax.swing.JTextField UserNameTextField;
    private javax.swing.JPanel actionsidejpanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
