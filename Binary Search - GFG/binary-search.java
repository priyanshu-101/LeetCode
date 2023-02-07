//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int key = sc.nextInt();
            Solution g = new Solution();
            System.out.println(g.binarysearch(arr, n, key));
            T--;
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    int binarysearch(int nums[], int n, int target) {
        // code here
         int a= 0,r= nums.length -1,mid = (a+r)/2;
        while(a<=r)
        {
            if(target < nums[mid])
            {
              r =mid-1;
            }
            else if(target > nums[mid])
            {
              a= mid+1;
            }
            else if(target == nums[mid])
            {
                return mid;
            }
            mid = (a+r)/2;
        }
        return -1;
    }
}