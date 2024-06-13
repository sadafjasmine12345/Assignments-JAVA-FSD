
import java.util.Scanner;
public class CityArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]={"hyderabad","mumbai","delhi","jaipur","ongole"};
		String longcity=" ";
		for(String city:arr) {
			if(city.length()>longcity.length()) {
				longcity=city;
			}
		}
		System.out.println("longest city name:"+longcity);
		

	}

}
