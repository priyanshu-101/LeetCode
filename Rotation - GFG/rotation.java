//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            int ans = new Solution().findKRotation(a, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
   public static int findKRotation(int[] arr,int n) {
    int low = 0;
    int high = arr.length - 1;
    while (low <= high) {
        if (arr[low] <= arr[high]) {
            return low;
        }
        int mid = low + (high - low) / 2;
        int next = (mid + 1) % arr.length;
        int prev = (mid + arr.length - 1) % arr.length;
        if (arr[mid] <= arr[prev] && arr[mid] <= arr[next]) {
            return mid;
        } else if (arr[mid] <= arr[high]) {
            high = mid - 1;
        } else if (arr[mid] >= arr[low]) {
            low = mid + 1;
        }
    }
    return -1;
}

}