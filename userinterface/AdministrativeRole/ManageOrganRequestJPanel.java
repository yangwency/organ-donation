/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AdministrativeRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.WorkQueue.WorkRequest;
import Business.Organization.DoctorOrganization;
import Business.Organization.AdminOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.ArtificialOrganRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Business.WorkQueue.OrganRequestDocToHos;
import Business.WorkQueue.OrganRequestHosToUNOS;
import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author 珍
 */
public class ManageOrganRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private DoctorOrganization doctororganization;
    private Enterprise enterprise;

    /**
     * Creates new form ManageOrganRequestJPanel
     */
    public ManageOrganRequestJPanel(JPanel userProcessContainer, Enterprise enterprise, UserAccount userAccount) {
        initComponents();
        this.userProcessContainer = userProcessContainer;

        this.enterprise = enterprise;
        this.userAccount = userAccount;

        populateTable(enterprise);
    }

    public void populateTable(Enterprise enterprise) {

        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {

            if (organization instanceof DoctorOrganization) {

                doctororganization = (DoctorOrganization) organization;
                //System.out.println("##$"+organization.getWorkQueue().getOrganRequestList());
                for (WorkRequest request : organization.getWorkQueue().getOrganRequestList()) {
                    OrganRequestDocToHos h = (OrganRequestDocToHos) request;

                    Object[] row = new Object[5];
                    row[0] = request;
                    row[1] = h.getOrganName();
                    row[2] = request.getSender().getEmployee().getName();
                    row[3] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                    row[4] = request.getStatus();

                    model.addRow(row);
                }
            }
        }

//  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel8 = new javax.swing.JPanel();
        refreshJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
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
        jPanel7 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(600, 600));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(600, 600));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel8.add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 120, -1));

        workRequestJTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Type", "Message", "Sender", "Receiver", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        jPanel8.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, 800, 420));

        assignJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel8.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 650, -1, -1));

        processJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        processJButton.setText("Approve");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        jPanel8.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 650, 120, -1));

        backJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel8.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 650, 120, -1));

        jPanel1.setBackground(new java.awt.Color(15, 58, 59));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 58, 59));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(204, 204, 204));
        jLabel10.setText("    Manage Organ Report");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(204, 204, 204));
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel15.setText("    Manage Organ Report");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 230, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Administrater");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 150, 10));

        jPanel4.setBackground(new java.awt.Color(15, 58, 59));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("    Manage Organization");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel12.setText("    Manage Organization");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 230, 40));

        jPanel5.setBackground(new java.awt.Color(15, 58, 59));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("    Manage Employee");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel13.setText("    Manage Employee");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 230, 40));

        jPanel6.setBackground(new java.awt.Color(15, 58, 59));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(204, 204, 204));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(204, 204, 204));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel14.setText("    Manage User");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 230, 40));

        jPanel7.setBackground(new java.awt.Color(7, 79, 80));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 204, 204));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel11.setText("    Manage Organ Request");
        jPanel7.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 230, 40));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(204, 204, 204));
        jLabel16.setText("    Manage Organ Request");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jPanel9.setBackground(new java.awt.Color(15, 58, 59));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(204, 204, 204));
        jLabel19.setText("    Manage Organ Report");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(204, 204, 204));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel20.setText("    Manage patients");
        jPanel9.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 230, 40));

        jPanel3.setBackground(new java.awt.Color(15, 58, 59));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("    Manage Organ Report");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(204, 204, 204));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        jLabel18.setText("    Start Chat");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 230, 40));

        jPanel8.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 1080));

        jPanel10.setBackground(new java.awt.Color(37, 155, 156));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("/System/Hospital/Administrator");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manage Organ Request");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-medical_heart.png"))); // NOI18N
        jPanel10.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, 50));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 850, 70));

        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Make Artificial Organ Request");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 650, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateTable(enterprise);
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        System.out.println("++" + workRequestJTable.getValueAt(selectedRow, 0));
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

        for (UserAccount userAccount : enterprise.getUserAccountDirectory().getUserAccountList()) {
            System.out.println("userAccount:" + userAccount);

        }

        request.setReceiver(userAccount);
        request.setStatus("HospitalPending");
        populateTable(enterprise);
        JOptionPane.showMessageDialog((this), "Successfully Assigned", "Warning", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        OrganRequestDocToHos request = (OrganRequestDocToHos) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Sent to UNOS");
        String id = request.getMessage();
        OrganRequestHosToUNOS request1 = new OrganRequestHosToUNOS();
        request1.setMessage(id);
        request1.setOrganName(request.getOrganName());
        request1.setSender(userAccount);
        request1.setOrgan(request.getOrganName());
        request1.setBloodtype(request.getBloodtype());
        request1.setOrgantype(request.getOrgantype());
        request1.setStatus("Sent to UNOS");
        populateTable(enterprise);

        userAccount.getWorkQueue().getOrganRequestList().add(request1);

        Organization org = null;

        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization instanceof AdminOrganization) {
                org = organization;
                break;
            }
        }

        if (org != null) {
            org.getWorkQueue().getOrganRequestList().add(request);
            userAccount.getWorkQueue().getOrganRequestList().add(request);

        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            return;
        }

        OrganRequestDocToHos request = (OrganRequestDocToHos) workRequestJTable.getValueAt(selectedRow, 0);

        request.setStatus("Sent to Organ Company");
        String message = request.getMessage();
        String organname = request.getOrganName();

        ArtificialOrganRequest request1 = new ArtificialOrganRequest();
        request1.setOrganName(organname);
        request1.setMessage(message);
        request1.setSender(userAccount);
        request1.setOrgan(organname);

        request1.setStatus("Sent to Organ Company");
        populateTable(enterprise);

        userAccount.getWorkQueue().getArtificialOrganRequestlist().add(request1);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
