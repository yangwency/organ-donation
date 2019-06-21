/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.storage.PatientDirectory;
import javax.swing.JPanel;
import userinterface.AirAmbulenceRole.AirAmbulenceWorkAreaJPanel;

/**
 *
 * @author wency
 */
public class AirEmployeeRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system,PatientDirectory patientDirectory) {
        return new AirAmbulenceWorkAreaJPanel(userProcessContainer, system, account);
    }
}
