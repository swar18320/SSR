package JavaProgrammes;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {

		Scanner sx=new Scanner(System.in);
		
		int num,count=0;
		System.out.println("Enter a new Number");
		num=sx.nextInt();
		
		if(num>0)
		{
			for(int i=1;i<=num;i++) //8
			{
				if(num%i == 0)
				{
					count++;
				}
			}
		}
		
		if(count == 1)
		{
			System.out.println("prime number");
		}
		
		else
			System.out.println("Non Prime");
		
	}

}
