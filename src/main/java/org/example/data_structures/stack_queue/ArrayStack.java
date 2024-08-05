package org.example.data_structures.stack_queue;

public class ArrayStack implements Stack_Queue_Interface{
    private int SIZE;
    private int topIndex;
    private int[] array ;
    public ArrayStack(int size)
    {
        SIZE = size;
        array = new int[size];
        topIndex = -1;
    }
    @Override
    public boolean push(int value) {
        if(isFull())
            return false;
        array[++topIndex] = value;
        return true;
    }

    @Override
    public int pop() {
        if(isEmpty())
            return -1;
        return array[topIndex--];
    }

    @Override
    public boolean isFull() {
        if(topIndex == SIZE -1)
            return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(topIndex == -1)
            return true;
        return false;
    }

    @Override
    public void print() {
        if(isEmpty())
        {
            System.out.println("Stack is empty");
        }else
        {
            for(int i = 0; i <= topIndex; i++)
                System.out.print(array[i] + " ");
        }
         System.out.println();
    }

    public static void main(String[] args) {
        ArrayStack stackArray = new ArrayStack(3);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.push(4);
        stackArray.print();
        stackArray.pop();
        stackArray.pop();
        stackArray.pop();
        stackArray.print();
        // 1 | 2 | 3 | 4 | 5
        // i
    }
}
