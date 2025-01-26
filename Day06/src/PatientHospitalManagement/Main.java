package PatientHospitalManagement;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        List<Patient> patients = new ArrayList<>();

        InPatient inp = new InPatient("IP001", "Alice", 70, 23);
        inp.addRecord("Admitted for surgery");

        OutPatient outp = new OutPatient("OP001", "Bob", 39, "Specialist");
        outp.addRecord("Regular checkup");

        patients.add(inp);
        patients.add(outp);

        // Polymorphic processing
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Total Bill of patient is: " + patient.calculateBill());

            // Check medical records
            if (patient instanceof MedicalRecord) {
                MedicalRecord medicalRecord = (MedicalRecord) patient;
                System.out.println("Medical Records of patient is: " + medicalRecord.viewRecords());
            }
            System.out.println();
        }
    }
}
