import com.training.basic.exercies.FizzBuzz;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by amanurat on 3/30/15 AD.
 */
public class FizzBuzzTest {


    @Test
    public void inputOneItShouldReturnOne() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(1);

        assertEquals("1", result);

    }

    @Test
    public void inputTwoItShouldReturnTwo() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(2);

        assertEquals("2", result);

    }

    @Test
    public void inputThreeItShouldReturnFizz() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(3);

        assertEquals("Fizz", result);

    }


    @Test
    public void inputFourItShouldReturnFour() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.getResult(4);

        assertEquals("4", result);

    }


}
