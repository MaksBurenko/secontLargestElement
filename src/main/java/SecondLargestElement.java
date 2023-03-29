import java.util.Arrays;

public class SecondLargestElement {

    public static int calculate(int[] array){
        if(array.length < 2){
            throw new IllegalArgumentException("Array size should be at least 2!!!");
        }
        Arrays.sort(array);
        int SLE = 0;
        for(int i= array.length; i>= array.length-1; i++){
            if(i== array.length-1){
                SLE = array[i];
            }
        }
        return SLE;
    }
}
