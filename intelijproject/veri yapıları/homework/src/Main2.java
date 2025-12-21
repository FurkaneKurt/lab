public class Main2 {
    public static void main(String []args){
        TreatmentQueue tq = new TreatmentQueue();
        tq.enqueue(new TreatmentRequest(12));
        tq.enqueue(new TreatmentRequest(13));
        tq.enqueue(new TreatmentRequest(15));
        tq.enqueue(new TreatmentRequest(18));
        tq.enqueue(new TreatmentRequest(21));
        tq.enqueue(new TreatmentRequest(67));
        tq.enqueue(new TreatmentRequest(48));
        tq.enqueue(new TreatmentRequest(54));
        tq.printQueue();
        tq.size();
        tq.dequeue();
        tq.dequeue();
        tq.dequeue();
        tq.size();
    }
}
