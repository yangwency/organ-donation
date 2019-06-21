/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UNOSWorkArea;

import Business.WorkQueue.OrganReportHosToUNOS;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.*;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.Component;
import java.awt.CardLayout;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


/**
 *
 * @author yang.wens
 */
public class ViewOrganDonorJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    OrganReportHosToUNOS request;
    EcoSystem system;
    int kidneyCount=0;
    int heartCount=0;
    int liverCount=0;
    int lungCount=0;
    int pancreasCount=0;
    int intestineCount=0;
    
    int kidneyabnCount=0;
     int kidneybnCount=0;
     int kidneyabpCount=0;
    
     int kidneyanCount=0;
     
     int heartabnCount=0;
     int heartbnCount=0;
     int heartabpCount=0;
    
     int heartanCount=0;
     
     int liverabnCount=0;
     int liverbnCount=0;
     int liverabpCount=0;
    
     int liveranCount=0;
     
     int lungabnCount=0;
     int lungbnCount=0;
     int lungabpCount=0;
    
     int lunganCount=0;
     
     int pancreasabnCount=0;
     int pancreasbnCount=0;
     int pancreasabpCount=0;
    
     int pancreasanCount=0;
     
     int intestineabnCount=0;
     int intestinebnCount=0;
     int intestineabpCount=0;
    
     int intestineanCount=0;
    
    /**
     * Creates new form ViewOrganDonerJPanel
     */
    public ViewOrganDonorJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for(Network network:system.getNetworkList()){
            for(Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList()){
                for(UserAccount user: enterprise.getUserAccountDirectory().getUserAccountList()){
                    if(user.getRole().toString() == "Business.Role.AdminRole"){
                        //System.out.println("see.."+user.getWorkQueue().getOrganReportList());
                        for(WorkRequest workrequest: user.getWorkQueue().getOrganReportList()){
                            OrganReportHosToUNOS report = (OrganReportHosToUNOS)workrequest;
                            Object[] row = new Object[6];
                            row[0] = report;
                            row[1] = report.getOrganType();
                            row[2] = report.getBloodType();
                            row[3] = report.getAvaliableDate();
                            row[4] = workrequest.getSender();
                            row[5] = report.getStatus();
                            model.addRow(row);
                            if(row[0].toString().equals("KIDNEY") && row[2].toString().equals("ABNEGATIVE"))
                            {
                                kidneyabnCount++;
                                System.out.println("kidneyabnCount"+kidneyabnCount);
                            }
                            
                            if(row[0].toString().equals("KIDNEY") && row[2].toString().equals("BNEGATIVE"))
                            {
                                kidneybnCount++;
                            }
                            if(row[0].toString().equals("KIDNEY") && row[2].toString().equals("ABPOSITIVE"))
                            {
                                kidneyabpCount++;
                            }
                             if(row[0].toString().equals("KIDNEY") && row[2].toString().equals("ANEGATIVE"))
                            {
                                kidneyanCount++;
                            }
                             
                              if(row[0].toString().equals("HEART") && row[2].toString().equals("ABNEGATIVE"))
                            {
                                heartabnCount++;
                            }
                            
                            if(row[0].toString().equals("HEART") && row[2].toString().equals("BNEGATIVE"))
                            {
                                heartbnCount++;
                            }
                            if(row[0].toString().equals("HEART") && row[2].toString().equals("ABPOSITIVE"))
                            {
                                heartabpCount++;
                            }
                             if(row[0].toString().equals("HEART") && row[2].toString().equals("ANEGATIVE"))
                            {
                                heartanCount++;
                            }
                             
                             if(row[0].toString().equals("LIVER") && row[2].toString().equals("ABNEGATIVE"))
                            {
                                liverabnCount++;
                            }
                            
                            if(row[0].toString().equals("LIVER") && row[2].toString().equals("BNEGATIVE"))
                            {
                                liverbnCount++;
                            }
                            if(row[0].toString().equals("LIVER") && row[2].toString().equals("ABPOSITIVE"))
                            {
                                liverabpCount++;
                            }
                             if(row[0].toString().equals("LIVER") && row[2].toString().equals("ANEGATIVE"))
                            {
                                liveranCount++;
                            }
                             
                               if(row[0].toString().equals("LUNG") && row[2].toString().equals("ABNEGATIVE"))
                            {
                                lungabnCount++;
                            }
                            
                            if(row[0].toString().equals("LUNG") && row[2].toString().equals("BNEGATIVE"))
                            {
                                lungbnCount++;
                            }
                            if(row[0].toString().equals("LUNG") && row[2].toString().equals("ABPOSITIVE"))
                            {
                                lungabpCount++;
                            }
                             if(row[0].toString().equals("LUNG") && row[2].toString().equals("ANEGATIVE"))
                            {
                                lunganCount++;
                            }
                             
                             
                               if(row[0].toString().equals("PANCREAS") && row[2].toString().equals("ABNEGATIVE"))
                            {
                                pancreasabnCount++;
                            }
                            
                            if(row[0].toString().equals("PANCREAS") && row[2].toString().equals("BNEGATIVE"))
                            {
                                pancreasbnCount++;
                            }
                            if(row[0].toString().equals("PANCREAS") && row[2].toString().equals("ABPOSITIVE"))
                            {
                                pancreasabpCount++;
                            }
                             if(row[0].toString().equals("PANCREAS") && row[2].toString().equals("ANEGATIVE"))
                            {
                                pancreasanCount++;
                            }
                             
                               if(row[0].toString().equals("INTESTINE") && row[2].toString().equals("ABNEGATIVE"))
                            {
                                intestineabnCount++;
                            }
                            
                            if(row[0].toString().equals("INTESTINE") && row[2].toString().equals("BNEGATIVE"))
                            {
                                intestinebnCount++;
                            }
                            if(row[0].toString().equals("INTESTINE") && row[2].toString().equals("ABPOSITIVE"))
                            {
                                intestineabpCount++;
                            }
                             if(row[0].toString().equals("INTESTINE") && row[2].toString().equals("ANEGATIVE"))
                            {
                                intestineanCount++;
                            }
                            
                            if(row[0].toString().equals("KIDNEY"))
                                
                            {
                                
                               kidneyCount+=1; 
                                
                            }
                            if(row[0].toString().equals("HEART"))
                            {
                               heartCount+=1; 
                                
                            }
                            if(row[0].toString().equals("LIVER"))
                            {
                                liverCount+=1;
                                
                            }
                            if(row[0].toString().equals("LUNG"))
                            {
                               lungCount+=1;
                                
                            }
                             if(row[0].toString().equals("PANCREAS"))
                            {
                               pancreasCount+=1;
                                
                            }
                             if(row[0].toString().equals("INTESTINE"))
                            {
                               intestineCount+=1;
                                
                            }
                             
                            
                             
                            
                            
                            
                            
                            
                            
                            
                            
                            
                            
                        }
                    }
                }
            }
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

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        backJButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Organ Name", "Organ Type", "Blood Type", "Avaliable day", "Hospital"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 840, 490));

        backJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 680, -1, -1));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setMaximumSize(new java.awt.Dimension(230, 1080));
        jPanel2.setMinimumSize(new java.awt.Dimension(230, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("System Administrator");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 10));

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("    Manage Organization");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel12.setText("   View Organ Request List");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 40));

        jPanel5.setBackground(new java.awt.Color(7, 79, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("    Manage Employee");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel13.setText("   View Organ Donor List");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 40));

        jPanel6.setBackground(new java.awt.Color(15, 58, 59));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel14.setText("   Process");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 1080));

        jPanel10.setBackground(new java.awt.Color(37, 155, 156));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("/System/UNOS/Administrator");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("View Organ Donor List");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-numbered_list.png"))); // NOI18N
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 850, 70));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Organ Statistics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 680, -1, -1));

        jButton2.setText("Rare Blood Group Stats");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 680, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 753, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        //OrganRequestJPanel orjp = (OrganRequestJPanel) component;
        //orjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        DefaultCategoryDataset barChartData=new DefaultCategoryDataset();
        barChartData.setValue(kidneyCount, "kidney", "kidney");
        barChartData.setValue(heartCount, "heart", "heart");
        barChartData.setValue(liverCount, "liver", "liver");
        barChartData.setValue(lungCount, "lung", "lung");
        barChartData.setValue(pancreasCount, "pancreas", "pancreas");
         barChartData.setValue(intestineCount, "intestine", "intestine");
        
        
        double d=0.1;
        
        JFreeChart jchart = ChartFactory.createBarChart3D("Statistical Data", "organs", "Number of Organ donors", barChartData, PlotOrientation.VERTICAL, true, true, true);
        
        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        plot.getRangeAxis().setLowerBound(d);
        ChartFrame chartFrm =new ChartFrame("Organ Donors",jchart,true);
        chartFrm.setAlwaysOnTop(true);
        chartFrm.setVisible(true);
        chartFrm.setSize(800, 800);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        
      final String kidney = "KIDNEY";        
      final String heart = "HEART";        
      final String liver = "LIVER";     
      final String lung = "LUNG";        
      final String pancreas = "PANCREAS";        
      final String intestine = "INTESTINE";   
      
      
      final String abNegative = "AB -ve";        
      final String bNgeative = "B -ve";        
      final String abPositive = "AB +ve";        
      final String aNegative = "A -ve";        
      final DefaultCategoryDataset dataset = 
      new DefaultCategoryDataset( );  

      dataset.addValue( kidneyabnCount , kidney , abNegative );        
      dataset.addValue( kidneybnCount, kidney , bNgeative );        
      dataset.addValue( kidneyabpCount, kidney , abPositive ); 
      dataset.addValue( kidneyanCount , kidney , aNegative );           

      dataset.addValue( heartabnCount , heart , abNegative );        
      dataset.addValue( heartbnCount , heart , bNgeative );       
      dataset.addValue( heartabpCount , heart , abPositive );        
      dataset.addValue( heartanCount , heart , aNegative );

      dataset.addValue( liverabnCount , liver , abNegative );        
      dataset.addValue( liverbnCount , liver , bNgeative );        
      dataset.addValue( liverabpCount, liver , abPositive );        
      dataset.addValue( liveranCount , liver , aNegative );
      
      
      dataset.addValue( liverabnCount , lung , abNegative );        
      dataset.addValue( liverbnCount, lung , bNgeative );        
      dataset.addValue( liverabpCount , lung , abPositive );        
      dataset.addValue( liveranCount , lung , aNegative );
      
      dataset.addValue( pancreasabnCount , pancreas , abNegative );        
      dataset.addValue( pancreasbnCount , pancreas , bNgeative );        
      dataset.addValue( pancreasabpCount, pancreas , abPositive );        
      dataset.addValue( pancreasanCount , pancreas , aNegative );
      
      dataset.addValue( intestineabnCount , intestine , abNegative);        
      dataset.addValue( intestinebnCount , intestine , bNgeative );        
      dataset.addValue( intestineabpCount , intestine , abPositive );        
      dataset.addValue( intestineanCount , intestine , aNegative );
      
      
      
         
        double d=0.5;
        
        JFreeChart jchart1 = ChartFactory.createBarChart3D("Statistical Data", "organs", "Number of Organ donors", dataset, PlotOrientation.VERTICAL, true, true, true);
        
        CategoryPlot plot = jchart1.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.black);
        plot.getRangeAxis().setLowerBound(d);
        ChartFrame chartFrm =new ChartFrame("Organ Donors",jchart1,true);
        chartFrm.setVisible(true);
        chartFrm.setSize(500, 400);
        
        
        
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
