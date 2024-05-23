package de.telran.summary0517.GroupWork;

import de.telran.lesson0515.IpAddressValidation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static de.telran.summary0517.GroupWork.TopKTask.*;
import static org.junit.jupiter.api.Assertions.*;

class TopKTaskTest {
    @Test
    public void listWithFor() {
        List<Item> expected = Arrays.asList(new Item("Toy3", 12),
                new Item("Toy5", 23),
                new Item("Doll", 25),
                new Item("Toy4", 32),
                new Item("Toy1", 50));
        List<Item> result =topK(Arrays.asList(new Item("Toy3", 12),
                new Item("Toy5", 23),
                new Item("Doll", 25),
                new Item("Toy4", 32),
                new Item("Toy1", 50)), 5);
        assertEquals(expected.toString(), result.toString());

        expected = Arrays.asList();
        result = TopKTask.topK(Arrays.asList(new Item(null, 0)), 0);
        assertEquals(expected.toString(), result.toString());

        expected = Arrays.asList();
        result = TopKTask.topK(Arrays.asList(new Item(null, 15)), 0);
        assertEquals(expected.toString(), result.toString());

        expected = Arrays.asList();
        result = TopKTask.topK(Arrays.asList(new Item("Toy4", 32)), 0);
        assertEquals(expected.toString(), result.toString());

        expected = Arrays.asList();
        result = TopKTask.topK(Arrays.asList(new Item("Toy4", -32)), 0);
        assertEquals(expected.toString(), result.toString());

        expected = Arrays.asList();
        result = TopKTask.topK(Arrays.asList(new Item("Toy4", 32)), -2);
        assertEquals(expected.toString(), result.toString());

    }

    @Test
    public void listPriorityQueue() {
        List<Item> expected = Arrays.asList(new Item("Toy3", 12),
                new Item("Toy5", 23),
                new Item("Doll", 25),
                new Item("Toy4", 32),
                new Item("Toy1", 50));
        List<Item> result =topKWithPriorityQueue(Arrays.asList(new Item("Toy3", 12),
                new Item("Toy5", 23),
                new Item("Doll", 25),
                new Item("Toy4", 32),
                new Item("Toy1", 50)), 5);
        assertEquals(expected.toString(), result.toString());

        assertThrows(NullPointerException.class, ()-> TopKTask.topKWithPriorityQueue(Arrays.asList(new Item(null, 0)), 0));

        assertThrows(NullPointerException.class, ()-> TopKTask.topKWithPriorityQueue(Arrays.asList(new Item(null, 15)), 0));

        assertThrows(NullPointerException.class, ()-> TopKTask.topKWithPriorityQueue(Arrays.asList(new Item("Toy4", 32)), 0));

        assertThrows(NullPointerException.class, ()-> TopKTask.topKWithPriorityQueue(Arrays.asList(new Item("Toy4", -32)), 0));

        expected = Arrays.asList(new Item("Toy4", 32));
        result = TopKTask.topKWithPriorityQueue(Arrays.asList(new Item("Toy4", 32)), 12);
        assertEquals(expected.toString(), result.toString());

        expected = Arrays.asList();
        result = TopKTask.topKWithPriorityQueue(Arrays.asList(new Item("Toy4", 32)), -2);
        assertEquals(expected.toString(), result.toString());

    }
}