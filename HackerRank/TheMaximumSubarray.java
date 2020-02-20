import java.util.*;


public class TheMaximumSubarray {
    
    
    static Scanner in = new Scanner(System.in);
    
    
    public static void main(String[] args){
        
        int n = in.nextInt();
        int theArray[];
        boolean svr=false,svr1=false;
        int sum=0,max=0,subseq=0;
        ArrayList result = new ArrayList();
        ArrayList result1=new ArrayList();
        
        for(int i=0;i<n;i++){
            
            
               int data = in.nextInt();
               theArray=new int[data];
               
               for(int j=0;j<data;j++){
                   theArray[j]=in.nextInt();
               }
               
            
               
               for(int j=0;j<data;j++){
                   
                   if(svr==false){
                   if(theArray[j] > 0){
                       svr=true;
                       
                   }}
                   if(svr==true){
                       sum += theArray[j];
                       if(sum < 0)
                           sum=0;
                       
                       if(max<sum){
                           max=sum;
                         
                       }
                   }
                   
                   if(theArray[j] > 0){
                       subseq += theArray[j];
                       svr1=true;
                   }
                   
                   
               }
               if(svr1==false){
                   
                   Arrays.sort(theArray);
                   subseq=theArray[theArray.length-1];
               }
               
               if(svr==false){
                   Arrays.sort(theArray);
                   max=theArray[theArray.length-1];
               }
               
               result.add(max);
               result1.add(subseq);
               subseq=0;
               max=0;
               sum=0;
               svr=false;
               svr1=false;
              
        }
        
      //  System.out.println(result);
      //  System.out.println(result1);
        
        Object ob[] = result.toArray(new Object[result.size()]);
        Object ob1[] = result1.toArray(new Object[result1.size()]);
        
        for(int i=0;i<result.size();i++){
            
            System.out.println(ob[i] +" "+ob1[i]);
        }
    }
    
}
