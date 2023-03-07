package JavaProgrammes;

public class FibonnacySeries {

	public static void main(String[] args) {

		//WAP For Fibonnacy Series Unto 1-4
		
		
		int num1=0,num2=1,sum;
		
		for(int i=0;i<=4;i++)
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
			System.out.print(sum + " ");
			
		}
		
		
	}

}
