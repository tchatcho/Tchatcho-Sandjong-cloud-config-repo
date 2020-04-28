package com.company;

import java.util.EmptyStackException;

public class Stack {

    private String myString;

    //We use the Red Green Refactor

    //TDD red : failing test
//    public boolean isEmpty() {
//        return false;
//    }

    //TDD Green : passing the test
    public boolean isEmpty(){
        return myString == null;
    }


    public void push(String myString) {
        this.myString = myString;
    }


    public String peek() {
        return myString;
    }

    public String pop() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }

        String newString = myString;
        myString = null;
        return newString;
    }



}
