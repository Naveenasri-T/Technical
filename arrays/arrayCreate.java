import java.util.*;
public class arrayCreate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
            int N=scanner.nextInt();
            int []arr=new int[N];
            for(int i=0;i<N;i++){
                arr[i]=scanner.nextInt();
            }
            for( int i=0;i<arr.length;i++){
                System.out.print(arr[i] +" ");
            }

        }
    }
    

