package PatientHospitalManagement;

import java.util.ArrayList;
import java.util.List;

class OutPatient extends Patient implements MedicalRecord{
    private String consultationType;
    private List<String> medicalRecords;

    public OutPatient(String patientId, String name, int age, String consultationType) {
        super(patientId, name, age);
        this.consultationType = consultationType;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return consultationType.equals("Specialist") ? 6000 : 1500;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return new ArrayList<>(medicalRecords);
    }
}
