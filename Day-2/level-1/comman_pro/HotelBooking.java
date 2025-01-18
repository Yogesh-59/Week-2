import java.util.*;

public class  HotelBooking{
     String guestName;
     String roomType;
     double night;

    // Default constructor
    HotelBooking() {
        guestName="Deepraj";
        roomType="VVVIP";
        night=30;
    }

    // Parameterized constructor
    HotelBooking( String guestName,String roomType,double night) {
        this.guestName=guestName;
        this.roomType=roomType;
        this.night=night;
    }
    HotelBooking(HotelBooking hb) {
        this.guestName=hb.guestName;
        this.roomType=hb.roomType;
        this.night=hb.night;
    }
    void displayResult(){
    System.out.println("Name of person is :"+guestName +" room type is :"+roomType +" night of guest stay is :"+night);
  }
    public static void main(String[] args) {
    
     //call default constructer and make there object
     HotelBooking obj=new HotelBooking();
      obj.displayResult();
     // create parameterize constructor obj 
     HotelBooking obj1=new HotelBooking("Bipin","Medium",12);
      obj1.displayResult();
    //call copy constructor and make object 
     HotelBooking obj2=new HotelBooking(obj1);
     obj2.guestName="Aryan";
     obj2.night=29;
     obj2.displayResult();
    }
}
