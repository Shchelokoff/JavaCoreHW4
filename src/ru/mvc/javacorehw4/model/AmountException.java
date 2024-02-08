package ru.mvc.javacorehw4.model;

public class AmountException extends Exception{
    public AmountException(){
        this("Неверное количество товара");
    }

    public AmountException(String string) {
        super(string);
    }
}
