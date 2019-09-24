//Дано действительное число R вида nnn.ddd(три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.

package com.yuditsky.unit1.linear_programs;

public class Task21 {
    public static void main(String[] args){
        double R = 123.321;
        double x, y;
        System.out.println(R);
        x = (int)R;
        y = (R*1000)%(x*1000);
        R = (y*1000 + x)/1000;
        System.out.println(R);
    }
}
