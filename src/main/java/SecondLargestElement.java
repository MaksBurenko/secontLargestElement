import java.util.Arrays;

public class SecondLargestElement {

    public static int calculate(int[] array){
        if(array.length < 2){
            throw new IllegalArgumentException("Array size should be at least 2!!!");
        }
        Arrays.sort(array);

        return array[array.length-2];
    }
}
