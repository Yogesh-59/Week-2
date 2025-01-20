public class Patient
{
   public static final String hospitalName="AIIMS BHOPAL";
    static int count =0;
    public String name,ailment;
    public int age;
    private final int patientID;
    Patient(String name,int age,String ailment)
    {
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        count++;
        patientID=count;
    }
    void getTotalPatient()
    {
        System.out.println("There are total "+count+" Patient in the Hospital");
    }
    void displayResult()
    {
        System.out.println("The patient name is "+name+" and age is "+age+ " he came to hospital for the cure of "+ailment);
    }
    public static void main(String args [])
    {
        Patient patient=new Patient("EVERYONE",70,"MONKEYPOX");
        if(patient instanceof Patient)
        {
            System.out.println("patient is the instance of Patient");
        }
        else {
            System.out.println("patient is not the instance of Patient");
        }
        patient.getTotalPatient();
        patient.displayResult();
    }

}