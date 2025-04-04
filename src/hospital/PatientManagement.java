package hospital;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PatientManagement {
    static Patient[] patients = new Patient[100];
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
    static int pCount=0;
	public static void main(String[] args)throws IOException {
		String result;
		do {
			patients[pCount]=Patient.getPatientInfo();
			pCount++;
			System.out.print("Do you want to continue? yes/no : ");
			result = bufferedReader.readLine();
		}while(result.equals("yes"));
		System.out.println();
		displayPatient();

        System.out.print("Enter doctor name to list assigned patients: ");
        String doctorName=bufferedReader.readLine();
        displayPatientDoctor(doctorName);

        System.out.print("Enter disease name to count affected patients: ");
        String disease=bufferedReader.readLine();
        System.out.println("Number of patients with disease : "+displayPatientDisease(disease));
   
	}
	public static void displayPatient() {
		for(int i=0;i<Patient.patientCount;i++) {
			System.out.println(patients[i].toString());
		}
	}
	public static void displayPatientDoctor(String doctor) {
		for(int i=0;i<Patient.patientCount;i++) {
			if(patients[i].doctorAssigned.equalsIgnoreCase(doctor)) {
				System.out.println(patients[i].toString());
			}
		}
	}
    public static int displayPatientDisease(String disease) {
    	int count = 0;
        for (int i = 0; i < Patient.patientCount; i++) {
            if (patients[i].disease.equalsIgnoreCase(disease)) {
                count++;
            }
        }
        return count;
    }
}


