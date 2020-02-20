import static java.lang.Math.abs;
import java.util.ArrayList;

import java.util.Scanner;

public class SherlockAndTheValidString {
    
    static int lol=0;
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int dif=0;
        String ans="";
        
        String x = in.next();
        
        char a[] = x.toCharArray();
        
        int visit[] = new int[123];
        int count=0;
        for(int i=0;i<a.length;i++){
          count++;
          visit[(int)a[i]]+=count;
          count=0;
  
        }
        boolean visit1[] = new boolean[123];
        ArrayList cx = new ArrayList();
        for(int i=0;i<a.length;i++){
        if(visit1[(int)a[i]]==false){
          //  System.out.println(a[i]+" = "+visit[(int)a[i]]);
            cx.add(visit[(int)a[i]]);
            visit1[(int)a[i]]=true;
            }
        }
        boolean svr=true;
        boolean bugi[] = new boolean[100001];
        bugi[(int)cx.get(0)]=true;
        
        for(int i=0;i<cx.size()-1;i++){
            
            
            if(abs((int)cx.get(i)- (int)cx.get(i+1))>=2){
                    svr=false;
                    ans=("NO");
            }
           
            if(bugi[(int)cx.get(i)]==false){
                dif=(int)cx.get(i);
                lol++;
                if(lol==2){
                    svr=false;
                    ans=("NO");
                    break;
                }
            }
        }
       
        if(bugi[(int)cx.get(cx.size()-1)]==false){
                dif=(int)cx.get(cx.size()-1);
                lol++;
                if(lol==2){
                    svr=false;
                    ans=("NO");
                }
            }
       // System.out.println(lol);
        if(svr==true){
            ans=("YES");
        }
        else{
            if(lol==1 && dif==1){
                ans="YES";
            }
        }
        System.out.println(ans);
       
        
        
    }
}
