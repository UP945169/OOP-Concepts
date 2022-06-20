public class Banking {
    private String owner;
    private double balance;

    public Banking(String owner, double balance){
        setOwner(owner);
        setBalance(balance);
    }

    public double deposit(double moneyIn){

        if(moneyIn > 0){
            balance = balance + moneyIn;

            return balance;
        }
        return 0;
    }

    public double withdraw(double moneyOut){

        if(moneyOut <= balance){
            balance = balance - moneyOut;

            return balance;
        }

        return 0;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = Math.max(balance, 0);
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
}
