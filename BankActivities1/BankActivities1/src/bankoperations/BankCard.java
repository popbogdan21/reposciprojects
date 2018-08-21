package bankoperations;

public class BankCard {
    Person owner;
    String cardnumber;
    int pin;
    String iban;

    public BankCard(Person owner, String cardnumber, int pin, String iban) {
        this.owner = owner;
        this.cardnumber=cardnumber;
        this.pin=pin;
        this.iban=iban;
        }
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public String getCardnumber() {
        return cardnumber;
    }

    public void setCardnumber(String cardnumber) {
        this.cardnumber = cardnumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
}
