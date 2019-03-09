package _4_Banking;

/**
 * Created by Mohammadi-HR on 3/9/2019.
 */
public class Customer {
    private String name;
    private Account account;
    private CreditCard creditCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public double calCustomerBalance(){
        return getAccount().getBalance() + getCreditCard().getCredit();
    }
}
