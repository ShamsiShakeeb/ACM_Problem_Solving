import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Triangle {
    
    
      public static void main(String[] args){
          
          Scanner in = new Scanner(System.in);
          
          int first[] = new int[3];
          
          int sec[] = new int[3];
          
          ArrayList a = new ArrayList();
          
          ArrayList b = new ArrayList();
          
          
          for(int i=0;i<3;i++){
              first[i]=in.nextInt();
              a.add(first[i]);
          }
          
          
           for(int i=0;i<3;i++){
              sec[i]=in.nextInt();
              b.add(sec[i]);
          }
          
           
           Collections.sort(a);
           Collections.sort(b);
           
           if((int)a.get(0)==(int)b.get(0) && (int)a.get(2)==(int)b.get(2)  && (int)a.get(1)==(int)b.get(1)){
               
               boolean svr=false;
               
               boolean svr1=false;
               
               if(((int)a.get(0)*(int)a.get(0))+((int)a.get(1)*(int)a.get(1))==((int)a.get(2)*(int)a.get(2))){
                  // System.out.println(((int)a.get(0)*(int)a.get(0))+((int)a.get(1)*(int)a.get(1))==((int)a.get(2)*(int)a.get(2)));
                   svr=true;
               }
               if(((int)b.get(0)*(int)b.get(0))+((int)b.get(1)*(int)b.get(1))==((int)b.get(2)*(int)b.get(2))){
                 //  System.out.println(((int)b.get(0)*(int)b.get(0))+((int)b.get(1)*(int)b.get(1))==((int)b.get(2)*(int)b.get(2)));
                   svr1=true;
               }
               if(svr==true && svr1==true){
                   //System.out.println(((int)a.get(0)*(int)a.get(0))+((int)a.get(1)*(int)a.get(1))==((int)a.get(2)*(int)a.get(2)));
                   System.out.println("YES");
               }
               else{
                   System.out.println("NO");
               }
               
           }
           else{
               System.out.println("NO");
           }
      }
}