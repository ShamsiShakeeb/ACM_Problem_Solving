import java.util.*;
public class BoyOrGirl {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        Set a = new HashSet();
        
        String x= in.next();
        
        char b[]=new char[x.length()];
        
        b=x.toCharArray();
        
        for(int i=0;i<x.length();i++){
            a.add(b[i]);
        }
        
        if(a.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
        
        
    }
    
}