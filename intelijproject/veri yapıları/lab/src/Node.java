public class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

class MyStack {
    Node head;
    Node middle;
    int size;

    MyStack() {
        head = null;
        middle = null;
        size = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head;

        if (head != null) {
            head.prev = newNode;
        }

        head = newNode;
        size++;

        if (size == 1) {
            middle = newNode;
        } else if (size % 2 != 0) {
            middle = middle.prev;
        }
    }

    int pop () {
        if (size == 0) return -1;

        int val = head.data;
        Node nextHead = head.next;
        head = nextHead;

        if (head != null) {
            head.prev = null;
        }

        size--;

        if (size % 2 == 0 && size > 0) {
            middle = middle.next;
        } else if (size == 0) {
            middle = null;
        }

        return val;
    }
    int deleteMiddle{
        if(size ==0){

        }
    }
}