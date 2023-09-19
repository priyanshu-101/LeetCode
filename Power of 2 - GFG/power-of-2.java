//{ Driver Code Starts
// //Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver_class
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());//testcases
        
        while(t-- > 0)
        {
            //input a number n
            long n = Long.parseLong(read.readLine());
            
            
            // if n is less than equal to zero then 
            //it can't be a power of 2 so we print No
            if(new Solution().isPowerofTwo(n) == true)
              System.out.println("YES");
            else System.out.println("NO");
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    
    // Function to check if given number n is a power of two.
    public static boolean isPowerofTwo(long N){
        
        // Your code here
               if (N <= 0) {
            return false; // N is non-positive, so it can't be a power of 2.
        }
        
        // A power of 2 has only one bit set, so we can use bitwise AND to check.
        return (N & (N - 1)) == 0;
        
    }
    
}