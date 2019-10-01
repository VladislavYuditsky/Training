//Составьте описание класса для представления времени. Предусмотрте возможности установки времени
// и изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

package com.yuditsky.unit3.classes_and_objects.task4;

import com.yuditsky.unit3.classes_and_objects.task4.entity.Clock;

public class Main {
    public static void main(String[] args) {
        Clock clock = new Clock();

        System.out.println(clock);
    }
}
