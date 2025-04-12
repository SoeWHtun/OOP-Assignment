package vehicle.rental;

public class Vehicle {
        public String ownerName,licenseNo;
        public String model;
        public double pricePerDay;
        public static int vehicleCount;
        
        public Vehicle() {
        	vehicleCount++;
        }
        public Vehicle(String ownerName,String model,String licenseNo,double pricePerDay) {
        	this.ownerName=ownerName;
        	this.model=model;
        	this.licenseNo=licenseNo;
        	this.pricePerDay=pricePerDay;
        	vehicleCount++;
        }
}
