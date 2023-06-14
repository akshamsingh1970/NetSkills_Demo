public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double viewBalance();
    double viewInterest();
}