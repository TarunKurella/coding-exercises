import java.io.*;
import java.util.*;
/*

4.Given a positive integer n and you can do operations as follow:
1.	If n is even, replace n with n/2.
2.	If n is odd, you can replace n with either n + 1 or n - 1.
What is the minimum number of replacements needed for n to become 1?
Example 1:
Input:
8

Output:
3

Explanation:
8 -> 4 -> 2 -> 1


*/
class Main {
  
  public static void main(String[] args) throws IOException {


     FastReader input = new FastReader();
     Print output = new Print();
     int ans;
     ans = solution(8);
     output.print(ans);
   
 
  }


static int solution(int n){
            int count = 0;
        while(n!=1){
            if((n&1)==1){
                if(n==3||(((n>>1)&1)==0)){
                    n--;
                }else{
                    n++;
                }
                
            }else{
                n=n>>1;
            }
            count++;
        }
        return count;
}



// Helper classes for input and output

      static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

   static class Print
{
    private final BufferedWriter bw;
    public Print()
    {
        this.bw=new BufferedWriter(new OutputStreamWriter(System.out));
    }
    public void print(Object object)throws IOException
    {
        bw.append(""+object);
        bw.flush();
    }
    public void println(Object object)throws IOException
    {
        print(object);
        bw.append("\n");
    }
    public void close()throws IOException
    {
        bw.close();
    }
}
}
