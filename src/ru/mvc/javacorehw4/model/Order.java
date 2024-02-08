package ru.mvc.javacorehw4.model;

public class Order {
    private Customer customer;
    private Product product;
    private int quantity;

    public Order(Customer customer, Product product, int quantity){
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }
    public Customer getBuyer(){
        return customer;
    }
    public Product getProduct(){
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setBuyer(Customer customer){
        this.customer = customer;
    }
    public void setProduct(Product product){
        this.product = product;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s", customer, product, quantity);
    }
}
