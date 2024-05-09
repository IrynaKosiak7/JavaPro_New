package de.telran.lesson0506.homework;

import de.telran.lesson0506.exception.InputValidationException;

import java.io.IOException;

public class LoginAndPasswordVerification {
    public static void main(String[] args) {
        try {
            boolean isValid1 = checkLoginAndPassword("john", "123", "123");
            System.out.println(isValid1);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bye");
        }


        try {
            boolean isValid2 = checkLoginAndPassword("john", "123", "1234");
            System.out.println(isValid2);


        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bye");
        }


        try {
            boolean isValid3 = checkLoginAndPassword("john", "123@", "123@");
            System.out.println(isValid3);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bye");
        }


        try {
            boolean isValid4 = checkLoginAndPassword("john@", "123", "123");
            System.out.println(isValid4);

        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Bye");
        }



    }

    public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) throws WrongPasswordException, WrongLoginException {
        if (login == null) throw new WrongLoginException("input login cannot be null");
        if (login.length() > 20) throw new WrongLoginException("login is too long");
        if (!login.matches("^[a-zA-Z]+$")) throw new WrongLoginException("Login must contain only Latin letters.");

        if (password == null) throw new WrongPasswordException("input password cannot be null");
        if (password.length() > 20) throw new WrongPasswordException("login is too long");
        if (!password.matches("\\d+")) throw new WrongPasswordException("Password is wrong");

        if (!confirmPassword.equals(password))
            throw new WrongPasswordException("confirmPassword and password aren't equal");

        return true;

    }

}
