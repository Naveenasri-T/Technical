import java.util.*;
public class even_multiplesarray {
   
  
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
                int N=scanner.nextInt();
                int []arr=new int[N];
                for(int i=0;i<N;i++){
                    arr[i]=scanner.nextInt();
                }
                for( int i=0;i<arr.length;i++){
                    if(arr[i]%2==0 && arr[i]%3==0){

                    
                    System.out.print(arr[i] +" ");
                }
    
            } 
    
        } 
}
