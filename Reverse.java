
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter your number :");
        int n = scanner.nextInt();
        int rev=0;
        scanner.close();
        while (n>0) {
            int digit= n%10;
            rev=rev*10+digit;
            n=n/10; 
            digit++;     
        }
        System.out.println("Reverse of number is : "+ rev);
    }
    
}
