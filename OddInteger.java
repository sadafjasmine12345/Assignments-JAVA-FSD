import java.util.Scanner;
public class OddInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter an integer value:");
		int num;
		num=scnr.nextInt();
		if(num%2==0) {
			System.out.println("False");	
		}
		else {
			System.out.println("True");
		}
	}

}