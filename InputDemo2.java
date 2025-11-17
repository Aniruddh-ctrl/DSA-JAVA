
import java.io.File;
import java.util.Scanner;

public class InputDemo2{
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(new File("C:\\Users\\kumar\\.vscode\\DSA JAVA\\InputDemo2.java"));
       // Scanner scanner = new Scanner("hello world");
        int wordCount=0;
        while(scanner.hasNext()){
            wordCount++;
            System.out.println(scanner.next());
        }   
        System.out.println("Total Words "+wordCount);
        scanner.close();
         }
}