package bankoperations;

public class AutomatedTellerMachine {
    BankAccount[] listOfBankAccounts;

    public AutomatedTellerMachine(BankAccount[] allClientsAccounts) {
       this.listOfBankAccounts=allClientsAccounts;

    }

    public BankAccount[] getListOfBankAccounts() {
        return listOfBankAccounts;
    }

    public void setListOfBankAccounts(BankAccount[] listOfBankAccounts) {
        this.listOfBankAccounts = listOfBankAccounts;
    }
    public void withDrawMoneyFromATM(BankCard card,int pin, double sum){
        Boolean accoountIsPresent=false;
        int i;
        for (i=0; i<listOfBankAccounts.length;i++){
                if(card.owner.bankAccount==listOfBankAccounts[i]){
                    if(card.pin==pin){
                        card.owner.bankAccount.withdrawMoney(card.owner.bankAccount,card,sum);
                        accoountIsPresent=true;
                    }else {
                        Receipt r=new Receipt();
                        r.printErr("Incorrect PIN number!");
                        return;
                    }
                }
        }
        if (!accoountIsPresent){
            Receipt r=new Receipt();
            r.printErr("Invalid card");
        }
    }
    public void addMoneyUsingATM(BankCard card,int pin, double sum){
        Boolean accoountIsPresent=false;
        int i;
        for (i=0; i<listOfBankAccounts.length;i++){
            if(card.owner.bankAccount==listOfBankAccounts[i]){
                if(card.pin==pin){
                    card.owner.bankAccount.addMoney(card.owner.bankAccount,card,sum);
                    accoountIsPresent=true;
                    break;
                }else {
                    Receipt r=new Receipt();
                    r.printErr("Incorrect PIN number!");
                    return;
                }
            }
        }
        if (!accoountIsPresent){
            Receipt r=new Receipt();
            r.printErr("Invalid card");
        }
    }
}
