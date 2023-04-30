import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Ex000 {
    public static void main(String[] args) {
        ex0();
    }

    private static void ex0() {
        final int SIZE = 100_000;
        Random random = new Random();

        List<Integer> linkedList = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            linkedList.add(0, random.nextInt());
        }
        System.out.println("linkedList: " + (System.currentTimeMillis() - start));

        List<Integer> arrayList = new ArrayList<>(SIZE);
        start = System.currentTimeMillis();
        for (int i = 0; i < SIZE; i++) {
            arrayList.add(0, random.nextInt());
        }
        System.out.println("arrayList: " + (System.currentTimeMillis() - start));
    }
}
