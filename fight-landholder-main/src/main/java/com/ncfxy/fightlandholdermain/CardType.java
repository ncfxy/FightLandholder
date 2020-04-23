package com.ncfxy.fightlandholdermain;

public enum CardType {
    HEART("红桃", 0), // 红桃 heart
    SPADE("黑桃", 1), // 黑桃 spade
    DIAMOND("方块", 2), // 方块 diamond
    CLUB("梅花", 3),
    JOKER1("小王", 4),
    JOKER2("大王", 5);  // 梅花 club

    private String name;
    private int index;

    private CardType(String name, int index){
        this.name = name;
        this.index = index;
    }

    /**
     * 通过对4取余得到的结果来获取当前手牌的花色
     * @param index
     * @return
     */
    public static CardType getCardTypeByIndex(int index) {
        CardType[] types = CardType.values();
        for(int i = 0;i < types.length;i++) {
            if(types[i].getIndex() == index) {
                return types[i];
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
