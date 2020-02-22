

import java.util.HashMap;

import java.util.Scanner;

public class ACM_ICPC_TEAM {
    
    static int TotalTopic(String a , String b){
        char x[] = a.toCharArray();
        char y[] = b.toCharArray();
        boolean visit[] = new boolean[x.length];
        int count=0;
        for(int i=0;i<x.length;i++){
            if(x[i]=='1'){
               visit[i]=true;
               count++;
            }
        }
        for(int i=0;i<y.length;i++){
            if(y[i]=='1' && visit[i]==false){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args){
        
       Scanner in = new Scanner(System.in);
      
       int n = in.nextInt();
       
       int m = in.nextInt();
       
       String topics[] = new String[n];
       
       for(int i=0;i<n;i++){
           topics[i]=in.next();
       }
       int max=0;
       HashMap<Integer,Integer> hm = new HashMap();
       for(int i=0;i<n;i++){
           for(int j=i+1;j<n;j++){
               int point = TotalTopic(topics[i],topics[j]);
               if(hm.get(point)==null){
                   hm.put(point, 1);
               }
               else{
                   int previousPoint = hm.get(point);
                   int newPoint=previousPoint+1;
                   hm.put(point, newPoint);
               }
               if(max<point){
                   max=point;
               }
           }
       }
        System.out.println(max);
        System.out.println(hm.get(max));
        
    }
}
