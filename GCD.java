
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First Number :");
        int n1= sc.nextInt();
        System.out.println("Enter Second Number :");
        int n2= sc.nextInt();
        sc.close();
        while (n2!=0) {
            int temp=n2;
            n2=n1%n2;
            n1=temp; 
        }
        System.out.println("GCD is :" + n1);
    }
    
}
