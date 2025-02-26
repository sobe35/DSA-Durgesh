package Arrays;

import java.util.Scanner;



public class LargestElement2 {

    public static  int largestElement(int arr[]){
        int max = arr[0];
        for(int i=0; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = scan.nextInt();
        int [] arr = new int[size] ;
        System.out.println("Enter the elements in the array one by one....:");
        for(int i=0; i<size; i++){
            arr[i] = scan.nextInt();
        }
            int largestvalue= largestElement(arr);
        System.out.println("Largest Element is....:" + largestvalue);
    }
}
