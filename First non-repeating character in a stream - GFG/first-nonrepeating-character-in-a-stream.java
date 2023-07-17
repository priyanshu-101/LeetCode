//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String A = br.readLine().trim();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


class Solution
{
    public String FirstNonRepeating(String stream)
    {
        // code here
          Map<Character, Integer> frequencyMap = new HashMap<>();
        Queue<Character> uniqueQueue = new LinkedList<>();

        StringBuilder answer = new StringBuilder();

        for (char c : stream.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

            if (frequencyMap.get(c) == 1) {
                uniqueQueue.offer(c);
            }

            while (!uniqueQueue.isEmpty() && frequencyMap.get(uniqueQueue.peek()) > 1) {
                uniqueQueue.poll();
            }

            if (uniqueQueue.isEmpty()) {
                answer.append("#");
            } else {
                answer.append(uniqueQueue.peek());
            }
        }

        return answer.toString();
    }
}