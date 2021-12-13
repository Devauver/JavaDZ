/**
 * Java 1. Homework #1
 *
 * @author Dmitry Chivkin
 * @version 11.12.2021
 */
class FirstHomeWork {
    public static void main(String[]args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = -20;
        int b = 20;
        System.out.println((a + b >= 0) ? "Sum positive" : "Sum negative");
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value >= 101) {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 30;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
