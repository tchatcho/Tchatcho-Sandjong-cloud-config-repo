package com.company;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class StackTest {

     private Stack myStack;

     @Before
     public void setUp(){
         myStack = new Stack();
     }

    @Test
    public void isEmpty_shouldReturnsTrue_IfStack_IsEmpty() {

        //Arrange
          // Already arranged int @Before

        //Act
        boolean myResult = myStack.isEmpty();

        //Assert
        Assert.assertEquals(true, myResult);
        //It is better tu use assertEquals Vs assertTrue as it provides better Assertion error trace
    }

    @Test
    public void isEmpty_shouldReturnsFalse_IfStack_IsEmpty() {

        //Arrange
        // Already partly arranged int @Before
        myStack.push("Peter");

        //Act
        boolean myResult = myStack.isEmpty();

        //Assert
        Assert.assertEquals(false, myResult);
        //It is better tu use assertEquals Vs assertTrue as it provides better Assertion error trace
    }

    @Test
    public void peek_ShouldReturn_Null_IfStackIsEmpty() {

         //Arrange

         // Act
         String result = myStack.peek();

         //Assert
        assertEquals(null, result);
    }

    @Test
    public void peek_ShouldReturn_MostRecentPushedValue() {

        //Arrange
        myStack.push("Tchatcho");

        // Act
        String result = myStack.peek();

        //Assert
        assertEquals("Tchatcho", result);
    }

    @Test(expected = EmptyStackException.class) // Assert
    public void pop_ShouldThrowEmptyStackException_IsStackIsEmpty() {

        //Arrange
        // Act
        myStack.pop();

    }

    @Test
    public void pop_ShouldReturn_LastPushedValue() {

         myStack.push("Tchatcho");
         assertEquals("Tchatcho", myStack.pop());

    }

    @Test
    public void peek_ShouldReturnNull_AfterPopIsCalled() {

        myStack.push("Tchatcho");
        myStack.pop();
        assertEquals(null, myStack.peek());

    }

    @Test
    public void isEmpty_ShouldReturnTrue_AfterPopIsCalled() {

         myStack.push("Tchatcho");
         myStack.pop();
         assertEquals(true, myStack.isEmpty());
    }





}
