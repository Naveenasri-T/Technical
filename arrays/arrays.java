
import java.util.*;
public class arrays {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
            int N=scanner.nextInt();
            int []arr= new int[N];
            for(int i=0;i<N;i++){
                arr[i]=scanner.nextInt();
            }
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    System.out.println(arr[i] +" "+arr[j]);
                }

            }


        
    }
    
}
