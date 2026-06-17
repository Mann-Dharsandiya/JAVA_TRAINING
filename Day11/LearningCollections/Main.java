package Day11.LearningCollections;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> marks = new LinkedList<>();

        // System.out.println(marks);

        marks.addFirst(20);
        marks.addLast(30);
        marks.addFirst(10);
        marks.addLast(40);

        System.out.println(marks);

        marks.removeFirst();

        System.out.println(marks);

        marks.removeLast();

        System.out.println(marks);

        System.out.println(marks.getFirst());

        System.out.println(marks.getLast());

        System.out.println(marks.size());

    }
}
