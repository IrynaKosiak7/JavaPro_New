package de.telran.lesson0327.Homework;

import java.util.*;
class Client{
    Queue<Products> product;
    public void choiceProduct(){
        if (!product.isEmpty()){
            Products pool = product.poll();
            System.out.println(" I buy this product " + pool);
        }
    }

    public Client(Queue<Products> products) {
        this.product = products;
    }

}

public class Products {
    String name;
    int price;
    int expiry_date;

    public Products(String name, int price, int expiry_date) {
        this.name = name;
        this.price = price;
        this.expiry_date = expiry_date;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", expiry_date=" + expiry_date +
                '}';
    }


    public static void main(String[] args) {
        Products product1 = new Products("Mango", 2, 10);
        Products product2 = new Products("Avocado", 1, 7);
        Products product3 = new Products("Milk", 3, 4);
        Products product4 = new Products("Bret", 1, 5);
        Products product5 = new Products("Fish", 4, 2);
        Products product6 = new Products("Eis",1,1);
        Products product7 = new Products("Book",2, 100);
        Products product8 = new Products("Perfume", 25,50);
        Products product9 = new Products("ShowerGel", 4, 120);
        Products product10 = new Products("Yoghurt", 1, 11);
        Products product11 = new Products("Shampoo", 2, 150);
        Products product12 = new Products("Comics",3, 70);

        Queue<Products> productsQueue = new PriorityQueue<>(new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                return o2.expiry_date - o1.expiry_date;
            }
        });

        productsQueue.add(product1);
        productsQueue.add(product2);
        productsQueue.add(product3);
        productsQueue.add(product4);
        productsQueue.add(product5);
        productsQueue.add(product6);
        productsQueue.add(product7);
        productsQueue.add(product8);
        productsQueue.add(product9);
        productsQueue.add(product10);
        productsQueue.add(product11);
        productsQueue.add(product12);
        Client client1= new Client(productsQueue);
        Client client2 = new Client(productsQueue);
        client1.choiceProduct();
        client1.choiceProduct();
        client2.choiceProduct();
        client2.choiceProduct();

        List<Products> productsList = new ArrayList<>(Arrays.asList(product1,product2,product3,product4,product5,product6,product7,product8,product9,product10,product11,product12));

        System.out.println(list_of_the_cheapest_products(productsList, 5));
        System.out.println(list_of_the_cheapest_products(productsList, -5));
        System.out.println(list_of_the_cheapest_products(productsList, 3));
        System.out.println(list_of_the_cheapest_products(productsList, 10));


    }

    private static List<Products> list_of_the_cheapest_products(List<Products> productsList, int k) {
        Collections.sort(productsList,new Comparator<Products> (){
            @Override
            public int compare(Products o1, Products o2) {
                return Integer.compare(o1.price, o2.price);
            }

        } );
        List<Products> newList = new ArrayList<>();
        for (int i = 0; i < k ; i++) {
            newList.add(productsList.get(i));
        }
        return newList;
    }
}
