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
public class AirAmbulenceDistribution {
   private static AirAmbulenceDistribution ad;
    
    private String aird = "AirAmbulenceDistribution";

    public static AirAmbulenceDistribution getInstance() {
        if (ad == null) {
            ad = new AirAmbulenceDistribution();
        }
        return ad;
    }

    public static AirAmbulenceDistribution getAd() {
        return ad;
    }

    public static void setAd(AirAmbulenceDistribution ad) {
        AirAmbulenceDistribution.ad = ad;
    }

    public String getAird() {
        return aird;
    }

    public void setAird(String aird) {
        this.aird = aird;
    }

    @Override
    public String toString() {
        return aird;
    }


}
