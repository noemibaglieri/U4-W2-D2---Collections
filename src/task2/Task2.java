package task2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        orderedList(7);

        ArrayList<Integer> listOfNumbers = new ArrayList<>(Arrays.asList(5, 6, 8, 7, 9, 1, 2));
        randomList(listOfNumbers);

    }

    static void orderedList(int num) {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < num; i++) {
            int randomNumber = random.nextInt(101);
            listOfNumbers.add(randomNumber);
        }

        System.out.println(listOfNumbers);
    }

    static void randomList(ArrayList<Integer> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }


}
