package Day4;

import java.util.Scanner;

public class Zomato {

    static double orderFood() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item you want to order");
        String Foodname = sc.next();
        if (Foodname.equals("Misal")) {
            return 250.00;
        } else if (Foodname.equals("Burger")) {
            return 300.00;
        } else if (Foodname.equals("Pizza")) {
            return 500.00;
        } else {
            System.out.println("No item found");
            return 0.0;
        }
    }

    static double deliverycharges(Double FoodPrice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the restraunt distance ");
        int distance = sc.nextInt();
        System.out.println("Your Food is coming from " + distance + " Km , we will add some delivery charges");
        if (distance > 10 && distance < 20) {
            FoodPrice = distance * 2 + FoodPrice;
        } else if (distance >= 20 && distance < 30) {
            FoodPrice = distance * 3 + FoodPrice;
        } else if (distance >= 30) {
            FoodPrice = distance * 4 + FoodPrice;
        } else {
            System.out.println("Free Delivery");
        }

        return FoodPrice;

    }

    static double applycoupon(double FoodPrice) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have Coupon");
        char Coupon = sc.next().charAt(0);

        if (Coupon == 'Y') {
            System.out.println("Enter your Coupon!");
            String CouponValue = sc.next();
            if (CouponValue.equals("IPLRCB")) {
                FoodPrice = FoodPrice - (FoodPrice * 0.25);
                return FoodPrice;
            }
        }

        return FoodPrice;

    }

    static double GST(double FoodPrice) {
        System.out.println("Adding 7% GST by Restraunt! ");
        FoodPrice = FoodPrice + (FoodPrice * 0.07);
        return FoodPrice;
    }

    static void finalamt(double Pf, double FWD, double DAMT, double FoodGST) {
        System.out.println("Your Food Price " + Pf);
        System.out.println("Food With Delivery Charges " + FWD);
        System.out.println("Food With or without Discount " + DAMT);
        System.out.println("Final Food Price after GST " + FoodGST);
    }

    public static void main(String[] args) {

        double PriceOfFood = orderFood();
        double FoodWithDeliveryCharge = deliverycharges(PriceOfFood);
        double discountedAmt = applycoupon(FoodWithDeliveryCharge);
        double foodwithGst = GST(discountedAmt);

        finalamt(PriceOfFood, FoodWithDeliveryCharge, discountedAmt, foodwithGst);

    }
}
