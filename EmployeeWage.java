package com.practice.problem;
import java.util.Random; 
public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Welcome");
		Random attendance = new Random(); 
		int i = attendance.nextInt(2);
		if(i == 0) {
			System.out.println("Employee is Abscent");
		} else {
			System.out.println("Employee is present");
		}
	}
}
