package com.bridgeabz.oop;

public class EmpWageUsingOOP {
	
	public static final int isFULL_TIME=1;
	public static final int isPART_TIME=2;
	public static final int empRatePerHr=20;
	public static final int numOfWorkingDays=20;
	public static final int maxWorkingHrs=100;
	
	void Emppwage()
	{
		int empHrs=0;
		int empWage=0;
		int totalEmpWage=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;

		while (totalEmpHrs <= maxWorkingHrs &&  totalWorkingDays < numOfWorkingDays)
		{
			totalWorkingDays++;
			int empstatus=(int) Math.floor(Math.random()*10) % 3;
			switch (empstatus)
			{
			case isFULL_TIME:
				empHrs=8;
				break;
			case isPART_TIME:
				empHrs=4;
				break;
			default:
				empHrs=0;
			}
			totalEmpHrs += empHrs;
			empWage = empHrs * empRatePerHr;
			totalEmpWage += empWage;
			System.out.println("DAY"+totalWorkingDays);
			System.out.println("Emp Hrs is:"+empHrs);
			System.out.println("Emp Wage  is:"+empWage);
		}
		System.out.print("\nTotal Employee Working Hrs is:"+totalEmpHrs);
		System.out.print("\nTotal Employee Working Days is:"+totalWorkingDays);
		System.out.println("\nMonthly Employee Wage is:"+totalEmpWage);
	}


public static void main(String[] args)
{
	System.out.println("Welcome to Employee Wage Computation");
	EmpWageUsingOOP emp = new EmpWageUsingOOP();
	emp.Emppwage();
}
}
