import java.util.Currency;

public class Money {
    final int amount;
    final Currency currency;

    public Money(int amount, Currency currency) {
        if(amount < 0){
            throw new IllegalArgumentException("money amount must be over 0");
        }
        if (currency == null){
            throw new NullPointerException("you specify currency");
        }
        this.amount = amount;
        this.currency = currency;
    }

    Money add(final Money other){
        if(!currency.equals(other.currency)){
            throw new IllegalArgumentException("different currency type");
        }

        final int added = amount + other.amount;
        return new Money(added, currency);
    }

    public int getAmount() {
        return amount;
    }
}
