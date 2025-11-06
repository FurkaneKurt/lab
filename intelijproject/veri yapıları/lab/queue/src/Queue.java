public class Queue {
    Node front, rear;
    int size;
    int num;

    Queue(){
        front = rear = null;
        size= 0;
        num = 0;

    }
    public void enqueue(int data){
        Node newNode = new Node(data);
        if(rear==null){
            front = newNode;
            rear = newNode;
        } else{
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        }
        int dequeue() {
        if (front == null) return -1;
        int val = front.data;
        front = front.next;
        if(front== null) rear=null;
        size--;
        return val;
    }
    boolean areEqual(Queue q1, Queue q2){
        if(q1.size != q2.size) return false;

        Node curr1 = q1.front;
        Node curr2 = q2.front;

        while (curr1 != null && curr2 != null){
            if(curr1.data != curr2.data) return false;
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return true;
    }
}
