package com.info;

public class CargoServiceTransport extends Transport {
	   protected int noOfCargoUnitsPerShip;

       public CargoServiceTransport(String name, String city, int noOfShips, int noOfCargoUnitsPerShip) {
               super(city, name, noOfShips);
               this.noOfCargoUnitsPerShip = noOfCargoUnitsPerShip;
       }

       public int getNoOfCargoUnitsPerShip() {
               return noOfCargoUnitsPerShip;
       }

       public void setNoOfCargoUnitsPerShip(int noOfCargoUnitsPerShip) {
               this.noOfCargoUnitsPerShip = noOfCargoUnitsPerShip;
       }
      public int calculatenoOfCargounits(){
               return getNoOfShips() * noOfCargoUnitsPerShip;
   }
}
