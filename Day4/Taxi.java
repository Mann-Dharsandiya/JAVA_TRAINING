package Day4;

import java.util.Scanner;

public class Taxi {

    static int CalFare(String TypeofTaxi, int TravelDist) {
        if (TypeofTaxi.equals("Car")) {
            return TravelDist * 25;

        } else if (TypeofTaxi.equals("Bike")) {
            return TravelDist * 10;
        } else if (TypeofTaxi.equals("Rental")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("FOr how much time you want to book");
            int Time = sc.nextInt();
            if (Time == 1) {
                return TravelDist * 28;
            } else if (Time == 2) {
                return TravelDist * 30;
            } else {
                return TravelDist * 35;
            }

        } else {
            System.out.println("Type of taxi is not available");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the type of taxi you want to book");
        String TypeofTaxi = sc.next();

        System.out.println("Enter the distance");
        int TravelDist = sc.nextInt();

        int fare = CalFare(TypeofTaxi, TravelDist);

        System.out.println("Your total Fare will be " + fare);
    }
}
