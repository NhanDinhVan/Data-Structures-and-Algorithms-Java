package org.example.data_structures.stack_ADT;

public interface StackADT<T> {
    //Them 1 phan tu vao dinh cua stack
    public void push(T element);

    //Tra ve va loai bo phan tu o dinh cua stack
    public T pop();

    //Tra ve nhung khong loai bo phan tu o dinh
    public T peek();

    //Kiem tra stack rong
    public boolean isEmpty();

    //Lay ra so luong phan tu cua stack
    public int size();

    //Lay ra cac phan tu cua stack
    public String toString();
}
