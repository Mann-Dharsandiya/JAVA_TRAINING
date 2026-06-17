package Day13.QueueInterface;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Hospital hos = new Hospital();
        ArrayList<Patient> line = new ArrayList<>();

        line.add(new Patient(101, "Pankaj", 26, "TimePass"));

        line.add(new Patient(107, "Rahul", 20, "TimePass"));

        line.add(new Patient(102, "Jaanu", 24, "TimePass"));

        line.add(new Patient(105, "Ram", 18, "TimePass"));

        System.out.println(line);

        Collections.sort(line, new SortByPatientAge());
        System.out.println("===================Sorted on basis of Age=============");
        System.out.println(line);
    }
}
