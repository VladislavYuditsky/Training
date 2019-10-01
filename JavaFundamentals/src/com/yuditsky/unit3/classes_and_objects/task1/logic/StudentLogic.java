package com.yuditsky.unit3.classes_and_objects.task1.logic;

import com.yuditsky.unit3.classes_and_objects.task1.entity.Student;

public class StudentLogic {
    public boolean isExcellent(Student student) {
        int[] progress = student.getProgress();
        for(int i = 0; i < progress.length; i++){
            if(progress[i] < 9){
                return false;
            }
        }
        return true;
    }
}
