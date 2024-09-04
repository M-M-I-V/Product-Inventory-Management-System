// Object class called Product
public class Product {
  
  // Instance variables 
  private String productId;
  private String productName;
  private double price; 
  private int quantity;
  
  /*
  ~ Constructor ~

  It sets the initial state of an object by assigning values to its
  instance variables. Essentially, it sets the initial value of 
  instance variables of an object.
  */

  // Constructor of Product class
  public Product(String productId, String productName, double price, int quantity) {
    /*
    this.productId
    We're referring to instance variable "private String productId"
    
    productId 
    We're referring to formal (argument) variable "String productId"
    */
    this.productId = productId;
    /*
    this.productName
    We're referring to instance variable "private String productName"
    
    productName
    We're referring to formal (argument) variable "String productName"
    */
    this.productName = productName;
    /*
    this.price
    We're referring to instance variable "private double price"
    
    price
    We're referring to formal (argument) variable "double price"
    */
    this.price = price;
    /*
    this.quantity
    We're referring to instance variable "private int quantity"
    
    quantity 
    We're referring to formal (argument) variable "int quantity"
    */
    this.quantity = quantity;
  }
  
  /*
  ~ Setter method ~

  It is used to set or update the value of an instance variable.
  To call a setter method:

  objectName.setVariableName(newValue);
  */

  // Setter method for price variable 
  public void setPrice(double price) {
    /*
    this.price
    We're referring to instance variable "private double price"
    
    price
    We're referring to formal (argument) variable "double price"
    */
    this.price = price;
  }
  
  // Setter method for quantity variable
  public void updateQuantity(int quantity) {
    /*
    this.quantity
    We're referring to instance variable "private int quantity"
    
    quantity 
    We're referring to formal (argument) variable "int quantity"
    */
    this.quantity = quantity;
  }
  
  /*
  ~ Getter methods ~

  It is used to retrieve or access the value of an instance variable.
  To call a getter method:

  objectName.getVariableName();
  */

  // Getter method for productId variable 
  public String getProductId() {
    // Returns the value of productId
    return productId;
  }
  
  // Getter method for productName variable 
  public String getProductName() {
    // Returns the value of productName
    return productName;
  }
  
  // Getter method for price variable 
  public double getPrice() {
    // Returns the value of price
    return price;
  }
  
  // Getter method for quantity variable 
  public int getQuantity() {
    // Returns the value of quantity
    return quantity;
  }
  
  /*
  ~ Overriding toString method ~

  This method returns a string representation of the object. 
  It is called when the object is printed.
  */
  @Override
  public String toString() {
    /*
    Prints 'Product ID: " + productId + ", Product Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity'
    in String format.
    */
    return "Product ID: " + productId + ", Product Name: " + productName + ", Price: $" + price + ", Quantity: " + quantity;
  }
}