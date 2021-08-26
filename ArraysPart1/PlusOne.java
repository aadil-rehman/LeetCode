package ArraysPart1;

import java.util.Arrays;
import java.util.Scanner;

/*Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Example 3:

Input: digits = [0]
Output: [1]8*/

public class PlusOne {
	
	public static void plusOne(int[] digits) {
        if(digits[0] == 0){
            digits[0]++;
            //return digits;
        }
        
        String val;
        val = String.valueOf(digits[0]);
        for(int i=0; i<digits.length; i++){
        	 if(i != 0) {
        		 val = val + "" +  String.valueOf(digits[i]);
        	 }
        }
       // System.out.println(val);
        long num = Long.valueOf(val);
       // System.out.println(num);
        num++;
       // System.out.println(num);
        int[] ans = new int[sizeOf(num)];
        for(int i=sizeOf(num)-1; i>=0; i--) {
        	ans[i] = (int)(num%10);
        //	System.out.print(ans[i]);
        	num /= 10;
        }
       // System.out.println();
        for(int i=0; i<ans.length; i++) {
        	System.out.print(ans[i]);
        }
    }

	public static int sizeOf(long num) {
		// TODO Auto-generated method stub
		int count = 0;
		while(num>0) {
			num /=  10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		plusOne(arr);
	}

}
