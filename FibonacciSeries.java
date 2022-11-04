//logic: firstly print out 0 and 1 separately by assigning them to two variables. (n1 and n2) 
//sum the two variables
//now update**** update first variable value(n1) to the second variable value(n2) and update second variable value(n2) to the value of the sum(n3) 
//**** the two variables are continuously getting updated.... n1 gets updated to n2 and n2 gets updated to n3 each time the loop runs
//n1 takes value of n2 so n1 becomes the first term for the next iteration and n2 takes value of n3(sum of n1 and n2) and becomes the 2nd term and so on

import java.util.Scanner;
public class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		long n1=0,n2=1,i,n3;
		
		int limit = sc.nextInt();
		
		System.out.print(n1+ " "+n2);// print out the 0 and 1 first
		
		for(i=2;i<=limit;i++)// run loop from 2 since 0 and 1 are already printed 
		{
			n3=n1+n2;// print the first two numbers sum
			n1=n2;// assign the previous term to the first variable
			n2=n3;// assign the sum which will be the second term for the next value of the series to the second variable 
			System.out.print(" "+n3); //print out the sum
		}
	}

}
