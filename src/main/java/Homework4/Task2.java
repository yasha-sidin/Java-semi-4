package Homework4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> numbers = new LinkedList<Integer>();
        int sizeOfList = 12;
        for (int i = 0; i < 12; i++) {
            numbers.add(random.nextInt(0, 100));
        }
        System.out.println(numbers);
        System.out.println(reverseList(numbers));
    }
    private static List reverseList(List elements) {
        List newList = new LinkedList();
        for (int i = 0; i < elements.size(); i++) {
            newList.add(0, elements.get(i));
        }
        return newList;
    }
}
