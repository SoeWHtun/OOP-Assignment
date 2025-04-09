package student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TestStudent {
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public static void main(String[] args) throws IOException {
		String result;
		do {
			Student.getStudentInfo();
			System.out.print("Do you want to continue (yes/no) : ");
			result = bufferedReader.readLine();
			System.out.println();
		} while (result.equals("yes"));
		displayAllStudent();
		System.out.println();
		System.out.println("Mean Marks : ");
		System.out.println("Subject 1 : " + Student.meanSub1());
		System.out.println("Subject 2 : " + Student.meanSub2());
		System.out.println("Subject 3 : " + Student.meanSub3());
		System.out.println("Subject 4 : " + Student.meanSub4());
		System.out.println("Subject 5 : " + Student.meanSub5());
		System.out.println("Subject 6 : " + Student.meanSub6());
		System.out.println();
		System.out.println("Student with the highest GPA :");
		Student.findHighestGPA();
	}

	public static void displayAllStudent() {
		System.out.println("All Students :");
		for (int i = 0; i < Student.getStudentCount(); i++) {
			Student.students[i].displayStudentInfo();
		}
	}
}
