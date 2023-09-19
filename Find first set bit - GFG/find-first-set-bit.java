//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();//taking testcases
		while(t-->0){
			int n=sc.nextInt();//input n
			Solution ob=new Solution();
			System.out.println(ob.getFirstSetBit(n));//calling method
		}
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
   
    public static int getFirstSetBit(int N){
            
        // Your code here
            if (N == 0) {
            return 0; 
        }
        
        int position = 1;
        int mask = 1;
        
       
        while ((N & mask) == 0) {
            mask <<= 1; 
            position++;
        }
        
        return position;
            
    }
}