/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author 珍
 */
public class UNOS {

    private static UNOS unos;
    
    private String UNOSname = "UNOS";

    public static UNOS getInstance() {
        if (unos == null) {
            unos = new UNOS();
        }
        return unos;
    }

    public static UNOS getUnos() {
        return unos;
    }

    public static void setUnos(UNOS unos) {
        UNOS.unos = unos;
    }

    @Override
    public String toString() {
        return UNOSname;
    }
    

}
