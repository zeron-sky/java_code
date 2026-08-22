package card;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// ArrayList 综合练习示例：创建牌堆、洗牌和发牌。
public class CardDemo {
    // 一副标准扑克牌包含的四种花色。
    private static final String[] SUITS = {"♣", "♠", "♦", "♥"};

    // 创建一副包含 52 张牌的标准扑克牌。
    private static List<Card> buyDeck() {
        // 预先指定容量，减少 ArrayList 扩容次数。
        List<Card> deck = new ArrayList<>(52);

        // 外层循环遍历四种花色。
        for (int suitIndex = 0; suitIndex < SUITS.length; suitIndex++) {
            // 内层循环创建当前花色的 13 个点数。
            for (int rank = 1; rank <= 13; rank++) {
                // 每次循环创建一张独立的牌，并加入牌堆。
                deck.add(new Card(rank, SUITS[suitIndex]));
            }
        }

        return deck;
    }

    // 交换牌堆中两个下标位置的牌。
    private static void swap(List<Card> deck, int i, int j) {
        // 先保存 i 位置的牌，避免在交换过程中丢失原数据。
        Card temporaryCard = deck.get(i);
        deck.set(i, deck.get(j));
        deck.set(j, temporaryCard);
    }

    // 使用 Fisher-Yates 思想原地打乱牌堆。
    private static void shuffle(List<Card> deck) {
        Random random = new Random();

        // 从最后一个位置开始，逐步确定每个位置上的牌。
        for (int i = deck.size() - 1; i > 0; i--) {
            // 随机下标范围为 0~i，允许当前位置与自身交换。
            int randomIndex = random.nextInt(i + 1);
            swap(deck, i, randomIndex);
        }
    }

    // 按照轮流发牌的方式，为每位参与者发放指定数量的牌。
    private static List<List<Card>> deal(List<Card> deck,
                                         int playerCount,
                                         int cardsPerPlayer) {
        // 外层列表保存每位参与者的手牌列表。
        List<List<Card>> hands = new ArrayList<>(playerCount);

        // 为每位参与者创建一个独立的空手牌列表。
        for (int i = 0; i < playerCount; i++) {
            hands.add(new ArrayList<>(cardsPerPlayer));
        }

        // 每轮给每位参与者发一张牌。
        for (int round = 0; round < cardsPerPlayer; round++) {
            for (int player = 0; player < playerCount; player++) {
                // remove(0) 取出并删除牌堆最前面的牌。
                Card card = deck.remove(0);

                // 将取出的牌加入当前参与者的手牌。
                hands.get(player).add(card);
            }
        }

        return hands;
    }

    // 程序入口。
    public static void main(String[] args) {
        // 创建一副牌，并输出洗牌前的顺序。
        List<Card> deck = buyDeck();
        System.out.println("刚买回来的牌：");
        System.out.println(deck);

        // 打乱牌堆，并输出洗牌后的顺序。
        shuffle(deck);
        System.out.println("洗过的牌：");
        System.out.println(deck);

        // 三位参与者轮流发牌，每人发五张。
        List<List<Card>> hands = deal(deck, 3, 5);

        // 输出发牌后的剩余牌和每位参与者的手牌。
        System.out.println("剩余的牌：");
        System.out.println(deck);
        System.out.println("A 手中的牌：");
        System.out.println(hands.get(0));
        System.out.println("B 手中的牌：");
        System.out.println(hands.get(1));
        System.out.println("C 手中的牌：");
        System.out.println(hands.get(2));
    }
}
