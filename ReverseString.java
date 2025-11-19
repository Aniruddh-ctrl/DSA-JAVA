package Recursion;

public class ReverseString {
    static String reverse(String str){
        if(str.length()==0){
            return"";
        }
       String oldResult= reverse(str.substring(1));
       char newResult= str.charAt(0);
       return oldResult+newResult;

    }
    public static void main(String[] args) {
        String rev = reverse("ani");
        System.out.println(rev);
    }
}
