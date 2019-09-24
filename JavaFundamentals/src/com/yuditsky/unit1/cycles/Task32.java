//Проверить введённую пользователем строку на наличие недопустимых символов.
// В качестве первого символа допустимы только буквы и знак подчёркивания.
// Остальные символы могут быть буквами, цифрами и знаком подчёркивания.

package com.yuditsky.unit1.cycles;

import java.util.Scanner;

public class Task32 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str;

        System.out.println("Enter the string");
        str = in.next();

        if(isCharacter(str.charAt(0)) | isUnderline(str.charAt(0))){
            for(int i = 0; i < str.length(); i++){
                if(!isCharacter(str.charAt(i)) & !isUnderline(str.charAt(i)) & !isNumber(str.charAt(i))){
                    System.out.println("Wrong string!");
                    return;
                }
            }
        } else {
            System.out.println("Wrong string!");
            return;
        }
        System.out.println("All right!");

    }

    public static boolean isCharacter(char symbol){
        if(('A' <= symbol & symbol >= 'Z') | ('a' <= symbol & symbol >= 'z')) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isUnderline(char symbol){
        if(symbol == '_'){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isNumber(char symbol){
        if(symbol >= '0' & symbol <= '9'){
            return true;
        } else {
            return false;
        }
    }


}

