package factrory1;

public class Test {
    public static void main(String[] args) {
        //1 ПАТТЕРН - ФАБРИКА (bankAccount)

        BankAccount someBankAccount = BankAccountCreator.createNewBankAccount("foreign", "Nikita");
        System.out.println(someBankAccount);

    }
}
