
package multithreading;

class Chrome1 implements Runnable
{
	public void run()
	{
		for (int i=0; i<5; i++)
	{
		System.out.println("Chrome id "+Thread.currentThread().getId());
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
class VSCode1 implements Runnable
{
	public void run()
	{
		for (int i=0; i<5; i++)
		{
			System.out.println("VSCode id "+Thread.currentThread().getId());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
	
}
}
class Facebook1 implements Runnable
{
	public void run()
	{
		for (int i=0; i<5; i++)
		{
		System.out.println("Facebook id "+Thread.currentThread().getId());
		try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}
}
public class ThreadEx1 {
	public static void main(String[] args)
	{
		
    Chrome1 ob=new Chrome1 ();
    Thread t=new Thread (ob);
    t.setPriority(Thread.MIN_PRIORITY);
    t.start ();
    
    VSCode1 ob1=new VSCode1 ();
    Thread t1=new Thread (ob1);
    t1.setPriority(Thread.NORM_PRIORITY);
    t1.start();
    
    Facebook1 ob2=new Facebook1 ();
    Thread t2=new Thread (ob2);
    t2.setPriority(Thread.MAX_PRIORITY);
    t2.start();
	}

}




