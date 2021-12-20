/**
 * Java 1. Homework #3
 *
 * @author Dmitry Chivkin
 * @version 15.12.2021
 */
import java.util.Arrays;
 
class ThirdHomeWork {
    public static void main(String[]args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
    }
    static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            arr[0] = 0;
            arr[1] = 1;
            arr[2] = 0;
            arr[3] = 1;
            arr[4] = 1;
            arr[5] = 0;
            }
            System.out.println(Arrays.toString(arr));
    }
    static void fillArray() {
        int[]fill = new int[101];
        for (int i = 0; i < fill.length; i++) {
            fill[i] = i;
        }
        System.out.println(Arrays.toString(fill));
    }
    
    static void changeArray() {
        int[] chan = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(chan));
        for (int i = 0; i < chan.length; i++) {
            if (chan[i] < 6) {
                chan[i] *= 2;
            } 
        }
        System.out.println(Arrays.toString(chan));
    }
    static void fillDiagonal() {
        int [] [] di = new int [5] [5];
        for (int i = 0; i < di.length; i++) {
            di [i] [i] = 1;
        di [i] [di.length - i - 1] = 1;
        }
        for (int i = 0; i < di.length; i++) {
            System.out.println(Arrays.toString(di[i]));
        }
    }

}