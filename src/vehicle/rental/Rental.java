package vehicle.rental;

public class Rental {
      private int rentalId,rentedDays;
      private String vehicleType;
      private double totalPrice;
      private Vehicle vehicle = new Vehicle();
      
      public Rental(int rentalId,String vehicleType,Vehicle vehicle,int rentedDays,double totalPrice) {
    	  this.rentalId=rentalId;
    	  this.vehicleType=vehicleType;
    	  this.vehicle=vehicle;
    	  this.rentedDays=rentedDays;
    	  this.totalPrice=totalPrice;
    	  
      }
      public int getRentalId() {
    	  return rentalId;
      }
      public String getVehicleType() {
    	  return vehicleType;
      }
      public Vehicle getVehicle() {
    	  return vehicle;
      }
      public int getRentedDays() {
    	  return rentedDays;
      }
      public double getTotalPrice() {
    	  return totalPrice;
      }
      public void setRentalId(int rentalId) {
    	  this.rentalId=rentalId;
      }
      public void setVehicleType(String vehicleType) {
    	  this.vehicleType=vehicleType;
      }
      public void setVehicle(Vehicle vehicle) {
    	  this.vehicle=vehicle;
      }
      public void setTotalPrice(double totalPrice) {
    	  this.totalPrice=totalPrice;
      }
      public void setRentedDays(int rentedDays) {
    	  this.rentedDays=rentedDays;
      }

}
