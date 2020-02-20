import java.util.*;

public class CommonChild {
    
    static Scanner in =new Scanner(System.in);
 //   static int fi=0;
 ///   static int max=0;
    
  static   int lcs( Object[] X, Object[] Y, int m, int n )
  {
    int L[][] = new int[m+1][n+1];
 
    /* Following steps build L[m+1][n+1] in bottom up fashion. Note
         that L[i][j] contains length of LCS of X[0..i-1] and Y[0..j-1] */
    for (int i=0; i<=m; i++)
    {
      for (int j=0; j<=n; j++)
      {
        if (i == 0 || j == 0)
            L[i][j] = 0;
        else if (X[i-1] == Y[j-1])
            L[i][j] = L[i-1][j-1] + 1;
        else
            L[i][j] = max(L[i-1][j], L[i][j-1]);
      }
    }
  return L[m][n];
  }
 
  /* Utility function to get max of 2 integers */
  static int max(int a, int b)
  {
    return (a > b)? a : b;
  }
    
    public static void main(String[] args){
        
        String x = in.next();
        String y = in.next();
      //  int count=0;
      //  boolean svr=false;
       // ArrayList result=new ArrayList();
      //  ArrayList temp3=new ArrayList();
        char a[];
        char b[];
        
        a=x.toCharArray();
        b=y.toCharArray();
        
        
        
        
        ArrayList c = new ArrayList();
        ArrayList d = new ArrayList();
        ArrayList temp1=new ArrayList();
        ArrayList temp2=new ArrayList();
       
        
        for(int i=0;i<x.length();i++){
            c.add(a[i]);
            temp2.add(a[i]);
        }
        
        for(int i=0;i<y.length();i++){
            d.add(b[i]);
            temp1.add(b[i]); 
            ///temp3.add(b[i]);
           
        }
        
        temp2.removeAll(d);
        c.removeAll(temp2);
        
        d.removeAll(c);
        temp1.removeAll(d);
    ///    temp3.removeAll(d);
       
       
        
     //   System.out.println(temp1 +" "+c);
        
        Object lol[] = temp1.toArray(new Object[temp1.size()]);
        Object lol1[] = c.toArray(new Object[c.size()]);
        
        System.out.println(lcs(lol,lol1,lol.length,lol1.length));
        
    /*   if(temp1.equals(c)){
            System.out.println(temp1.size());
            return;
        }
     
        
      //  System.out.println(temp1.indexOf('N'));
        
        Object ob[] = c.toArray(new Object[c.size()+1]);
       
        
        for(int i=0;i<c.size();i++){
            
           
          
            if(svr==false){
            if(temp1.contains(ob[i])){
                fi=temp1.indexOf(ob[i]);
                svr=true;
                count++;
                result.add(count);
                temp1.remove(temp1.indexOf(ob[i]));
                i++;
             ///   System.out.println(temp1);
            }}
            if(svr==true){
                    
                if(fi <=temp1.indexOf(ob[i])){
                 count++;
                 result.add(count);
                 fi =temp1.indexOf(ob[i]);
                 temp1.remove(temp1.indexOf(ob[i]));  
                  
                }
                else{
                  count=1;
                  svr=false;
                  result.add(count);
                  temp1.clear();
                  temp1.addAll(temp3);
                 
                }
                
                
              
            }
           
            
        }
        
        
       
          Collections.sort(result,Collections.reverseOrder());

          Object ob1[] = result.toArray(new Object[result.size()]);
          
          System.out.println(ob1[0]); 
       
       
       */
        
    }
    
}


