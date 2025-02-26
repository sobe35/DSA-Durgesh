package Arrays;
// Find the LargestElement From the Given Array.
public class LargestElement {
    public static void main(String[] args) {
        // Define an array of integers
        int arr[] = {34, 55, 67, 88, 99, 50};

        // Initialize largestElement as the first element of the array
        int largestElement = arr[0];
        //
        // Iterate through the array and update largestElement if current element is greater than it
        for(int i=1; i <arr.length; i++){
            //If the current Element is greater than the currentelement ,Update the currentElement.
            if(arr[i] > largestElement){
                // Update the largestElement.
                largestElement = arr[i];
            }
        }
        // Print the largest element in the array.
        System.out.println("Largest Element is:" + largestElement);
    }}