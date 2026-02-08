import java.util.Scanner;
public class SwitchExample{
    public static void main(String []args){
    Scanner ab = new Scanner(System.in);
    int a;
    System.out.print("Enter a Number :");
    a = ab.nextInt();
    switch(a){    
    case 1 : System.out.print("case 1 passed");
        break;
    case 2 : System.out.print("case 2 passed");
        break;
    default : System.out.print("default passed");
        break;
    }
   
    ab.close();
   
    }

}