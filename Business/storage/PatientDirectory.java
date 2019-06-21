/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.storage;
import java.util.ArrayList;
/**
 *
 * @author wency
 */
public class PatientDirectory {
    private ArrayList<Patient>PatientDirectory;

    public PatientDirectory() {
        PatientDirectory = new ArrayList();
    }
    
       public ArrayList<Patient> getPatientDirectory() {
        return PatientDirectory;
    }

    public Patient addPatient() {
        Patient patient = new Patient();
        PatientDirectory.add(patient);
        return patient;
    }

    public void removeAirplane(Patient patient) {
        PatientDirectory.remove(patient);
    }

    public Patient searchAirplane(String keyWord) {
        for (Patient patient : PatientDirectory) {
            if (keyWord.equals(patient.getName())) {
                return patient;
            }
        }
        return null;
    }

    
}
