package de.telran.lesson0221;

public class UserChildParent {
    public static void main(String[] args) {
//        Parents parents = new Parents();
//        Child child = new Child();
//        System.out.println(child.publicField);


//        System.out.println(child.getPrivateField());
//       child.publicMethod();

//        Parents entity = null;
//        boolean condition = false;
//
//        if (condition) {
//            entity = new Parents();
//        } else {
//            entity = new Child();
//        }
//        entity.publicMethod();

        Child child = new Child();
        ChildTwo childTwo = new ChildTwo();
        processEntity(child);
        processEntity(childTwo);
    }
    public static void processEntity (Parents parent){
        // ((Child)parent).method();

        if (parent.getClass().equals(Child.class)) {
            Child child = (Child) parent;
            child.method();
        }

        System.out.println("processing " + parent.getClass().getSimpleName());
    }
}
