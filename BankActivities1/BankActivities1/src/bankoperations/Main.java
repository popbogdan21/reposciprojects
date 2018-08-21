package bankoperations;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.basic.BasicLookAndFeel;

public class Main {
    public static void main(String[] args) {
        //Client 1 account Instantiation
        BankAccount b1=new BankAccount("Ion Ion",1000,"RO00AAAA1B31007593840000","RON");
        //Client 2 account Instantiation
        BankAccount b2=new BankAccount("King Kong",10000,"RO00AAAA1B31007593840000","EUR");

        //User instantiation
        Person p1= new Person("1830000000001","Ion Ion",b1);
        Person p2= new Person("1830000000002","King Kong",b2);

        // Bank cards instantiation
        BankCard c1=new BankCard(p1,"2320 5632 9999 5764",1234, "RO00AAAA1B31007593840000");
        BankCard c2=new BankCard(p1,"2320 5632 9999 5765",1234, "RO00AAAA1B31007593840000");
        BankCard c3= new BankCard(p2,"2320 5632 9999 5766",1234, "RO00AAAA1B31007593840001");


        //Intializarea contului clientului 1
        BankCard[] client1BankCards=new BankCard[2];
        client1BankCards[0]=c1;
        client1BankCards[1]=c2;
        b1.setCards(client1BankCards);
        BankCard[] client2BankCards=new BankCard[1];
        client2BankCards[0]=c3;
        b2.setCards(client2BankCards);

        //Adaugarea conturilor in Atm si instantierea atm
        BankAccount[] allClientsAccounts=new BankAccount[2];
        allClientsAccounts[0]=b1;
        allClientsAccounts[1]=b2;


        // operatiuni cu bancomatul
        AutomatedTellerMachine atm1=new AutomatedTellerMachine(allClientsAccounts);
        System.out.println("Retragere bani din cont!!!!!!!!!!!!!!");
        atm1.withDrawMoneyFromATM(c1,1234,100);
        System.out.println();

        System.out.println("Adauga bani in cont!!!!!!!!!!");
        atm1.addMoneyUsingATM(c3,1234,500);
        System.out.println();

        System.out.println("Pin gresit!!!!!!!");
        atm1.withDrawMoneyFromATM(c1,2555,100);
        System.out.println();

    }
}
