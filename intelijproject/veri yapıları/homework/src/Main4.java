public class Main4 {
    public static void main(String []args){
        HospitalSystem hs = new HospitalSystem();
        hs.addNewPatient(new Patient(12,"Furkan",1,21));
        hs.addNewPatient(new Patient(14,"Yusuf",7,24));
        hs.addNewPatient(new Patient(17,"Musa",9,56));
        hs.addNewPatient(new Patient(19,"Cihan",5,70));
        hs.addNewPatient(new Patient(21,"Ayşe",3,18));
        hs.addNewPatient(new Patient(45,"Talha",2,19));
        hs.addNewPatient(new Patient(32,"Şahin",8,45));
        hs.addNewPatient(new Patient(54,"Cengiz",6,73));
        hs.addNewPatient(new Patient(123,"Enes",4,12));
        hs.addNewPatient(new Patient(11,"Faruk",2,56));

        hs.addTreatmentRequest(12,false);
        hs.addTreatmentRequest(14,true);
        hs.addTreatmentRequest(17,true);
        hs.addTreatmentRequest(11,false);
        hs.addTreatmentRequest(123,false);
        hs.addTreatmentRequest(54,false);
        hs.addTreatmentRequest(32,true);
        hs.addTreatmentRequest(45,false);

        hs.addDischargeRecord(new DischargeRecord(234,System.currentTimeMillis()));
        hs.addDischargeRecord(new DischargeRecord(256,System.currentTimeMillis()));

        System.out.println("Processing requests:");
        for(int i=0; i<4; i++) {
            hs.processTreatment();
        }

        hs.sortingSeverity();


        hs.printSystemState();

    }
}
