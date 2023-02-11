package week1.day2;

public class FibonacciSequence {
	public static void main(String arg[])
	
	{
		System.out.println("Inside Fibo Main method");
		int sum=0;
		int firstNumber = 0;
		int secondNumber =1;
		
		System.out.print("Fibonacci Series is : " +firstNumber+" "+secondNumber+"");
		for (int i=0;i<10;i++) 
		{
			
			sum=firstNumber+secondNumber;
			firstNumber=secondNumber;
			secondNumber=sum;
			System.out.print(" "+sum+" ");
			
		}
			
}
	
}