package ArraysPart1;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {
	
	   //Ashu bhai ne isme barabar support kiya is questions mein
		 public static int removeElement(int[] nums, int val) {
			 Arrays.sort(nums);
		       int length = 0;
		       int startInd = -1;
             int endInd = -1;
		       for(int i=0; i<nums.length; i++){
		           if(nums[i] == val){
		              if(length == 0){
		                  startInd = i;
		              }
		              length++;  
		           }
		       }
    
             if(length == 0){
                return nums.length;
             }
		  
             endInd = startInd + length-1;
           
		       int count = 1;
		       for(int i=startInd; i<=endInd; i++){ 
		           //swap nums[i] <-> nums[startInd]
		           //int temp = nums[i];
		           nums[i] = nums[nums.length-count];
		           nums[nums.length-count] = val;
		           count++;
		       }
		       
		       return nums.length-length;
		     
		    }
	        
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int value = sc.nextInt();
		int[] nums = new int[n];
		for(int i=0; i<nums.length; i++) {
			nums[i] = sc.nextInt();
		}
		int ans = removeElement(nums, value);
		//System.out.println();
		System.out.println(ans);

	}

}
