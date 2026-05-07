// Name: Keenan Roberts
// Date: 5/6/2026
// Assignment: Assignment 10 - Vending Machine

public class CashPayment implements PaymentMethod
{
    private double _cashOnHand;

    public CashPayment(double startAmount)
    {
        _cashOnHand = startAmount;
    }

    public boolean ProcessPayment(double amount)
    {
        boolean isSuccessful = false;
        if(_cashOnHand > amount)
            {
                _cashOnHand -= amount;
                return isSuccessful = true;
            }
        else
        {
            System.out.println("Insufficient cash.");
            return isSuccessful;
        }
    }

    public String PaymentType()
    {
        return "Cash";
    }

    public double AvailableBalance()
    {    
        return _cashOnHand;
    }
}
