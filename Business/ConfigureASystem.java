package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.Role.UNOSRole;
import Business.Role.AirRole;
import Business.Role.OrganCompanyAdminRole;
/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        //log in as system administrator
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("1", "1", employee, new SystemAdminRole());
        //log in as UNOS administrator
        UserAccount uno = system.getUserAccountDirectory().createUserAccount("UNOS", "UNOS", employee, new UNOSRole());
        //log in as air ambulence administrator
        UserAccount air = system.getUserAccountDirectory().createUserAccount("AIR", "AIR", employee, new AirRole());
        //log in as organ company administrator
        UserAccount oad = system.getUserAccountDirectory().createUserAccount("COM", "COM", employee, new OrganCompanyAdminRole());
        return system;
    }
    
}
