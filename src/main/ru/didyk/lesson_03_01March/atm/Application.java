package ru.didyk.lesson_03_01March.atm;

import ru.didyk.lesson_03_01March.atm.MyVersion.*;

public class Application {
    public static void main(String[] args) {

        AccountState myAccount = new AccountState();
        ATM atm = new ConcretteATM(myAccount);
        atm.addBanknotes(Banknotes.TENS, 50);
        atm.addBanknotes(Banknotes.FIFTH, 50);
        atm.addBanknotes(Banknotes.HUNDREDS, 50);
        atm.addBanknotes(Banknotes.FIVEHUNDREDS, 50);


        atm.depositMoney(1000); // внесли 400
        atm.withDraw(500); // снимаем 500

        atm.accountState(); //проверка баланса

    }
}
