public class Main3 {
    public static void main(String []args){
        DischargeStack ds = new DischargeStack();
        ds.push(new DischargeRecord(12,System.currentTimeMillis()));
        ds.push(new DischargeRecord(13,System.currentTimeMillis()+1));
        ds.push(new DischargeRecord(17,System.currentTimeMillis()+2));
        ds.push(new DischargeRecord(29,System.currentTimeMillis()+3));
        ds.push(new DischargeRecord(32,System.currentTimeMillis()+4));

        ds.pop();
        ds.pop();
        ds.pop();

        ds.printStack();


    }
}
