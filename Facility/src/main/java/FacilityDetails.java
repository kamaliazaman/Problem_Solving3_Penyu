
/**
 * @author Izzah & Kamalia
 * Title: Inheritance for Facility Details
 * Date Modified: 06/04/2020
 * File Name: Facility.java
 */


/**
 * The superclass Facilities has Facility Name, Price and Organizer.
 */
class Facilities {
    //Private intances variable
    private String FacilityName, organizer;
    private int PricePerHour;
   
    /** Constructs a Facilities instance with the given name, price and organizer */
    public Facilities (String name, int price, String organizer){
       this.FacilityName = name;
       this.PricePerHour = price;
       this.organizer = organizer;
    }
    
     /** Returns the  facility name */
    public String getFacilityName(){
       return FacilityName;
    }
    
     /** Returns the price */
    public int getPricePerHour(){
       return PricePerHour;
    }

     /** Returns the organizer */
    public String getOrganizer(){
       return organizer;
    }
    
    /** Returns a superclass data */
    @Override
    public String toString(){
       return FacilityName + ""+ PricePerHour+"  "+ organizer;
    }
}
/**
 * The Hall class, subclass of Facilities.
 */
class Hall extends Facilities{
    // private instance variables
    private String location; //location name
    private int capacity; //number of people fits
       
    /** Constructs a Hall instance with the given name, price and organizer */
    public Hall (String FacilityName, int PricePerHour, String organizer){
       super (FacilityName, PricePerHour, organizer);
       this.location = location;
       this.capacity = capacity;
    }
    
    /** Returns a self-descriptive string */
    @Override
    public String toString(){
       return super.toString();
    }
    
    /** Adds a location and capacity*/
    public void addDetails(String location, int capacity){
       this.location= location;
       this.capacity = capacity;
    }
     
    /** Prints location and capacity */
    public void printDetails(){
       System.out.print(this);
       System.out.print(location+ capacity);
    }
}
 /**
 * The MeetingRoom class, subclass of Facilities.
 */ 
class MeetingRoom extends Facilities{
    // private instance variables
    private String location;
    private int capacity;
     
    /** Constructs a MeetingRoom instance with the given name, price and organizer */
    public MeetingRoom (String FacilityName, int PricePerHour, String organizer){
       super (FacilityName, PricePerHour, organizer);
       this.location = location;
       this.capacity = capacity;
    }
 
    /** Returns a self-descriptive string */
    @Override
    public String toString(){
       return  super.toString();
    }
    
    /** Adds a location and capacity*/
    public void addDetails(String location, int capacity){
       this.location= location;
       this.capacity = capacity;
    }
   
    /** Prints location and capacity */ 
    public void printDetails(){
       System.out.print(this);
       System.out.print(""+location+""+ capacity);
    }
}


/**
 * A test driver for Facilities and its subclasses.
 */
public class FacilityDetails {
    public static void main(String[] args){
        
       System.out.print("Facilities");
       System.out.print("\nName\t \tPrice \tOrganizer \tLocation \tCapacity");
       /* Test Hall class */ 
       Hall h1 = new Hall("\nSportHall\t",20,"\tFC\t"); 
       h1.addDetails("\tKTDI\t\t",50);
       h1.printDetails();

       /* Test MeetingRoom class */
       MeetingRoom m1 = new MeetingRoom("\nMeeting Room\t",10,"\tFKM\t"); 
       m1.addDetails("\tBlok N28\t",30);
       m1.printDetails();
    }
}
