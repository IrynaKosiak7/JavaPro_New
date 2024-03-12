package de.telran.lesson0311.homework;

import java.util.*;

public class Homework {
    public static void main(String[] args) {
//        Имеется заданный список имен студентов:
//  List names = new ArrayList<>(List.of("Mary", "Jane", "Tom", "Tim", "Mark", "Ann", null, ""));

        List<String> names = new ArrayList<>();
        names.add("Mary");
        names.add("Jane");
        names.add("Tom");
        names.add("Tim");
        names.add("Mark");
        names.add("Ann");
        names.add(null);
        names.add("");
        System.out.println("Origin " + names);

//      С помощью итератора:
//      a). Вывести имена, состоящие из 4 букв

       Iterator<String> iterator = names.iterator();
       while (iterator.hasNext()){
           String element = iterator.next();
           if ( element != null && element.length() == 4){
               System.out.println("Вывести имена, состоящие из 4 букв: " + element);
           }
       }

//        b). Удалить из списка null и пустые строки.

        Iterator<String> iteratorHollow = names.iterator();
        while (iteratorHollow.hasNext()) {
            String elementHollow = iteratorHollow.next();
            if (elementHollow == null || elementHollow.isEmpty()) {
                iteratorHollow.remove();
            }
        }
        System.out.println("Удалить из списка null и пустые строки" + names);

//      С помощью listIterator:
//      c). Удалить из списка все имена, начинающиеся на "T"

        ListIterator<String> listIteratorDeleted = names.listIterator();
        char targetLetter = 'T';
        while (listIteratorDeleted.hasNext()) {
            String elementDeleted = listIteratorDeleted.next();
            if (elementDeleted.charAt(0) == targetLetter) {
                listIteratorDeleted.remove();
            }
        }
        System.out.println("Удалить из списка начинающиеся на 'T' "  + names);

//        d). Заменить в списке "Ann" на "student Ann"
        ListIterator<String> listIteratorReplace  = names.listIterator();
        String replaceWord= "Ann";
        while (listIteratorReplace.hasNext()) {
            String elementDeleted = listIteratorReplace.next();
            if (Objects.equals(elementDeleted, replaceWord)) {
                listIteratorReplace.set("student Ann");
            }
        }
        System.out.println("Заменить в списке " + names);
    }


}
