package de.telran.lesson0506.homework;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class HomeworkRead {
    public static void main(String[] args) {
        File file = new File("resources/testFile.txt");
        List<String> strings = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            while (bufferedReader.ready()) {
                strings.add(bufferedReader.readLine());
            }
            System.out.println("File size: " + file.length() + " bytes");
            System.out.println("File size: " + (double) file.length() / 1024 + " KB");
            System.out.println("File size: " + (double) file.length() / 2048 + " MB");
            System.out.println("Number of lines: " + strings.stream().count());
            long words = strings.stream().flatMap(s -> Stream.of(s.split("\\W+")).filter(t -> !t.isEmpty()))
                    .count();
            System.out.println("Number of symbols: " + words);
        } catch (IOException e) {
            System.out.println("We have problem with file " + e.getMessage());
        }
    }

}
