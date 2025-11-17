public class SwapFirstLast{
    public static void main(String[] args) {
        int num = 72456;
        int temp= num;
         int lastDigit= num%10;
         int digit=0;
        while(temp>0){
        temp=temp/10;
        digit++;
         }
         int first= num/(int)Math.pow(10, digit-1);
         int middle= num%(int)Math.pow(10, digit-1);
         middle=middle/10;
         int swapped = lastDigit*(int)Math.pow(10, digit-1)+middle*10+first;
         System.out.println("original number "+num);
         System.out.println("number after swapping "+ swapped);
    }
}