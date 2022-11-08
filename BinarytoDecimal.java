import java.io.*;
import java.math.*;
public class BinarytoDecimal {

	public static void main(String[] args)throws IOException
	{
		DataInputStream in =new DataInputStream(System.in);
		  
	    int binary_number = Integer.parseInt(in.readLine());
	    
	    int i = 0;
	    double decimal = 0.0;
	    
	    while(binary_number!=0)
	    {
	    	
	    	int digit = binary_number % 10; //take out the digits from the end
	    	
	    	decimal = decimal + digit*(Math.pow(2, i)); // use a accumulator to add up the digits while multiplying it with the correct power of 2 
	    	
	    	i++; // use a counter for using for the correct value to raise the power of 2 to.
	    	
	    	binary_number = binary_number/10; // divide the number by ten so that the last digit used in calculation is no more used 
	    }
		System.out.println(decimal);
		

	}

}
