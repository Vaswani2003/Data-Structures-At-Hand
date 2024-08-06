package DynamicProgramming;
import java.util.*;
public record LongestCommonSubsequence() {

  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s2 = sc.next();
    int n = s1.length(), m = s2.length();
    
    int[][] dp = new int[n+1][m+1];
    int r,c;
    
    for(r=1;r<=n;r++){
    	for(c=1;c<=m;c++){
        	if(s1.charAt(r-1) == s2.charAt(c-1)){
            	dp[r][c] = dp[r-1][c-1] + 1;
            }
          	else{
            	dp[r][c] = Math.max(dp[r-1][c], dp[r][c-1]);
            }
        }
    }
    
    System.out.print(dp[n][m]);
    
  }
}