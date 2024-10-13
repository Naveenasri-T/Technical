package triangle_pattern;

import java.util.Scanner;

public class triangle4 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int i,j,k;
        
        System.out.println("enter te number");
        int n= scan.nextInt();
        for(i=1;i<=n;i++){
            for(k=1;k<=n-i;k++){
                System.out.print(" ");

             }
                for(j=1;j<=i;j++){
                
                System.out.print( "*  ");
            }
                System.out.println();
        }
    }

    
}

    


    




    


    

