package vehicle.rental;

public class Car extends Vehicle {
 private int numSeat;
 private CarType carType;
 public static int carCount;
 
 public Car(String ownerName,String model,String licenseNo,double pricePerDay,int numSeat,CarType carType) {
	 super(ownerName,model,licenseNo,pricePerDay);
	 this.numSeat=numSeat;
	 this.carType=carType;
	 carCount++;
 }
 public int getNumSeat() {
	 return numSeat;
 }
 public CarType getCarType() {
	 return carType;
 }
 public void setNumSeat(int numSeat) {
	 this.numSeat=numSeat;
 }
 public void setCarType(CarType carType) {
	 this.carType=carType;
 }
 
}
