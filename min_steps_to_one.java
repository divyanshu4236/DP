/*
JAVA CODE
Given a positive integer n, find the minimum number of steps s, that takes n to 1. You can perform any one of the following 3 steps.
1.) Subtract 1 from it. (n= n ­ 1) ,
2.) If its divisible by 2, divide by 2.( if n%2==0, then n= n/2 ) ,
3.) If its divisible by 3, divide by 3. (if n%3 == 0, then n = n / 3 ). 
The time complexity of your code should be O(n).
*/



public static int countStepsTo1(int n){
		
	int[] dp=new int[n+1];
      int i=2;
      dp[1]=0;
      
      while(i<=n)
      {
        int t2=Integer.MAX_VALUE, t3=Integer.MAX_VALUE;
       int t1=1+dp[i-1];
        if(i%2==0)
        {
           t2=1+dp[i/2];
        }
        if(i%3==0)
        {
          t3=1+dp[i/3];
        }
        dp[i]=Math.min(t1,Math.min(t2,t3));
        i++;
      }
	return dp[n];
	}