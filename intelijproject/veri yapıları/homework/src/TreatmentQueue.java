public class TreatmentQueue {
    private class Node{                           //A Node class is created to work with a linked list.
        TreatmentRequest request;
        Node next;

        private Node(TreatmentRequest request){
            this.request = request;
            this.next = null;

        }
    }
    Node front , rear;                        //These are the names that hold the first and last items in the queue.
    int size;                                // It is used to keep the size of the queue consistent.
    public TreatmentQueue(){                 // Constructor for queue items.
        front =  rear = null;
        size = 0;
    }
    boolean isEmpty(){                         // İt check queue empty or not.
        return front == null && rear == null;
    }
    void enqueue(TreatmentRequest request){    // İt used to add new elements, appends to the end.
        Node newNode = new Node(request);      //We created a list
        if (isEmpty()){                        //Queue empty or not ,if is empty add first item to queue.
            front = rear = newNode;
            System.out.println("The patient was added to the top of the list.");
        }else{                                //If queue not empty it newregister adds to the end.
            rear.next = newNode;
            rear = newNode;
            System.out.println("A new patient has been added to the list.");
        }
        size++;                              //Queues size is increases.
    }
     public int dequeue(){                   //Deletes the element that was initially added to the list.
        if(isEmpty()){                       //It check queue empty or not.
            System.out.println("There are no patient on the list.");
            return -1;                      //I had to add this, I kept getting errors.
        }
        int deletedID = front.request.patientId;   //I created this so I could print out the cancelled treatment request.
        front= front.next;
        if (front== null) {
            rear = null;
        }
         System.out.println("The patiten with ID "+deletedID+"has been removed from list.");
         size--;
        return deletedID;                 //I had to add this, I kept getting errors.
    }
    public int size() {                    //I used print to print the size.
        System.out.println("Size is : "+size);
        return size;
    }
    public void printQueue(){           //A simple printing method to print all the elements in the queue and the registration time.
        if (isEmpty()){
            System.out.println("There are no patient on the list. ");
        }else{
            Node current = front;
            while (current != null){
                System.out.println("The patient Id: "+current.request.patientId+" the registration time: "+ current.request.arrivalTime);
                current = current.next;
            }

        }

    }
}
