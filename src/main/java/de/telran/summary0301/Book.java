package de.telran.summary0301;

public class Book {
    private String name = "Name";
    public void printBook(){
        String info = "Info";
        int x = 10;
        innerMethod(info, x);
    }
    private void innerMethod (String info, int x){
        System.out.println(info +" " + x);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.printBook();
    }
}
