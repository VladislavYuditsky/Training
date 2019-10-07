//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
// на единицу в заданном диапазоне.Предусмотрите инициализацию счетчика значениями по умолчанию
// и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
// и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

package com.yuditsky.unit3.classes_and_objects.task3;

import com.yuditsky.unit3.classes_and_objects.task3.entity.Counter;
import com.yuditsky.unit3.classes_and_objects.task3.logic.CounterLogic;
import com.yuditsky.unit3.classes_and_objects.task3.ui.CounterUI;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterLogic counterLogic = new CounterLogic();
        CounterUI counterUI = new CounterUI();
        int choice;

        while ((choice = counterUI.menu()) != 0) {
            switch (choice) {
                case 1:
                    switch (counterUI.initializationMenu()) {
                        case 1:
                            counter = new Counter();
                            break;
                        case 2:
                            counterUI.print("Enter limit: ");
                            int limit = counterUI.getInt();
                            counter = new Counter(limit);
                            break;
                        case 3:
                            counterUI.print("Enter initial value and limit:");
                            int start = counterUI.getInt();
                            limit = counterUI.getInt();
                            counter = new Counter(start, limit);
                            break;
                        case 0:
                            break;
                        default:
                            counterUI.print("Incorrect input");
                            break;
                    }
                    counterUI.pressEnterKey();
                    break;
                case 2:
                    counterUI.print(counter.toString());
                    counterUI.pressEnterKey();
                    break;
                case 3:
                    counterUI.print(counter.getStart());
                    counterUI.pressEnterKey();
                    break;
                case 4:
                    counterUI.print("Enter start value:");
                    counter.setStart(counterUI.getInt());
                    counterUI.pressEnterKey();
                    break;
                case 5:
                    counterUI.print(counter.getLimit());
                    counterUI.pressEnterKey();
                    break;
                case 6:
                    counterUI.print("Enter limit value:");
                    counter.setLimit(counterUI.getInt());
                    counterUI.pressEnterKey();
                    break;
                case 7:
                    counterUI.print(counter.getCurrent());
                    counterUI.pressEnterKey();
                    break;
                case 8:
                    counterUI.print("Enter current value:");
                    counter.setCurrent(counterUI.getInt());
                    counterUI.pressEnterKey();
                    break;
                case 9:
                    counterLogic.up(counter);
                    counterUI.pressEnterKey();
                    break;
                case 10:
                    counterLogic.down(counter);
                    counterUI.pressEnterKey();
                    break;
                case 0:
                    return;
                default:
                    counterUI.print("Incorrect input");
                    counterUI.pressEnterKey();
                    break;
            }
        }
    }

}
