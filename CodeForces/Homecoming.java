import java.util.ArrayList;
import java.util.Scanner;

public class Homecoming {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        m: for(int j=0;j<t;j++){
        
        int a = in.nextInt();
        
        int b = in.nextInt();
        
        int c = in.nextInt();
        
        String s = in.next();
        
        ArrayList<String> list = new ArrayList();
        ArrayList<Integer> taka = new ArrayList();
        
        if(a>c && b>c){
            System.out.println(s.length());
            continue m;
        }
        else{
            int count=1;
            
            char x[] = s.toCharArray();
            char kabadi=x[0]; int suru=0;
            for(int i=0;i<x.length;i++){
                if(kabadi!=x[i]){
                    if(x[i]=='A'){
                        list.add(suru+1 +"-"+(i+1));
                        suru=i;
                        taka.add(b);
                        kabadi=x[i];
                    }
                    else if(x[i]=='B'){
                        list.add((suru+1) +"-"+(i+1));
                        suru=i;
                        taka.add(a);
                        kabadi=x[i];
                    }
                }
            }
            int lastIndex=0;
            try{
            lastIndex=Integer.parseInt(list.get(list.size()-1).split("-")[1]);}
            catch(Exception e){
                lastIndex=1;
            }
            if(lastIndex!=s.length()){
                if(x[lastIndex-1]=='A'){
                    taka.add(a);
                    list.add(lastIndex +"-"+s.length());
                }
                else if(x[lastIndex-1]=='B'){
                    taka.add(b);
                    list.add(lastIndex +"-"+s.length());
                }
            }
            
        }
     //   System.out.println(taka);
      //  System.out.println(list);
        int cost=0;
        int hataSuru=0;
        for(int i=taka.size()-1;i>=0;i--){
            cost+=taka.get(i);
            if(c<cost){
                hataSuru=i;
                break;
            }
        }
        
        if(c-cost >= 0){
            System.out.println(1);
        }
        
        else
        System.out.println(Integer.parseInt(list.get(hataSuru).split("-")[1]));
        
        }
    }
    
}
