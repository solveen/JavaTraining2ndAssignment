package QuestionNumberFour;

public abstract class Bank {

    private double BankA = 1000d;
    private double BankB = 1500d;
    private double BankC = 2000d;
    //private variables need getter and setter to be accessed by other classes.

   public abstract void getBalance();

    public double getBankA() {
        return BankA;
    }

    public void setBankA(double bankA) {
        BankA = bankA;
    }

    public double getBankB() {
        return BankB;
    }

    public void setBankB(double bankB) {
        BankB = bankB;
    }

    public double getBankC() {
        return BankC;
    }

    public void setBankC(double bankC) {
        BankC = bankC;
    }
}
