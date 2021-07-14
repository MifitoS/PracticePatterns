package Factory;

public class BankAccount {
    private int id;
    private String name;
    private String currencyCode;
    boolean inActive;

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currencyCode='" + currencyCode + '\'' +
                ", inActive=" + inActive +
                '}';
    }

    public BankAccount(int id, String name, String currencyCode, boolean inActive) {
        this.id = id;
        this.name = name;
        this.currencyCode = currencyCode;
        this.inActive = inActive;


    }
}
