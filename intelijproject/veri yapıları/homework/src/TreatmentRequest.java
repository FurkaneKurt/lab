public class TreatmentRequest {
    int patientId;
    long arrivalTime;                            //millis time used with long.

    public TreatmentRequest(int patientId){           // This is constructor for TreatmentRequest class.
        this.patientId = patientId;
        this.arrivalTime = System.currentTimeMillis();   //Used for instantaneous time.
    }
}
