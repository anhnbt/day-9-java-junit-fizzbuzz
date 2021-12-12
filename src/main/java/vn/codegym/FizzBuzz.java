package vn.codegym;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/17/2020
 * Time: 2:59 PM
 */
public class FizzBuzz {
    private FizzBuzz() {
        throw new IllegalStateException("FizzBuzz class");
    }

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
        return numberToWorld(number);
    }

    private static String numberToWorld(int number) {
        String numberToWorld = "";
        int unit = number % 10;
        int tens = (number % 100) / 10;
        if (number > 10) {
            switch (tens) {
                case 1:
                    numberToWorld += "Muoi ";
                    break;
                case 2:
                    numberToWorld += "Hai ";
                    break;
                case 3:
                    numberToWorld += "Ba ";
                    break;
                case 4:
                    numberToWorld += "Bon ";
                    break;
                case 5:
                    numberToWorld += "Nam ";
                    break;
                case 6:
                    numberToWorld += "Sau ";
                    break;
                case 7:
                    numberToWorld += "Bay ";
                    break;
                case 8:
                    numberToWorld += "Tam ";
                    break;
                case 9:
                    numberToWorld += "Chin ";
                    break;
                default:
                    numberToWorld = String.valueOf(number);
            }
        }
        switch (unit) {
            case 1:
                numberToWorld += "Mot";
                break;
            case 2:
                numberToWorld += "Hai";
                break;
            case 3:
                numberToWorld += "Ba";
                break;
            case 4:
                numberToWorld += "Bon";
                break;
            case 5:
                numberToWorld += "Nam";
                break;
            case 6:
                numberToWorld += "Sau";
                break;
            case 7:
                numberToWorld += "Bay";
                break;
            case 8:
                numberToWorld += "Tam";
                break;
            case 9:
                numberToWorld += "Chin";
                break;
            default:
                numberToWorld = String.valueOf(number);
        }
        return numberToWorld;
    }

    private static boolean isFizz(int number) {
        return number % 3 == 0;
    }

    private static boolean isBuzz(int number) {
        return number % 5 == 0;
    }
}
