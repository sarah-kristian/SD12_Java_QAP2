public class Money {
    private long dollars;
    private long cents;

    // constructor

    Money(double amount){
        this.dollars = (long) amount;
        this.cents = Math.round((amount - dollars) * 100);
    }

    // copy constructor
    public Money(Money otherMoney) {
        this.dollars = otherMoney.dollars;
        this.cents = otherMoney.cents;
    }


    // getters and setters
    public long getDollars() {
        return dollars;
    }
    public void setDollars(long dollars) {
        this.dollars = dollars;
    }
    public long getCents() {
        return cents;
    }
    public void setCents(long cents) {
        this.cents = cents;
    }

    // Alter amount

    public Money add(Money otherMoney){
        double debitAmount = otherMoney.dollars + (double) otherMoney.cents/100;
        double originalAmount = this.dollars + (double) this.cents/100;
        double newAmt = originalAmount + debitAmount;
        return new Money(newAmt);
    }

    public Money subtract(Money otherMoney){
        double originalAmount = this.dollars + (double) this.cents/100;
        double creditAmount = otherMoney.dollars + (double) otherMoney.cents/100;
        double newAmt = originalAmount - creditAmount;
        return new Money(newAmt);
    }

    public int compareTo(Money otherMoney) {
        long thisTotalCents = this.dollars * 100 + this.cents;
        long otherTotalCents = otherMoney.dollars * 100 + otherMoney.cents;

        return Long.compare(thisTotalCents, otherTotalCents);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true; // both references point to same object
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false; // checks if null or diff class types
        }
        Money otherMoney = (Money) obj;
        return this.dollars == otherMoney.dollars && this.cents == otherMoney.cents;
    }

    public long adjustCents(long cents){
        if (cents >= 0 && cents < 10) { // Checks if the number is a single digit
            return cents * 10;           // Multiplies single-digit numbers by 10
        } else {
            return cents;                // Returns the number unchanged if it's 10 or more
        }
    }

    @Override
    public String toString() {
        return "$" + dollars +
                "." + String.format("%02d", adjustCents(cents));
    }
}
