import java.util.Currency;

// value object
// 値をクラスとして表現する
public class Money {
    final int amount;
    final Currency currency;

    // インスタンス変数を全て初期化できるだけの引数を持った、完全コンストラクタ
    public Money(int amount, Currency currency) {
        // ガード節で不正値を弾く
        if(amount < 0){
            throw new IllegalArgumentException("money amount must be over 0");
        }
        if (currency == null){
            throw new NullPointerException("you specify currency");
        }
        this.amount = amount;
        this.currency = currency;
    }

    // 値の渡し間違いを防ぐため、Money型で加算する
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
