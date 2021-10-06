package DailyChallengeLeetCode;

import java.util.ArrayList;
import java.util.Scanner;

public class FindAllDuplicatesInAnArray442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> ans = new ArrayList<>();
		int[] freq = new int[n];
		for(int i=0; i<arr.length; i++) {
			freq[arr[i]-1]++;
			if(freq[arr[i]-1] == 2) {
				ans.add(arr[i]);
			}
		}
		System.out.println(ans);

	}

}
