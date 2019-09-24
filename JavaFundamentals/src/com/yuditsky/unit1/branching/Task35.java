// Вычислить число и месяц в невисокосном году по номеру дня

package com.yuditsky.unit1.branching;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        int[] daysMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dayPerYear = 365;
        int dayNumber;
        Scanner in = new Scanner(System.in);

        do {
            System.out.print("Enter day number: ");
            dayNumber = in.nextInt();
        }while(dayNumber > dayPerYear | dayNumber <= 0);

        for(int i = 0; i < months.length; i++){
            if(dayNumber > daysMonth[i]){
                dayNumber -= daysMonth[i];
            } else {
                System.out.println(dayNumber + " " + months[i]);
                break;
            }
        }
    }

}
