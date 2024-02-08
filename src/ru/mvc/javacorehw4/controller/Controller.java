package ru.mvc.javacorehw4.controller;

import ru.mvc.javacorehw4.model.*;
import ru.mvc.javacorehw4.view.View;

public class Controller {

    public Controller() throws CustomerException{
        Customer[] customer = new Customer[]{
                new Customer("Иванов Иван Иваночич"),
                new Customer("Петров Петр Петрович")
        };
        Product[] products = new Product[]{
                new Product("Йогурт", 50),
                new Product("Хлеб", 30),
        };
        Order[] orders = new Order[5];
        orders[0] = Controller.makeAPurchase(customer, products, "Иванов Иван Иваночич", "Хлеб", 2);
        orders[1] = Controller.makeAPurchase(customer, products, "Васильев Федор Валентиновчи", "Рыба", 2);
        orders[2] = Controller.makeAPurchase(customer, products, "Петров Петр Петрович", "Ананас", 10);
        orders[3] = Controller.makeAPurchase(customer, products, "Петров Петр Петрович", "Йогурт", 105);
        orders[4] = Controller.makeAPurchase(customer, products, "Иванов Иван Иваночич", "Бананы", 10);

        for(Order order : orders){
            System.out.println(order);
        }
    }
    private static Order makeAPurchase(Customer[] customers, Product[] products, String name, String productName, int quantity) throws CustomerException{
        Order order = null;
        Customer customer = null;
        Product product = null;
        try{
            for(Product temp : products){
                if(temp.getProductName().equals(productName))
                    product = temp;
            }
            if(product == null)
                throw new ProductException(productName);
            try{
                if(quantity <= 0 || quantity >= 100)
                    throw new AmountException();
            }catch (AmountException e) {
                System.out.println(e);
                quantity = 1;
            }
            for(Customer temp : customers){
                if(temp.getName().equals(name))
                    customer = temp;
            }
            if(customer == null)
                throw new CustomerException(name);
            order = new Order(customer, product, quantity);
        }catch(ProductException e){
            System.out.println(e);
        }
        return order;
    }
}
