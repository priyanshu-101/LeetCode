//{ Driver Code Starts
import java.util.*;
import java.io.*;
class Reversing{
    public static void main(String[] args)throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        //Reading total number of testcases
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            //Reading total number of elements
            int n=Integer.parseInt(br.readLine());
            
            //Creating a Queue
            Queue<Integer> q=new LinkedList<>();
            
            //Reading all the elements in a string
            String s=br.readLine();
            
            //Spliting the string into different
            //string separated by space
            String[] a=s.split(" ");
            
            //adding all the elements to the Queue
            for(String b:a){
                int x=Integer.parseInt(b);
                q.add(x);
            }
            
            //Creating an object of class Geeks
            GfG g=new GfG();
            
            //calling rev method of class Geeks
            q=g.rev(q);
            
            //printing the elements of the queue
            while(!q.isEmpty()){
                int x=q.peek();
                q.poll();
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
/*Complete the function below*/
class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> queue){
        //add code here.
        Stack<Integer> stack = new Stack<>();

        // Push elements from the queue into the stack
        while (!queue.isEmpty()) {
            stack.push(queue.poll());
        }

        // Pop elements from the stack and enqueue them back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        return queue;
    }
}