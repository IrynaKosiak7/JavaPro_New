package de.telran.lesson0515.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework {
    public static void main(String[] args) {
//   1) Напишите регулярное выражение, которое соответствует любому номеру телефона согласно формату:
//телефонный номер состоит из 7 цифр подряд или из 3х цифр, пробела или тире, а затем из 4 цифр (1234567, 123-4567, 123 4567).
        System.out.println(Pattern.matches("([\\\\d+]{7})|([\\d+]{3}[-\\s]{1}[\\d+]{4})", "123-4567"));
        System.out.println(Pattern.matches("([\\\\d+]{7})|([\\d+]{3}[-\\s]{1}[\\d+]{4})", "123-4567984"));
        System.out.println(Pattern.matches("([\\\\d+]{7})|([\\d+]{3}[-\\s]{1}[\\d+]{4})", "123-4567"));
        System.out.println(Pattern.matches("([\\\\d+]{7})|([\\d+]{3}[-\\s]{1}[\\d+]{4})", "123 4567"));
        System.out.println(Pattern.matches("([\\\\d+]{7})|([\\d+]{3}[-\\s]{1}[\\d+]{4})", "123!4567"));


//   2) Имеется текст "Php is the best programming language in the world. I study php." Замените в нем php на java.
        String text = "Php is the best programming language in the world. I study php.";
        String regex = "[pP]hp";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String textReplaced = null;
        if (matcher.find()) {
            text = matcher.replaceFirst("Java");
            textReplaced = Pattern.compile(regex).matcher(text).replaceFirst("Java");
        }
        textReplaced = Pattern.compile(regex).matcher(text).replaceAll("java");
        System.out.println(textReplaced);


//   3) Имеется некоторый текст. Найти и вывести из него все группы гласных, стоящие вместе. Например: a, ua, uiy
        String someText = "The Billion Dollar Code is a 2021 German television miniseries starring Björn Freiberg, Seumas F. Sargent and Leonard Scheicher.\n" +
                "Based on true events, the series was developed for Netflix, where it was first aired in October 2021 along with an additional feature story episode.\n" +
                "The miniseries dramatizes the lawsuit, the proceedings of which lasted until 2017. Art+Com lost at trial and on appeal.\n" +
                "The filmmakers used portions of the trial transcript to avoid coming into conflict with Google, but key aspects of the trial were entirely fictionalized or omitted.\n" +
                "The actual decision of the court was in fact based on other findings.";
        String regexVowelGroups = "[aeiouAEIOU]+";
        Pattern patternVowelGroups = Pattern.compile(regexVowelGroups);
        Matcher matcherVowelGroups = patternVowelGroups.matcher(someText);

        while (matcherVowelGroups.find()) {
            String searchResult = matcherVowelGroups.group();
            System.out.println("Vowel groups found " + searchResult);

        }

//    4) Напишите метод поиска в тексте всех слов, начинающихся с определенной буквы.
        searchInTextWithASpecificLetter(someText, "i");

    }

    public static void searchInTextWithASpecificLetter(String text, String letter) {
       String regex = Pattern.quote(letter) + "\\w*";
        Pattern pattern = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String result = matcher.group();
            System.out.println("All word in text begin to " + letter + " -> " + result);
        }
    }
}
