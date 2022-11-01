package com.practice.problem;
import java.util.Random;

import com.exercize.three.Student; 
public class EmployeeWage {
public void dailyWage(int wage, int time) {
	int employeewage = wage*time;
			System.out.println("Daily wage of employee is :"+employeewage);
}
	public static void main(String[] args) {
		System.out.println("Welcome");
		Random attendance = new Random(); 
		int i = attendance.nextInt(2);
		if(i == 0) {
			System.out.println("Employee is Abscent");
			EmployeeWage dw = new EmployeeWage();
			dw.dailyWage(0, 0);
		} else {
			System.out.println("Employee is present");
			EmployeeWage dw = new EmployeeWage();
			dw.dailyWage(20, 8);
		}
		
	}
}
