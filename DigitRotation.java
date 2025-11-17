public class DigitRotation{
    public static void main(String[] args) {
        int num = 12345;
        int temp=num;
        int digit=0;
        int rotation=2;
        int lastDigit=num%(int)Math.pow(10, rotation);
        int remaining= num/(int)Math.pow(10, rotation);
        while(temp>0){
            digit++;
            temp/=10;
        }
        int AfterRotation= lastDigit*(int)Math.pow(10, digit-rotation)+remaining;
        System.out.println("original number "+ num);
        System.out.println("After 2 rotations "+AfterRotation);

    }
}