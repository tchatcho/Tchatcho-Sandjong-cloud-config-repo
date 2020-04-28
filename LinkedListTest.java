package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList myList;

    @Before
    public void setUp() {
        myList = new LinkedList();
    }

    @Test
    public void shouldReturnPushedValues() {

        myList.push("Tchatcho");
        myList.push("Peter");

        assertEquals("Peter", myList.pop());
        assertEquals("Tchatcho", myList.peek());

    }

    @Test
    public void contains_ShouldReturnTrue_IfValueIsPresentAndFalseOtherwise() {

        myList.push("Tchatcho");
        myList.push("Peter");

        assertEquals(true, myList.contains("Tchatcho"));
        assertEquals(false, myList.contains("Sandjong"));

    }

    @Test
    public void size_ShlouldReturnNumberOfElements_InStack() {

        assertEquals(0, myList.size());

        myList.push("Tchatcho");
        myList.push("Peter");
        assertEquals(2, myList.size());

        myList.push("Sandjong");
        myList.push("Florek");
        assertEquals(4, myList.size());

    }

    @Test
    public void peekN_ShouldReturn_nthValue() {

        myList.push("Tchatcho");
        myList.push("Peter");
        myList.push("Sandjong");
        myList.push("Florek");
        assertEquals("Sandjong", myList.peekN(1));
        assertEquals("Peter", myList.peekN(2));
        assertEquals(null, myList.peekN(5));

    }

}