import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
public class Complixity {

    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        ArrayList s = new ArrayList();
        
        String x = in.next();
        
        char a[] = x.toCharArray();
        
        ArrayList list[] = new ArrayList[26];
        
        for(int i=0;i<=25;i++){
            list[i]=new ArrayList();
        }
        
        
        HashSet hs = new HashSet();
        
        HashSet boom = new HashSet();
        
        boolean svr = true;
        
        for(int i=0;i<a.length;i++){
            
            if(hs.add(a[i])==false){
                svr=false;
                hs.clear();
                break;
            }
            
        }
        if(svr==true){
            
       
            System.out.println(hs.size()-2);
        }
        else{
            
            for(int i=0;i<a.length;i++){
                hs.add(a[i]);
                s.add(a[i]);
            }
            if(hs.size()==1 || hs.size()==2){
                System.out.println(0);
            }
            else{
            
            
            for(int i=0;i<a.length;i++){
                
                if(a[i]=='a'){
                    list[0].add(a[i]);
                }
               else if(a[i]=='b'){
                    list[1].add(a[i]);
                }
               else if(a[i]=='c'){
                    list[2].add(a[i]);
                }
              else  if(a[i]=='d'){
                    list[3].add(a[i]);
                }
              else  if(a[i]=='e'){
                    list[4].add(a[i]);
                }
               else if(a[i]=='f'){
                    list[5].add(a[i]);
                }
             else   if(a[i]=='g'){
                    list[6].add(a[i]);
                }
             else   if(a[i]=='h'){
                    list[7].add(a[i]);
                }
              else  if(a[i]=='i'){
                    list[8].add(a[i]);
                }
              else  if(a[i]=='j'){
                    list[9].add(a[i]);
                }
              else  if(a[i]=='k'){
                    list[10].add(a[i]);
                }
               else if(a[i]=='l'){
                    list[11].add(a[i]);
                }
               else if(a[i]=='m'){
                    list[12].add(a[i]);
                }
             else   if(a[i]=='n'){
                    list[13].add(a[i]);
                }
             else   if(a[i]=='o'){
                    list[14].add(a[i]);
                }
             else   if(a[i]=='p'){
                    list[15].add(a[i]);
                }
              else  if(a[i]=='q'){
                    list[16].add(a[i]);
                }
              else  if(a[i]=='r'){
                    list[17].add(a[i]);
                }
             else   if(a[i]=='s'){
                    list[18].add(a[i]);
                }
              else  if(a[i]=='t'){
                    list[19].add(a[i]);
                }
              else  if(a[i]=='u'){
                    list[20].add(a[i]);
                }
              else  if(a[i]=='v'){
                    list[21].add(a[i]);
                }
              else  if(a[i]=='w'){
                    list[22].add(a[i]);
                }
              else  if(a[i]=='x'){
                    list[23].add(a[i]);
                }
             else   if(a[i]=='y'){
                    list[24].add(a[i]);
                }
              else  if(a[i]=='z'){
                    list[25].add(a[i]);
                }
                
                
                
            }
            boolean visit[]=new boolean[101];
              int bagha = 200;
               int kancha=0;
               int count=0;
            for(;;){
              //System.out.println(count+"puu");
                 for(int i=0;i<=25;i++){
                    
                    if(visit[i]==false){
                    if(list[i].size()!=0){
                        if(list[i].size()<bagha){
                            kancha=i;
                            bagha=list[i].size();
                        }
                    }
                    }
                }
                count += list[kancha].size();
                s.removeAll(list[kancha]);
                
                for(int i=0;i<s.size();i++){
                    boom.add(s.get(i));
                }
                if(boom.size() ==2 || boom.size()==1){
                    System.out.println(count);
                    break;
                }
                else{
                   visit[kancha]=true;
                   bagha = 200;
                   kancha=0;
                   boom.clear();
                }
            }
            }
        }
        
        
    }
    
}
