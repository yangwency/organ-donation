/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author wency
 */
public class OrganCompany {
    
    private static OrganCompany organcompany;
    
    private String OrganCompanyname = "OrganCompany";

    public static OrganCompany getInstance() {
        if (organcompany == null) {
            organcompany = new OrganCompany();
        }
        return organcompany;
    }

    public static OrganCompany getOrgancompany() {
        return organcompany;
    }

    public static void setOrgancompany(OrganCompany organcompany) {
        OrganCompany.organcompany = organcompany;
    }


    @Override
    public String toString() {
        return OrganCompanyname;
    }
}
