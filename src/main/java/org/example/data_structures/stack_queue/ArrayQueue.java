package org.example.data_structures.stack_queue;

public class ArrayQueue implements Stack_Queue_Interface{
    private int head, tail, SIZE;
    private int[] array;

    public ArrayQueue(int size)
    {
        SIZE = size;
        head = -1;
        tail = -1;
        array = new int[size];
    }
    @Override
    public boolean push(int value) {
        if(isFull())
           return false;
        if(isEmpty())
            head++;
        array[++tail] = value;
        return true;
    }

    @Override
    public int pop() {
        if(isEmpty())
            return -1;
        if(count() == 1)
        {
            int result = array[head];
            tail = -1; head =-1;
            return result;
        }
        return array[head++];
    }

    @Override
    public boolean isFull() {
        if(SIZE - 1 == tail)
            return true;
        return false;
    }

    @Override
    public boolean isEmpty() {
        if(tail == -1)
            return true;
        return false;
    }

    @Override
    public void print() {
        if(isEmpty())
            System.out.println("Queue is empty !");
        else
        {
            for(int i = head; i <= tail ; i++)
            {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public int count()
    {
        if(isEmpty())
            return 0 ;
        return tail - head + 1;
    }

    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.print();
        queue.pop();
        queue.print();
    }
}
