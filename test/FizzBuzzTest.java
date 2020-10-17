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
        String expected = "Fizz";
        String actual = FizzBuzz.translate(3);
        assertEquals(expected, actual);
    }

}