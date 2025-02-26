package Arrays;
import java.util.Arrays;
public class CountElements {
    public static void main(String[] args) {
        
        int [] arr = {2,3,4,5,6,7,9,8,1,0};
      //  System.out.println(arr.length);
      long count=  Arrays.stream(arr).count();
        System.out.println("The Number of Elements in a given Array are:" + count);
    }
}
