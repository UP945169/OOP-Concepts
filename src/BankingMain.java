public class BankingMain {
    public static void main(String[] args) {
        Banking JohnAccount = new Banking("John" , 30000);

        Banking KarenAccount = new Banking("Karen", 20000);

        JohnAccount.withdraw(150);
        System.out.println(JohnAccount.getBalance());

        KarenAccount.deposit(300);
        System.out.println(KarenAccount.getBalance());
    }
}
