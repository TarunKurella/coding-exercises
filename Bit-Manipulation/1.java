import java.io.*;
import java.util.*;
/*

1.Given the array arr of positive integers and the array queries where queries[i] = [Li, Ri], for each query i compute the XOR of elements from Li to Ri (that is, arr[Li] xor arr[Li+1] xor ... xor arr[Ri] ). Return an array containing the result for the given queries.

Input: arr = [1,3,4,8], queries = [[0,1],[1,2],[0,3],[3,3]]
Output: [2,7,14,8] 




*/
class Main {
  
  public static void main(String[] args) throws IOException {


     FastReader input = new FastReader();
     Print output = new Print();
     int[] ans;
     ans = solution(new int[] { 1,3,4,8},new int[][] { {0,1},{1,2},{0,3},{3,3}});
     for(int temp: ans){
       output.print(temp+" ");
     }
   
 
  }

static int[] solution(int[] arr,int[][] queries){
int[] ans = new int[queries.length];
int i = 0;
for(int[] temp : queries) {
  int var=arr[temp[0]];
  
  for(int k = temp[0]+1;k<=temp[1];k++){
    var=var^arr[k];
  }
  ans[i]=var;
  i++;
}

return ans;
}



//Helper classes for fast input and fast output
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
