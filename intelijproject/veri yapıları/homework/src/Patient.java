public class Patient {

    int id;
    String name;
    int severity;
    int age;
    Patient next;

    public Patient(int id,String name, int severity, int age ){
        this.id=id;
        this.name=name;
        this.severity=severity;
        this.age=age;
        this.next = null;
    }
}
