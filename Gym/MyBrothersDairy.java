import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyBrothersDairy {
    
    
    public static void main(String[] args){
        
        
        Scanner in = new Scanner(System.in);
        
        int hg=in.nextInt();
        in.nextLine();
        
        m: for(int ss=0;ss<hg;ss++){
      
        
            
            
        String x = in.nextLine();
        
        
        
        ArrayList list[] = new ArrayList[26];
        
        for(int i=0;i<26;i++){
            list[i]=new ArrayList();
           
        }
        
        char a[]=x.toCharArray();
        
        for(int i=0;i<a.length;i++){
            
            if(a[i]!=' '){
            if(a[i]=='A'){
                list[0].add(a[i]);
            }
            else if(a[i]=='B'){
                list[1].add(a[i]);
            }
             else if(a[i]=='C'){
                list[2].add(a[i]);
            }
              else if(a[i]=='D'){
                list[3].add(a[i]);
            }
              else  if(a[i]=='E'){
                list[4].add(a[i]);
            }
               else  if(a[i]=='F'){
                list[5].add(a[i]);
            }
                else  if(a[i]=='G'){
                list[6].add(a[i]);
            }
                else   if(a[i]=='H'){
                list[7].add(a[i]);
            }
                 else   if(a[i]=='I'){
                list[8].add(a[i]);
            }
                  else   if(a[i]=='J'){
                list[9].add(a[i]);
            }
                  else    if(a[i]=='K'){
                list[10].add(a[i]);
            }
                   else    if(a[i]=='L'){
                list[11].add(a[i]);
            }
                     else   if(a[i]=='M'){
                list[12].add(a[i]);
            }
                     else    if(a[i]=='N'){
                list[13].add(a[i]);
            }
                     else     if(a[i]=='O'){
                list[14].add(a[i]);
            }
                       else    if(a[i]=='P'){
                list[15].add(a[i]);
            }
                       else     if(a[i]=='Q'){
                list[16].add(a[i]);
            }
                       else      if(a[i]=='R'){
                list[17].add(a[i]);
            }
                        else      if(a[i]=='S'){
                list[18].add(a[i]);
            }
                       else        if(a[i]=='T'){
                list[19].add(a[i]);
            }
                       else         if(a[i]=='U'){
                list[20].add(a[i]);
            }
                        else         if(a[i]=='V'){
                list[21].add(a[i]);
            }
                        else          if(a[i]=='W'){
                list[22].add(a[i]);
            }
                        else           if(a[i]=='X'){
                list[23].add(a[i]);
            }
                else      if(a[i]=='Y'){
                list[24].add(a[i]);
            }
                     else                if(a[i]=='Z'){
                list[25].add(a[i]);
            }
                                   
            }               
        }
        
       
        ArrayList temp = new ArrayList();
        for(int i=0;i<26;i++){
            temp.add(list[i].size());
        }
        Collections.sort(temp, Collections.reverseOrder());
        int kabadi = (int) temp.get(0);
        temp.remove(0);
      
         if(temp.contains(kabadi)){
             System.out.println("NOT POSSIBLE");
             
             
             continue m;
         }
       
       int bagha = 0;
        int dis=0;
         for(int i=0;i<26;i++){
           // System.out.println(list[i].size());
            if(list[i].size()>bagha){
                bagha=list[i].size();
                dis=i;
            }
            
           
        }
       int n=abs(dis+65)-69;
       if(n>=0)
        System.out.print(n+" ");
       else{
           System.out.print((n=n+26)+" ");
       }
        for(int i=0;i<a.length;i++){
            
            
            if(a[i]==' '){
               System.out.print(" "); 
            }
            else{
            int haga = (int)a[i]-n;
           
            if(haga<65){
               
                System.out.print((char)(90-(65-haga-1)));
                
            }
            
            else
            System.out.print((char)haga);
            }
        }
      
        System.out.println();
        }  
    }
    
}
