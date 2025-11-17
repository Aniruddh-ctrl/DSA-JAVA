
 import java.util.Scanner;

 public class AbsoluteDiff {
     public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
         System.out.println("Enter First Number");
         int n1 = scanner.nextInt();
       System.out.println("Enter Second Number");
         int n2= scanner.nextInt();
         int diff= n1-n2;
         int AbsoluteDiff= Math.abs(diff);
         System.out.println("Absolute difference is  : "+ AbsoluteDiff);

     }
 }
