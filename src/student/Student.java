package student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Student {
	private String name;
	private double sub1 = 0;
	private double sub2 = 0;
	private double sub3 = 0;
	private double sub4 = 0;
	private double sub5 = 0;
	private double sub6 = 0;
	private double gpa = 0;
	private String ad1;
	private String ad2;
	private static int studentCount;
	public static Student[] students = new Student[100];
	static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
	static BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

	public Student(String name, double sub1, double sub2, double sub3, double sub4, double sub5, double sub6,
			String ad1, String ad2) {
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.ad1 = ad1;
		this.ad2 = ad2;
		setGPA(sub1, sub2, sub3, sub4, sub5, sub6);
		studentCount++;

	}

	public Student(String name, double sub1, double sub2, double sub3, double sub4, double sub5, double sub6,
			String ad1) {
		this.name = name;
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
		this.sub5 = sub5;
		this.sub6 = sub6;
		this.ad1 = ad1;
		this.ad2 = "";
		setGPA(sub1, sub2, sub3, sub4, sub5, sub6);
		studentCount++;
	}

	public double getSub1() {
		return sub1;
	}

	public double getSub2() {
		return sub2;
	}

	public double getSub3() {
		return sub3;
	}

	public double getSub4() {
		return sub4;
	}

	public double getSub5() {
		return sub5;
	}

	public double getSub6() {
		return sub6;
	}

	public String getAd1() {
		return ad1;
	}

	public String getAd2() {
		return ad2;
	}

	public String getName() {
		return name;
	}

	public static int getStudentCount() {
		return studentCount;
	}

	public void setSub1(double sub1) {
		this.sub1 = sub1;
	}

	public void setSub2(double sub2) {
		this.sub2 = sub2;
	}

	public void setSub3(double sub3) {
		this.sub3 = sub3;
	}

	public void setSub4(double sub4) {
		this.sub4 = sub4;
	}

	public void setSub5(double sub5) {
		this.sub5 = sub5;
	}

	public void setSub6(double sub6) {
		this.sub6 = sub6;
	}

	public void setAd1(String ad1) {
		this.ad1 = ad1;
	}

	public void setAd2(String ad2) {
		this.ad2 = ad2;
	}

	public double getGPA() {
		return gpa;
	}

	public void setGPA(double sub1, double sub2, double sub3, double sub4, double sub5, double sub6) {
		int subCount = 0;
		if (sub1 > 0) {
			subCount++;
		}
		if (sub2 > 0) {
			subCount++;
		}
		if (sub3 > 0) {
			subCount++;
		}
		if (sub4 > 0) {
			subCount++;
		}
		if (sub5 > 0) {
			subCount++;
		}
		if (sub6 > 0) {
			subCount++;
		}
		this.gpa = (sub1 + sub2 + sub3 + sub4 + sub5 + sub6) / subCount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void getStudentInfo() throws IOException {
		System.out.println("Enter details for a new student ");
		System.out.print("Enter your name : ");
		String name = bufferedReader.readLine();
		System.out.println("Enter marks for 6 subject (or less,default mark to 0) ");
		System.out.print("Subject 1 : ");
		double sub1 = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Subject 2 : ");
		double sub2 = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Subject 3 : ");
		double sub3 = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Subject 4 : ");
		double sub4 = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Subject 5 : ");
		double sub5 = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Subject 6 : ");
		double sub6 = Double.parseDouble(bufferedReader.readLine());
		System.out.print("Enter address 1 : ");
		String ad1 = bufferedReader.readLine();
		System.out.print("Enter address 2 (or press Enter to skip) : ");
		String ad2 = bufferedReader.readLine();
		if (ad2.isEmpty()) {
			students[studentCount] = new Student(name, sub1, sub2, sub3, sub4, sub5, sub6, ad1);
		} else {
			students[studentCount] = new Student(name, sub1, sub2, sub3, sub4, sub5, sub6, ad1, ad2);
		}
	}

	public void displayStudentInfo() {
		System.out.println("Name :" + name);
		System.out.println(
				"Marks :" + sub1 + " | " + sub2 + " | " + sub3 + " | " + sub4 + " | " + sub5 + " | " + sub6 + " | ");
		System.out.println("GPA : " + gpa);
		System.out.println("Address 1 : " + ad1);
		if (!ad2.isEmpty()) {
			System.out.println("Address 2 : " + ad2);
		} else {
			System.out.println("Address 2 : Not Provided");
		}
		System.out.println();
	}

	public static void findHighestGPA() {
		Student highest = students[0];
		for (int i = 1; i <= studentCount; i++) {
			if (students[i] != null && students[i].gpa > highest.gpa) {
				highest = students[i];
			}
		}
		highest.displayStudentInfo();
		;
	}

	public static double meanSub1() {
		double total = 0;
		for (int i = 0; i < studentCount; i++) {
			total += students[i].sub1;
		}
		return total / studentCount;
	}

	public static double meanSub2() {
		double total = 0;
		for (int i = 0; i < studentCount; i++) {
			total += students[i].sub2;
		}
		return total / studentCount;
	}

	public static double meanSub3() {
		double total = 0;
		for (int i = 0; i < studentCount; i++) {
			total += students[i].sub3;
		}
		return total / studentCount;
	}

	public static double meanSub4() {
		double total = 0;
		for (int i = 0; i < studentCount; i++) {
			total += students[i].sub4;
		}
		return total / studentCount;
	}

	public static double meanSub5() {
		double total = 0;
		for (int i = 0; i < studentCount; i++) {
			total += students[i].sub5;
		}
		return total / studentCount;
	}

	public static double meanSub6() {
		double total = 0;
		for (int i = 0; i < studentCount; i++) {
			total += students[i].sub6;
		}
		return total / studentCount;
	}
}
