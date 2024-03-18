package stream_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {
	private int rollNumber;
	private String name;
	private float marks;

	public Student(int rollNumber, String name, Float marks) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
	}

	public String calGrade() {
		if (marks <= 100 && marks > 90) {
			return "Excellent";
		} else if (marks <= 90 && marks >= 80) {
			return " Very Good";
		} else if (marks <= 80 && marks > 60) {
			return "Average";
		} else if (marks <=60  && marks > 35) {
			return "Below Average";
		} else if (marks <= 35 && marks >= 0) {
			return "Fail";
		} else {
			return "";
		}
	}

	@Override
	public String toString() {
		return "\n rollNumber=" + rollNumber + "\n name=" + name + "\n marks=" + marks + "\n Grade = "
				+ calGrade() ;
	}

	public static void main(String[] args) {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Roll number");
		try {
			int rollNmber = Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter Name");
			String name = bufferedReader.readLine();
			System.out.println("Enter Marks ");
			float marks = Float.parseFloat(bufferedReader.readLine());
			Student student = new Student(rollNmber, name, marks);
			System.out.println(student);
		} catch (Exception e) {
			System.out.println("Enter Valid Details");
		} finally {
			try {
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
