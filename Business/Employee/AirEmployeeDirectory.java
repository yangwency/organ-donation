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
public class AirEmployeeDirectory {
     private ArrayList<AirEmployee> airList;

    public AirEmployeeDirectory() {
        airList = new ArrayList();
    }

    public ArrayList<AirEmployee> getEmployeeList() {
        return airList;
    }
    
    public AirEmployee createManager(String name){
        AirEmployee employee = new AirEmployee();
        employee.setName(name);
        airList.add(employee);
        return employee;
    }
}
