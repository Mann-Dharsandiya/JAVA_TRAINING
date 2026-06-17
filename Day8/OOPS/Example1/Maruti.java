package Day8.OOPS.Example1;

public class Maruti {

    static int Cartyres = 4;
    int Model;// class attribute -> instance variable
    double TopSpeed;
    String color;

    void StartEngine() {
        int petrol = 3;// local variable
        System.out.println(3 + " litree free oil to you!!");
        System.out.println("Bruummm bRummmmm");
    }

    void StopEngine() {
        System.out.println("Chikkkchiikcchiikkk");
    }

    void drift() {
        System.out.println("sheeeeeeeeeeeeeeeee");

    }

    static void serverWater() {
        System.out.println("Lee munna paani peee");
    }

    void carVarient(String varient) {
        System.out.println(varient.toUpperCase() + " is available");
    }

}
