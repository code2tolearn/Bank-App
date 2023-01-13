import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter your name  and Initial Balence to create an account");
        String name = sc.nextLine() ; // till point you dont press enter
        double balance = sc.nextDouble() ;
        System.out.println("Enter password");
        String password = sc.next() ;
        SBIUser user = new SBIUser( name , balance , password);
        System.out.println("Wlc to Bank for Banking type yes");
        String option = sc.next() ;
        if(Objects.equals(option , "yes")) {
            int a = 0 ;
            while(a<5){
                System.out.println("Enter correct Option for Banking "+"\n"+ "Enter 1 to Add Money"+"\n"+"Enter 2 to Check Balence"+"\n"+"Enter 3 for Withdraw"+"\n"+"Enter 4 to get Interest"+"\n"+"Enter 5 to exit");
                a = sc.nextInt() ;
                switch (a){
                    case 0 :
                        System.out.println("Dekh bhai Time khoti Mat kr Nhi to Nikal le ");
                        break;
                    // add amount
                    case 1: System.out.println("Enter the Amount you want to add ");
                        int amounttoadd = sc.nextInt() ;
                        String message = user.addMaoney(amounttoadd) ;
                        System.out.println(message);
                        break;
                    // chech balanc
                    case 2:
                        System.out.println("Your Balance is"+user.checkBalence());
                        break;
                    case 3:
                        //Withdraw
                        System.out.println("Please enter the amount you want to withdraw");
                        int money = sc.nextInt() ;
                        System.out.println(" please Emter your password");
                        String pass = sc.next() ;
                        System.out.println(user.withdrawMoney(money , password));
                        break;
                    case 4 :
                        // check Interest
                        System.out.println("Kitne sal se Jama kr raha hai");
                        int year = sc.nextInt() ;
                        System.out.println("Bhai sahab Etne Mil rahe hai"+user.calculateInterest(year));
                        break;
                    case 5 :
                        break ;
                }
            }
            System.out.println("Ja sakte Ho "+"\n" +"Don't come again");
        }else{
            System.out.println("Ja sakte Ho "+"\n" +"Don't come again");

        }

    }
}