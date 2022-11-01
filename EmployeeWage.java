package com.practice.problem;
import java.util.Random;

public class EmployeeWage {
	int parttimeemployee = 5;
	int partwage = 160;

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
			System.out.println("Employee is Present");
			EmployeeWage dw = new EmployeeWage();
			dw.dailyWage(20, 8);	
		}
		EmployeeWage pt = new EmployeeWage();
		System.out.println("Number of part time employee :"+pt.parttimeemployee);
		System.out.println("Wage of part time employee per day  :"+pt.partwage);
		
		int workingday = 20;
		int monthlywage = 0;
		
	    monthlywage = workingday*160;
	    System.out.println("Monthly wage for  daily employee is :"+monthlywage);
	    
	   
	    int maxworkinghr = 100;
	    int wage = 20;
	    int maxdays = 20;
	   
	    System.out.println("Maximum wage :");
	   
	    	if ((maxworkinghr*wage)>=(maxdays*wage)) {
	    	System.out.println(maxworkinghr*wage);
	    	}
	    
	}
	}

	

