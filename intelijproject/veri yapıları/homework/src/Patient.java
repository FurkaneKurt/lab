
public class Patient {

    int ID;                   //patient id
    String name;              // patient name
    int severity;             //patient disease
    int age;                 //patient age
    Patient next;            // for next pointer in linkedlist

    public Patient(int ID,String name, int severity, int age ){ //constructor for patient class
        this.ID=ID;
        this.name=name;
        this.severity=severity;
        this.age=age;
        this.next = null;
    }
}
