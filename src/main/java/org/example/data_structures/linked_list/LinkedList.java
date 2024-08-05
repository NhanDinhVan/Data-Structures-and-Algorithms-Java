package org.example.data_structures.linked_list;

public class LinkedList<T> {
    private Node<T> head;

    public LinkedList() {
        this.head = null;
    }
    public void traverse(Node<T> tmp)
    {
        while(tmp != null)
        {
            System.out.print("Node: " + tmp.getData());
            tmp = tmp.getNext();
            System.out.print("->");
            if(tmp == null)
                System.out.println("");
        }
    }
    public  void addElementAtFirst(T data) {
        Node<T> newNode = new Node<T>(data,this.head);
        this.head = newNode;
    }
    public void addElementAtLast(T data) {
        Node<T> tmp = this.head;
        if(tmp == null) {
            addElementAtFirst(data);
        }else{
            Node<T> newNode = new Node<>(data);
            while (tmp.getNext()!=null)
                tmp = tmp.getNext();
            tmp.setNext(newNode);
        }
    }
    public int size()
    {
        int counter = 1;
        Node<T> tmp = this.head;
        if(tmp == null)
        {
            return 0;
        }
        while (tmp.getNext() != null)
        {
            tmp = tmp.getNext();
            counter++;
        }
        return counter;
    }


    public Boolean deleteElement(T key) {
        if(head == null)
            return false;

        // Xoa neu key o vi tri dau tien
        if(head.getData().equals(key)){
            this.head = head.getNext();
            return true;
        }

        // Tao bien tam
        Node<T> prev = null;
        Node<T> cur = head;

        while(cur!=null && !cur.getData().equals(key)){
            prev = cur;
            cur = cur.getNext();
        }

        if(cur==null)
            return false;

        // Xoa node
        prev.setNext(cur.getNext());
        return true;
    }
    public void addElementAtAnyPosition(T data, T key) {
        Node<T> newNode = new Node<>(data);
        Node<T> tmp = this.head;
        while(tmp != null && !tmp.getData().equals(key))
        {
            tmp = tmp.getNext();
        }
       if(tmp != null)
       {
           newNode.setNext(tmp.getNext());
           tmp.setNext(newNode);
       }
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        System.out.println(linkedList.size());
    }
}
