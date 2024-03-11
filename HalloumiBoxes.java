import java.util.*;

public class HalloumiBoxes{

    public static boolean isSorted(int[] a) 
{
    
    for(int i = 0; i < a.length-1; i ++){
        if (a[i] >a[i+1]) 
        {
            
            return false;
            
        } 

    }
    return true;
}
    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);


        int a=sc.nextInt();
       

        while(a--!=0){

           int  size=sc.nextInt();
           int   k=sc.nextInt();
      
           int arr[]=new int[size];
           
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }



            if(k==1&&!isSorted(arr)){
                
               
                System.out.println("NO");
    
            }
            else
            {
                System.out.println("YES");
            }


        }






    }
}