
package final_super_interface;

	class Demo{
		String color="Red";
		void display ()
		{
			System.out.println("Hello M12");	
		}
	}
	public class DemoFinal extends Demo
	{
	       void display ()
	       {
	    	   System.out.println("Hello");
	    	   System.out.println(super.color);
	       }
	       final int studid=101;
	       
	public static void main(String[] args)
	{
			DemoFinal df=new DemoFinal();
			df.display ();

	}

}


