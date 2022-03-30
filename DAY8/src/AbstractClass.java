
abstract class My_Rules 
{
	abstract void speedLimit();
	abstract void rashDriving();
}

public class AbstractClass extends My_Rules 
{
	void speedLimit()
	{
		System.out.println("The Speed Limit is 80");
	}
     void rashDriving ()
     {
    	 System.out.println("Alert voice");
     }
     
	public static void main(String[] args) {
		
		AbstractClass s=new AbstractClass ();
		s.speedLimit();
		s.rashDriving();
		

	}

}


