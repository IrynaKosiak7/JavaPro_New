package de.telran.lesson0228.Homework;

public class Teacher {
    private String name;
    private Subject subject;

    public Teacher(String name, Subject subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
    public void teach(Student student){
        student.study(getSubject());
        System.out.println(name + " teaches " + student.getName() +" learned this subject " + subject);

    }
    public void teach(Student[] students){
        for (Student student : students) {
            teach(student);
        }
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", subject=" + subject +
                '}';
    }
}
