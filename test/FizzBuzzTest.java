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

    @Test
    @DisplayName("5 to Buzz")
    void testBuzz() {
        String expected = "Buzz";
        String actual = FizzBuzz.translate(5);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("15 to FizzBuzz")
    void testFizzBuzz() {
        String expected = "FizzBuzz";
        String actual = FizzBuzz.translate(15);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("2 to Hai")
    void test2toHai() {
        int number = 2;
        String expected = "Hai";
        String actual = FizzBuzz.translate(number);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("26 to Hai Sau")
    void test26toHaiSau() {
        int number = 26;
        String expected = "Hai Sau";
        String actual = FizzBuzz.translate(number);
        assertEquals(expected, actual);
    }

}