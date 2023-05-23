package com.selenium.individual.com.selenium.individual;

import java.util.Scanner;

import io.netty.util.internal.SystemPropertyUtil;

public class OopsConcepts 
{

	String country;
	int pos;

	public void switchmethos()
	{
		Scanner cn= new Scanner(System.in);
		country = cn.next().toUpperCase();
		System.out.print("Enter country name: ");

		switch(country)
		{
		case "USA":
			System.out.println("Position number : 1");
			break;
		case "INDIA":
			System.out.println("Enter the country position: 2");
			break;
		case "UK":
			System.out.println("Enter the country position: 3");
			break;
		case "GERMANY":
			System.out.println("Enter the country position: 4");
			break;
		case "CHAINA":
			System.out.println("Enter the country position: 5");
			break;
		default:
			System.out.println("country name is not entered : ");
			break;

		}		



	}
	//Print starts as left angle triangle

	public void forImplimentation()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)

			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void forImplimentation2()
	{
		for(int i=10;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}		
	public void foreach()
	{
		int arr[]= {1,2,3,4};
		int j;
		int len=arr.length;System.out.println("length of array : " + len);
		for(int i=0;i<=len-1;i++)
		{
			System.out.println(arr[i]+",");

		}
		for(int k:arr)
		{
			System.out.println(k);
		}

	}
	public void whileloop()
	{
		int x=10;
		while(x>1)
		{
			System.out.print(x+ " ");
			x--;
		}
	}
	public void cpallelementstoanotherarray()
	{

		int arr1[]= {2,3,4,5,2};
		int arr2[]= new int[arr1.length];
		int j=0;
		int len =arr1.length;
		for(int i=0;i<=len-1;i++)
		{
			arr2[i]=arr1[i];
		}
		for(int i=0;i<=len-1;i++)
		{
			System.out.println(arr2[i]);
		}






	}
	public void frequnceofeachElementsinArray() 
	{
		
		int alph =65;
		char a = (char)alph;
		System.out.println(a);
	}
}
