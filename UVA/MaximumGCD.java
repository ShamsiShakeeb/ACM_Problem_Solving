import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import java.util.StringTokenizer;

public class MaximumGCD {
    
    public static PrintWriter out;
	
	public static class MyScanner
	{
		public  BufferedReader br;
		public StringTokenizer st;
		
		public MyScanner()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
		}
		
		public String next()
		{
			while (st==null || !st.hasMoreElements())
			{
				try
				{
					st = new StringTokenizer(br.readLine());
				}
				catch(IOException e)
				{
					///e.printStackTrace();
                                        
				}
			}
			return st.nextToken();
		}
		
		public int nextInt()
		{
			return Integer.parseInt(next());
		}
		
		public long nextLong()
		{
			return Long.parseLong(next());
		}
		
		public double nextDouble()
		{
			return Double.parseDouble(next());
		}
		
		public String nextLine()
		{
			String str = "";
			try
			{
				str = br.readLine();
			}
			catch(IOException e)
			{
				//e.printStackTrace();
			}
			return str;
                }
        }
    
    public static int GCD(int x , int y){
        if(x<y){
            if(y%x==0){
                return x;
            }
            else{
               return GCD(x,y%x);
            }
        }
        else{
             if(x%y==0){
                return y;
            }
            else{
               return GCD(y,x%y);
            }
        }
    }
    
    
    public static void main(String[] args) throws IOException{
        
        MyScanner in = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        
        
        int t = in.nextInt();
        
        for(int kkk=0;kkk<t;kkk++){
            
           
            String x="";
            String y[];
            while((x=in.nextLine())!=null){
            ArrayList<Integer> list = new ArrayList();
            int ans=0;   
            y = x.split(" ");
            
            for(int i=0;i<y.length;i++){
                list.add(Integer.parseInt(y[i]));
            }
                
                
            
            for(int i=0;i<list.size();i++){
                for(int j=i+1;j<list.size();j++){
                    int kabadi = GCD(list.get(i),list.get(j));
                    if(ans<=kabadi){
                        ans=kabadi;
                    }
                }
            }
            out.println(ans);
            out.flush();
               
                 
            }
           
            
        }
        
    }
    
}
