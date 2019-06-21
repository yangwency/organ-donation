/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Enterprise.UNOS;
import Business.Enterprise.OrganCompany;
import Business.Enterprise.AirAmbulenceDistribution;

/**
 *
 * @author MyPC1
 */
public class Network {
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private UNOS unos;
    private OrganCompany organcompany;
    private AirAmbulenceDistribution ad;

    public OrganCompany getOrgancompany() {
        return organcompany;
    }

    public void setOrgancompany(OrganCompany organcompany) {
        this.organcompany = organcompany;
    }

    public AirAmbulenceDistribution getAd() {
        return ad;
    }

    public void setAd(AirAmbulenceDistribution ad) {
        this.ad = ad;
    }
    
    

    public void setUnos(UNOS unos) {
        this.unos = unos;
    }
    
    public Network(){
        enterpriseDirectory=new EnterpriseDirectory();
        unos = UNOS.getInstance();
        organcompany = OrganCompany.getInstance();
        ad = AirAmbulenceDistribution.getInstance();
    }

    public UNOS getUnos() {
        return unos;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
}
