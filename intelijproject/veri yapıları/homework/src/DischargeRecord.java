public class DischargeRecord {                            //discharged patient class
    int patientId;
    long dischargeTime;

    public DischargeRecord(int patientId , long dischargeTime){    // constructor for DischargeRecord class.
        this.patientId= patientId;
        this.dischargeTime= dischargeTime;
    }
}
