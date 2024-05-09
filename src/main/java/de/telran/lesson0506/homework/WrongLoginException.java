package de.telran.lesson0506.homework;

public class WrongLoginException  extends  Exception{
    public WrongLoginException() {
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
