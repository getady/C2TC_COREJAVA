
package exception_handling;

public class DemoException {

	public static void main(String[] args) 
	{
		int num = 50/2;
		System.out.println(num);
		int num1 = 50/10;
		System.out.println(num1);
		//ArithmeticException
		try
		{
			int num2 = 50/0;
			System.out.println(num2);	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		//ArrayIndexOutOfBoundsException
		int arr[]=new int[4];
		try
		{
			int num3 = arr[5];
			System.out.println(num3);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
		//finally block 
		finally
		{
			System.out.println("What ever you write executed here.");
			
		}
		int num4 = 50/25;
		System.out.println(num4);
	}

}


