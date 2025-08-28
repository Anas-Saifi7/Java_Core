package com.info;

public class CommercialServiceShipping extends Transport {
	  private int noOfPassengers;

      public CommercialServiceShipping(String city, String name, int noOfShips, int noOfPassengers) {
              super(city, name, noOfShips);
              this.noOfPassengers = noOfPassengers;
      }
      public int getNoOfPassengers() {
              return noOfPassengers;
      }

      public void setNoOfPassengers(int noOfPassengers) {
              this.noOfPassengers = noOfPassengers;
      }
   public int calculatenoOfPassengers() {
       return getNoOfShips() * noOfPassengers;
   }

}
