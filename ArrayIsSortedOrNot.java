package Recursion;
public class ArrayIsSortedOrNot{
    static boolean isSorted(int arr[],int index){
if(index== arr.length-1){
    return true;

}
if (arr[index]>arr[index+1]){
    return false;
}
return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[]={10,90,100,200,2};
       System.out.println( isSorted(arr, 0)?"sorted":"unsorted");
    }
}