package de.telran.lesson0612.homework;

import java.awt.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class ReflectionArrayList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            arrayList.add(i);
        }
        try {
            Field field = arrayList.getClass().getDeclaredField("elementData");
            field.setAccessible(true);
            Object[] elementData = (Object[]) field.get(arrayList);
            System.out.println(elementData.length);

            Method methodGrownFindAndMakeAnotherSize = arrayList.getClass().getDeclaredMethod("grow", int.class);
            methodGrownFindAndMakeAnotherSize.setAccessible(true);
            methodGrownFindAndMakeAnotherSize.invoke(arrayList, 15);
            elementData = (Object[]) field.get(arrayList);
            System.out.println(elementData.length);

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }





    }
}
