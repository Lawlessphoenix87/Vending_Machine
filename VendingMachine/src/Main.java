// Name: Keenan Roberts
// Date: 5/6/2026
// Assignment: Assignment 10 - Vending Machine

import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        VendingMachine BCC_Machine = new VendingMachine(5);
        CashPayment cashPayment = new CashPayment(5.00);
        int choice = 0;
        
        InitialStock(BCC_Machine);
        BCC_Machine.DisplayItems();

        System.out.print("Enter the number of the item to purchase: ");
        if(input.hasNextInt())
            choice = input.nextInt();
            
        BCC_Machine.PurchaseItem(choice, cashPayment);

        input.close();
    }

    public static void InitialStock(VendingMachine machine)
    {
        machine.StockItem("Chips", 1.50, 3);
        machine.StockItem("Soda", 2.00, 2);
        machine.StockItem("Candy", 1.25, 0);
    }
}
