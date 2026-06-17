package Day12.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {
        // HashSet<Integer> set = new HashSet<>();

        // Set<Integer> set2 = new Set<Integer>();

        // Unordered
        Set<Integer> set = new HashSet<>();

        set.add(3);
        set.add(30);
        set.add(35);
        set.add(32);
        set.add(3);

        System.out.println(set);

        set.remove(3);

        System.out.println(set);

        System.out.println(set.contains(3));

        set.clear();

        System.out.println(set);

        set.size();

        set.isEmpty();

        // LinkedHashSet<Integer> linkedSet = new LinkedHashSet<>();

        // linkedSet.add(3);
        // linkedSet.add(30);
        // linkedSet.add(35);
        // linkedSet.add(32);
        // linkedSet.add(3);

        // System.out.println(linkedSet);

        // Set<Integer> treeSet = new TreeSet<>();

        // treeSet.add(3);
        // treeSet.add(30);
        // treeSet.add(35);
        // treeSet.add(32);
        // treeSet.add(3);

        // System.out.println(treeSet);

    }
}
