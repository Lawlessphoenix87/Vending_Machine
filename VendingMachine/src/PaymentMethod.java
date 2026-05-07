// Name: Keenan Roberts
// Date: 5/6/2026
// Assignment: Assignment 10 - Vending Machine

public interface PaymentMethod 
{
    public boolean ProcessPayment(double amount);
    public String PaymentType();
    public double AvailableBalance();
}
