package com.info;
// Shipping 14
public class Transport {
	 private String name;
     private String city;
     private int	noOfShips;

      public Transport(String city, String name, int noOfShips) {
              this.city = city;
              this.name = name;
              this.noOfShips = noOfShips;
      }

      public String getCity() {
              return city;
      }

      public void setCity(String city) {
              this.city = city;
      }

      public String getName() {
              return name;
      }

      public void setName(String name) {
              this.name = name;
      }

      public int getNoOfShips() {
              return noOfShips;
      }

      public void setNoOfShips(int noOfShips) {
              this.noOfShips = noOfShips;
      }

}
