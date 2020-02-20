import java.util.Scanner;

public class OneTwoThree {
    
    
       public static void main(String[] args){
           
           Scanner in = new Scanner(System.in);
           
           char one[] = {'o','n','e'};
           
           char two[] = {'t','w','o'};
           
           char three[] = {'t','h','r','e','e'};
           
           
           
           int n = in.nextInt();
           
           m:  for(int k=0;k<n;k++){
               
               int o=0,t=0,th=0;
           
           String x = in.next();
           
           char a[]=x.toCharArray();
           
           for(int i=0;i<one.length;i++){
               
              if(a[i]!=one[i]){
                  o++;
              }
           }
           if(o<=1){
               System.out.println(1);
               continue m;
           }
           
            for(int i=0;i<two.length;i++){
               
              if(a[i]!=two[i]){
                  t++;
              }
           }
            
             if(t<=1){
               System.out.println(2);
               continue m;
           }
             
            for(int i=0;i<three.length;i++){
               
              if(a[i]!=three[i]){
                  th++;
              }
           }
            
              if(th<=1){
               System.out.println(3);
               continue m;
           }
           
           
        }
       }
    
}
