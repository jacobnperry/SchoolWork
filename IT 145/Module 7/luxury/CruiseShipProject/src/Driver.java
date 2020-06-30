import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Driver {

    // instance variables (add more as needed)
    private static ArrayList<Ship> shipList = new ArrayList();
    private static ArrayList<Cruise> cruiseList = new ArrayList();
    private static ArrayList<Passenger> passengerList = new ArrayList();


    public static void main(final String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean boatLoop = true;


        initializeShipList(); // initial ships
        initializeCruiseList(); // initial cruises
        initializePassengerList(); // initial passengers

        String userInput;


        while(boatLoop){
            displayMenu();
            userInput = scnr.nextLine();
            if(userInput.contains("1")){
                addShip();
            }
            else if(userInput.contains("2")){
                System.out.println("feature is not yet implemented.");
            }
            else if(userInput.contains("3")){
              addCruise();
            }
            else if(userInput.contains("4")){
                System.out.println("feature is not yet implemented.");
            }
            else if(userInput.contains("5")){

            }
            else if(userInput.contains("6")){
                System.out.println("feature is not yet implemented.");
            }
            else if((userInput.toUpperCase()).contains("A")){
                printShipList("name");
            }
            else if((userInput.toUpperCase()).contains("B")){
                printShipList("active");
            }
            else if((userInput.toUpperCase()).contains("C")){
                printShipList("full");
            }
            else if((userInput.toUpperCase()).contains("D")){
                printCruiseList("list");
            }
            else if((userInput.toUpperCase()).contains("E")){
                printCruiseList("details");
            }
            else if((userInput.toUpperCase()).contains("F")){
                printPassengerList();
            }
            else if(userInput.contains("x")){
                boatLoop = false;
            }
            else{
                System.out.println("Invalid input, please try again.");
            }
    }
        // add loop and code here that accepts and validates user input
        // and takes the appropriate action. include appropriate
        // user feedback and redisplay the menu as needed

    }

    // hardcoded ship data for testing
    // Initialize ship list
    public static void initializeShipList() {
        add("Candy Cane", 20, 40, 10, 60, true);
        add("Peppermint Stick", 10, 20, 5, 40, true);
        add("Bon Bon", 12, 18, 2, 24, false);
        add("Candy Corn", 12, 18, 2, 24, false);
    }

    // hardcoded cruise data for testing
    // Initialize cruise list
    public static void initializeCruiseList() {
        final Cruise newCruise = new Cruise("Southern Swirl", "Candy Cane", "Miami", "Cuba", "Miami");
        cruiseList.add(newCruise);
    }

    // hardcoded cruise data for testing
    // Initialize passenger list
    public static void initializePassengerList() {
        final Passenger newPassenger1 = new Passenger("Neo Anderson", "Southern Swirl", "STE");
        passengerList.add(newPassenger1);

        final Passenger newPassenger2 = new Passenger("Trinity", "Southern Swirl", "STE");
        passengerList.add(newPassenger2);

        final Passenger newPassenger3 = new Passenger("Morpheus", "Southern Swirl", "BAL");
        passengerList.add(newPassenger3);
    }

    // custom method to add ships to the shipList ArrayList
    public static void add(final String tName, final int tBalcony, final int tOceanView, final int tSuite,
            final int tInterior, final boolean tInService) {
        final Ship newShip = new Ship(tName, tBalcony, tOceanView, tSuite, tInterior, tInService);
        shipList.add(newShip);
    }

    public static void printShipList(final String listType) {
        // printShipList() method prints list of ships from the
        // shipList ArrayList. There are three different outputs
        // based on the listType String parameter:
        // name - prints a list of ship names only
        // active - prints a list of ship names that are "in service"
        // full - prints tabbed data on all ships

        if (shipList.size() < 1) {
            System.out.println("\nThere are no ships to print.");
            return;
        }
        if (listType == "name") {
            System.out.println("\n\nSHIP LIST - Name");
            for (int i = 0; i < shipList.size(); i++) {
                System.out.println(shipList.get(i));
            }
        } else if (listType == "active") {
            System.out.println("\n\nSHIP LIST - Active");
            int i = 0;
            for (Ship eachShip : shipList) {
              if(eachShip.getInService()){
                System.out.println(shipList.get(i));
                i = i + 1;
              }
            }

        } else if (listType == "full") {
            System.out.println("\n\nSHIP LIST - Full");
            System.out.println("-----------------------------------------------");
            System.out.println("                    Number of Rooms     In");
            System.out.print("SHIP NAME           Bal OV  Ste Int     Service");
            System.out.println("\n-----------------------------------------------");
            for (final Ship eachShip : shipList)
                eachShip.printShipData();

        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printCruiseList(final String listType) {
        if (cruiseList.size() < 1) {
            System.out.println("\nThere are no cruises to print.");
            return;
        }
        if (listType == "list") {
            System.out.println("\n\nCRUISE LIST");
            for (int i = 0; i < cruiseList.size(); i++) {
                System.out.println(cruiseList.get(i));
            }
        } else if (listType == "details") {
            System.out.println("\n\nCRUISE LIST - Details");
            System.out.println(
                    "------------------------------------------------------------------------------------------");
            System.out.println(
                    "                                      |----------------------PORTS-----------------------|");
            System.out.print("CRUISE NAME         SHIP NAME           DEPARTURE           DESTINATION         RETURN");
            System.out.println(
                    "\n-----------------------------------------------------------------------------------------");
            for (final Cruise eachCruise : cruiseList)
                eachCruise.printCruiseDetails();
        } else
            System.out.println("\n\nError: List type not defined.");
    }

    public static void printPassengerList() {
        if (passengerList.size() < 1) {
            System.out.println("\nThere are no passengers to print.");
            return;
        }
        System.out.println("\n\nPASSENGER LIST");
        System.out.println("-----------------------------------------------------");
        System.out.print("PASSENGER NAME      CRUISE              ROOM TYPE");
        System.out.println("\n-----------------------------------------------------");
        for (final Passenger eachPassenger : passengerList)
            eachPassenger.printPassenger();
    }

    // display text-based menu
    public static void displayMenu() {

        System.out.println("\n\n");
        System.out.println("\t\t\tLuxury Ocean Cruise Outings");
        System.out.println("\t\t\t\t\tSystem Menu\n");
        System.out.println("[1] Add Ship            [A] Print Ship Names");
        System.out.println("[2] Edit Ship           [B] Print Ship In Service List");
        System.out.println("[3] Add Cruise          [C] Print Ship Full List");
        System.out.println("[4] Edit Cruise         [D] Print Cruise List");
        System.out.println("[5] Add Passenger       [E] Print Cruise Details");
        System.out.println("[6] Edit Passenger      [F] Print Passenger List");
        System.out.println("[x] Exit System");
        System.out.println("\nEnter a menu selection: ");
    }

    // Add a New Ship
    public static void addShip() {
        Scanner newShipInput = new Scanner(System.in);
        System.out.println("Enter the new ship's name");
        String newShipName = newShipInput.nextLine();
        // complete this method

        for (Ship eachShip : shipList){
            if(eachShip.getShipName().equalsIgnoreCase(newShipName)){
                System.out.println("Ship already exists in list.");
            }
        }
        //gets input for all types of rooms on ship
        System.out.println("How many balcony rooms?");
        int newShipBalcony = 0;
        while (newShipBalcony <= 0){
          newShipBalcony = newShipInput.nextInt();
          if(newShipBalcony < 1){
            System.out.println("Invalid input.");
          }
        }

        System.out.println("How many ocean view rooms?");
        int newShipOceanView = 0;
        while (newShipOceanView <= 0){
          newShipOceanView = newShipInput.nextInt();
          if(newShipOceanView < 1){
            System.out.println("Invalid input.");
          }
        }

        System.out.println("How many suite rooms?");
        int newShipSuite = 0;
        while (newShipSuite <= 0){
          newShipSuite = newShipInput.nextInt();
          if(newShipSuite < 1){
            System.out.println("Invalid input.");
          }        }

        System.out.println("How many interior rooms?");
        int newShipInterior = 0;
        while (newShipInterior <= 0){
          newShipInterior = newShipInput.nextInt();
          if(newShipInterior < 1){
            System.out.println("Invalid input.");
          }
        }
        //checks if ship is active

        //clears input for data validation
        String clearLine = newShipInput.nextLine();

        System.out.println("Is the ship active? y/n");
        String newShipActive = newShipInput.nextLine();

          boolean newShipActiveCheck;

          if(newShipActive.contains("y")){
            newShipActiveCheck = true;
          }
          else if (newShipActive.contains("n")){
            newShipActiveCheck = true;
          } else {
            System.out.println("Invalid input");
            newShipActiveCheck = false;
          }

        Ship shipAddition = new Ship(newShipName,newShipBalcony,newShipOceanView,newShipSuite,newShipInterior,newShipActiveCheck);
        shipList.add(shipAddition);



    }

    // Edit an existing ship
    public static void editShip() {

        // This method does not need to be completed
        System.out.println("The \"Edit Ship\" feature is not yet implemented.");

    }

    // Add a New Cruise
    public static void addCruise() {
      Scanner newCruiseInput = new Scanner(System.in);
      System.out.println("Enter the new cruise's name");
      String newCruiseName = newCruiseInput.nextLine();
      // complete this method

      for (Cruise eachCruise : cruiseList){
          if(eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)){
              System.out.println("Cruise already exists in list.");
          }
      }

      System.out.println("Enter the new ship's name");
      String newCruiseShipName = newCruiseInput.nextLine();
      // complete this method

      for (Ship eachShip : shipList){
          if(eachShip.getShipName().equalsIgnoreCase(newCruiseShipName)){
              System.out.println("Ship already exists in list.");
          }
      }
      System.out.println("Where is it departing from?");
      String newCruiseDepart = newCruiseInput.nextLine();

      System.out.println("What is the cruise destination?");
      String newCruiseDestination = newCruiseInput.nextLine();

      System.out.println("Where is it returning to?");
      String newCruiseReturn = newCruiseInput.nextLine();


      Cruise cruiseAddition = new Cruise(newCruiseName,newCruiseShipName,newCruiseDepart,newCruiseDestination,newCruiseReturn);
      cruiseList.add(cruiseAddition);

    }

    // Edit an existing cruise
    public static void editCruise() {

        // This method does not need to be completed
        System.out.println("The \"Edit Cruise\" feature is not yet implemented.");

    }

    // Add a New Passenger
    public static void addPassenger() {

        final Scanner newPassengerInput = new Scanner(System.in);
        System.out.println("Enter the new passenger's name: ");
        final String newPassengerName = newPassengerInput.nextLine();

        // ensure new passenger name does not already exist
        for (final Passenger eachPassenger : passengerList) {
            if (eachPassenger.getPassengerName().equalsIgnoreCase(newPassengerName)) {
                System.out.println("That passenger is already in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get cruise name for passenger
        System.out.println("Enter cruise name: ");
        final String newCruiseName = newPassengerInput.nextLine();

        // ensure cruise exists
        for (final Cruise eachCruise : cruiseList) {
            if (eachCruise.getCruiseName().equalsIgnoreCase(newCruiseName)) {
                // cruise does exist
            } else {
                System.out.println("That cruise does not exist in the system. Exiting to menu...");
                return; // quits addPassenger() method processing
            }
        }

        // get room type
        System.out.println("Enter Room Type (BAL, OV, STE, or INT: ");
        final String room = newPassengerInput.nextLine();
        // validate room type
        if ((room.equalsIgnoreCase("BAL")) || (room.equalsIgnoreCase("OV")) || (room.equalsIgnoreCase("STE"))
                || (room.equalsIgnoreCase("INT"))) {
            // validation passed - add passenger
            final Passenger newPassenger = new Passenger(newPassengerName, newCruiseName, room.toUpperCase());
            passengerList.add(newPassenger);
        } else {
            System.out.println("Invalid input. Exiting to menu...");
            return; // quits addPassenger() method processing
        }
    }

    // Edit an existing passenger
    public static void editPassenger() {

        // This method does not need to be completed
        System.out.println("The \"Edit Passenger\" feature is not yet implemented.");

    }

    // Method to check if input is a number
    public static boolean isANumber(final String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i)) == false)
                return false;
        }
        return true;
    }

}
