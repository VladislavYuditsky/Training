package com.yuditsky.unit3.classes_and_objects.task1.entity;

public class Student {
    private String surname;
    private String initials;
    private int groupNumber;
    private int[] progress;

    public Student() {
        progress = new int[5];
    }

    public Student(String surname) {
        this();
        this.surname = surname;
    }

    public Student(String surname, String initials) {
        this(surname);
        this.initials = initials;
    }

    public Student(String surname, String initials, int groupNumber) {
        this(surname, initials);
        this.groupNumber = groupNumber;
    }

    public Student(String surname, String initials, int groupNumber, int mark) {
        this(surname, initials, groupNumber);
        this.progress[0] = mark;
    }

    public Student(String surname, String initials, int groupNumber, int[] progress) {
        this(surname, initials, groupNumber);
        if (progress.length > this.progress.length) {
            System.arraycopy(progress, 0, this.progress, 0, this.progress.length);
        } else {
            System.arraycopy(progress, 0, this.progress, 0, progress.length);
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getProgress() {
        return progress;
    }

    public void setProgress(int[] progress) {
        this.progress = progress;
    }

    @Override
    public boolean equals(Object obj){

        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }

        if(getClass()!=obj.getClass()){
            return false;
        }

        Student student = (Student) obj;
        if(groupNumber != student.groupNumber){
            return false;
        }

        if(progress == null){
            return progress == student.progress;
        } else{
            if(!progress.equals(student.progress)){
                return false;
            }
        }

        if(surname == null){
            return surname == student.surname;
        } else{
            if(!surname.equals(student.surname)){
                return false;
            }
        }

        if(initials == null){
            return initials == student.initials;
        } else{
            if(!initials.equals(student.initials)){
                return false;
            }
        }

        return true;
    }

    @Override
    public int hashCode(){
        return 31 * groupNumber + ((progress == null) ? 0 : progress.hashCode()) +
                ((surname == null) ? 0 : surname.hashCode() + ((initials == null) ? 0 : initials.hashCode()));
    }

    @Override
    public String toString(){
        return getClass().getName() + "@" + "surname: " + surname + ", initials: " + initials + ", group number: " +
                groupNumber + ", progress: " + progress;
    }
}
