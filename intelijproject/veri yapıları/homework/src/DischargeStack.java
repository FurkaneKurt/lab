public class DischargeStack {
    private class Node{
        DischargeRecord record;
        Node next;
        private Node(DischargeRecord record){
            this.record= record;
            this.next= null;
        }
    }
    Node top;
    public DischargeStack(){
        this.top=null;
    }
    public boolean isEmpty(){return top== null;}
    public void push(DischargeRecord record){
        Node temp = new Node(record);
        if (isEmpty()){
            top=temp;
            System.out.println("The first patient "+temp.record+" was added to the discharge list..");
        }else{
            temp.next=top;
            top= temp;
            System.out.println("A patient "+temp.record+" was added to the discharge list.");
        }

    }
    public void pop(){
        if(isEmpty()){
            System.out.println("No patients to be discharged.");
        }else{
            System.out.println("The patient with "+top.record.patientId+" ıd was  discharged at "+top.record.dischargeTime+" this time.");
            top= top.next;
        }
    }
    public int peek(){
        if (isEmpty()){
            System.out.println("The discharge list is empty");
        }else{
            System.out.println(" The first patient to be discharged:"+top.record);
        }
        return  top.record.patientId;
    }
    public void printStack(){

    }


}
