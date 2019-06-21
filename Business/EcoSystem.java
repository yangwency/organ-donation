/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.AirEmployeeDirectory;
import Business.Employee.OrganCompanyStaffDirectory;
import Business.Employee.UNOSmanagerDirectory;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.storage.PatientDirectory;
import java.util.ArrayList;


/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
   private static EcoSystem business;
    private ArrayList<Network> networkList;
    private PatientDirectory patientDirectory;
    private UNOSmanagerDirectory unosManagerDirectory;
    private AirEmployeeDirectory airEmployeeDirectory;
    private OrganCompanyStaffDirectory organCompanyStaffDirectory;

    public OrganCompanyStaffDirectory getOrganCompanyStaffDirectory() {
        return organCompanyStaffDirectory;
    }

    public void setOrganCompanyStaffDirectory(OrganCompanyStaffDirectory organCompanyStaffDirectory) {
        this.organCompanyStaffDirectory = organCompanyStaffDirectory;
    }
    
    

    public AirEmployeeDirectory getAirEmployeeDirectory() {
        return airEmployeeDirectory;
    }

    public void setAirEmployeeDirectory(AirEmployeeDirectory airEmployeeDirectory) {
        this.airEmployeeDirectory = airEmployeeDirectory;
    }
    

    public UNOSmanagerDirectory getUnosManagerDirectory() {
        return unosManagerDirectory;
    }

    public void setUnosManagerDirectory(UNOSmanagerDirectory unosManagerDirectory) {
        this.unosManagerDirectory = unosManagerDirectory;
    }
    
    

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
        patientDirectory = new PatientDirectory();
        unosManagerDirectory = new UNOSmanagerDirectory();
        airEmployeeDirectory = new AirEmployeeDirectory();
        organCompanyStaffDirectory = new OrganCompanyStaffDirectory();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        
        for(Network network:networkList){
            
        }
        return true;
    }
}
