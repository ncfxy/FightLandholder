package com.ncfxy.fightlandholdermain;

public class CardSet {
    private long currentSet;

    public CardSet() {
        this.currentSet = 0;
    }

    public long getCurrentSet() {
        return currentSet;
    }

    public void setCurrentSet(long currentSet) {
        this.currentSet = currentSet;
    }

    public void addCardByIndex(int index){
        long tempSet = 1;
        while(index > 0) {
            tempSet <<= 1;
        }
    }

    public void addCardByCardSet(CardSet cardSet) {
        this.currentSet = this.currentSet | cardSet.getCurrentSet();
    }
}
