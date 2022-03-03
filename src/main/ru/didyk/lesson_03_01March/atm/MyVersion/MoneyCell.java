package ru.didyk.lesson_03_01March.atm.MyVersion;

public interface MoneyCell {
    void putMoney(int money);
    boolean canPut(int money);
    boolean canGet(int money);
    int getMoney(int money);
    Banknotes getType();
}
