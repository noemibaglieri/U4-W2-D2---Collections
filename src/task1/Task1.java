package task1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many words do you want to enter?");
        int n = Integer.parseInt(scanner.nextLine());

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter word " + (i + 1) + ":");
            String word = scanner.nextLine();

            if (!uniqueWords.add(word)) {
                duplicates.add(word);
            }
        }

        System.out.println("Duplicate words:");
        if (duplicates.isEmpty()) {
            System.out.println("None");
        } else {
            for (String word : duplicates) {
                System.out.println(word);
            }
        }

        System.out.println("Number of distinct words: " + uniqueWords.size());

        System.out.println("List of distinct words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        scanner.close();
    }

}
