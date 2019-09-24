//Написать программу, переводящую римские цифры в арабские

package com.yuditsky.unit1.cycles;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args){
        String[] romeDefault = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
        int[] arabDefault = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        Scanner in = new Scanner(System.in);

        System.out.print("Enter rome number: ");
        String romeNumber= in.next();
        StringBuffer romeNumberBuffer = new StringBuffer(romeNumber);

        int arabNumber = 0, i = 0;
        if (romeNumberBuffer.length() > 0) {
            while (true) {
                do {
                    if (romeDefault[i].length() <= romeNumberBuffer.length()) {
                        if (romeDefault[i].equals(romeNumberBuffer.substring(0, romeDefault[i].length()))) {
                            arabNumber += arabDefault[i];
                            romeNumberBuffer.delete(0, romeDefault[i].length());
                            if (romeNumberBuffer.length() == 0)
                            {
                                System.out.println(arabNumber);
                                return;
                            }
                        } else
                            break;
                    } else
                        break;
                } while (romeNumberBuffer.length() != 0);
                i++;
            }
        }
    }

}

