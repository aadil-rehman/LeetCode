package DailyChallengeLeetCode;

import java.util.Scanner;

public class IslandPerimeter463 {
	
	public static int boundaryIfAny(int[][] grid, int r, int c, int m, int n) {
		int sumOfBoundary = 0;
		if(r == 0) {
			sumOfBoundary++;
		}
		if(c == 0) {
			sumOfBoundary++;
		}
		if(r == m-1) {
			sumOfBoundary++;
		}
		if(c == n-1) {
			sumOfBoundary++;
		}
		if(c != n-1) {
			if(grid[r][c+1] == 0) {
				sumOfBoundary++;
			}
		}
		if(c != 0) {
			if(grid[r][c-1] == 0) {
				sumOfBoundary++;
			}
		}
		if(r != m-1) {
			if(grid[r+1][c] == 0) {
				sumOfBoundary++;
			}
		}
		if(r != 0) {
			if(grid[r-1][c] == 0) {
				sumOfBoundary++;
			}
		}
		return sumOfBoundary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] grid = new int[m][n];
		for(int r=0; r<m; r++) {
			for(int c=0; c<n; c++) {
				grid[r][c] = sc.nextInt();
		    }

	    }
		int sum = 0;
		for(int r=0; r<m; r++) {
			for(int c=0; c<n; c++) {
				if(grid[r][c] == 1) {
					sum += boundaryIfAny(grid, r, c, m, n);
				}
		    }

	    }
		System.out.println(sum);
		
	}

}



