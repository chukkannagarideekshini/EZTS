package basic;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int incometax;
	        
		    Scanner sc = new Scanner(System.in); 
		    System.out.println("Enter age");
		    int age = sc.nextInt();
		    System.out.println("age is: " + age);
		        
		        if(age<60)
		        {
		    Scanner d = new Scanner(System.in); 
		    System.out.println("Enter sal");
		    int sal = d.nextInt();
		    System.out.println("sal is: " + sal);
		         if (sal<=250000){
		             incometax=sal;
		            System.out.println("tax is: " + incometax);
		         }
		          else if(sal>=250001&&sal<=500000){
		                 incometax=(sal*1/20);
		                 System.out.println("tax is: " + incometax);
		             }
		             else if(sal>=500001&&sal<=1000000){
		                 incometax=(sal*1/10);
		                 System.out.println("tax is: " + incometax);
		             }
		             else if(sal>=1000001&&sal<=3000000){
		                 incometax=(sal*1/5);
		                 System.out.println("tax is: " + incometax);
		             }
		             else if(sal>3000000){
		                 incometax=(sal*3/10);
		                 System.out.println("tax is: " + incometax);
		             }
		        }
		        else
		        {
		            Scanner e = new Scanner(System.in); 
		    System.out.println("Enter salary");
		    int salary = e.nextInt();
		    System.out.println("sal is: " + salary);
		          if (salary<=300000){
		             incometax=salary;
		            System.out.println("tax is: " + incometax);
		         }
		          else if(salary>=300001&&salary<=500000){
		                 incometax=(salary*1/20);
		                 System.out.println("tax is: " + incometax);
		             }
		             else if(salary>=500001&&salary<=2000000){
		                 incometax=(salary*1/10);
		                 System.out.println("tax is: " + incometax);
		             }
		             else if(salary>2000000){
		                 incometax=(salary*1/5);
		                 System.out.println("tax is: " + incometax);
		             }
		        }
	}

}
