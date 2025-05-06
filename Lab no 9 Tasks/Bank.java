abstract class Bank{

  abstract int getBalance();
}

class BankA extends Bank{

    int balance=4000;

    int getBalance(){
        return balance;

    }
}

class BankB extends Bank {

    int balance=3500;

    int getBalance(){
        return balance;
    }
}

class BankC extends Bank{

    int balance=5000;
    int getBalance(){
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            BankA bankA = new BankA();
            BankB bankB = new BankB();
            BankC bankC = new BankC();

            System.out.println("Balance in Bank A: " + bankA.getBalance());
            System.out.println("Balance in Bank B: " + bankB.getBalance());
            System.out.println("Balance in Bank C: " + bankC.getBalance());
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

    }
}