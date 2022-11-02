/*
 * Create a boolean function isPrime and use the prime number logic there, check for Prime and return true or false
 * 
 * Inside main run a loop from 1 till the number
 * use if and inside if block call the function, since the function gives true or false value it will go inside "if" block if and only if isPrime function
 * returns true. Inside if block just print i separated with a space
 */

// Question: Print prime numbers from 0 to input number 

import java.util.Scanner;

public class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
//		System.out.println("Enter Limit: ");
		
		int input_number = sc.nextInt(); // input the number till which you want primes
		
		PrimeNumber obj = new PrimeNumber(); // create an object of the main class
		
		for(int i = 1; i<=input_number; i++) // run a loop from i to input number to check each number is Prime or not
		{
			if(obj.isPrime(i)) // using if check if i is prime or not while calling the function isPrime( isPrime returns boolean value so we can call it inside 
				               // if block)
			{
				System.out.print(i + " "); // if true then print i which will be the prime number
			}
		}
		
		sc.close();
 	}
	
	public boolean isPrime(int number)
	{
		
		for(int i = 2; i<number ;i++) // run loop from 2 to number-1 
		{
			if(number % i == 0) // if number is divisible by i (i is any number apart from number itself and 1) then not Prime
			{
				return false; // return false if "if" condition is true
			}
		}
		
		return true; // return true if "if" condition false
	}
}
