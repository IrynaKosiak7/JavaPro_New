package de.telran.lesson0327.Homework;

import de.telran.lesson0327.map.Pizza;

import java.util.*;

public class Customer implements Comparable<Customer>{

    private String name;
    private String email;
    private String country;
    private int bonusAmount;
    private boolean isEmailConfirmed;

    public Customer(String name, String email, String country, int bonusAmount, boolean isEmailConfirmed) {
        this.name = name;
        this.email = email;
        this.country = country;
        this.bonusAmount = bonusAmount;
        this.isEmailConfirmed = isEmailConfirmed;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", country='" + country + '\'' +
                ", bonusAmount=" + bonusAmount +
                ", isEmailConfirmed=" + isEmailConfirmed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return  Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }
    @Override
    public int compareTo(Customer other) {
        int i = this.email.compareTo(other.email);
        return i;
    }
    public static void main(String[] args) {
        Customer customer1 = new Customer("Ivan", "new124@gmail.com", "German", 10, false);
        Customer customer2 = new Customer("Iryna", "irYna@yandex.ua", "Belarus", 15, true);
        Customer customer3 = new Customer("Olena", "NewAccount@ukr.net", "Ukraine", 5, true);
        Customer customer4 = new Customer("Ivanka", "MyEmail@qmail.com", "Italy", 7, false);
        Customer customer5 = new Customer("Ivan", "NewMoglichkeit@qmail.com", "Austria", 20, true);
        Customer customer6 = new Customer("Linda", "NewMyaccount@qmail.com", "German", 12, false);
        Customer customer7 = new Customer("Iryna", "MyAccountForIryna@gmail.com", "Ukraine", 10, true);
        Customer customer8 = new Customer("Lidia", "LIdAccountMy@gmail.com", "Austria", 20, false);

        List<Customer> customerList = new ArrayList<>(Arrays.asList(customer1, customer2, customer3, customer4, customer5, customer6, customer7, customer8));
        Map<String, String> customerCountByCountry = new TreeMap<>();
        for (Customer customer : customerList) {
            String email = customer.email;
            if (!customerCountByCountry.containsKey(email)) {
                customerCountByCountry.put(customer.email, customer.country);
            }
        }
        System.out.println(customerCountByCountry);

        Map<String, String> customerCountByName = new TreeMap<>();
        for (Customer customer : customerList) {
            String email = customer.email;
            if (!customerCountByName.containsKey(email)) {
                customerCountByName.put(customer.email, customer.name);
            }
        }
        System.out.println(customerCountByName);

        Map<Boolean, Set<String>> customerIsEmailConfirmed = new TreeMap<>();
        for (Customer customer : customerList) {
            Boolean isConfirmed = customer.isEmailConfirmed;
            if (customerIsEmailConfirmed.containsKey(isConfirmed)) {
                Set<String> confirmedSet = customerIsEmailConfirmed.get(isConfirmed);
                confirmedSet.add(customer.email);
            } else {
                Set<String> confirmedSet = new HashSet<>();
                confirmedSet.add(customer.email);
                customerIsEmailConfirmed.put(isConfirmed, confirmedSet);
            }
        }
        System.out.println(customerIsEmailConfirmed);

        Map<String, Set<String>> customerCountByOtherCuntry = new TreeMap<>();
        for (Customer customer : customerList) {
            String country = customer.country;
            if (customerCountByOtherCuntry.containsKey(country)) {
                Set<String> countrySet = customerCountByOtherCuntry.get(country);
                countrySet.add(customer.name);
            } else {
                Set<String> countrySet = new HashSet<>();
                countrySet.add(customer.name);
                customerCountByOtherCuntry.put(customer.country, countrySet);
            }
        }
        System.out.println(customerCountByOtherCuntry);

        Map<String, Integer> customerCountBySumBounus = new TreeMap<>();
        for (Customer customer : customerList) {
            String country = customer.country;
            int bonus = customer.bonusAmount;
            if (!customerCountBySumBounus.containsKey(country)) {
                customerCountBySumBounus.put(country, bonus);
            } else {
                Integer bonusCount = customerCountBySumBounus.get(country);
                customerCountBySumBounus.put(country, bonusCount + bonus);
            }
        }
        System.out.println(customerCountBySumBounus);

        Map<Customer, Integer> hashMapExample = new HashMap<>();
        hashMapExample.put(customer1,1);
        hashMapExample.put(customer2, 2);
        System.out.println(hashMapExample);

        Map<Customer, String> treeMapExample = new TreeMap<>();
        treeMapExample.put(customer5, "newCustomer");
        treeMapExample.put(customer4, "oldClient");
        System.out.println(treeMapExample);


    }


}
