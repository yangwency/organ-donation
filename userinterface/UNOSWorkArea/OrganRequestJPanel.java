/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.UNOSWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.Network.Network;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.OrganRequestHosToUNOS;
import Business.WorkQueue.OrganReportDocToHos;
import Business.WorkQueue.OrganRequestDocToHos;
import Business.WorkQueue.WorkQueue;
import Business.UserAccount.UserAccount;
import Business.Role.AdminRole;
import Business.WorkQueue.LabTestWorkRequest;
import java.awt.CardLayout;
import userinterface.LabAssistantRole.ProcessWorkRequestJPanel;
import java.awt.Component;
import Business.WorkQueue.WorkRequest;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author yang.wens
 */
public class OrganRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount useraccount;
    int kidneyCount = 0;
    int heartCount = 0;
    int liverCount = 0;
    int lungCount = 0;
    int pancreasCount = 0;
    int intestineCount = 0;

    /**
     * Creates new form OrganRequesrJPanel
     */
    public OrganRequestJPanel(JPanel userProcessContainer, EcoSystem system, UserAccount useraccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.useraccount = useraccount;
        populateTable();
    }

    public void populateTable() {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount useraccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
//                    System.out.println("enterprise:"+enterprise.getUserAccountDirectory().getUserAccountList());
//                    System.out.println("where:"+useraccount.getRole().toString());
                    if (useraccount.getRole().toString() == "Business.Role.AdminRole") {

                        for (WorkRequest request : useraccount.getWorkQueue().getOrganRequestList()) {
                            OrganRequestHosToUNOS u = (OrganRequestHosToUNOS) request;
                            Object[] row = new Object[4];
                            row[0] = u;
                            //row[1] = u.getOrganName();
                            row[1] = request.getSender().getEmployee().getName();
                            row[2] = request.getReceiver();
                            row[3] = request.getStatus();

                            if (row[1].toString().equals("KIDNEY")) {
                                kidneyCount++;
                                //System.out.println(kidneyCount);
                            }

                            if (u.getOrganName().toString().equals("HEART")) {
                                heartCount++;
                            }
                            if (u.getOrganName().toString().equals("LIVER")) {
                                liverCount++;
                            }
                            if (u.getOrganName().toString().equals("LUNG")) {
                                lungCount++;
                            }
                            if (u.getOrganName().toString().equals("PANCREAS")){
                                pancreasCount++;
                            }
                            if (u.getOrganName().toString().equals("INTESTINE")) {
                                intestineCount++;
                            }
                            model.addRow(row);

                        }
                    }
                }

//                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//                    System.out.println("enterprise:"+enterprise.getOrganizationDirectory().getOrganizationList());
//                    if (organization instanceof AdminOrganization) {
//                        AdminOrganization adminorganization = (AdminOrganization) organization;
//                        for (WorkRequest request : adminorganization.getWorkQueue().getOrganRequestList()) {
//                            System.out.println("unos:"+adminorganization.getWorkQueue().getOrganRequestList());
//                            Object[] row = new Object[5];
//                            row[0] = request;
//                            row[1] = request.getMessage();
//                            row[2] = request.getSender().getEmployee().getName();
//                            row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//                            row[4] = request.getStatus();
//
//                            model.addRow(row);
//                        }
//                    }
//                }
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
        workRequestJTable = new javax.swing.JTable();
        Process = new javax.swing.JButton();
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
        assign = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Organ Name", "Sender", "Receiver", "Status"
            }
        ));
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 780, 420));

        Process.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        Process.setText("Process");
        Process.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessActionPerformed(evt);
            }
        });
        jPanel1.add(Process, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 610, -1, -1));

        backJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 90, -1));

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setMaximumSize(new java.awt.Dimension(230, 1080));
        jPanel2.setMinimumSize(new java.awt.Dimension(230, 1080));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("System Administrator");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 10));

        jPanel4.setBackground(new java.awt.Color(7, 79, 80));
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

        jPanel5.setBackground(new java.awt.Color(15, 58, 59));
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

        assign.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        assign.setText("Assign to me");
        assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignActionPerformed(evt);
            }
        });
        jPanel1.add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, -1, -1));

        jPanel10.setBackground(new java.awt.Color(37, 155, 156));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("/System/UNOS/Administrator");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("View Organ Request List");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-report_card.png"))); // NOI18N
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 60));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 850, 70));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Organ Requested Statistics");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 650, -1, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 1080));
    }// </editor-fold>//GEN-END:initComponents

    private void ProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        WorkQueue workqueue = system.getWorkQueue();

        OrganRequestHosToUNOS request = (OrganRequestHosToUNOS) workRequestJTable.getValueAt(selectedRow, 0);
        WorkRequest r = (WorkRequest) request;
        //OrganRequestDocToHos req = (OrganRequestDocToHos)r;
        //req.setStatus("UNOS Processing");
        request.setStatus("UNOS Processing");
        String id = request.getMessage();
        String name = request.getOrgan();
        System.out.println("message!" + request.getMessage());
        String sed = request.getSender().toString();

        OrganRequestDocToHos ordh = new OrganRequestDocToHos();

        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {

                for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

                    //System.out.println("aaa"+organization.getWorkQueue().search(me));
                    //System.out.println("and and ?"+organization.getWorkQueue().getOrganRequestList());
                    //System.out.println("keve"+organization.getWorkQueue().search(id, name));
                    if (organization.getWorkQueue().search(id, name) != null) {
                        WorkRequest wr = organization.getWorkQueue().search(id, name);
                        OrganRequestDocToHos requ = (OrganRequestDocToHos) wr;
                        requ.setStatus("UNOS Processing");
                        ordh = requ;

                    }
                }
            }
        }

        ProcessJPanel requestprocessJPanel = new ProcessJPanel(userProcessContainer, request, workqueue, ordh);
        userProcessContainer.add("processWorkRequestJPanel", requestprocessJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ProcessActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        //Component component = componentArray[componentArray.length - 1];
        //OrganRequestJPanel orjp = (OrganRequestJPanel) component;
        //orjp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        System.out.println("++" + workRequestJTable.getValueAt(selectedRow, 0));
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        request.setReceiver(useraccount);
        request.setStatus("Pending");
        populateTable();
    }//GEN-LAST:event_assignActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        populateTable();
        //System.out.println("kidney"+kidneyCount);
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("kidney", kidneyCount);
        pieDataset.setValue("heart", heartCount);
        pieDataset.setValue("liver", liverCount);
        pieDataset.setValue("lung", lungCount);
        pieDataset.setValue("pancreas", pancreasCount);
        pieDataset.setValue("intestine", intestineCount);

        JFreeChart chart = ChartFactory.createPieChart("Pie Chart", pieDataset, true, true, true);

        PiePlot p = (PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
        frame.setVisible(true);
        frame.setAlwaysOnTop(true);
        frame.setSize(450, 500);


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Process;
    private javax.swing.JButton assign;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
