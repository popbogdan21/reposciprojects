package bankoperations;

import javax.management.MBeanNotificationInfo;
import javax.print.DocFlavor;
import java.awt.*;

public class BankAccount {
    public String name;
    public BankCard[] cards;
    public double balance;
    public String iban;
    public String currency;

    public BankAccount(String name, double balance, String iban, String currency) {
        this.name=name;
        this.balance=balance;
        this.iban=iban;
        this.currency=currency;
    }
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankCard[] getCards() {
        return cards;
    }

    public void setCards(BankCard[] cards) {
        this.cards = cards;
    }
    public void withdrawMoney(BankAccount bankAccount, BankCard card, double sum){
        Receipt r=new Receipt();
        if (bankAccount.balance<sum){
            r.printErr("Not enough funds");
        }else{
            this.balance-=sum;
            r.printOperation("The sum that was withdrawn: ",Double.toString(sum),
                              "Available amount in account: ", Double.toString(this.balance),this.currency);
        }
    }
    public void addMoney(BankAccount bankAccount, BankCard card, double sum){
        Receipt r=new Receipt();
            this.balance+=sum;
            r.printOperation("The sum that was added: ",Double.toString(sum),
                    "Available amount in account: ", Double.toString(this.balance),this.currency);
        }
}