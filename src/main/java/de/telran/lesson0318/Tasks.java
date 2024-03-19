package de.telran.lesson0318;

import java.util.*;

public class Tasks {


    public static class Employee implements Comparable<Employee> {
        private String name;
        private String surname;
        private int age;
        private int workingHoursInMonth;

        public Employee(String name, String surname, int age, int workingHoursInMonth) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.workingHoursInMonth = workingHoursInMonth;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", age=" + age +
                    ", workingHoursInMonth=" + workingHoursInMonth +
                    '}';
        }

        public static class EmployeesByAge implements Comparator<Employee> {

            @Override
            public int compare(Employee employee1, Employee employee2) {
                int age1 = employee1.age;
                int age2 = employee2.age;
                return Integer.compare(age1, age2);
            }
        }

        public static class EmployeesBySurnameAndName implements Comparator<Employee> {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int result = employee1.surname.compareTo(employee2.surname);
                if (result == 0) {
                    return employee1.name.compareTo(employee2.name);
                }
                return result;
            }
        }

        @Override
        public int compareTo(Employee o) {

            int result = this.name.compareTo(o.name);
            if (result == 0) {result = this.surname.compareTo(o.surname);}
            if (result == 0) {result = Integer.compare(this.age, o.age);}
            if (result == 0) { result = Integer.compare(this.workingHoursInMonth, o.workingHoursInMonth);}
            return result;
        }
        public static class EmployeesByName implements Comparator<Employee> {
            @Override
            public int compare(Employee employee1, Employee employee2) {
               return employee1.name.compareTo(employee2.name);

            }
        }
        public static class EmployeesByAgeAndWorkingHoursInMonth implements Comparator<Employee> {
            @Override
            public int compare(Employee employee1, Employee employee2) {
                int result = Integer.compare(employee1.workingHoursInMonth, employee2.workingHoursInMonth);
                if (result == 0) {
                    return Integer.compare(employee1.age,employee2.age);
                }
                return result;
            }
        }
       public static void getFirstByName(List<Employee> list){
            String firstName = null;
            for (Employee empl: list){
                if (list.size() > 0) {
                    firstName = list.get(0).name;
                }
            }

           System.out.println(firstName);
       }
        public static void getLastByName(List<Employee> list){
            String lastName = null;
            for (Employee empl: list){
                if (list.size() > 0) {
                    Collections.reverse(list);
                    lastName = list.get(0).name;
                }
            }

            System.out.println(lastName);

        }

    }

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", "Simonenko", 50, 42);
        Employee employee2 = new Employee("Oleg", "Kriworuchko", 35, 20);
        Employee employee3 = new Employee("Olga", "Klimenko", 42, 40);
        Employee employee4 = new Employee("Maria", "Oleinick", 24, 19);
        Employee employee5 = new Employee("Danny", "Valentinka", 19, 34);
        Employee employee6 = new Employee("Valeria", "Simonenko", 49, 28);

        List<Employee> employeeList = Arrays.asList( employee2, employee3, employee4, employee5, employee6);
        Collections.sort(employeeList, new Employee.EmployeesByName());


        System.out.println("sort by age");
        Collections.sort(employeeList, new Employee.EmployeesByAge());
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("sort by surname and name");
        Collections.sort(employeeList, new Employee.EmployeesBySurnameAndName());
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("natural order by name, surname, age, workingHoursInMonth");
        Collections.sort(employeeList);
        for (Employee empl : employeeList) {
            System.out.println(empl);
        }
        System.out.println("--------------------------------------------------");

        System.out.println("sort by name: ");
        Collections.sort(employeeList, new Employee.EmployeesByName());
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        System.out.println("get first by name: ");
        Employee.getFirstByName(employeeList);

        System.out.println("get last by name: ");
        Employee.getLastByName(employeeList);


        System.out.println("sort by name reversed: ");
        Collections.sort(employeeList, new Employee.EmployeesByName().reversed());
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        System.out.println("sort by working hours in month and age reversed: ");
        Collections.sort(employeeList, new Employee.EmployeesByAgeAndWorkingHoursInMonth().reversed());
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }



    }
}
