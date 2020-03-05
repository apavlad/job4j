package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ivan Ivanov");
        student.setGroup("12A");
        student.setReceipt(new Date());
        String nl = System.lineSeparator();
        System.out.println(student.getFio() + nl + student.getGroup() + nl + student.getReceipt() );


    }
}
