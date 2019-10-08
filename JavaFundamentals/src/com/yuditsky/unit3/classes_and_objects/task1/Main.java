//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

package com.yuditsky.unit3.classes_and_objects.task1;

import com.yuditsky.unit3.classes_and_objects.task1.entity.Student;
import com.yuditsky.unit3.classes_and_objects.task1.logic.StudentLogic;

public class Main {
    public static void main(String[] args) {
        StudentLogic studentLogic = new StudentLogic();
        Student[] students = {
                new Student(),
                new Student(),
                new Student(),
                new Student("Vasilkov"),
                new Student("Petrov", "P.P."),
                new Student("Sidorov", "S.S.", 12345),
                new Student("Ivanov", "I.I.", 54321, 10),
                new Student("Petuhov", "K.O.", 11111, new int[]{9, 9, 9, 9, 9}),
                new Student("Kurochkin", "K.O.", 22222, new int[]{9, 9, 9}),
                new Student("Da", "D.A.", 12121, new int[]{10, 10, 10, 10, 10}),
        };

        for (int i = 0; i < students.length; i++) {
            if (studentLogic.isExcellent(students[i])) {
                System.out.println(students[i].getSurname() + " " + students[i].getGroupNumber());
            }
        }
    }


}
