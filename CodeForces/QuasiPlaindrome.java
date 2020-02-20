import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class QuasiPlaindrome {

    
    public static void main(String[] args) {
        
          Scanner in =new Scanner(System.in);
          ArrayList one = new ArrayList();
          ArrayList two = new ArrayList();
          int l=0,c=0;
          String x=in.next();
          String y="";
          int k=0;
        
          char a[] = new char[x.length()];
          a=x.toCharArray();
          char b[] = new char[x.length()];
          
          for(int i=a.length-1;i>=0;i--){
              
              b[k]=a[i];
              y +=b[k]+"";
              k++;
          }
          
            char get[]=new char[y.length()];
            get=y.toCharArray();
            
           
             
               for(int i=x.length()-1;i>=0;i--){
                 
                 if(a[i]=='0'){
                     c=i;
                   
                 }
                 else{
                     for(int j=0;j<c;j++){
                     one.add(a[j]);}
                     break;
                    
                 }
             }
             
              for(int i=0;i<x.length();i++){
                    
                    if(get[i]=='0'){
                        l=i;
                       
                    }
                    else{
                        for(int j=l+1;j<x.length();j++){
                        two.add(get[j]);}
                        
                        break;
                        
                    }
    
              }
              
           //   System.out.println(one +" "+two);
              
              if(Arrays.equals(a, get)){
                  System.out.println("YES");
              }
              else{
                  if(one.equals(two)){
                      System.out.println("YES");
                  }
                  else
                      System.out.println("NO");
              }
    
}
}