package Backtracking;

import java.util.*;

public class RatMazeWithMultipleJumps{

    public static boolean check(int[][] maze, int n, int r, int c){
        if(c<n && r<n && maze[r][c] != 0){
            return true;
        }
        return false;
    }
  
    public static boolean rat(int[][] maze, int[][] res, int len, int r, int c){
        if( r == len-1 && c == len-1 ){
            res[r][c] = 1;
            return true;
        }

        if(check(maze, len, r,c)){
          	res[r][c] = 1;
          	for(int i = 1; i <= maze[r][c]; i++){
            	if ( rat(maze,res, len, r,c+i) || rat(maze, res, len, r+i,c)){
                	return true;
            	}
            }
          res[r][c] = 0;
        }

        return false;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
      	for(int k = 0; k<T;k++){
        int n = sc.nextInt();
        int[][] maze = new int[n][n];
        int i, j;
      
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                maze[i][j] = sc.nextInt();
            }
        }

        int[][] res = new int[n][n];

        if (rat(maze, res, n, 0,0)){
            for(i=0;i<n;i++){
                for(j=0;j<n;j++){
                    System.out.print(res[i][j]+" ");
                }
                System.out.println();
            }
        }
      else{
                System.out.println(-1);
            
      }
    }
    sc.close();
    }
}
