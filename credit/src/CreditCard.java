public class CreditCard {
    private Money balance = new Money(0.00);
    private Money creditLimit;
    private Person owner;

    // constructor
    CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = limit;
    }

    // copy constructor
    public CreditCard(CreditCard newCard){
        this.owner = new Person(newCard.owner);
        this.creditLimit = new Money(newCard.creditLimit);
        this.balance = new Money(newCard.balance);
    }

    // getters
    public Money getBalance() {
        return new Money(this.balance);
    }

    public Money getCreditLimit() {
        return new Money(this.creditLimit);
    }
    public String getPersonals(){
        return owner.toString();
    }

    public Money checkRemainingCredit(){
        return new Money(this.creditLimit.subtract(this.balance));
    }

    public void charge(Money debit){
        if (checkRemainingCredit().compareTo(debit) < 0) {
            System.out.println("Exceeds credit limit");
        }else{
            this.balance = balance.add(debit);
            System.out.println("Charge: " + debit);
        }
    }

    public void payment(Money payment){
        if (payment.compareTo(this.balance) > 0) {
            System.out.println("Payment amount exceeds the current balance");
        }else {
            this.balance = balance.subtract(payment);
            System.out.println("Payment: " + payment);
        };
    }

    @Override
    public String toString() {
        return "Account information{" +
                "balance=" + balance +
                ", creditLimit=" + creditLimit +
                ", owner=" + owner +
                '}';
    }
}
