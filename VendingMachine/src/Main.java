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
        CashPayment cashPayment = new CashPayment(10.00);
        int choice = 0;
        boolean quit = false;

        InitialStock(BCC_Machine);

        do
        {
           choice = DisplayMenu(input);
           switch(choice)
           {
                case 1:
                    BCC_Machine.DisplayItems();  
                    break;                  
                case 2:
                    PurchaseItem(input, BCC_Machine, cashPayment);
                    break;
                case 3:
                    double balance = cashPayment.AvailableBalance();
                    System.out.printf("Current balance: $%.2f%n", balance);
                    
                    break;
                case 4:
                    System.out.println("Thank you for using the Vending Machine. Goodbye!");
                    quit = true;
                    break;
           }
        }while(!quit);

        input.close();
    }

    public static void InitialStock(VendingMachine machine)
    {
        machine.StockItem("Chips", 1.50, 3);
        machine.StockItem("Soda", 2.00, 2);
        machine.StockItem("Candy", 1.25, 5);
    }

    public static int DisplayMenu(Scanner input)
    {
        int choice = 0;

        System.out.println("===== VENDING MACHINE =====");
        System.out.print("1. View items \n2. Purchase item \n3. Check balance \n4. Quit\n");
        System.out.println("===========================");
        System.out.print("Enter your choice: ");

        if(input.hasNextInt())
        {
            int temp = input.nextInt();
            input.nextLine();
            if(temp > 0 && temp <= 4)
                {choice = temp;
                return choice;
                }
            else
            {
                System.out.println("Invalid choice. Please try again.");
                input.next();
            }    
        }
        else
        {
            System.out.println("Invalid choice. Please try again.");
            input.nextLine();
        }
        return choice;
            
    }

    public static void PurchaseItem(Scanner input, VendingMachine machine, CashPayment payment)
    {
                machine.DisplayItems();
                int count = machine.GetItemCount();
                int temp = 0;
                int choice = 0;

        System.out.print("Enter the number of the item to purchase: ");
        if(input.hasNextInt())
            temp = input.nextInt();
        input.nextLine();
        if(temp > 0 && temp <= count)
            choice = temp;
        machine.PurchaseItem(choice, payment);
    }

  
}
