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
        System.out.println(trueNegative(-1));
        printSomeWords();
    }

    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void isPositiveOrNegative(int a) {
       System.out.println((a >= 0) ? "positive" : "negative");
    }
    
        static boolean trueNegative(int c) {
        if (c < 0) {
            return true;
        } else {
            return false;
        }
    }
    
    static void printSomeWords() {
            for (int i = 0; i < 11; i++) {
            System.out.println("Hello");
        }
    }
}
