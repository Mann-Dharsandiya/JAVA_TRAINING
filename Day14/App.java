package Day14;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {
        Map<Integer, String> employees = new HashMap<>();

        employees.put(90, "Aakash");
        employees.put(101, "Oberoi");
        employees.put(103, "Dhakad");
        employees.put(104, "Sam");
        employees.put(113, "Gursimran");

        System.out.println(employees.entrySet());

        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry);
        }

        // System.out.println(employees.keySet());

        // for (Integer i : employees.keySet()) {
        // System.out.println(employees.get(i));
        // }

        // System.out.println(employees.values());

        // System.out.println(employees);

        // System.out.println(employees.size());

        // System.out.println(employees.get(101));

        // System.out.println(employees.getOrDefault(90, "User not found"));

        // employees.putIfAbsent(104, "PAM");

        // System.out.println(employees);

        // System.out.println(employees.containsKey(95));

        // System.out.println(employees.containsValue("Sam"));

        // employees.remove(101);

        // System.out.println(employees);

        // employees.remove(90, "Aakash");

        // System.out.println(employees);

        // System.out.println(employees.replace(90, "kunal"));

        // System.out.println(employees);

        // employees.replace(104, "Sam", "Pam");

        // System.out.println(employees);

        // Map<Integer, String> students = new LinkedHashMap<>();

        // students.put(101, "Oberoi");
        // students.put(103, "Dhakad");
        // students.put(104, "Sam");
        // students.put(103, "Gursimran");
        // students.put(100, "Mann");
        // students.put(null, null);
        // students.put(null, null);

        // System.out.println(students);

        // Map<Integer, String> products = new TreeMap<>();

        // products.put(201, "chips");
        // products.put(190, "icecream");
        // products.put(215, "Colddrink");

        // System.out.println(products);

    }
}
