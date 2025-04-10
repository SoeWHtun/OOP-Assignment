package vehicle.rental;

public class Car extends Vehicle {
 private int numSeat;
 private String carType;
 
 public Car(String ownerName,int model,String licenseNo,double pricePerDay,int numSeat,String carType) {
	 super(ownerName,model,licenseNo,pricePerDay);
	 this.numSeat=numSeat;
	 this.carType=carType;
 }
 public int getNumSeat() {
	 return numSeat;
 }
 public String getCarType() {
	 return carType;
 }
 public void setNumSeat(int numSeat) {
	 this.numSeat=numSeat;
 }
 public void setCarType(String carType) {
	 this.carType=carType;
 }
 
}
