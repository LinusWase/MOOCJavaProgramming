public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents >= 100){
            newEuros += 1;
            newCents -= 100;
        }

        Money newMoney = new Money(newEuros, newCents); // create a new Money

        return newMoney;
    }

    public boolean lessThan(Money compared){
        if (this.euros > compared.euros){
            return false;
        } else if (this.euros == compared.euros()) {
            return this.cents <= compared.cents;
        }
        return true;
    }

    public Money minus(Money decreaser){
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;

        if (newCents < 0){
            newCents += 100;
            newEuros -= 1;
        }

        if (newEuros < 0){
            newEuros = 0;
            newCents = 0;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }
}