package ru.didyk.lesson_03_01March.MyVersion;

import java.util.ArrayList;
import java.util.List;

public class ConcretteATM implements ATM{

    private List<MoneyCell> moneyCells;
    private AccountState accountState;

    public ConcretteATM(AccountState accountState) {
        this.moneyCells = new ArrayList<>();
        moneyCells.add(new FifthCellImpl());
        this.accountState = accountState;
    }

    @Override
    public int accountState() {
        System.out.println("Остаток по счету: " + accountState.printAmount());
        return accountState.printAmount();
    }

    @Override
    public void withDraw(int money) {
        if(money < accountState.getAmount()) {
            System.out.println("Вы сняли: " + money);
            accountState.setAmount(accountState.getAmount() - money);
        } else {
            System.out.println("Недостаточно денег на счету");
        }
    }

    public List<MoneyCell> getMoneyCells() {
        return moneyCells;
    }

    public void setMoneyCells(List<MoneyCell> moneyCells) {
        this.moneyCells = moneyCells;
    }

    public AccountState getAccountState() {
        return accountState;
    }

    public void setAccountState(AccountState accountState) {
        this.accountState = accountState;
    }

    @Override
    public void depositMoney(int money) {
        System.out.println("Вы внесли: " + money);
        accountState.setAmount(accountState.getAmount() + money);
    }

    @Override
    public void addBanknotes(Banknotes banknotes, int amount) {
        for (int i = 0; i < moneyCells.size(); i++) {
            if(moneyCells.get(i).getType() == banknotes) {
                moneyCells.get(i).putMoney(amount);
            }
        }
    }
}
