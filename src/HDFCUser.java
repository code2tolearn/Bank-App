import java.util.UUID;

public class HDFCUser implements BankInterface{
    private String name ;
    private  String accountNo ;
    private double balance ;
    private String password ;
    private static  double rateOfInterest ;
    HDFCUser(String name , double balance , String password ){
        this.name = name ;
        this.balance = balance ;
        this.password = password ;
        rateOfInterest = 6.5 ;
        this.accountNo = String.valueOf(UUID.randomUUID()) ;
        System.out.println("Hello sir/mam Wlc to HDFC, We are lucky to have you. " +"\n"+
                "Here are your details please check it Once"+"\n"+"name:"+name+"\n"+"AccountNo:"+accountNo+"\n"+"Balence;"+balance);
    }
    @Override
    public double checkBalence() {
        return 0;
    }

    @Override
    public String addMaoney(int amount) {
        return null;
    }

    @Override
    public String withdrawMoney(int amount, String password) {
        return null;
    }

    @Override
    public double calculateInterest(int years) {
        return 0;
    }
}
