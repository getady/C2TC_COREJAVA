
package javacollection;

import java.util.LinkedList;
//import java.util.Iterator;

public class DemoLinkedList {

	public static void main(String[] args)
	{
		
	LinkedList<String> al=new LinkedList<String>();
	al.add("ammar");
	al.add("yasir");
	al.add("sohel");
	al.add("akash");
	al.addFirst("tns");
	
	System.out.println(al);
	
	al.set(2, "tns");
	System.out.println(al);
	
	al.add(2,"chinni");
	System.out.println(al);
	
	al.remove(1);
	System.out.println(al);
	
	/*System.out.println("forloop");
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	
	System.out.println("Advance forloop");
	for(String str:al)
		System.out.println(str);
	
	
	System.out.println ("while loop");
	int count=0;
	while(al.size()>count)
	{
		System.out.println(al.get(count));
		count++;
	}
	
	System.out.println("Iterator");
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}*/

	} 	
}