
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author Maciej Pinkowski
 * @version 15.11.2021
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
        
        stock.add(new Product(11, "Samsung Galaxy S20"));
        stock.add(new Product(12, "Apple iPhone 12"));
        stock.add(new Product(13, "Google Pixel 4A"));
        stock.add(new Product(14, "Apple iPhone 13"));
        stock.add(new Product(15, "Xiaomi Mi 11"));
        stock.add(new Product(16, "Apple iPhone X"));
        stock.add(new Product(17, "Asus ZenFone 8"));
        stock.add(new Product(18, "vivo X60 Pro"));
        stock.add(new Product(19, "realme GT 5G"));
        stock.add(new Product(20, "Motorola Edge 20 Pro"));
        
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
    
    /**
     * buys different quantity of each product
     */
    private void buyProducts()
    {
        stock.buyProduct(11, 5);
        stock.buyProduct(12, 6);
        stock.buyProduct(13, 7);
        stock.buyProduct(14, 8);
        stock.buyProduct(15, 9);
        stock.buyProduct(16, 10);
        stock.buyProduct(17, 11);
        stock.buyProduct(18, 12);
        stock.buyProduct(19, 13);
        stock.buyProduct(20, 14);
    }
    
    /**
     *sells different quantity of each product
     */
    private void sellProducts()
    {
        stock.sellProduct(11, 1);
        stock.sellProduct(12, 1);
        stock.sellProduct(13, 2);
        stock.sellProduct(14, 2);
        stock.sellProduct(15, 3);
        stock.sellProduct(16, 3);
        stock.sellProduct(17, 4);
        stock.sellProduct(18, 4);
        stock.sellProduct(19, 5);
        stock.sellProduct(20, 5);
    }    
}