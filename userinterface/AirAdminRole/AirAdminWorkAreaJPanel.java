/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.AirAdminRole;

import Business.EcoSystem;
import javax.swing.JPanel;
import Business.Employee.AirEmployee;
import Business.Employee.AirEmployeeDirectory;

import Business.UserAccount.UserAccountDirectory;
import Business.UserAccount.UserAccount;
import Business.Role.AirEmployeeRole;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author wency
 */
public class AirAdminWorkAreaJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem system;
    /**
     * Creates new form AirAdminWorkAreaJPanel
     */
    public AirAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populate();
    }

        public void populate() {
         DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        model.setRowCount(0);
        for (AirEmployee employee : system.getAirEmployeeDirectory().getEmployeeList()) {
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = employee.getName();
            model.addRow(row);
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

        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        submitJButton = new javax.swing.JButton();
        usernameJTextField = new javax.swing.JTextField();
        passwordJPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameJTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(242, 240, 242));
        jPanel5.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel5.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("My Work Area ");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, -1, -1));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 1080));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 1040, 30));

        jPanel3.setBackground(new java.awt.Color(7, 79, 80));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "NAME"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 370));

        submitJButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 550, -1, -1));

        usernameJTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(usernameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 136, -1));

        passwordJPasswordField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(passwordJPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 134, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username* :");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 410, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password* :");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 450, -1, -1));

        nameJTextField.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(nameJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 136, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Name* :");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 490, -1, -1));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 1040, 940));

        jLabel3.setText("Air Admin Role");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 200, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/icons8-find_user.png"))); // NOI18N
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 90, 80));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        String username = usernameJTextField.getText();
        String password = String.valueOf(passwordJPasswordField.getPassword());
        String name = nameJTextField.getText();

        AirEmployeeDirectory directory = system.getAirEmployeeDirectory();
        AirEmployee employee = directory.createManager(name);

        UserAccountDirectory ud = system.getUserAccountDirectory();

        UserAccount account = ud.createAirUserAccount(username, password, employee, new AirEmployeeRole());

        populate();
    }//GEN-LAST:event_submitJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JPasswordField passwordJPasswordField;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField usernameJTextField;
    // End of variables declaration//GEN-END:variables
}
