package Day14;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderManager {
    HashMap<Integer, Customer> customers = new HashMap<>();

    ArrayList<Order> orders = new ArrayList<>();

    public void addCustomer(Customer cust) {
        customers.putIfAbsent(cust.getCustomerId(), cust);
    }

    public void addOrder(Order order) {
        if (customers.containsKey(order.getCustomerId())) {
            System.out.println("Order placed successfull");

            orders.add(order);
        } else {
            System.out.println("We can not find respective cust for this order");
        }
    }

    public void displayCustomers() {
        if (customers.isEmpty()) {
            System.out.println("Map is empty");
            return;
        }
        for (Customer customer : customers.values()) {
            System.out.println(customer);
        }
    }

    public void displayOrders() {
        if (orders.isEmpty()) {
            System.out.println("Order list is empty");
            return;
        }

        for (Order order : orders) {
            System.out.println(order);
        }
    }

    public void displayOrdersOfCustomers(int customerId) {
        Customer cust = customers.get(customerId);

        if (cust == null) {

        } else {
            System.out.println("Order of " + cust.getCustomerName());

            int flag = 0;

            for (Order or : orders) {
                if (or.getCustomerId() == customerId) {
                    System.out.println(or);
                    flag++;
                }
            }

            if (flag == 0) {
                System.out.println("No orders found");
            }
        }

    }

    public void calculateTotalSpending(int customerId) {
        double totalSpent = 0;
        if (customers.get(customerId) == null) {
            System.out.println("No customer present");
            return;
        }
        for (Order or : orders) {
            if (or.getCustomerId() == customerId) {
                totalSpent += or.getAmount();
            }
        }

        Customer cust = customers.get(customerId);

        System.out.println("Total order amount of  " + cust.getCustomerName() + " is " + totalSpent);

    }

    public void findHighesSpendingCustomer() {
        double maxAmt = 0;
        Customer topSpendingCustomer = null;

        for (Customer cust : customers.values()) {
            double total = 0;
            for (Order or : orders) {
                if (or.getCustomerId() == cust.getCustomerId()) {
                    total += or.getAmount();
                }
            }
            if (total > maxAmt) {
                maxAmt = total;
                topSpendingCustomer = cust;
            }
        }

        System.out.println("Highest spending customer - " + topSpendingCustomer.getCustomerName()
                + " with the spending of " + maxAmt);

    }

    public void countOrdersPerCustomer() {

        for (Customer cust : customers.values()) {
            double count = 0;
            for (Order or : orders) {
                if (or.getCustomerId() == cust.getCustomerId()) {
                    count++;
                }
            }
            System.out.println(cust.getCustomerName() + " " + count);
        }
    }

    public void removeCustomer(int customerId) {
        customers.remove(customerId);

        for (Order order : orders) {
            if (customerId == order.getCustomerId()) {
                orders.remove(order);
            }
        }
    }

}
