package de.telran.methods;

public class TestMethods {
    public static void main(String[] args) {
        method();
        method("string");
        method("String",1);
        method(new String[] {"A","B"});
    }
    public static String method(String s){
        return  "String";
    }
    public static String method(String s, Integer i){
        return  "String";
    }
    public static String method(String[] s){
        return  "String";
    }
    public static int method(){
        return 0;
    }
}
