
 import java.util.Scanner;

 public class Alphabet{
     public static void main(String[] args) {
         Scanner scanner= new Scanner(System.in);
         System.out.println("Enter Character");
         char c = scanner.next().charAt(0);
         if(c>='a' && c<='z'){
         if(c == 'a'|| c== 'e' || c=='i'  c=='o' || c=='u') {
         System.out.println("Vowel");}
         else{
         System.out.println("Consonant");}
         }
         else{
             System.out.println("Not a Valid Character");
         }




     }
 }