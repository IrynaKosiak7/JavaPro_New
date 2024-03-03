package de.telran.lesson0228.Homework;

import java.util.Arrays;

public class Student {
    private String name;
    private Subject[] learnedSubjects;

    public Student(String name) {
        this.name = name;
        this.learnedSubjects = new Subject[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getLearnedSubjects() {
        return learnedSubjects;
    }

    public void setLearnedSubjects(Subject[] learnedSubjects) {
        this.learnedSubjects = learnedSubjects;
    }

    public void study(Subject subject) {
        if (knows(subject) == false){
            Subject[] newSubjects = Arrays.copyOf(learnedSubjects, learnedSubjects.length + 1);
            newSubjects[learnedSubjects.length] = subject;
            learnedSubjects = newSubjects;
            System.out.println(name + " studies " + subject);
        } else{
            System.out.println(name + " doesn't learn this Subject " + subject);
        }

    }
    public boolean knows(Subject subject) {
        for (Subject learnedSubject : learnedSubjects) {
            if (learnedSubject == subject) {
                return true;
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", learns subjects=" + Arrays.toString(learnedSubjects) +
                '}';
    }
}
