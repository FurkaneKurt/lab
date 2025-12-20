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
    public void removePatient(int ID){         //This remove method removes the patient according to their ID.
        if(head == null){
            System.out.println("The list dont have any patient");
        }else if(ID == head.ID){
            head= head.next;
            head=null;
            tail=null;
            System.out.println("The patient with the ID has been removed.");
        }else{
            Patient temp = head;
            Patient temp2 = head;
            while (temp.next != null){
                if(ID == temp.ID){
                    temp2.next = temp.next;
                    System.out.println(temp.ID+"The Patient with the ID was deleted.");
                }
                temp2= temp;
                temp = temp.next;
            }
            if (ID == temp.ID){
                temp2.next = null;
                tail = temp2;
                System.out.println(temp.ID+"The Patient with the ID was deleted.");
            }

        }

    }
    public void findPatient(int ID){
        Patient current = head;
        while (current !=null){
            if(current.ID == ID){
                System.out.println("The patient is"+current.ID+" "+current.name+" "+current.severity+" "+current.age);
                return;
            }
            current= current.next;
        }
        System.out.println(ID+"The patient with ID is not on the list.");
    }
    public void printList(){
        Patient temp = head;
        while (temp != null){
            System.out.println("Id:"+temp.ID+" Name:"+temp.name+" Severity:"+temp.severity+" Age:"+temp.age);
            temp = temp.next;
        }
    }


}

