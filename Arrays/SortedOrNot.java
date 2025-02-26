package Arrays;

import java.util.Arrays;

public class SortedOrNot {
    public static void main(String[] args) {
        int [] arr = {3,2,4,5,6};
        boolean isSorted = true;
        for(int i=0; i< arr.length - 1; i++){
            if(arr[i] < arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("Array is sorted..." + Arrays.toString(arr));
        }else{
            System.out.println("Arrays is Not sorted.." + Arrays.toString(arr));
        }
    }
}
