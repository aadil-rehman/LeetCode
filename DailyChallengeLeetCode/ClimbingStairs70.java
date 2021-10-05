package DailyChallengeLeetCode;

import java.util.Scanner;
//There are only two possible ways of reaching any particular step, these are: either 
//take a single jump from the penultimate step or take a double jump from the anti-penultimate step.
//Now the total number of ways (counted from the very bottom) of reaching the current step 
//is the sum of the possible ways of reaching the penultimate step and the possible ways of 
//reaching the anti-penultimate step.  

public class ClimbingStairs70 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int waysOfReachingCurrentStep=0;
        
        int waysOfReachingPrevToPreviousStep=0; //Anti-penultimate steps
        int waysOfReachingJustPreviousStep=1; //Penultimate steps 
        
        for(int i=1; i<=n;i++){
            waysOfReachingCurrentStep = waysOfReachingJustPreviousStep + waysOfReachingPrevToPreviousStep;  //
            
            //preparation for next iteration
            waysOfReachingPrevToPreviousStep = waysOfReachingJustPreviousStep;
            waysOfReachingJustPreviousStep = waysOfReachingCurrentStep;
            
        }
        System.out.println(waysOfReachingCurrentStep);;
    }  
}