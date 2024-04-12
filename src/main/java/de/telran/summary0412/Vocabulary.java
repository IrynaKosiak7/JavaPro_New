package de.telran.summary0412;

import de.telran.lesson0327.map.Pizza;

import java.util.*;

public class Vocabulary {
    private String newtext;

    public Vocabulary(String newtext) {
        this.newtext = newtext;
    }

    @Override
    public String toString() {
        return "Vocabulary{" +
                "newtext='" + newtext + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Vocabulary text = new Vocabulary("«Новые миры» – захватывающий сериал 2014 года, где драма, военные события и исторический контекст переплетаются в уникальное полотно сюжета. Этот проект стал продолжением популярной британской исторической драмы \"Мятежный путь\" и переносит зрителя в Англию и Америку 1680-х годов. Сериал раскрывает жизнь героев в эпоху борьбы за свободу и права, во времена жестоких испытаний и политических интриг. Онлайн просмотр «Новых миров» - отличная возможность погрузиться в мир страстей, любви и революции через истории храбрых персонажей, борющихся за лучшее будущее своих наций. Смотреть этот сериал - значит стать свидетелем исторических перемен, отраженных в захватывающих дух приключениях главных героев.");
        String[] textArray = text.newtext.split(" ");
         Map<String, Integer> mapWords = new TreeMap<>();

        for (String vocabulary : textArray) {
            if (!mapWords.containsKey(vocabulary)) {
                mapWords.put(vocabulary, 1);
            } else {
                Integer count = mapWords.get(vocabulary);
                mapWords.put(vocabulary, count + 1);
            }
        }

        System.out.println(mapWords);

        List<Word> vocabularyList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : mapWords.entrySet()){
            Word word =new Word(entry.getKey(), entry.getValue());
            vocabularyList.add(word);

        }
        System.out.println(vocabularyList);

        Collections.sort(vocabularyList);
        System.out.println(vocabularyList);




    }
    private static class Word implements Comparable<Word>{
       private String word;
       private Integer count;

        public Word(String word, Integer count) {
            this.word = word;
            this.count = count;
        }

        @Override
        public int compareTo(Word o) {
            int result = Integer.compare(o.count, this.count);
            if (result == 0) this.word.compareTo(o.word);
            return result;
        }

        @Override
        public String toString() {
            return "Word{" +
                    "word='" + word + '\'' +
                    ", count=" + count +
                    '}';
        }
    }

}
