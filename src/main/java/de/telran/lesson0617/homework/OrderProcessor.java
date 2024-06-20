package de.telran.lesson0617.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderProcessor {
    private List<Order> orders = new ArrayList<>();
    private String customerId = UUID.randomUUID().toString();
    private String itemId = UUID.randomUUID().toString();
    private double shippingCost;

    public void processOrder(Customer customer, Order order, String shippingMethod) {
        isCustomer(customer);
        List<Item> listOrder = getListOrder(itemId);
        double totalAmount = 0;
        for (Item item : listOrder) {
            totalAmount += item.getPrice();
        }

        payMethod(shippingMethod);

        order = getOrder(customer, listOrder, totalAmount);

        orders.add(order);
        System.out.println("Order processed: " + order.getId());
    }

    public boolean isCustomer(Customer customer) {
        if (customer.getId() == null) {
            System.err.println("Customer not found");
        }
        return false;
    }

    public List<Item> getListOrder(String itemId) {
        List<Item> items = new ArrayList<>();
        Item item = new Item(itemId, "item Name", Math.random() * 100);
        if (item.getId() != null) {
            items.add(item);
        } else {
            System.out.println("Item not found: " + itemId);
        }
        return items;
    }

    public double payMethod(String shippingMethod) {
        if ("standard".equals(shippingMethod)) {
            shippingCost = 5.99;
        } else if ("express".equals(shippingMethod)) {
            shippingCost = 9.99;
        } else {
            System.out.println("Invalid shipping method");
        }
        return shippingCost;
    }
    public Order getOrder(Customer customer, List<Item> listOrder, double totalAmount){
       Order order = new Order();
        order.setCustomer(customer);
        order.setItems(listOrder);
        order.setTotalAmount(totalAmount);
        order.setShippingCost(shippingCost);
        order.setOrderStatus("Processing");
        return order;
    }

    public void cancelOrder(long orderId) {
        Order orderToRemove = null;
        for (Order order : orders) {
            if (order.getId() == orderId) {
                orderToRemove = order;
                break;
            }
        }
        if (orderToRemove != null) {
            orders.remove(orderToRemove);
            System.out.println("Order canceled: " + orderToRemove.getId());
        } else {
            System.out.println("Order not found: " + orderId);
        }
    }

    public void printOrderDetails(long orderId) {
        Order foundOrder = null;
        for (Order order : orders) {
            if (order.getId() == orderId) {
                foundOrder = order;
                break;
            }
        }
        if (foundOrder != null) {
            System.out.println("Order Details: ");
            System.out.println("Customer: " + foundOrder.getCustomer().getName());
            System.out.println("Items: ");
            for (Item item : foundOrder.getItems()) {
                System.out.println(" - " + item.getName() + ": $" + item.getPrice());
            }
            System.out.println("Total Amount: $" + foundOrder.getTotalAmount());
            System.out.println("Shipping Cost: $" + foundOrder.getShippingCost());
            System.out.println("Status: " + foundOrder.getOrderStatus());
        } else {
            System.out.println("Order not found: " + orderId);
        }
    }


}
