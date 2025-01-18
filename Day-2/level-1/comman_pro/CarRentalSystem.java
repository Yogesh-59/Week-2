import java.util.*;
public class CarRentalSystem {

    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate;

    // Constructor with default daily rate
    public CarRentalSystem(String customerName, String carModel, int rentalDays) {
      this.customerName=customerName;
      this.carModel=carModel;
      this.rentalDays=rentalDays;
      this.dailyRate=50.0;
    }

    // Constructor with specified daily rate
    public CarRentalSystem(String customerName, String carModel, int rentalDays, double dailyRate) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = dailyRate;
    }

    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
  void displayResult(){
   System.out.printf("Total cost for car rent %s: %.2f%n",customerName, calculateTotalCost());
 }

    public static void main(String[] args) {
        // Create a CarRental object with default daily rate
        CarRentalSystem rental1 = new CarRentalSystem("Deepraj", "BMW M5", 15);
        rental1.displayResult();

        // Create a CarRental object with specified daily rate
        CarRentalSystem rental2 = new CarRentalSystem("Rishi", "Ford Mustang", 13, 75.0);
        rental2.displayResult();
    }
}