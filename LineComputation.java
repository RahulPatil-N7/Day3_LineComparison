package com.bridgelabz.LineBranch;

import java.util.Scanner;

public class LineComputation {
	
	static Double length1=0.0d;
	static Double length2=0.0d; 

	public static void main(String[] args) {
		System.out.println("Welcome to the line comparison computation.");
		
	    System.out.print("Enter the first line-\n"); 
	    length1 = linecalculation(); 
	    System.out.print("\nEnter the second line-\n"); 
	    length2 = linecalculation();
	    linecomparison();
	    linecompareTo();
	    
	   }
	  public static Double linecalculation() 
	    { 
	    	//Line length calculation
		  
	    	Scanner scanner = new Scanner(System.in);
	    	System.out.println("Enter the value of x1 and y1 :");
	    	float x1 = scanner.nextFloat();
	    	float y1 = scanner.nextFloat();
	    	System.out.println("Enter the value of x2 and y2 :");
	    	float x2 = scanner.nextFloat();
	    	float y2 = scanner.nextFloat();
	    	Double length = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	    	System.out.println("\nlength of the line is :"+length);
	    	return length;
	    	}
	  public static void linecomparison() 
	    {
		    //Line comparison using equals
		  
	    	if (length1.equals(length2))
	    	{ 
	    		System.out.println("\nBoth the line are equal.");
	    	} 
	    	else 
	    	{
	    		System.out.println("\nLines are not equal."); 
	    	}
	    
	    }
	  public static void linecompareTo() 
	    {
		  //Line comparison using compareTo
	    	if (length1.compareTo(length2)==0)
	    	{ 
	    		System.out.println("\nBoth the line are equal.");
	    	} 
	    	else if(length1.compareTo(length2)==1)
	    	{
	    		System.out.println("\nLines 1 is greater than Line 2 ."); 
	    	}
	    	else
	    	{
	    		System.out.println("\nLines 1 is smaller than Line 2 .");
	    	}
	}   
} 