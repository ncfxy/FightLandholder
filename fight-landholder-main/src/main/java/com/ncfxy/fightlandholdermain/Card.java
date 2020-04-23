package com.ncfxy.fightlandholdermain;

public class Card {
    private CardType type;
    private int number;

    public Card(CardType type, int number) {
        this.type = type;
        this.number = number;
    }

    /**
     * 通过手牌的index来创建手牌，编号规则如下：
     * 数组从0开始编号，手牌从红桃A开始编号
     * 点数顺序为A-K， 点数值 = (index / 4) + 1
     * 花色顺序为红桃、黑桃、方块、梅花, 花色= (index % 4)
     * 52为小王，53为大王, 点数为0
     * @param index
     */
    public Card(int index){
        if(index >= 52 && index <= 53) {
            this.number = 0;
            this.type = CardType.getCardTypeByIndex(index - 48);
            return;
        }
        this.number = (index / 4) + 1;
        this.type = CardType.getCardTypeByIndex(index % 4);
    }

    public CardType getType() {
        return type;
    }

    public void setType(CardType type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
