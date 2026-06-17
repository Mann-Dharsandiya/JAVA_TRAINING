package Day12.SetInterface;

public class Main {
    public static void main(String[] args) {
        AdmissionSystem system = new AdmissionSystem();

        Student arr[] = { new Student(101, "Shlok", "Shlok@gmail.com", "B.TECH"),
                new Student(102, "Shlok Kumar", "SHLOK@gmail.com", "MBA"),
                new Student(104, "Pankaj", "PANKAJ@gmail.com", "BCA"),
                new Student(107, "keshvi", "KeShvI@gmail.com", "MCA")
        };

        system.registerMultipleStudents(arr);

        system.displayStudents();

    }
}
