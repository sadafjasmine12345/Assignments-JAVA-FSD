
public class ThreeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] org= {10,20,30,40,50,60,70,80,90,100};
		int [] earr=new int[10];
		int [] oarr=new int[10];
		for(int idx=0;idx<org.length;idx++) {
			if(org[idx]%2==0) {
				earr[idx]=org[idx];
				oarr[idx]=0;
				
			}else {
				oarr[idx]=org[idx];
				earr[idx]=0;
			}
		}
		System.out.println("original array:");
		
		for(int idx=0;idx<org.length;idx++) {
			System.out.print(org[idx]+" ");
			
		}
		System.out.println("Even array:");
		
	for(int idx=0;idx<earr.length;idx++) {
		System.out.print(earr[idx]+" ");
		
	}
	System.out.println("odd array:");
	
	for(int idx=0;idx<oarr.length;idx++) {
		System.out.print(oarr[idx]+" ");
		
	}
	}
}
