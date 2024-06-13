import java.util.Scanner;
public class ArrayMultiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int []arr=new int[10];
		System.out.print("Enter 10 integers:");
		for(int idx=0;idx<arr.length;idx++) {
			arr[idx]=scnr.nextInt();
		}
		System.out.println("enter an ele:");
		int n=scnr.nextInt();
		for(int idx=0;idx<arr.length;idx++) {
			if(arr[idx]%n==0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		
		
		

	}

}
