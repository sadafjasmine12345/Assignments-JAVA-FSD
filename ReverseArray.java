import java.util.Scanner;
public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		int arr[]=new int[5];
		System.out.print("Enter elements into an array:{ }");
		for(int idx=0;idx<arr.length;idx++) {
			arr[idx]=scnr.nextInt();
		}
		int start=0,end=arr.length,temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end-1];
			arr[end-1]=temp;
			start++;
			end--;
		}
		System.out.println("Reversed array:{ }");
		for(int idx=0;idx<arr.length;idx++) {
			System.out.print(" "+ arr[idx]);
			
			
		}
		

	}

}
