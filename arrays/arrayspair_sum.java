
import java.util.*;
public class arrayspair_sum {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter :");
            int N=scanner.nextInt();
            int []arr= new int[N];
            System.out.println("enter :");
            for(int i=0;i<N;i++){
                arr[i]=scanner.nextInt();
            }
            System.out.println("enter :");
            int k=scanner.nextInt();
            int c=0;
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i] +arr[j]==k){
                    System.out.println(arr[i] +" "+arr[j]);
                    c++;
                }
            }
            if(c==0){
                System.out.println("No pair found ");
            }

            }


        
    }
    
}
