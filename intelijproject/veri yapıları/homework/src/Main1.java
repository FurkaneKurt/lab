public class Main1 {
        public static void main(String []args){
            PatientList pl = new PatientList();
            pl.addPatient(new Patient(12,"Furkan",2,21));
            pl.addPatient(new Patient(18,"Talha",3,19));
            pl.addPatient(new Patient(14,"Cengiz",9,19));
            pl.addPatient(new Patient(13,"Enes",2,24));
            pl.addPatient(new Patient(15,"Şahin",5,45));
            pl.printList();
            pl.removePatient(15);
            pl.printList();
            pl.findPatient(13);
            pl.findPatient(15);
        }

    }

