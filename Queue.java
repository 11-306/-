package Test_1;

public class Queue {
    public Node head;
    public final int DEFAULT_CAPACITY = 5;
    public int size;
    private int capacity;

    public Queue(int capacity) {
        head = null;
        if(capacity <= 0){
            throw new IllegalArgumentException("Размер не может быть меньше нуля");
        }

            this.capacity = capacity;
    }
    public Queue(){
        head = null;
        this.capacity = DEFAULT_CAPACITY;

    }


    public class Node{
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    public void push(int data){
        Node newData = new Node(data);
        Node cur = head;

        if(cur == null){
            head = newData;
        }else {
            while (cur.next != null){
                cur = cur.next;
            }
            if(size > capacity){
                pop();
            }
            cur.next = newData;
        }
        size++;
    }
    public int pop() {
        if (head != null) {
            int res = head.data;
            head = head.next;
            return res;
        }
        else {
            throw new ArrayIndexOutOfBoundsException("head равен null");
        }
    }
    public void print(){
        Node cur = head;

        if(head != null){
            System.out.println(head.data);
        }
        while (cur.next != null){
            cur = cur.next;
            System.out.println(cur.data);
        }
    }
}
