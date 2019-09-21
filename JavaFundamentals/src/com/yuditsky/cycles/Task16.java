//Вычислить: (1+2)*(1+2+3)*...*(1+2+...+10).

package com.yuditsky.cycles;

public class Task16 {
    public static void main(String[] args){
        System.out.println(task16(1, 2));
    }

    public static double task16(double prevResult, double i){
        if(i<10) {
            return (prevResult + i) * task16(prevResult + i, ++i);
        } else {
            return prevResult + i;
        }
    }

}

