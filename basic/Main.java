package basic;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vehicle vh = new Vehicle();

		System.out.println("Enter model");
		int d = sc.nextInt();
		System.out.println("Enter Engine");
		int e = sc.nextInt();
		System.out.println("Enter Brand");
		String f = sc.next();
		Bike b=new Bike(d,e,f,t);
		b.Output();
	}

}
