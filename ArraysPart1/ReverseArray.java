package ArraysPart1;

import java.util.Scanner;



public class ReverseArray {
	public static int reverse(int x) {
        int flag = 0;
        if(x<0){
            x = Math.abs(x);
            flag = 1;
        } 
        if(x == 0){
            return 0;
        } 
        
        int revNum = 0;
        while(x>0){
        int digit = x%10;
        x = x/10;
        revNum = revNum*10 + digit;
        }       
        if(revNum > (Math.pow(2, 31)-1) || revNum < (-Math.pow(2, 31))){
            return 0;
        }
        if(flag == 1){
            return -revNum;
        }
        else{
            return revNum;
        }
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = reverse(n);
        System.out.println(ans);
	}

}
