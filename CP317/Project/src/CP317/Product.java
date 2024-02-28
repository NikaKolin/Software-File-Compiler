package CP317;
public class Product extends Inventory {

    private String description = null;
    private String productName = null;
    private String supplierId = null;

    /**
     * Supplier constructor.
     *
     * @param productId   Product ID
     * @param description Product description
     * @param price       Product price
     * @param quantity    Product quantity
     * @param status      Product status
     * @param supplierId  Supplier ID
     */

    public Product(String productId, String productName, String description, float price, int quantity, String status,
	    String supplierId) {

	super(productId, productName, quantity, price, status, null); // Assuming Supplier class has a constructor
								      // taking supplierId

	this.description = description;
	this.productName = productName;
	this.supplierId = supplierId;
    }

    /**
     **
     * Getter for description
     */

    public String getDescription() {
	return description;
    }

    /**
     * Getter for product name
     */

    @Override
    public String getProductName() {
	return productName;
    }

    /**
     * Getter for product status
     */

    public String getSupplierId() {
	return supplierId;
    }

    /**
     * Creates formatted string version of Product.
     */
    @Override
    public String toString() {
	return (getProductId() + ", " + getProductName() + ", " + this.description + ", " + getPrice() + ", "
		+ getQuantity() + ", " + getStatus() + ", " + this.supplierId);
    }
}
