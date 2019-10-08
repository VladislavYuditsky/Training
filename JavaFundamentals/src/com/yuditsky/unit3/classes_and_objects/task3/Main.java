//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
// на единицу в заданном диапазоне.Предусмотрите инициализацию счетчика значениями по умолчанию
// и произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния,
// и метод позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

package com.yuditsky.unit3.classes_and_objects.task3;

import com.yuditsky.unit3.classes_and_objects.task3.entity.Counter;
import com.yuditsky.unit3.classes_and_objects.task3.view.CounterView;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterView view = new CounterView();
        int choice;

        while ((choice = view.menu()) != 0) {
            switch (choice) {
                case 1:
                    switch (view.initializationMenu()) {
                        case 1:
                            counter = new Counter();
                            break;
                        case 2:
                            view.print("Enter limit: ");
                            int limit = view.getInt();
                            counter = new Counter(limit);
                            break;
                        case 3:
                            view.print("Enter initial value and limit:");
                            int start = view.getInt();
                            limit = view.getInt();
                            counter = new Counter(start, limit);
                            break;
                        case 0:
                            break;
                        default:
                            view.print("Incorrect input");
                            break;
                    }
                    view.pressEnterKey();
                    break;
                case 2:
                    view.print(counter.toString());
                    view.pressEnterKey();
                    break;
                case 3:
                    view.print(counter.getStart());
                    view.pressEnterKey();
                    break;
                case 4:
                    view.print("Enter start value:");
                    counter.setStart(view.getInt());
                    view.pressEnterKey();
                    break;
                case 5:
                    view.print(counter.getLimit());
                    view.pressEnterKey();
                    break;
                case 6:
                    view.print("Enter limit value:");
                    counter.setLimit(view.getInt());
                    view.pressEnterKey();
                    break;
                case 7:
                    view.print(counter.getCurrent());
                    view.pressEnterKey();
                    break;
                case 8:
                    view.print("Enter current value:");
                    counter.setCurrent(view.getInt());
                    view.pressEnterKey();
                    break;
                case 9:
                    counter.up();
                    view.pressEnterKey();
                    break;
                case 10:
                    counter.down();
                    view.pressEnterKey();
                    break;
                case 0:
                    return;
                default:
                    view.print("Incorrect input");
                    view.pressEnterKey();
                    break;
            }
        }
    }

}
