public class PatientList {    // this is patientLinkendList
    public Patient head ;
    public Patient tail;

    public void addPatient(Patient p){          // this method for adding new patient to list
        if (head == null){                     // firstly we check to list it have any patient
            head = p;                          // if head = null we add new patient to head and head = tail
            tail =p;
            System.out.println("The patient was added to the head of the list.");
        }else{                               // if are there any patient to list we add new patient to the end
            tail.next =p;
            tail = p;
            System.out.println("The patient was added to the end of to list.");
        }
    }
    public void removePatient(int id){

    }
    public void findPatient(int id){


    }
    public void printList(){
        if(head ==null){
            System.out.println("There arent any patient on the list.");
        }else{
            Patient temp = head;
            while (temp != null){
                System.out.println(temp);
                temp.next= temp;
            }

        }

    }

}

