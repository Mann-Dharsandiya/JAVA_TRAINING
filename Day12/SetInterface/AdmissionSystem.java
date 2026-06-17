package Day12.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class AdmissionSystem {

    Set<Student> students = new HashSet<>();

    // Register student
    void registerStudent(Student student) {
        if (student.getEmail() == null || student.getEmail().isEmpty()) {
            System.out.println("Not a valid email");
            return;
        }
        if (students.add(student)) {
            System.out.println("Registration successfull!!");
        } else {
            System.out.println("Duplicate email , please change it");
        }

    }

    // Register Multiple students

    void registerMultipleStudents(Student student[]) {
        for (Student st : student) {
            registerStudent(st);
        }
    }

    // Remove Student
    void removeStudent(String email) {

        Student toBeRemoved = null;

        for (Student st : students) {
            if (st.getEmail().equalsIgnoreCase(email)) {
                toBeRemoved = st;
                break;
            }
        }
        if (toBeRemoved != null) {
            students.remove(toBeRemoved);
            System.out.println("Student removed successfully");
        } else {
            System.out.println("Email not found");
        }

    }

    // Search
    void searchStudent(String email) {
        if (students.isEmpty()) {
            System.out.println("List if registration is empty");
            return;
        }

        for (Student st : students) {
            if (st.getEmail().equals(email)) {
                System.out.println("Registration found!");
                System.out.println(st);
                return;
            }
        }

        System.out.println("Registration not found");
    }

    // Display

    void displayStudents() {
        for (Student st : students) {
            System.out.println(st);
        }
    }

    // total count
    void TotalRegistrations() {
        System.out.println("total registration are " + students.size());
    }

    // Empty ?
    void checkEmpty() {
        if (students.isEmpty()) {
            System.out.println("Your list is empty");
        }
    }

    // clear

    void clearList() {
        students.clear();
        System.out.println("List cleared successfully");
    }

}
