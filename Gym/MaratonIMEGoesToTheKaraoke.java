import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MaratonIMEGoesToTheKaraoke {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        String x = in.next();
        
        int count[] = new int[x.length()+1];
        
        char a[] = x.toCharArray();
        
        String res[]=new String[x.length()+1];
        
        for(int i=0;i<x.length();i++){
            res[i]="";
        }
        
        char temp[] = {'A', 'B', 'C','D', 'E', 'F','G'};
        
        int A=0,B=0,C=0,D=0,E=0,F=0,G=0;
        
        boolean a1=false,b=false,c=false,d=false,e=false,f=false,g=false;
        
        int cl=0;
        
       
         for(int i=0;i<a.length;i++){
             
             if(a[i]==temp[0]){
                 if(a1==true){ res[i-1]=""; 
                     A=A;}
                 else
                     A=0;
  
                 A=A+1;
                 res[i]=a[i]+""+A;
                 cl=i;
                  a1=true;
                  b=false;
                  c=false;
                  d=false;
                  e=false;
                  f=false;
                  g=false;
             }
             
           else  if(a[i]==temp[1]){
               
                if(b==true){res[i-1]=""; 
                     B=B;}
                 else
                     B=0;
               
                 B++;
                 res[i]=a[i]+""+B;cl=i;
                  a1=false;
                   b=true;
                  c=false;
                  d=false;
                  e=false;
                  f=false;
                  g=false;
             }
             
          else   if(a[i]==temp[2]){
               if(c==true){res[i-1]=""; 
                     C=C;}
                 else
                     C=0;
              
                 C++;
                 res[i]=a[i]+""+C;cl=i;
                  a1=false;
                  b=false;
                 c=true;
                  d=false;
                  e=false;
                  f=false;
                  g=false;
             }
             
          else   if(a[i]==temp[3]){
              
              if(d==true){res[i-1]=""; 
                     D=D;}
                 else
                     D=0;
              
                 D++;
                 res[i]=a[i]+""+D;cl=i;
                  a1=false;
                  b=false;
                  c=false;
                  d=true;
                  e=false;
                  f=false;
                  g=false;
             }
             
          else   if(a[i]==temp[4]){
               if(e==true){res[i-1]=""; 
                     E=E;}
                 else
                     E=0;
              
                 E++;
                 res[i]=a[i]+""+E;cl=i;
                 a1=false;
                  b=false;
                  c=false;
                  d=false;
                 e=true;
                  f=false;
                  g=false;
                 
             }
             
           else  if(a[i]==temp[5]){
               
                 if(f==true){res[i-1]=""; 
                     F=F;}
                 else
                     F=0;
               
                 F++;
                 res[i]=a[i]+""+F;cl=i;
                 a1=false;
                  b=false;
                  c=false;
                  d=false;
                  e=false;
                  f=true;
                  g=false;
             }
             
           else  if(a[i]==temp[6]){
                if(g==true){res[i-1]=""; 
                     G=G;}
                 else
                     G=0;
               
                 G++;
                 res[i]=a[i]+""+G;cl=i;
                 a1=false;
                  b=false;
                  c=false;
                  d=false;
                  e=false;
                  f=false;
                  g=true;
             }
         }
         for(int i=0;i<x.length();i++){
             System.out.print(res[i]);
         }
        
        
    }
}
