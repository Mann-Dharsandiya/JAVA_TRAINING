package Day13.QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class Hospital {
    Queue<Patient> line = new LinkedList<>();

    void addPatient(Patient pt) {
        line.offer(pt);
        System.out.println("Patient added");
    }

    void addMultiplePatients(Patient pt[]) {
        for (Patient pat : pt) {
            addPatient(pat);
        }
    }

    Patient callPatient() {
        if (line.isEmpty()) {
            return null;
        }
        return line.poll();
    }

    Patient ViewNext() {
        if (line.isEmpty()) {
            return null;
        }
        return line.peek();
    }

    void DisplayAlltheWaiting() {
        if (!line.isEmpty()) {
            for (Patient patient : line) {
                System.out.println(patient);
            }
        } else {
            System.out.println("List is empty");
        }

    }

    boolean checkQueue() {
        return line.isEmpty();
    }

    void ClearQueue() {
        line.clear();
    }

}
