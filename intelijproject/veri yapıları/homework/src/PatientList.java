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
        if(head == null){                      //List empty or not.
            System.out.println("The list dont have any patient");
        }else if(ID == head.ID){               //If the entered ID matches the ID of the header, the header is deleted and shifted to the side.
            head= head.next;                   //If this process is not followed carefully, the list will be deleted.
            head=null;
            tail=null;
            System.out.println("The patient with the ID has been removed.");
        }else{
            Patient temp = head;          //If the ID isn't the initial ID and matches another one, this part will run and that element will be deleted.
            Patient temp2 = head;
            while (temp.next != null){     // From start to finish, it searches for the ID until the element is gone.
                if(ID == temp.ID){
                    temp2.next = temp.next;
                    System.out.println(temp.ID+"The Patient with the ID was deleted."); // if it find id it removes this id.
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
    public void findPatient(int ID){               //It allows us to find the patient we want.
        Patient current = head;
        while (current !=null){                     //It iterates through the entire list until the first one is equal to null.
            if(current.ID == ID){
                System.out.println("The patient is"+current.ID+" "+current.name+" "+current.severity+" "+current.age); //prints all information about patient.
                return;
            }
            current= current.next;                //If the IDs are not equal, it moves to the next one.
        }
        System.out.println(ID+"The patient with ID is not on the list."); // The patient not in the list.
    }
    public void printList(){                                     //a simple method for printing an entire list
        Patient temp = head;
        while (temp != null){
            System.out.println("Id:"+temp.ID+" Name:"+temp.name+" Severity:"+temp.severity+" Age:"+temp.age);
            temp = temp.next;
        }
    }


}

