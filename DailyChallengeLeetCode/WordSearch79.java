package DailyChallengeLeetCode;

import java.util.Scanner;

public class WordSearch79 {
	static boolean hoGayaKaam;
	static int flag;
	
	private static void kyaWordBanSaktaHai(char[][] grid, int r, int c, String word, int cc, boolean[][] vis) {
		// TODO Auto-generated method stub
		//+ve base case
		if(cc == word.length()) {
			hoGayaKaam = true;
			return;
		}
		//-ve base case
		if(r < 0 || c < 0 || r == grid.length || c == grid[0].length || vis[r][c] == true) {
			return;
		}
		
		if(flag == 1) {
			if(grid[r][c] == word.charAt(cc)) {
				cc++;
			} else {
				return;
			}
		}
		
		if(flag == 0 && grid[r][c] == word.charAt(cc)) {
			cc++;
		}
		
		vis[r][c] = true;
		//left
		kyaWordBanSaktaHai(grid, r, c-1, word, cc, vis);
		//right
		kyaWordBanSaktaHai(grid, r, c+1, word, cc, vis);
		//up
		kyaWordBanSaktaHai(grid, r-1, c, word, cc, vis);
		//down
		kyaWordBanSaktaHai(grid, r+1, c, word, cc, vis);
		flag = 0;
		vis[r][c] = false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		hoGayaKaam = false;
		flag = 0;
		char[][] grid = new char[m][n];
		for(int r=0; r<m; r++) {
			for(int c=0; c<n; c++) {
				grid[r][c] = sc.next().charAt(0);
		    }

	    }
		String word = sc.next();
		boolean[][] vis = new boolean[m][n];
		kyaWordBanSaktaHai(grid, 0, 0, word, 0, vis);
		System.out.println(hoGayaKaam);
		

	}

	

}
