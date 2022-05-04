package composition;

public class FighterPhysicalAttack {

    // composition
    // 利用したいクラスをスーパークラスとして継承するのではなく、
    // private なインスタンス変数としてもち呼び出す
    private final PhysicalAttack physicalAttack;

    public FighterPhysicalAttack(PhysicalAttack physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    int singleAttack(){
        // 委譲する
        return physicalAttack.singleAttack() + 30;
    }
    int doubleAttack(){
        // スーパクラスの　doubleAttack のロジックを実行した結果に + 10 する(テストコードを参照)
        return physicalAttack.doubleAttack() + 10;
    }
}
