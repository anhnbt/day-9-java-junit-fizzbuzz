/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 2:59 PM
 */
public class FizzBuzz {
    public FizzBuzz() {}
    public static String translate(int number) {
        return (number % 3 == 0) ? "Fizz" : String.valueOf(number);
    }
}
