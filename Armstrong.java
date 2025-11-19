package Recursion ;

public class Armstrong {
    static int power(int num, int pow){
        if (pow==0) {
          return 1;  
        }
        return power(num, pow-1)*num;
    }
    static int CountDigit(int num){
if (num==0) {
    return 0;
}
return 1 + CountDigit(num/10);
    }
    static boolean isArmstrong(int num,int org,int sum,int totalDigit){
        if(num==0){
            return sum== org;
        }
        int lastDigit=num%10;
        sum= sum+ power(lastDigit,totalDigit);
        return isArmstrong(num/10, org, sum, totalDigit);
    }
    static int countArmStrong(int range){
        if (range==0) {
            return 0;
        }
        boolean result = isArmstrong(range, range, 0, CountDigit(range));
        int c= countArmStrong(range-1);
        if (result) {
            c++;
            
        }
        return c;
    }
    public static void main(String[] args) {
        System.out.println(countArmStrong(1000));
    }
}
