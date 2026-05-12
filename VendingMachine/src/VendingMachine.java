// Name: Keenan Roberts
// Date: 5/6/2026
// Assignment: Assignment 10 - Vending Machine

public class VendingMachine 
{
    private String[] _itemNames;
    private double[] _itemPrices;
    private int[] _itemQuantities;
    private int _itemCount;
    private int _maxItems;

    public VendingMachine(int maxItems)
    {
        _maxItems = maxItems;

        _itemNames = new String[maxItems];
        _itemPrices = new double[maxItems];
        _itemQuantities = new int[maxItems];
        _itemCount = 0;
    }

    public void StockItem(String name, double price, int quantity)
    {
        if(_itemCount >= _maxItems)
            System.out.println("Machine is full. Cannot add more items.");
        else
        {
            _itemNames[_itemCount] = name;
            _itemPrices[_itemCount] = price;
            _itemQuantities[_itemCount] = quantity;
            _itemCount++;
            System.out.printf("Stocked: %s ($%.2f) x %d%n", name, price, quantity);
        }
    }

    public void DisplayItems()
    {
        if(_itemCount == 0)
            System.out.println("Machine is empty.");
        else
        {
            System.out.println("===== VENDING MACHINE =====");
            for(int i = 0; i < _itemCount; i++)
            {
                if(_itemQuantities[i] > 0)
                    System.out.printf((i + 1) + ". %s - $%.2f (%d left)%n", _itemNames[i], _itemPrices[i], _itemQuantities[i]);
                else
                    System.out.printf((i + 1) + ". %s - $%.2f (SOLD OUT)%n", _itemNames[i], _itemPrices[i]);
   
            }
            System.out.println("===========================");

        }
    }
}
