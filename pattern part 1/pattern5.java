import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int i,j;
        int count=1;
        System.out.println("enter te number");
        int n= scan.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(count <10){
                    System.out.print("0");
                }
                System.out.print(count ++ + " ");
            }
            System.out.println();
        }
    }

    
}

    

