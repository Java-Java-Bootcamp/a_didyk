package ru.didyk.lesson_03_01March.atm.MyVersion;

public class FifthCellImpl implements MoneyCell {

    private int maxNumber = 10;
    private int currentState;
    private Banknotes banknotes = Banknotes.FIFTH;

    @Override
    public void putMoney(int money) {
        this.currentState = currentState + money;
    }

    @Override
    public boolean canPut(int money) {
        return money <= maxNumber - currentState;
    }

    @Override
    public boolean canGet(int money) {
        return money <= maxNumber - currentState;
    }

    @Override
    public int getMoney(int money) {
        if(money > currentState) {
            return 0;
        }
        this.currentState = currentState - money;
        return money;
    }

    @Override
    public Banknotes getType() {
        return banknotes;
    }
}
