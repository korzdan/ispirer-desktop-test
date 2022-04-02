package com.greeting.greetingdesktop.second;

// Test entity for custom List
public class Test {
    private double age;

    public Test() {
        age = Math.random();
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                '}';
    }
}
