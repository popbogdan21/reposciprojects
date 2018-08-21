package bankoperations;

public class Person {
    public String  cnp;
    public String name;
    BankAccount bankAccount;


    public Person(String  cnp, String name, BankAccount bankAccount) {
        this.cnp=cnp;
        this.name=name;
        this.bankAccount=bankAccount;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankAccount() {
        return bankAccount.iban;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

}
