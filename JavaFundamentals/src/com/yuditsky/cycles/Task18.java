//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
// Общий член ряда имеет вид: a=(-1)^(n-1)/n

package com.yuditsky.cycles;

public class Task18 {
    public static void main(String[] args) {
        int n = 10;
        double e = (double)1/3;
        double sum = 0;
        for(int i = 1; i <= n; ++i){
            if(Math.abs(Math.pow((-1),(i-1))/i) >= e){
                sum += Math.pow((-1),(i-1))/i;
            }
        }
        System.out.println(sum);
    }
}

