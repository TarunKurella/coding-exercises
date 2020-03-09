import java.io.*;
import java.util.*;
/*

2. Given 3 positives numbers a, b and c. Return the minimum flips required in some bits of a and b to make ( a OR b == c ). (bitwise OR operation).
Input: a = 2, b = 6, c = 5
Output: 3




*/
class Main {
  
  public static void main(String[] args) throws IOException {


     FastReader input = new FastReader();
     Print output = new Print();
     int ans;
     ans = solution(2,6,5);
     output.print(ans);
   
 
  }

static int solution(int a,int b,int c){
int ans = 0;
while(c!=0){
  int need = c&1;
  int upper = a&1;
  int lower = b&1;
  if(need!=(upper|lower)){
    if(need==1){
      ans++;
    }else{
      ans=ans+2;
    }
  }
  c=c>>1;
  a=a>>1;
  b=b>>1;
}

return ans;
}




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
