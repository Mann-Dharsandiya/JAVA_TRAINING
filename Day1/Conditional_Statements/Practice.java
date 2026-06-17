package Day1.Conditional_Statements;

public class Practice {
    public static void main(String[] args) {
        Double weight = 71.00;
        Double height = 1.7;

        Double bmi = weight / (height * height);

        System.out.println(bmi);

        if (bmi < 18.5) {
            System.out.println("Chal be patlu!!");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Fit fit");
        } else if (bmi >= 25.0 && bmi < 29.9) {
            System.out.println("chal be mottee");
        } else {
            System.out.println("bhains ki aulaad");
        }

    }
}
