package Arrays;

public class SumElements {
    public static void main(String[] args) {
        int[] arr = {32, 4, 76, 44, 99, 6};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

        }
        System.out.println("Sum of Elements of Array is... : " + sum);
    }
}