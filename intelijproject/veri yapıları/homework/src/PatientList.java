public class PatientList {
    Patient head;

    public PatientList() {
        this.head = null;
    }

    public void addPatient(Patient p) {
        if (head == null) {
            head = p;
        } else {
            Patient current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = p;
        }
    }
    public boolean removePatient(int id) {
        Patient current = head;
        Patient previous = null;


        if (current != null && current.id == id) {
            head = current.next;
            return true;
        }

        while (current != null && current.id != id) {
            previous = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        previous.next = current.next;
        return true;
    }
    public Patient findPatient(int id) {
        Patient current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void printList() {
        Patient current = head;
        if (current == null) {
            System.out.println("List is empty..");
            return;
        }
        System.out.println("Patient List: ");
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }
}

