/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OrganCompanyStaff;

import Business.WorkQueue.ArtificialOrganRequest;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.DirtributionWorkRequest;
import java.awt.CardLayout;

/**
 *
 * @author wency
 */
public class ProcessRequestJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    ArtificialOrganRequest request;
    WorkQueue workqueue;
    /**
     * Creates new form ProcessRequestJPanel
     */
    public ProcessRequestJPanel(JPanel userProcessContainer, ArtificialOrganRequest request,WorkQueue workqueue) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.workqueue = workqueue;
        populate();
    }
    
    private void populate(){
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        Object[] row = new Object[3];
        row[0] = request;
        row[1] = request.getSender();
        row[2] = request.getStatus();
        model.addRow(row);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        source = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        assign = new javax.swing.JButton();
        distribution = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setMaximumSize(new java.awt.Dimension(230, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(230, 1080));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Organ Company Staff");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 10));

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("    Manage Organization");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel12.setText("    Organ Company Staff");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 40));

        jPanel5.setBackground(new java.awt.Color(7, 79, 80));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("    Manage Employee");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel13.setText("    Process Request");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 40));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 1080));

        jPanel10.setBackground(new java.awt.Color(37, 155, 156));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("/System/OrganCompany/Staff");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Process Request");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-process.png"))); // NOI18N
        jPanel10.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel3.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 850, 70));

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Organ Name", "Needed Hospital", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 781, 420));

        source.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(source, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 140, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Status:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 630, -1, -1));

        assign.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        assign.setText("update");
        assign.setToolTipText("");
        assign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignActionPerformed(evt);
            }
        });
        jPanel3.add(assign, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 620, -1, -1));

        distribution.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        distribution.setText("distribution request");
        distribution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributionActionPerformed(evt);
            }
        });
        jPanel3.add(distribution, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 660, -1, -1));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 660, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignActionPerformed
        // TODO add your handling code here:
                // TODO add your handling code here:
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }
        String s = source.getText();
        WorkRequest request = (WorkRequest) jTable1.getValueAt(selectedRow, 0);

        request.setStatus(s);
        populate();
 
    }//GEN-LAST:event_assignActionPerformed

    private void distributionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributionActionPerformed
        // TODO add your handling code here:

       
        int selectedRow = jTable1.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        ArtificialOrganRequest re = (ArtificialOrganRequest)jTable1.getValueAt(selectedRow, 0);
        //OrganReportDocToHos req = (OrganReportDocToHos)jTable1.getValueAt(selectedRow, 0);
        re.setStatus("Message Sent to Air Ambulence");
        //req.setStatus("Message Sent to Air Ambulence");

        DirtributionWorkRequest airrequest = new DirtributionWorkRequest();
        airrequest.setMessage(request.getMessage());
        airrequest.setFrom("Organ Company");
        
        airrequest.setTo(request.getSender().toString());
        airrequest.setStatus("Sent to Air Ambulence");
        airrequest.setOrganname(request.getOrganName());

        

        workqueue.getDistributionList().add(airrequest);
    }//GEN-LAST:event_distributionActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assign;
    private javax.swing.JButton distribution;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField source;
    // End of variables declaration//GEN-END:variables
}
