package triangle_pattern;

import java.util.Scanner;

public class triangle2 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int i,j;
        
        System.out.println("enter te number");
        int n= scan.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                
                System.out.print( j+ " ");
            }
            System.out.println();
        }
    }

    
}

    


    




    


    

