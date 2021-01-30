package classstructureintegrate;

public class Bank {

    public static void main(String[] args) {

    BankAccount OtpAccountKP = new BankAccount("10073217-12000098-67341590","Kis Pista", 50000);
    BankAccount MkbAccountNA = new BankAccount("24523417-00100055-23453451","Nagy Anna",100000);

    System.out.println(OtpAccountKP.getInfo());
    System.out.println(MkbAccountNA.getInfo());
    OtpAccountKP.transfer(MkbAccountNA,49999);
    System.out.println(OtpAccountKP.getInfo()+" "+MkbAccountNA.getInfo());
    OtpAccountKP.deposit(5000);
    MkbAccountNA.withdraw(3000);
    System.out.println(OtpAccountKP.getInfo()+" "+MkbAccountNA.getInfo());

    }

}
