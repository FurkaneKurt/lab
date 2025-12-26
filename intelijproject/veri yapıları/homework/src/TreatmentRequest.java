public class TreatmentRequest {
    int patientId;
    boolean priority;
    long arrivalTime;                            //millis time used with long.

    public TreatmentRequest(int patientId){           // This is constructor for TreatmentRequest class.
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();   //Used for instantaneous time.
    }
    public TreatmentRequest(int patientId, boolean priority){
        this.patientId=patientId;
        this.priority = priority;
    }
}
