package Junior_dev;

public class CarModel 
{
	//public void display()  //public access modifier is accessible in any class and package
	// void display() //default access modifier is accessible in within a same package
	protected void display() //protected access modifier is accessible in within a class and within a same package 
	
	{
		
		System.out.println("BMW");
		System.out.println("Tesla");
		System.out.println("Lamborghini");
		System.out.println("Benz");
	}
	
	public void speed()
	{
		System.out.println("160");
		
	}
	
}
