// Name: Keenan Roberts
// Date: 5/6/2026
// Assignment: Assignment 10 - Vending Machine

public interface PaymentMethod 
{
    boolean ProcessPayment(double amount);
    String CashPayment();
    double AvailableBalance();
}
