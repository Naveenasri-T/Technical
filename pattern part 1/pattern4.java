import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int i,j;
        System.out.println("enter te number");
        int n= scan.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*"+ " ");

                }
                else{
                    System.out.print("  ");

                }
                
            }
            System.out.println();
        }
    }

    
}

    

