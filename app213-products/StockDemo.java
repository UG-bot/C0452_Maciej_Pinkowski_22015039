
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo(StockList stock)
    {
        this.stock = stock;
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Apple iPhone 12"));
        stock.add(new Product(103, "Google Pixel 4A"));
        stock.add(new Product(104, "Apple iPhone 13"));
        stock.add(new Product(105, "Xiaomi Mi 11"));
        stock.add(new Product(106, "Apple iPhone X"));
        stock.add(new Product(107, "Asus ZenFone 8"));
        stock.add(new Product(108, "vivo X60 Pro"));
        stock.add(new Product(109, "realme GT 5G"));
        stock.add(new Product(110, "Motorola Edge 20 Pro"));
        
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(101, 50);
        stock.buyProduct(102, 60);
        stock.buyProduct(103, 70);
        stock.buyProduct(104, 80);
        stock.buyProduct(105, 90);
        stock.buyProduct(106, 100);
        stock.buyProduct(107, 110);
        stock.buyProduct(108, 120);
        stock.buyProduct(109, 130);
        stock.buyProduct(110, 140);
    }

    private void sellProducts()
    {
        stock.sellProduct(101, 10);
        stock.sellProduct(102, 15);
        stock.sellProduct(103, 20);
        stock.sellProduct(104, 25);
        stock.sellProduct(105, 30);
        stock.sellProduct(106, 35);
        stock.sellProduct(107, 40);
        stock.sellProduct(108, 45);
        stock.sellProduct(109, 50);
        stock.sellProduct(110, 55);
    }    
}