import java.util.Scanner;
public class StringPalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		String str=" ";
		System.out.println("Enter string:");
		str=scnr.nextLine();
		boolean ispalindrome=true;
		int length=str.length();
		for(int idx=0;idx<length/2;idx++) {
			if(str.charAt(idx)!=str.charAt(length-1-idx)) {
				ispalindrome=false;
				break;
			}
		}
		if(true) {
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
	}
}

