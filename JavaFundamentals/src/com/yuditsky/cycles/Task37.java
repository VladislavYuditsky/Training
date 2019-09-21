//Даны два двузначных чмсла А и В. Из этих чисел составили 2 четырёхзначных числа:
// первое число получили путём напсания сначала числа А, а затем В.
// Для получения второго числа сначала записали число В, затем А.
// Найти числа А и В если известно. что первое четырёхзначное число нацело делится на 99, а второе на 49.

package com.yuditsky.cycles;

public class Task37 {
    public static void main(String[] args){
        for(int A = 10; A < 100; ++A){
            for(int B = 10; B < 100; ++B){
                if(isFound(parseNumber1(A, B), parseNumber2(A, B))){
                    System.out.println("A = " + A + " B = " + B);
                }
            }
        }
    }

    public static int parseNumber1(int A, int B){
        int number1;

        number1 = A/10*10;
        number1 += A%10;
        number1 *= 10;
        number1 += B/10;
        number1 *= 10;
        number1 += B%10;
        return number1;
    }

    public static int parseNumber2(int A, int B){
        int number2;

        number2 = B/10*10;
        number2 += B%10;
        number2 *= 10;
        number2 += A/10;
        number2 *= 10;
        number2 += A%10;
        return number2;

    }

    public static boolean isFound(int num1, int num2){
        if(num1%99==0 & num2%49 == 0)
        {
            return true;
        } else {
            return false;
        }
    }
}

