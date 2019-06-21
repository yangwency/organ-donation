/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author yang.wens
 */
public class OrganReportHosToUNOS extends WorkRequest{
    private String OrganName;
    private String DonerName;
    private String BloodType;
    private String OrganType;
    private String AvaliableDate;

    public String getOrganName() {
        return OrganName;
    }

    public void setOrganName(String OrganName) {
        this.OrganName = OrganName;
    }

    public String getDonerName() {
        return DonerName;
    }

    public void setDonerName(String DonerName) {
        this.DonerName = DonerName;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getOrganType() {
        return OrganType;
    }

    public void setOrganType(String OrganType) {
        this.OrganType = OrganType;
    }

    public String getAvaliableDate() {
        return AvaliableDate;
    }

    public void setAvaliableDate(String AvaliableDate) {
        this.AvaliableDate = AvaliableDate;
    }

    @Override
    public String toString() {
        return OrganName;
    }
}
