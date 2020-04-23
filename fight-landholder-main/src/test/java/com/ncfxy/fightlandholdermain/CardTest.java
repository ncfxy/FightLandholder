package com.ncfxy.fightlandholdermain;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import org.junit.jupiter.api.Assertions;

public class CardTest {

    @Test
    public void testCreateCardByIndex(){
        Card card1 = new Card(0);
        Assertions.assertEquals(1, card1.getNumber());
        Assertions.assertEquals(CardType.HEART, card1.getType());
        Card card2 = new Card(51);
        Assertions.assertEquals(13, card2.getNumber());
        Assertions.assertEquals(CardType.CLUB, card2.getType());
        Card card3 = new Card(52);
        Assertions.assertEquals(0, card3.getNumber());
        Assertions.assertEquals(CardType.JOKER1, card3.getType());
        Card card4 = new Card(53);
        Assertions.assertEquals(0, card4.getNumber());
        Assertions.assertEquals(CardType.JOKER2, card4.getType());
    }
}
