package Lab_3;

import java.util.Scanner;

public class Q2 {
	public static void main(String []args) 
	{
	Scanner ob=new Scanner(System.in);
	int size;
	System.out.print("enter the number of elements : ");
	size=ob.nextInt();
	int array[]= new int[size];
	System.out.print("Enter the elemnets : ");
	for(int i=0;i<size;i++)
	{
		array[i]=ob.nextInt();
	}
	for(int i=0;i<size;i++)
	{
		int c=1;
		for(int j=i+1;j<size;j++)
		{
			if(array[i]==array[j])
			{
				c++;
				if(c>=2)
					array[j]=0;
			}
		}
		if(c>=2 && array[i]!=0)
		{
			
			System.out.println("Occurrence of "+array[i]+" is "+c+" times.");
			array[i]=0;
		}
	}
}
}
