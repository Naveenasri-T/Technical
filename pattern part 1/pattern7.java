import java.util.Scanner;
public class pattern7 {


    
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        int i,j;
        
        System.out.println("enter te number");
        int n= scan.nextInt();
        int count;
        for(i=0;i<n;i++){
            count = i+1;

            for(j=0;j<n;j++){
                System.out.print( count ++ + " ");
                
                }
                System.out.println();
                
            }
            
        }
    }

    


    


    

    
