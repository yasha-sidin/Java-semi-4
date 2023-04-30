import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex001 {
    public static void main(String[] args) {
        String regex = "^[A-Za-z]+~\\d+$";
        Scanner iScanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print(">_");
            String element = iScanner.next();

            if(Pattern.matches(regex, element) == true) {
                String[] tempArr = element.split("~");
                int tempPosition = Integer.parseInt(tempArr[1]);
                for(int j = 0; j <= tempPosition; j++) {
                    try {
                        if (list.get(j) != null) {

                        }
                    } catch (IndexOutOfBoundsException e) {
                        list.add(null);
                    }
                }

                if(tempArr[0].equals("print")) {
                    list.set(tempPosition, null);
                } else {
                    list.set(tempPosition, tempArr[0]);
                }

            } else {
                System.out.println("Неверный формат");
                i--;
            }
        }
        printListString(list);
    }

    private static void printListString(List<String> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) != null) {
                System.out.printf("%d) %s\n", i, list.get(i));
            }
        }
    }

}
