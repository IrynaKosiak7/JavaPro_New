package de.telran.lesson0313.Homework;

import java.util.*;

public class HomeworkLinkedList {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("The");
        list.add("queen of");
        list.add("creative");
        list.add("Instagram captions");
        list.add("appeared to take");
        list.add("photo editing");
        list.add("fall");
        System.out.println(list);

//        Перебрать LinkedList и найти самую короткую строку.
        String shortest = list.get(0);
        for (String str : list) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        System.out.println(shortest);


//        Перебрать LinkedList и объединить все строки в одну с использованием разделителя "|".
        Iterator<String> iterator = list.iterator();
        StringBuilder strings = new StringBuilder();
        while (iterator.hasNext()) {
            strings.append(iterator.next());
            strings.append(" | ");

        }
        System.out.println(strings);

//         Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.

        LinkedList<Example> examples = new LinkedList<>();
        examples.add(new Example("Ivan", 20, true, "Germany"));
        examples.add(new Example("Inna", 18, true, "Ukraine"));
        examples.add(new Example("Anna", 22, true, "Russia"));
        examples.add(new Example("Oleg", 29, true, "Austria"));
        System.out.println(examples);
        Example.deleted(examples, "Russia");


//  Напишите метод, чтобы получить первое и последнее вхождение указанных элементов в связанном списке.
        List<Integer> listInteger = new LinkedList<>(List.of(1, 4, 3, 2, 1, 2, 2, 0));
        System.out.println(listInteger);
        System.out.println(Arrays.toString(entryElement(listInteger, 2)));

    }

    public static int[] entryElement(List<Integer> list, int element) {
        int[] entyElements = new int[2];

        ListIterator<Integer> listIntegerIterator = list.listIterator();
        int indexFirst = 0;
        int indexLast = 0;
        while (listIntegerIterator.hasNext()) {
            if (element == listIntegerIterator.next()) {
                entyElements[0] = indexFirst;
                break;
            }
            indexFirst++;
        }
        listIntegerIterator = list.listIterator();
        while (listIntegerIterator.hasNext()) {
            if (element == listIntegerIterator.next()) {
                entyElements[1] = indexLast;

            }
            indexLast++;
        }
        return entyElements;
    }

    public static class Example {
        private String name;
        private int age;
        private boolean isLiving;
        private String country;

        public Example(String name, int age, boolean isLiving, String country) {
            this.name = name;
            this.age = age;
            this.isLiving = isLiving;
            this.country = country;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public boolean isLiving() {
            return isLiving;
        }

        public void setLiving(boolean living) {
            isLiving = living;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public static void deleted(LinkedList<Example> examp, String country) {
            for (Example example : examp) {
                if (example.country.equals(country)) {
                    examp.remove(example);
                }
            }
            System.out.println(examp);
        }

        @Override
        public String toString() {
            return "Example{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", isLiving=" + isLiving +
                    ", country='" + country + '\'' +
                    '}';
        }
    }


}
