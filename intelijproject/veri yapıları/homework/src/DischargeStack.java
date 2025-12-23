public class DischargeStack {                 //stack class for DischargeRecord.
    private class Node{                       // A Node class is created to work with a linked list.
        DischargeRecord record;
        Node next;
        private Node(DischargeRecord record){  // This is constructor for Node class.
            this.record= record;
            this.next= null;
        }
    }
    Node top;                             // Top is item off stack last adding item.
    public DischargeStack(){
        this.top=null;
    }
    public boolean isEmpty(){return top== null;}       // for checking stack have item or not.
    public void push(DischargeRecord record){          // for adding item in stack to the beginning.
        Node temp = new Node(record);
        if (isEmpty()){                               // İt's checking stack have item or not.If haven't add first item.
            top=temp;
            System.out.println("The first patient "+temp.record.patientId+" was added to the discharge list..");
        }else{
            temp.next=top;                          //Stack have item and add new item to the beginning.
            top= temp;
            System.out.println("A patient "+temp.record.patientId+" was added to the discharge list.");
        }

    }
    public void pop(){                         //For removing item
        if(isEmpty()){                         //It's checking stack have item or not.
            System.out.println("No patients to be discharged.");
        }else{                                  //If it has item remove top item.
            System.out.println("The patient with "+top.record.patientId+" ıd was  discharged at "+top.record.dischargeTime+" this time.");
            top= top.next;
        }
    }
    public int peek(){                                //It shows top item on the stack.
        if (isEmpty()){                               //It's checking stack have item or not.
            System.out.println("The discharge list is empty");
        }else{
            System.out.println(" The first patient to be discharged:"+top.record.patientId+" "+top.record.dischargeTime);
        }
        return  top.record.patientId;
    }
    public void printStack(){                       //A simple printing method to print all the elements in the stack.
        if (isEmpty()){
            System.out.println("No patients to be discharged.");
        }else{
            Node current = top;
            while (current != null){
                System.out.println("The patient: "+current.record.patientId+" "+current.record.dischargeTime);
                current = current.next;
            }
        }
    }
}
