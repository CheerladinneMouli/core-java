package ai.jobiak.games;

public class Subarray {
	
	int a[]= {1,2,3,4,5,6,7,8,9,10};
	int n = 10;
	int s = 15;
	
	int[] subarraySum() {
		int end=5;
		int start=1;
		for(int i=start;i<=end;i++) {
			if((a[i]+a[i+1]+a[i+2]+a[i+3])==s) {
				return a;
			}
		
			
		}
		return a;
	}
		
		public static void main(String args[]) {
			Subarray s = new Subarray();
			s.subarraySum();
		}

}
