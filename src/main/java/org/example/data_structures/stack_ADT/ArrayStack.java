package org.example.data_structures.stack_ADT;

public class ArrayStack<T> implements StackADT<T> {

    //Cho biet so luong phan tu trong stack va vi tri cho phan tu tiep theo
    private int top;

    //Mang chua cac phan tu trong stack
    private T[] stack;

    //Kich thuoc mac dinh cua mang
    private final int DEFAULT_CAPACITY = 100;


    @Override
    public void push(Object element) {

    }

    @Override
    public T pop() {
        return null;
    }

    @Override
    public T peek() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
