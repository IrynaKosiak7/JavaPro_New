package de.telran.lesson0228.ClassWork;

public class UseErrorCodes {
    public static void main(String[] args) {
        ErrorCode errorCode = ErrorCode.NOT_FOUND;
        System.out.println(errorCode);
        System.out.println(errorCode.getCode());
        System.out.println(errorCode.getMessage());

    }
}
