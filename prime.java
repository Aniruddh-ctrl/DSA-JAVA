public class prime{
    public static void main(String[] args) {
        int num= 45465463;
for (int i = 2; i*i <=num; i++) {
    if(num%i==0){
        System.out.println("not prime");
        return;
    } }
    System.out.println("prime");



//         int factor= 0;
//         for (int i = 1; i <= num; i++) {
//             if (num % i==0){
//                 factor++;}
//             }
// if (factor==2){
//     System.out.println("prime number");
// }
// else{
//     System.out.println("not prime number");
// }
            
        
    }
}