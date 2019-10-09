int cutRod(int price[], int n) 
{ 
   if (n <= 0) 
     return 0; 
   int max_val = INT_MIN; 
  
   // Recursively cut the rod in different pieces and compare different  
   // configurations 
   for (int i = 0; i<n; i++) 
         max_val = max(max_val, price[i] + cutRod(price, n-i-1)); 
  
   return max_val; 
} 
