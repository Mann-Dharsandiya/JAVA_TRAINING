package Day7;

public class Employees {

    static void findByFirst(String Employees[]) {
        String input = "Pankaj";
        int flag = 0;
        for (String name : Employees) {
            if (name.startsWith(input)) {
                flag++;
                System.out.println("Mil gya majdoor " + name);

            }

        }
        if (flag == 0) {
            System.out.println("Nhi mila majdoor maalik");
        }
    }

    static void findByLast(String Employees[]) {
        String input = "Kumar";
        int flag = 0;
        for (String name : Employees) {
            if (name.endsWith(input)) {
                flag++;
                System.out.println("Mil gya majdoor " + name);
            }
        }
        if (flag == 0) {
            System.out.println("Nhi mila majdoor maalik");
        }
    }

    static void countOfEmp(String Employees[]) {
        System.out.println("No of employees are " + Employees.length);
    }

    static void LongestName(String Employees[]) {
        int Longestlength = Employees[0].length();
        String LongestName = "";
        for (String name : Employees) {
            if (name.length() > Longestlength) {
                Longestlength = name.length();
                LongestName = name;
            }
        }

        System.out.println("Longest length of a name is " + Longestlength + " " + LongestName);

    }

    static void toCapital(String Employees[]) {
        for (String name : Employees) {
            System.out.println(name.toUpperCase());
        }
    }

    public static void main(String[] args) {
        String employee[] = { "Shlok Kumar",
                "Pankaj Oberoi",
                "Rohit Sharma",
                "Virat Kohli",
                "Aman Singh" };

        findByFirst(employee);
        findByLast(employee);
        countOfEmp(employee);
        LongestName(employee);
        toCapital(employee);
    }
}
