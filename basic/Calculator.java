package basic;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    char operator;
	    Double num1, num2, result;

	    
	    Scanner a = new Scanner(System.in);

	    
	    System.out.println("Choose an operator: +, -, *, or /");
	    operator = a.next().charAt(0);

	    
	    System.out.println("Enter first number");
	    num1 = a.nextDouble();

	    System.out.println("Enter second number");
	    num2 = a.nextDouble();

	    switch (operator) {

	   
	      case '+':
	        result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	     
	      case '-':
	        result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	     
	      case '*':
	        result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      
	      case '/':
	        result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }

	    a.close();
	}

}
