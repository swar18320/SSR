package JavaProgrammes;

public class RevrseEachWord {

	public static void main(String[] args) {

		String str="i will love you";
		
		String arr[]=str.split(" ");
		
		String[] str1 = new String[4];
		
		for(int i=0;i<arr.length;i++)
		{
			String revString=" ";
			for(int j=0;j<arr[i].length();j++)
			{
				char ch=arr[i].charAt(j);
				revString=ch+revString;
				
			}
			
			str1[i]=revString;
		}
		
		for(String v : arr)
		System.out.print(v + " ");
		
		System.out.println("\n---------------------------------------");
		
		for(String value : str1)
		System.out.print(value);
	}

}
