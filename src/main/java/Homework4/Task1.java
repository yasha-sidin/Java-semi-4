package Homework4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        List<String> main = new ArrayList<>();
        while (true) {
            System.out.print("Введите элемент или команду: ");
            String tempEl = iScanner.next();
            if (tempEl.equals("Stop")) {
                break;
            } if (tempEl.equals("print")) {
                for (int i = 0; i < main.size(); i++) {
                    if (i == 0) {
                        System.out.print(main.get(main.size() - 1) + " ");
                    } if (i == (main.size() - 1)) {
                        System.out.print(main.get(0) + " ");
                    } if (i !=  main.size() - 1 && i != 0){
                        System.out.print(main.get(i) + " ");
                    }
                }
                System.out.println();
            } if (tempEl.equals("revert")) {
                main.remove(main.size() - 1);
            } if (!tempEl.equals("revert") && !tempEl.equals("print")) {
                main.add(tempEl);
            }
        }
    }
}
