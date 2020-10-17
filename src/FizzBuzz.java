/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 2:59 PM
 */
public class FizzBuzz {
    public FizzBuzz() {}
    public static String translate(int number) {
        if (isFizz(number) && isBuzz(number)) {
            return "FizzBuzz";
        }
        if (isFizz(number)) {
            return "Fizz";
        }
        if (isBuzz(number)) {
            return "Buzz";
        }
        return "Hai";
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
