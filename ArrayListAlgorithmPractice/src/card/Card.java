package card;

// 表示一张扑克牌。
public class Card {
    // 牌面点数，取值范围为 1~13。
    public int rank;

    // 牌面花色。
    public String suit;

    // 创建一张扑克牌。
    public Card(int rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    // 返回便于阅读的牌面信息。
    @Override
    public String toString() {
        return String.format("[%s %d]", suit, rank);
    }
}
