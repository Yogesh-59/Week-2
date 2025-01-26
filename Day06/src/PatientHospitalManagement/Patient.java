package PatientHospitalManagement;

abstract class Patient {
    private String patientId;
    private String name;
    protected int age;

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate bill
    public abstract double calculateBill();

    // Concrete method to get patient details
    public String getPatientDetails() {
        return "Patient ID: " + patientId + ", Name of the : " + name + ", Age is: " + age;
    }

    // Getters
    public String getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }
}
