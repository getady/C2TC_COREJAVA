
import java.util.Scanner;

public class Additions1 {

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		
		sc.close();
		c = a + b;
		System.out.println("The Sum of these numbers: "+c);

	}

}
