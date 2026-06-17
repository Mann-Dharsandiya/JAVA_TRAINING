package Day9.PolyMorphism;

public class App {
    public static void main(String[] args) {
        // PaymentService payment = new PaymentService();

        // payment.pay(500);

        // payment.pay(2000, 50504040);

        // payment.pay(1000, "Pankaj@oksbi");

        Notification s1 = new EmailNotification();
        Notification s2 = new SMSNotification();
        Notification s3 = new WhatsAppNotification();

        s3.send();

    }
}
