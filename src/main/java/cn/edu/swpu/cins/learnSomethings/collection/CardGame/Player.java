package cn.edu.swpu.cins.learnSomethings.collection.CardGame;

import javax.smartcardio.Card;
import java.util.List;

/**
 * Created by miaomiao on 17-7-25.
 */
public class Player {
    private int id;
    private String name;
    private List<Card> cards;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }

    public Player(int id, String name, List<Card> cards) {
        this.id = id;
        this.name = name;
        this.cards = cards;
    }



}
