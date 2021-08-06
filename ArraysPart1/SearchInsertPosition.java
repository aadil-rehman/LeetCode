package ArraysPart1;
import java.util.Arrays;
import java.util.Scanner;

// Problem : https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
	
	public static int searchInsert(int[] nums, int target) {
		Arrays.sort(nums);
		int x = 0;
		int flag = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] == target) {
				x = i;
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			for(int i=0; i<nums.length; i++) {
				if(nums[i] > target) {
					x = i;
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0) {
			x = nums.length;
		}
		
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] nums = new int[n];
		
		for(int i=0; i<nums.length; i++) {
			nums[i] =sc.nextInt();
		}
		
		int target = sc.nextInt();
		int ans = searchInsert(nums, target);
		System.out.println(ans);
		

	}

}
