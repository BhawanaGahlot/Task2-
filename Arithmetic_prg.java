import java.util.*;
public class Arithmetic_prg
{
	public static void main(String args[])
	{
		int a,b;
		Scanner in =new Scanner (System.in);
		System.out.print("Enter a value:");
		a=in.nextLine();
		System.out.print("Enter b value:");
		b=in.nextLine();
		System.out.println("Sum of a and b="+(a+b));
		System.out.println("Diffrence of a and b="+(a-b));
		System.out.println("Product of a and b="+(a*b));
		System.out.println("Division of a and b="+(a/b));
		in.close();
	}
}