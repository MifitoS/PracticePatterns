package factrory1;

public class BankAccountCreator {

    public static BankAccount createNewBankAccount(String type, String name){
        if(type.equalsIgnoreCase("foreign")){
            BankAccount bankAccount = new BankAccount((int) Math.random(),name,"USD",false);
            return bankAccount;
        }
        else {
            BankAccount bankAccount = new BankAccount((int) Math.random(),name,"RUB",true);
            return bankAccount;
        }

    }
}
