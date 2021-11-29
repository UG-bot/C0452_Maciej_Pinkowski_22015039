
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Maciej Pinkowski
 * @version (29.11.2021)
 */
public class StockApp
{
    private InputReader reader;
<<<<<<< HEAD
    
    private StockList stock;
=======
    private StockList stock;
   
>>>>>>> df2fcd17d3063ca61afd0c0dc2152d7b2215c395
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
<<<<<<< HEAD
        
        stock = new StockList();
=======
        stock = new StockList();
        //stock = new ProductList();
>>>>>>> df2fcd17d3063ca61afd0c0dc2152d7b2215c395
        //StockDemo demo = new StockDemo(stock);
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("quit"))
        {
            return true;
        }
<<<<<<< HEAD
        if(choice.equals("print"))
        {
             printProduct();
        }
        if(choice.equals("add"))
        {
            addProduct();
        }
        if(choice.equals("buy"))
        {
            buyProduct();
        }
        if(choice.equals("sell"))
        {
            sellProduct();
        }
        if(choice.equals("restock"))
        {
            stock.lowStockList();
        }
        if(choice.equals("search"))
        {
            searchProduct();
        }
        if(choice.equals("low stock"))
        {
            stock.getProductsWithLowStock();
        }
        if(choice.equals("remove"))
        {
            removeProduct();
        }
=======
        else if(choice.equals("add"))
        {
            int id = reader.getInt("Please enter Id for item");
            String name = reader.getString("Enter name of product");
            Product product = new Product(id , name);
            stock.add(product);
            System.out.println("Product" + product.getID() + "," 
            + product.getName() + "has been added");
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("remove"))
        {
        
        }
>>>>>>> df2fcd17d3063ca61afd0c0dc2152d7b2215c395
        return false;
    }
    
     private void printProduct()
    {
        stock.print();
        System.out.println("List of products has been printed");
    }
    
    private void addProduct()
    {
        int id = reader.getInt("Enter the product ID: ");
        String name = reader.getString("Enter the name of the product: ");
        Product product = new Product(id, name);
        stock.add(product);
        System.out.println("Product " + product.getID() 
            + ", " + product.getName() + " has been ADDED");
    }
    
    private void buyProduct()
    {
        System.out.println("Buying a Product");
        System.out.println();
        
        int id = reader.getInt(" Enter a Product ID > ");
        int amount = reader.getInt(
        " Enter the Amount to be Bought > ");
        
        Product product = stock.findProduct(id);
        stock.buyProduct(id, amount);
        stock.print();
        System.out.println("Bought "+ amount +" of ID "+product.getID()+": "+
        product.getName());
    }
    
    private void sellProduct()
    {
        int id = reader.getInt("Enter a Product ID ");
        int amount = reader.getInt("Enter Amount to sell ");
        
        Product product = stock.findProduct(id);
        stock.sellProduct(id, amount);
        stock.print();
        System.out.println("Sold "+ amount +" of ID " + product.getID() + ": "+
        product.getName());
    }
    
    private void searchProduct()
    {  
        int id = reader.getInt("Enter a Product ID "); 
        Product product = stock.findProduct(id);
        System.out.println("Product found: " + product.getID() + ": " +
        product.getName());
    }
    
     private void removeProduct()
    {
        int id = reader.getInt("Please enter the ID");
        System.out.println("Removing the product");
        System.out.println();
        
        stock.remove(id);
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println("    Buy:        Buy a product");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Search:     Find a product");
        System.out.println("    Restock:    Restock a product");
        System.out.println("    Low stock   Print all products with low stock");
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Maciej Pinkowski");
        System.out.println("********************************");
    }
}