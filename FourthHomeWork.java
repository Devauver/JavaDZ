/**
 * Java 1. Practice
 *
 * @author Dmitry Chivkin
 * @version 12.12.2021
 */
import java.util.Random;
import java.util.Scanner;

 class FourthHomeWork {
        // TicTacToe (крестики нолики);
    // 1.Ячейки поля
    final char SIGN_EMPTY = '*';
    final char SIGN_X = 'X';
    final char SIGN_O = 'O';
    
    // 2.Создание игрового поля
    char [][] table;
    
    Scanner sc;
    Random random;
    
    public static void main(String[] args) {
        FourthHomeWork ttt = new FourthHomeWork();
        ttt.game();
    }
    // 2.1 конструктор
    FourthHomeWork() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
    }
    
    void game() {
        initTable();
        printTable();
    // 3.цикл хода человека
        while (true) {
            turnHuman();
            if (isWin(SIGN_X)) {
                System.out.println("YOU WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW...");
                break;
            }
    // 4. цикл хода робота
            turnAi();
            printTable();
            if (isWin(SIGN_O)) {
                System.out.println("AI WON!");
                break;
            }
            if (isTableFull()) {
                System.out.println("SORRY, DRAW...");
                break;
            }
        }
        printTable();
    }
    
    // 5.роспись основных методов
    void initTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                table[y][x] = SIGN_EMPTY;
            }
            
        }
    }
    
    void printTable() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                System.out.print(table[y][x] + " ");
            }
            System.out.println();
        }
    } 
    
    void turnHuman() {
        int x, y;
        do {
            System.out.print("Enter x y [1..3]:");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        table [y][x] = SIGN_X;
    }
    
    void turnAi() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isCellValid(x, y));
        table [y][x] = SIGN_O;
    }
    
    boolean isCellValid(int x, int y) {
        if (x < 0 || y < 0 || x > 2 || y > 2) {
            return false;
        }
        return table[y][x] == SIGN_EMPTY;
    }
    /*//оптимизация победы
    //check H&V
    boolean isWin(char ch) {
        for (int i = 0; i < table.length; i++) {
            for (int l = 0; l < table.length; l++) {
            if ((table[i][0] == ch && table[i][l] == ch && table[i][2] == ch) ||
                (table[0][i] == ch && table[l][i] == ch && table [2] [i] == ch))
                return true;
        }
        for (int l = 0; l < table.length; l++) {
        if ((table[0][0] == ch && table[l][l] == ch && table[2][2] == ch) ||
            (table[2][0] == ch && table[l][l] == ch && table [0] [2] == ch)) {
                return true;
            }
        
            return false;
 }*/
    
    boolean isWin(char ch) {
        // вертикаль
        if (table[0][0] == ch && table[0][1] == ch && table[0][2] == ch) return true;
        if (table[1][0] == ch && table[1][1] == ch && table[1][2] == ch) return true;
        if (table[2][0] == ch && table[2][1] == ch && table[2][2] == ch) return true;
        // горизонталь
        if (table[0][0] == ch && table[1][0] == ch && table[2][0] == ch) return true;
        if (table[0][1] == ch && table[1][1] == ch && table[2][1] == ch) return true;
        if (table[0][2] == ch && table[1][2] == ch && table[2][2] == ch) return true;
        // диагональ
        if (table[0][0] == ch && table[1][1] == ch && table[2][2] == ch) return true;
        if (table[2][0] == ch && table[1][1] == ch && table[0][2] == ch) return true;
        return false;
    }
    
    boolean isTableFull() {
        for (int y = 0; y < table.length; y++) {
            for (int x = 0; x < table.length; x++) {
                if (table[y][x] == SIGN_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }
 }
