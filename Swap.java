
import java.util.Scanner;
public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter a,b values:");
		a=scnr.nextInt();
		b=scnr.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a="+a);
		System.out.println("b="+b);
		
	}

}
