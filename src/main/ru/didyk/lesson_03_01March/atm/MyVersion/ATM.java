package ru.didyk.lesson_03_01March.atm.MyVersion;

public interface ATM {
    int accountState();
    void withDraw(int money);
    void depositMoney(int money);
    void addBanknotes(Banknotes banknotes, int amount);

}
