public class Vehicle
{
    static int count=0;
    String ownerName,vehicleType;
    final int registrationNumber;
    Vehicle(String ownerName ,String vehicleType,int registrationNumber)
    {
        this.registrationNumber=registrationNumber;
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        count++;
    }
    void displayTotalVehicle()
    {
        System.out.println("There are "+count+" no. of vehicles");
    }
    void getdata()
    {
        System.out.println("The owner name is "+ ownerName+" with the vehicle type "+vehicleType+" and his registration no. is "+ registrationNumber);
    }


    public static void main(String [] args)
    {
        Vehicle vehicle=new Vehicle("Deepraj","Four Vehilar",2505);
        if(vehicle instanceof Vehicle)
        {
            System.out.println("vehicle is instanceof of Vehicle");
        }
        else {
            System.out.println("vehicle is not instanceof of Vehicle");
        }
        vehicle.displayTotalVehicle();
        vehicle.getdata();
    }


}