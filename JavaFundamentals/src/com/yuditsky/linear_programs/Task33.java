//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Input symbol:");
        char symbol = in.next().charAt(0);
        System.out.println((int)symbol);
        System.out.println("Prev: " + (char)(symbol-1));
        System.out.println("Next: " + (char)(symbol + 1));
    }
}
