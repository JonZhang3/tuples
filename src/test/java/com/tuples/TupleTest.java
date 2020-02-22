package com.tuples;

import org.junit.Test;
import static org.junit.Assert.*;

public class TupleTest {

    @Test
    public void test() {
        Tuple tuple = new Tuple();
        tuple.add("A");
        tuple.add(12);
        tuple.add(10.12);
        assertEquals(3, tuple.size());
        assertEquals("A", tuple.getString(0));
        assertNull(tuple.getString("0"));
        assertEquals("12", tuple.getString(1));
        assertEquals(10.12, tuple.getDouble(2), 1.0);

        tuple.add("test", "test");
        assertEquals("test", tuple.getString("test"));
        tuple.add(1, "abc");
        assertEquals("abc", tuple.getString(1));
        assertEquals(12, (long) tuple.getLong(2));

        tuple.remove(12);
        assertEquals(10.12, tuple.getDouble(2), 1.0);
        tuple.forEach((name, index, value) -> {
            System.out.println("-------------------");
            System.out.println("name: " + name);
            System.out.println("index: " + index);
            System.out.println("value: " + value);
            System.out.println("-------------------");
        });
    }

}
