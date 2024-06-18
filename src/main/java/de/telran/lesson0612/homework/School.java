package de.telran.lesson0612.homework;

import de.telran.lesson0612.homework.StudentInfo;

import java.lang.reflect.Field;

public class School {
    @StudentInfo(name = "Tom", surname = "Smith", age = 15)
    private Student student1;
    @StudentInfo(name = "Mary", surname = "Jennings", age = 17)
    private Student student2;

    public static void main(String[] args) throws NoSuchFieldException {
        School school  = new School();

        Class<? extends School> schoolClass = school.getClass();
        Field field1 = schoolClass.getDeclaredField("student1");
        Field field2 = schoolClass.getDeclaredField("student2");

        StudentInfo annotation1 = field1.getAnnotation(StudentInfo.class);
        StudentInfo annotation2 = field2.getAnnotation(StudentInfo.class);

        System.out.println("Name student1: " + annotation1.name() + ", surname: " + annotation1.surname() + ", age: "+ annotation1.age() );
        System.out.println("Name student2: " + annotation2.name() + ", surname: " + annotation2.surname() + ", age: "+ annotation2.age() );


    }

}
