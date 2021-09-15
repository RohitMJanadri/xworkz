package com.xworkz.controlStatements;

public class noDivisibleBy2n6 {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++)
		{
			if(i%2==0)
				System.out.print(" ");
			
		}
		
		for(int i=0;i<=100;i++)
		{
			if(i%6==0)
				System.out.print(" ");
			
		}
		System.out.println("divisible by 3&5 ");
		for(int i=0;i<=100;i++)
		{
			if(i%2==0 && i%6==0)
				System.out.print(i+" ");
			
		}
		System.out.println("\n");

	}

}
