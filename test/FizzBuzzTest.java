import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 3:03 PM
 */
class FizzBuzzTest {

    @Test
    @DisplayName("3 to Fizz")
    void testFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expected = "fizz";
        String actual = fizzBuzz.translate(3);
        assertEquals(expected, actual);
    }

}