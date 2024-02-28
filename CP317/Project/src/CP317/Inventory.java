package CP317;
public class Inventory {


  private String productId = null;
    private String productName = null;
    private int quantity = 0;
    private float price = 0;
    private String status = null;
    private String supplierName = null;

    /**
     * Supplier constructor.
     *
     * @param productId   Product ID
     * @param description Product name
     * @param price       Product quantity
     * @param quantity    Product price
     * @param status      Product stat
     * @param supplierId  Supplier ID
     */

  public Inventory(String productId, String productName, int quantity, float price, String status,
	    String supplierName) {

	this.productId = productId;
	this.productName = productName;
	this.quantity = quantity;
	this.price = price;
	this.status = status;
	this.supplierName = supplierName;
    }

    /**
     **
     * Getter for product ID
     */
    public String getProductId() {
	return productId;
    }

    /**
     **
     * Getter for product Name
     *
     * public String getProductName() { return productName; }
     * 
     * 
     * /** Getter for product description
     */
    public String getProductName() {
	return productName;
    }

    /**
     * Getter for product quantity
     */

    public int getQuantity() {
	return quantity;
    }

    /**
     * Getter for product price
     */
    public float getPrice() {
	return price;
    }

    /**
     * Getter for product status
     */
    public String getStatus() {
	return status;
    }

    /**
     * Getter for product status
     */
    public String getSupplierName() {
	return supplierName;
    }

    /**
     * Creates formatted string version of Product.
     */
    @Override
    public String toString() {
	return (this.productId + ", " + this.productName + ", " + this.quantity + ", " + this.price + ", " + this.status
		+ ", " + this.supplierName);
    }

  
}
