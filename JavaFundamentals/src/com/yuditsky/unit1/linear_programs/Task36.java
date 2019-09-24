//Найти частное произведений чётных и нечётных цифр четырёхзначного числа

package com.yuditsky.unit1.linear_programs;

public class Task36 {
    public static void main(String[] args){
        int x = 1234;
        int y1 = 1, y2 = 1;
        String str = String.valueOf(x);
        for(int i = 0; i < 4; i++){
            if(i%2 == 0){
                y1 *= str.charAt(i) - '0';
            } else {
                y2 *= str.charAt(i) - '0';
            }
        }
        System.out.println(y1);
        System.out.println(y2);
        System.out.println((double)y2/y1);
    }

}
