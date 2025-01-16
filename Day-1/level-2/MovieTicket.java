import java.util.*;
class MovieTicket{
  //create variable in movie name, seat number and ticket price
  String movieName;
  int seatNumber;
  double price;
  boolean isBook;
  //this keyword to initialize the value
  MovieTicket(String movieName, int seatNumber, double price){
     this.movieName=movieName;
     this.seatNumber=seatNumber;
     this.price=price;
     this.isBook=false;
     }
   // this method help to find out seat is avilable or not
    void bookTicket(){
     if(isBook){
            System.out.println("Seat " + seatNumber + " for " + movieName + " is already booked.");
        } else {
            isBook = true;
            System.out.println("Successfully booked seat " + seatNumber + " for " + movieName + ".");
        }
    }
   //method use to display the results
      void displayResult(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
        System.out.println("Booking Status: " + (isBook ? "Booked" : "Available"));
    }
   public static void main(String[] args){
     MovieTicket mt=new MovieTicket("KGF-3", 7,2500.75);
    mt.displayResult();
    mt.bookTicket();
   }
}