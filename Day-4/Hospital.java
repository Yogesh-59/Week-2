import java.util.*;
import java.util.ArrayList;
public class Doctor {
   //create instances of doctor class
    private String name;
    private String specialty;
    private Set<Patient> patients;
    // to define a collection of unique objects of type Patient
    public Doctor(String name, String specialty) {
        this.name = name;
        this.specialty = specialty;
        this.patients = new HashSet<>();
    }
   //method to add patient
    public void addPatient(Patient patient) {
        patients.add(patient);
        patient.addDoctor(this);
    }
   //method to print the doctor consult
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Dr. " + name + " (" + specialty + ") consulting with " 
                             + patient.getName() + " about " + patient.getCondition());
        } else {
            System.out.println("Error: Patient not assigned to this doctor");
        }
    }
   //method to get name
    public String getName() {
        return name;
    }
}
//create class patient
public class Patient {
    //define there instances
    private String name;
    private String condition;
    private Set<Doctor> doctors;
   //using constructor to initialize instances
    public Patient(String name, String condition) {
        this.name = name;
        this.condition = condition;
        this.doctors = new HashSet<>();
    }
   //method to add doctors
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }
   //get name
    public String getName() {
        return name;
    }
  //method to get condition
    public String getCondition() {
        return condition;
    }
}
//create main class Hospital
public class Hospital {
// make there instances
    private String name;
    private List<Doctor> doctors;
    private List<Patient> patients;
   //initialize the instance variable 
    public Hospital(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }
   
    public static void main(String[] args) {
     //create the object of Hospital class and call
        Hospital hospital = new Hospital("AIIMS BHOPAL");
        //make object of doctor class
        Doctor dr = new Doctor("Deepraj", "Cardiology");
        Doctor nl = new Doctor("Ram", "Neurology");
        //creating object of patient class
        Patient patient1 = new Patient("Aryan", "Heart condition");
        Patient patient2 = new Patient("Bipin", "Migraine");
        
        hospital.addDoctor(dr);
        hospital.addDoctor(nl);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        
        dr.addPatient(patient1);
        nl.addPatient(patient1);
        nl.addPatient(patient2);
        
        dr.consult(patient1);
        nl.consult(patient1);
        nl.consult(patient2);
    }
}