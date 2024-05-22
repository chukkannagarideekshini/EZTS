package basic;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner in=new Scanner(System.in);
       int[] arr= new int[5];
       int sum=0;
       System.out.println("enter marks ");
       for(int i=1;i<arr.length;i++) {
    	   arr[i]=in.nextInt();
       }
       for(int i=0;i<arr.length;i++) {
    	   sum=sum+arr[i];
       }
       System.out.println("sum is"+sum);
       float average=sum/arr.length;
       System.out.println("average is"+average);
	}

}
