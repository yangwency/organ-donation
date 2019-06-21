/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author wency
 */
public class OrganCompanyStaffDirectory {
    
         private ArrayList<OrganCompanyStaff> staffList;

    public OrganCompanyStaffDirectory() {
        staffList = new ArrayList();
    }

    public ArrayList<OrganCompanyStaff> getStaffList() {
        return staffList;
    }
    
    public OrganCompanyStaff createStaff(String name){
        OrganCompanyStaff staff = new OrganCompanyStaff();
        staff.setName(name);
        staffList.add(staff);
        return staff;
    }
}
