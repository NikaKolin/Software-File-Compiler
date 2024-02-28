public class Supplier extends Inventory {

  protected String supplierId = null;
  protected String address = null;
  protected String phone = null;
  protected String email = null;

  /**
   * Supplier constructor.
   *
   * @param supplier_id   Supplier ID
   * @param supplier_name Supplier name
   * @param address       supplier address Person
   * @param Phone
   * @param Email         (of the supplier)
   */

  public Supplier(final String supplierId, final String supplierName, final String address, final String phone,
    final String email) {

super(null, null, 0, 0, null, supplierName);

this.supplierId = supplierId;
this.address = address;
this.phone = phone;
this.email = email;
  }

  /**
   * getter for supplier ID
   * 
   */

  public String getSupplierId() {
return supplierId;
  }

  /**
   * getter for supplier address
   * 
   */

  public String getaddress() {
return address;
  }

  /**
   * getter for supplier phone number
   * 
   */

  public String getPhone() {
return phone;
  }

  /**
   * getter for supplier email
   * 
   */

  public String getEmail() {
return email;
  }

  /**
   * Creates formatted string version of Person.
   */
  @Override
  public String toString() {
return (this.supplierId + ", " + getSupplierName() + ", " + this.address + ", " + this.phone + ", "
  + this.email);
  }

}