package ArraysPart1;

import java.util.Scanner;

   //https://leetcode.com/problems/3sum-closest/

public class ThreeSumClosest {
	
	public static int closestSum(int[] arr, int target) {
		int sum = 0;
		int diff = 0;
		int x = 0;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				for(int k=j+1; k<arr.length; k++) {
					sum = arr[i] + arr[j] + arr[k];
					if(sum > target) {
						diff = sum-target;
					}
					else {
						diff = target-sum;
					}
					if(diff < min) {
						min = diff;
						x = sum;
					}
			     }
		     }
	     }
		return x;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		int ans = closestSum(arr, target);
		System.out.println(ans);
		

	}

}
