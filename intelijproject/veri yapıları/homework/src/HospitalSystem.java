import java.util.*;                                //for hashing

public class HospitalSystem {
    public PatientList patientList;
    public TreatmentQueue treatmentQueue;
    public DischargeStack dischargeStack;
    public HashMap<Integer,Patient> patientHashMap;              //creating hashMap

    public HospitalSystem(){                                    //constructor
        patientList = new PatientList();
        treatmentQueue = new TreatmentQueue();
        dischargeStack = new DischargeStack();
        patientHashMap = new HashMap<>();
    }
    public void addNewPatient(Patient p){                     //adding new patient with hashmap
        patientList.addPatient(p);
        patientHashMap.put(p.ID,p);

    }
    public void addTreatmentRequest(int patieentId,boolean priority ){        // adding treatment request  with hash and using priority
        if(!patientHashMap.containsKey(patieentId)){
            System.out.println("The patient not found.");
            return;
        }else {
            TreatmentRequest request = new TreatmentRequest(patieentId, priority);
            treatmentQueue.enqueue(request);
        }

    }
    public void addDischargeRecord(DischargeRecord record){                //adding discharge stack
        dischargeStack.push(record);

    }
    public void processTreatment(){                                         //we add patient queuw to stack and it removes to queue
        TreatmentRequest request = treatmentQueue.dequeue();
        if(request != null){
            DischargeRecord record = new DischargeRecord(request.patientId, System.currentTimeMillis());
            dischargeStack.push(record);
        }
    }
    public void sortingSeverity(){                                        // buble sort from to severity
        if(patientList.head == null) {
            return;

        }
        boolean changed;
        do{
            changed = false;
            Patient current = patientList.head;
            while (current.next != null){
                if (current.severity < current.next.severity){
                    int tempID = current.ID;                                  // this part so long because I didn't have any general naming for this objects.
                    String tempName = current.name;
                    int tempSeverity = current.severity;
                    int tempAge = current.age;

                    current.ID = current.next.ID;
                    current.name = current.next.name;
                    current.severity = current.next.severity;
                    current.age = current.next.age;

                    current.next.ID = tempID;
                    current.next.name = tempName;
                    current.next.severity = tempSeverity;
                    current.next.age = tempAge;
                    changed = true;
                }
                current = current.next;
            }
        }while (changed);
    }
    public  void printSystemState() {                          // printing all lists
        System.out.println("Patients: ");
        patientList.printList();
        System.out.println("Treatment Queue: ");
        treatmentQueue.printQueue();
        System.out.println("Discharge Stack: ");
        dischargeStack.printStack();
    }
}

