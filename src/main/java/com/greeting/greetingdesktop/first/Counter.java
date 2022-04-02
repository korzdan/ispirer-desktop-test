package com.greeting.greetingdesktop.first;

public class Counter {
    private static int instanceNum = 0;

    public Counter() {
        instanceNum++;
    }

    public static int getInstanceNum() {
        return instanceNum;
    }

    // Primitive tests)
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(Counter.getInstanceNum());
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(Counter.getInstanceNum());
    }
}
