package ru.mvc.javacorehw4.model;

public class ProductException extends Exception{
    public ProductException(String productName){
        super("Товар '" + productName + "' не существует");
    }

}