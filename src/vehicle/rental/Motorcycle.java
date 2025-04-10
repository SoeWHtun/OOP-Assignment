package vehicle.rental;

public class Motorcycle extends Vehicle {
      private double engineCapacity;
      
      public Motorcycle(String ownerName,int model,String licenseNo,double pricePerDay,double engineCapacity) {
    	  super(ownerName,model,licenseNo,pricePerDay);
    	  this.engineCapacity=engineCapacity;
      }
      
      public double getEngineCapacity() {
    	  return engineCapacity;
      }
      public void setEngineCapacity(double engineCapacity) {
    	  this.engineCapacity=engineCapacity;
      }
}
