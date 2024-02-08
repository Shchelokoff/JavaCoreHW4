package ru.mvc.javacorehw4.model;

public class CustomerException extends Exception{
    public CustomerException(){
        this("Покупателя не существует");
    }

    public CustomerException(String customerName) {
        super("Имя: " + customerName);
    }
}