package com.javarush.test.AMy_test;

/**
 * Created by Vitalii.Nedzelskyi on 07.07.2015.
 */
public class MyClass {
    public String name = "Public";
    private int age = 24;
    protected boolean male = true;

    public MyClass(){System.out.println("Hi = Hello!!"); }

    protected void print(){System.out.println("Protected"); }
}
