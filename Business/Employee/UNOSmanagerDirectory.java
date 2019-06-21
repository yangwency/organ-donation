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
public class UNOSmanagerDirectory {
        private ArrayList<UNOSmanager> managerList;

    public UNOSmanagerDirectory() {
        managerList = new ArrayList();
    }

    public ArrayList<UNOSmanager> getManagerList() {
        return managerList;
    }
    
    public UNOSmanager createManager(String name){
        UNOSmanager manager = new UNOSmanager();
        manager.setName(name);
        managerList.add(manager);
        return manager;
    }
}
