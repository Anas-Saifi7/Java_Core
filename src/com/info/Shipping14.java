package com.info;
import java.util.*;

public class Shipping14 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);

	      System.out.println("Enter the Name");
	      String name = sc.nextLine();
	      sc.nextLine();
	      System.out.println("Enter the City");
	      String city = sc.nextLine();
	      System.out.println("Enter the number of Ships per day");
	      int noOfShips = sc.nextInt();
	      System.out.println("Enter the number of passengers travelling in each Ship");
	      int noOfPassengers = sc.nextInt();
	      System.out.println("Enter the number of cargo units shipped in each Ship");
	      int noOfCargoUnitsPerShip = sc.nextInt();

	      CommercialServiceShipping commercialService = new CommercialServiceShipping(name, city, noOfShips, noOfPassengers);
	      CargoServiceTransport cargoService = new CargoServiceTransport(name,name, noOfShips,noOfCargoUnitsPerShip);

	      System.out.println("Shipping Details");
	      System.out.println("Number of passengers travelled/day: " + commercialService.calculatenoOfPassengers());
	      System.out.println("Number of cargo units shipped/day: " + cargoService.calculatenoOfCargounits());

	        }


	}

}
