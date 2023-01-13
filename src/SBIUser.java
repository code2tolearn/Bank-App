import java.util.Objects;
import java.util.UUID;

public class SBIUser implements  BankInterface {
    // attributes
    private String name ;
    private   String accountNo ;
    private double balance ;
    private String password ;
    private static  double rateOfInterest ;

    SBIUser(String name , double balance , String password ){
        this.name = name ;
        this.balance = balance ;
        this.password = password ;
        rateOfInterest = 6.5 ;
        this.accountNo = String.valueOf(UUID.randomUUID()) ;
        System.out.println("Hello sir/mam Wlc to SBI, We are fortunate to have a customer like you. " +
                "Here are your details please check it Once"+"\n"+"name:"+name+"\n"+"AccountNo:"+accountNo+"\n"+"Balence;"+balance);
    }
    // getters and setters

    @Override
    public double checkBalence() {
        return this.balance ;
    }
    @Override
    public String addMaoney(int amount) {
        balance = balance + amount ;
        return "Your transaction successfull Your balance is: "+checkBalence()+"\n"+ " Thank you ";
    }

    @Override
    public String withdrawMoney(int amount, String newpassword) {
        if(Objects.equals(newpassword , password))
        {
            if(amount > balance)
            {
                return "Sorry bro ! Aukat me Nikal" ;
            }
            balance -= amount ;

            return "Ley bhai Yaish kr Ho Gaya: Etne Bache hai"+" "+String.valueOf(checkBalence()) ;
        }

         return ("Bhai tu hi hai n Password check kr le ek Bar fir se");
    }

    @Override
    public double calculateInterest(int years) {
        double interest = (balance*years * rateOfInterest)/100 ;
        return interest ;
    }
}
