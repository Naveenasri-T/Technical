import java.util.Scanner;
public class hello1 {
    static int a=9;
    static int b=10;
    static{
        System.out.println("hello");
    }
    
    
    void display(){
        System.out.println("display");
    }


    public static void main(String[] args) {
        hello1 h=new hello1();

        
        
        int c = h.a +h.b;
        System.out.println(c);
        h.display();
        

    }
    }
    
