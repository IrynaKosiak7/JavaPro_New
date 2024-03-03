package de.telran.lesson0228.Homework;

import java.util.Arrays;

public class School {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Maria Shevchenko", Subject.BIOLOGY);
        Teacher teacher2 = new Teacher("Ivan Sokolovskiy", Subject.CHEMISTRY);
        Teacher teacher3 = new Teacher("Sofiia Ivanivna", Subject.HISTORY);

        Student student1 = new Student("Ira");
        Student student2 = new Student("Luda");
        Student student3 = new Student("David");

//        Subject[] subjects ={ Subject.BIOLOGY,Subject.CHEMISTRY,Subject.HISTORY};
//        student1.knowsSubject(Subject.ENGLISH);

        System.out.println("--------------------");
        teacher1.teach(student1);
        teacher3.teach(student2);
        System.out.println(student1);
        System.out.println(student3);
        System.out.println(student2);
        Student[] students = {student1, student2, student3};
        teacher2.teach(students);

        System.out.println("--------------------");
        student1.study(Subject.GERMANY);
        student1.knows(Subject.ENGLISH);
        System.out.println("--------------------");
        student2.study(Subject.BIOLOGY);
        student2.knows(Subject.HISTORY);

        System.out.println("--------------------");
        student2.study(Subject.MATHEMATICS);
        student1.knows(Subject.BIOLOGY);

        System.out.println(student1);
        System.out.println(student3);
        System.out.println(student2);



    }
}
