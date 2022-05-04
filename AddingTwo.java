package com.Renu.logicThink;

public class AddingTwo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a= a + b;
        b= a - b;
        a= a - b;
        System.out.println("After swapping : a , b : " + a + " , "  + b);
    }
}
