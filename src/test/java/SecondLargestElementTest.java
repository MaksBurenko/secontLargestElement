import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class SecondLargestElementTest {

    @Test
    public void calculate1() {
        int[] array = {3,2,7,4};
        assertThat(SecondLargestElement.calculate(array), is(4));
    }
    @Test
    public void calculate2() {
        int[] array = {8,2,7,4,12,9,3,5};
        assertThat(SecondLargestElement.calculate(array), is(9));
    }
}
