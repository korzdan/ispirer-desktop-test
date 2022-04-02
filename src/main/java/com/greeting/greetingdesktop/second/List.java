package com.greeting.greetingdesktop.second;

public class List<T> {
    private final int INITIAL_CAPACITY = 10;
    private Object[] array = new Object[INITIAL_CAPACITY];
    private int size;

    public void add(T obj) {
        if (size == array.length) {
            resize(array.length * 2);
        }
        array[size] = obj;
        size++;
    }

    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(array, index + 1, array, index, size - index);
        array[size] = null;
        size--;
        if (array.length > INITIAL_CAPACITY && size < array.length / 2) {
            resize(array.length / 2);
        }
    }

    public T get(int index) {
        checkIndex(index);
        return (T) array[index];
    }

    public int size() {
        return size;
    }

    private void resize(int newCapacity) {
        Object[] newArray = new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private boolean checkIndex(int index) {
        if (index >= 0 && index < size) {
            return true;
        }
        throw new IndexOutOfBoundsException("The index is out of bounds");
    }

    // Primitive tests)
    public static void main(String[] args) {
        List<Test> testList = new List<>();

        for (int i = 0; i < 100; i++) {
            testList.add(new Test());
        }

        testList.remove(0);
        System.out.println(testList.size());
        // Exception tests
        /*System.out.println(testList.get(99));
        System.out.println(testList.get(-10));
        testList.remove(-10);
        testList.remove(1000);*/
    }
}
