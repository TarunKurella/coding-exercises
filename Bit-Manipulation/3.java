import java.io.*;
import java.util.*;
/*

3.Given a non-empty array of numbers, a0, a1, a2, … , an-1, where 0 ≤ ai < 231.
Find the maximum result of ai XOR aj, where 0 ≤ i, j < n.
Could you do this in O(n) runtime?
Example:
Input: [3, 10, 5, 25, 2, 8]

Output: 28

Explanation: The maximum result is 5 ^ 25 = 28.



*/
class Main {
  
  public static void main(String[] args) throws IOException {


     FastReader input = new FastReader();
     Print output = new Print();
     int ans;
     ans = solution(new int[]{3,10,5,25,2,8});
     output.print(ans);
   
 
  }

//solution inspired by blog post for O(n)
static int solution(int[] nums){
    int max = 0,mask = 0;
        for(int i=31;i>=0;i--){
          //we gredilly start from msb increasing it bit by bit
            mask = mask|(1<<i);
            HashSet<Integer>  temp = new HashSet();
            for(int j: nums){
                temp.add(mask&j);
            }
            int prefix = max|(1<<i);
             for(int j: temp){

               /*
               if a^b=c, then b^c=a
               based on above property, we are assuming
               if the the element of assumed maximum and one of elements is present in the  input array,if true then 
               we update our max.
               */
                if(temp.contains(j^prefix)){
                    max = prefix;
                    break;
                }
            }
            
        }
        return max;
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
