// Imports ArrayList class for list of objects 
import java.util.ArrayList;
// Imports Scanner class for user input 
import java.util.Scanner;

/*
~Inventory class ~

This class handles the list of products and provides methods
to add, update, and display products.
*/
public class Inventory {

  // List to store products
  private static final ArrayList<Product> products = new ArrayList<Product>();
  // Scanner for user input
  private static final Scanner scan = new Scanner(System.in);

  /*
  ~ Method to add a product to the inventory ~

  This method takes a Product object and adds it to the products list.
  */
  public void addProduct(Product product) {
    // Adds a product in products (ArrayList of Product class)
    products.add(product);
  }

  /*
  ~ Method to update product price ~

  This method updates the price of a product identified by its productId.
  It prompts the user to enter the new price.
  */
  public void updateProductPrice(String productId) {
    // Loops inside products.
    for(Product product : products) {
      /* 
      Checks if a certain product have a productId similar to 
      productId a user inputted.
      */
      if(product.getProductId().equals(productId)) {
        /*
        If yes, it prompts the user to input a new product price
        for that product
        */
        System.out.print("Enter new product price: ");
        try {
          // Stores user input inside price variable
          double price = scan.nextDouble();
          // Updates product price using setPrice method
          product.setPrice(price);
          // Prints 'Price updated for Product ID (plus its ID)' in the console.
          System.out.println("Price updated for Product ID " + product.getProductId());
          // Calls displayProducts method to display products
          displayProducts();
          // Checks for exceptions
        } catch(Exception e) {
          /*
          Prints 'Invalid input. Please enter a valid price' in the 
          console.
          */
          System.out.println("Invalid input. Please enter a valid price.");
          // Clear the invalid input
          scan.next(); 
        }
        // Exits early in the method if no productId matches.
        return;
      }
    }
    // Prints 'Product ID not found' in the console.
    System.out.println("Product ID not found.");
  }

  /*
  ~ Method to update product quantity ~

  This method updates the quantity of a product identified by its productId.
  It prompts the user to enter the new quantity.
  */
  public void updateProductQuantity(String productId) {
    // Loops inside products.
    for(Product product : products) {
      /* 
      Checks if a certain product have a productId similar to 
      productId a user inputted.
      */
      if(product.getProductId().equals(productId)) {
        /*
        If yes, it prompts the user to input a new product price
        for that product
        */
        System.out.print("Enter new product quantity: ");
        try {
          // Stores user input inside quantity variable
          int quantity = scan.nextInt();
          // Updates product quantity using setQuantity method.
          product.updateQuantity(quantity);
          // Prints 'Price updated for Product ID (plus its ID)' in the console.
          System.out.println("Quantity updated for Product ID " + product.getProductId());
          // Calls displayProducts method to display products
          displayProducts();
          // Checks for exceptions
        } catch(Exception e) {
          /*
          Prints 'Invalid input. Please enter a valid price' in the 
          console.
          */
          System.out.println("Invalid input. Please enter a valid quantity.");
          // Clear the invalid input.
          scan.next(); 
        }
        // Exits early in the method if no productId matches.
        return;
      }
    }
    // Prints 'Product ID not found' in the console.
    System.out.println("Product ID not found.");
  }

  /*
  ~ Method to display all products ~

  This method prints all the products in the inventory.
  */
  public void displayProducts() {
    // Prints 'Products in the inventory' in the console.
    System.out.println("\nProducts in the inventory:");
    // Loops inside products.
    for(Product product : products) {
      // Prints product inside the products.
      System.out.println(product);
    }
    // Creates new line for formatting.
    System.out.println();
  }
}