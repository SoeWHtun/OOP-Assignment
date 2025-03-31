package hospital;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Patient {
  String name;
  int age;
  String disease;
  String doctorAssigned;
  static int patientCount=0;

  public Patient(String name,int age,String disease,String doctorAssigned) {
	this.name=name;
	this.age=age;
	this.disease=disease;
	this.doctorAssigned=doctorAssigned;
	patientCount++;
 }
  @Override
  public String toString() {
	  return "Patient name : "+this.name+" | "+"Age : "+this.age+" | "+"Disease : "+this.disease+" | "+"Assigned Doctor : "+this.doctorAssigned+" | ";
  }
  public static Patient getPatientInfo() throws IOException {
	     InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    	 BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    	 System.out.print("Enter the name of the patient : ");
    	 String name = bufferedReader.readLine();
    	 System.out.print("Enter the age : ");
    	 int age = Integer.parseInt(bufferedReader.readLine());
    	 System.out.print("Enter the disease : ");
    	 String disease = bufferedReader.readLine();
    	 System.out.print("Enter the doctor to assign : "); 
    	 String doctorAssigned = bufferedReader.readLine();
    	 System.out.println();
    	 
    	 return new Patient(name,age,disease,doctorAssigned);
  }
}