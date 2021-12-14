/**
 * Java 1. Homework #2
 *
 * @author Dmitry Chivkin
 * @version 12.12.2021
 */
class SecondHomeWork {
    public static void main(String[]args) {
        System.out.println(checkSum(5, 15));
        isPositiveOrNegative(-1);
        System.out.println(trueNegative(0));
        printSomeWords("Hello", -2);
    }
    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    static void isPositiveOrNegative(int a) {
        System.out.println((a >= 0) ? "positive" : "negative");
    }
    static boolean trueNegative(int c) {
        return c < 0 ? true : false;
    }
    static void printSomeWords(String word, int times) {
        for (times = times; times < 5; times++) {
            System.out.println(word + " " + times);
        }
    }
}
