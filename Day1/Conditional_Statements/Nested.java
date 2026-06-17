package Day1.Conditional_Statements;

public class Nested {
    public static void main(String[] args) {
        int tenth = 80;
        int twelth = 65;
        int CG = 5;
        int placement = 85;

        if (tenth > 70) {
            if (twelth > 60) {
                if (CG > 7) {
                    if (placement > 80) {
                        System.out.println("Placement crack!!!");
                    } else {
                        System.out.println("Chal betta bahar placement no nhi ayye");
                    }
                } else {
                    System.out.println("Chal betta bahar CG kaam hai");
                }
            } else {
                System.out.println("Chal betta bahar 12 mai nhi hai");
            }

        } else {
            System.out.println("Chal betta bahar 10 mai no nhi hai");
        }
    }
}
