package basic;

public class Vehicle {
	int Model;
	int Engine;
	String Brand;

	public Vehicle(int a, int b, String c) {
		this.Model = a;
		this.Engine = b;
		this.Brand = c;

	}

	void Output() {
		System.out.println("Model is" + this.Model);
		System.out.println("Engine is" + this.Engine);
		System.out.println("Brand is" + this.Brand);
	}
}
