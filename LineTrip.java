import java.util.*;
public class LineTrip {
    public static void main(String [] args){
          Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
      
        while(t-->0)
        {
            int last=0;
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();

            }
            int max=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++)
            {
                max=Math.max(max,arr[i]-last);
                last=arr[i];

            }
            max=Math.max(max,2*(x-last));
            System.out.println(max);
        }
        
    }
    
}
