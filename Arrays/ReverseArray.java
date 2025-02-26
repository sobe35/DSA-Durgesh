package Arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr= {23,45,67,87,99,70,11,44};
        for(int i=0; i<arr.length/2; i++){
            int temp = arr[i];
            arr[i] =arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
        System.out.println("Reversed Array is:" +Arrays.toString(arr));
    }
}
