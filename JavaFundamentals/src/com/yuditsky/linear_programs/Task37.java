//Составить линейную программу, печатающую значение true,
// если указанное высказывание является истинным, и false - в противном случае:
//1.Целое число N является чётным двузначным числом.
//2.Сумма двух первых цифр заданного четырёхзначного числа равна сумме двух его последних цифр.
//3.Сумма цифр данного трёхзначного числа N является чётным числом.
//4.Точка с координатами (x,y) принадлежит части плоскости, лежащей между прямыми x = m, x = n (m < n)
//5.Квадрат заданного четырёхзначного числа равен кубу суммы цифр этого числа.
//6.Треугольник со сторонами a, b, c является равнобедренным.
//7.Сумма каких-либо двух цифр заданного трёхзначного натурального числа N равна третьей цифре.
//8.Заданное число N является степенью а (показатель степени может находиться в диапазоне от 0 до 4)
//9.График функции y = a*x^2 + b*x + с проходит через заданную точку с координатами (m, n). Не делал.

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args){
        int choice;
        int[] testArray1 = { 1, 12, 13, 123};
        int[] testArray2 = { 1, 1322, 3012, 1234, 12345};
        int[] testArray3 = { 23, 123, 111, 1234};
        int[] testArray4 = { 1, 2, 3, 3, 2, 5};
        int[] testArray5 = { 1, 1234, 10000, 9999};
        int[] testArray6 = { 1, 2, 1, 0, 3, 3, -5, 3, 3, 1, 2, 3};
        int[] testArray7 = { 0, 123, 132, 752, 222};
        int[] testArray8 = { 1, 1, 2, 0, 9, 3};
        do {
            choice = menu();
            switch (choice) {
                case 1:
                    System.out.println("Task1");
                    for (int i = 0; i < testArray1.length; i++) {
                        System.out.println("N = " + testArray1[i]);
                        task1(testArray1[i]);
                    }
                    break;
                case 2:
                    for (int i = 0; i < testArray2.length; i++) {
                        System.out.println("N = " + testArray2[i]);
                        task2(testArray2[i]);
                    }
                    break;
                case 3:
                    for (int i = 0; i < testArray3.length; i++) {
                        System.out.println("N = " + testArray3[i]);
                        task3(testArray3[i]);
                    }
                    break;
                case 4:
                    for(int i = 0; i != testArray4.length;){
                        int m = testArray4[i];
                        int x = testArray4[++i];
                        int n = testArray4[++i];
                        i++;
                        System.out.println("m = " + m + " x = " + x + " n = " + n);
                        task4(m, x, n);
                    }
                    break;
                case 5:
                    for (int i = 0; i < testArray5.length; i++) {
                        System.out.println("N = " + testArray5[i]);
                        task5(testArray5[i]);
                    }
                    break;
                case 6:
                    int a;
                    int b;
                    int c;
                    int i = 0;
                    while(i != testArray6.length){
                        a = testArray6[i];
                        b = testArray6[++i];
                        c = testArray6[++i];
                        i++;
                        System.out.println("a = " + a + " b = " + b + " c = " + c);
                        task6(a, b, c);
                    }
                    break;
                case 7:
                    for (i = 0; i < testArray7.length; i++) {
                        System.out.println("N = " + testArray7[i]);
                        task7(testArray7[i]);
                    }
                    break;
                case 8:
                    i = 0;
                    while(i != testArray8.length){
                        task8(testArray8[i], testArray8[++i]);
                        i++;
                    }
                    break;
            }
        }while(choice != 0);
    }

    public static int menu() {
        char symbol;
        int num;
        System.out.println("1.Целое число N является чётным двузначным числом.");
        System.out.println("2.Сумма двух первых цифр заданного четырёхзначного числа равна сумме двух его последних цифр.");
        System.out.println("3.Сумма цифр данного трёхзначного числа N является чётным числом.");
        System.out.println("4.Точка с координатами (x,y) принадлежит части плоскости, лежащей между прямыми x = m, x = n (m < n)");
        System.out.println("5.Квадрат заданного четырёхзначного числа равен кубу суммы цифр этого числа.");
        System.out.println("6.Треугольник со сторонами a, b, c является равнобедренным.");
        System.out.println("7.Сумма каких-либо двух цифр заданного трёхзначного натурального числа N равна третьей цифре.");
        System.out.println("8.Заданное число N является степенью а (показатель степени может находиться в диапазоне от 0 до 4)");
        System.out.println("0.Выход");
        System.out.println("Enter number of task");
        Scanner in = new Scanner(System.in);
        do {
            symbol = in.next().charAt(0);
            num = symbol - '0';
        }while(num < 0 | num > 8);
        return num;
    }

    public static void task1(int N) {
        if(N%2 == 0 & N <= 99 & N >= 10) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void task2(int N){
        if(N%10 + (N/10)%10 == (N/100)%10 + (N/1000)%10 & N >= 1000 & N <= 9999){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void task3(int N) {
        if(N >= 100 & N <= 999 & (N%10 + ((N/10)%10 + (N/100)%10))%2 == 0){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void task4(int m, int x, int n){
        if(x >= m && x <= n) {
            System.out.println("true");
            return;
        }
        System.out.println("false");
    }

    public static void task5(int N) {
        String str = String.valueOf(N);
        int sum = 0;
        if(str.length() == 4){
            for(int i = 0; i < 4; i++){
                sum += str.charAt(i) - '0';
            }
            if(Math.pow(sum, 3) == Math.pow(N, 2)){
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }

    public static void task6(int a, int b, int c){
        if(a > 0 & b > 0 & c > 0) {
            if(a == b | a == c | b == c) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }

    public static void task7(int N) {
        String str = String.valueOf(N);
        if(N >= 100 & N <= 999) {
            int a = str.charAt(0) - '0';
            int b = str.charAt(1) - '0';
            int c = str.charAt(2) - '0';
            if (a + b == c | a + c == b | b + c == a) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        } else {
            System.out.println("false");
        }
    }

    public static void task8(int N, int a) {
        System.out.println("N = " + N + " a = " + a);
        boolean result = false;
        for(int i = 0; i <= 4; i++){
            if(N == Math.pow(a, i)){
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
