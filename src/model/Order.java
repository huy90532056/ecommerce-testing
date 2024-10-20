package model;

import java.util.Date;
import java.util.List;

public class Order {
    private String orderId;
    private Customer customer;
    private Date orderDate;
    private String status;
    private List<OrderItem> items;
    private Payment payment;
    private ShippingTracker shipping;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public ShippingTracker getShipping() {
        return shipping;
    }

    public void setShipping(ShippingTracker shipping) {
        this.shipping = shipping;
    }
}
