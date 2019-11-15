public class Test {
	public static void main(String[] args) {
		int m=3;
		int n=3;
		int[] nums1={1,2,3,0,0,0};
		int[] nums2={2,5,6};
		int p=m+n-1;
		while(m>0 && n>0) {
			if(nums1[m-1]>nums2[n-1]) {
				nums1[p]=nums1[m-1];
				m--;
			}else {
				nums1[p]=nums2[n-1];
				n--;
			}
			p--;
		}
		while(m>0) {
			nums1[p]=nums1[m-1];
			m--;
			p--;
		}
		while(n>0) {
			nums1[p]=nums2[n-1];
			n--;
			p--;
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(nums1[i]+" ");
		}
	}
}
