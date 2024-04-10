package de.telran.test_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Translate {
    private Languages fromLanguage = Languages.ENGLISH;
    private Languages toLanguage;
    Map<String, String> wordTranslate = new HashMap<>();

    public Translate(Languages fromLanguage, Languages toLanguage) {
        this.fromLanguage = fromLanguage;
        this.toLanguage = toLanguage;
    }

    public void translate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write you word: ");
        String word = scanner.nextLine();
        if (wordTranslate.containsKey(word)) {
            System.out.println(wordTranslate.get(word));
        } else {
            System.out.println("Translation not found in the dictionary.");
            System.out.print("Write translate for this word and I'll save " + word + ": ");
            String translation = scanner.nextLine();

            wordTranslate.put(word, translation);
            System.out.println("Translation saved to the dictionary.");
        }
        for (Map.Entry<String, String> entry : wordTranslate.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }


    @Override
    public String toString() {
        return "Translate{" +
                "fromLanguage=" + fromLanguage +
                ", toLanguage=" + toLanguage + '\'' +
                '}';
    }


    public static void main(String[] args) {
        Translate google = new Translate(Languages.ENGLISH, Languages.RUSSIAN);
        google.translate();
    }


}

