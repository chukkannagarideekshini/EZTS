package basic;

import java.util.*;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double basicsalary, da, ta, grosssalary;
		System.out.print("Enter Basic Salary:");
		basicsalary = sc.nextDouble();
		if (basicsalary >= 10000) {
			da = basicsalary * 0.40;
			ta = basicsalary * 0.30;
		} else {
			da = basicsalary * 0.30;
			ta = basicsalary * 0.20;
		}
		grosssalary = basicsalary + ta + da;
		System.out.println("Gross Salary: " + grosssalary);
	}

}
