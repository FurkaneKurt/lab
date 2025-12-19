public class Patient {

    int id;                   //patient id
    String name;              // patient name
    int severity;             //patient disease
    int age;                 //patient age
    Patient next;            // for next pointer in linkedlist

    public Patient(int id,String name, int severity, int age ){ //constructor for patient class
        this.id=id;
        this.name=name;
        this.severity=severity;
        this.age=age;
        this.next = null;
    }
}
