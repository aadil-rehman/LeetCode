package ArraysPart1;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         int x = sc.nextInt();
         boolean ans = isPalindromeNum(x);
         System.out.println(ans);
         
	}
	
	public static boolean isPalindromeNum(int x) {
		
		int numOfDigit = nOfD(x);
        int[] digit = new int[numOfDigit];
        for(int i=0; i<numOfDigit; i++) {
       	   digit[i] = x%10;
       	   x /= 10;
        }
        int count = 0;
        for(int i=0; i<digit.length/2; i++) {
       	   if(digit[i] == digit[digit.length-i-1]) {
       		   count++;
       	   }
        }
        if(count == digit.length/2) {
        	return true;
        }
        else {
        	return false;
        }
	}
	public static int nOfD(int x) {
		int count = 0;
		while(x>0) {
			int digit = x%10;
			x /= 10;
			count++;
		}
		return count;
	}

}
