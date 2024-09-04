// Imports Scanner class for user input 
import java.util.Scanner;

/*
~ Main class ~

This class handles the user interaction and invokes methods 
from Inventory class based on user input.
*/
public class SetAProductInventoryManagementSystem {
  
  // Creating Scanner class object for user input.
  private static final Scanner scan = new Scanner(System.in);
  
  // Main method
  public static void main(String[] args) {
    /*
    Exit variable with value false. It will be use in the 
    condition for while loop.
    */
    boolean exit = false;
    // Variable for productId inside main method.
    String productId = "";
    
    /*
    Creating Inventory class object so we can use its methods inside
    main method in SetAProductManagementInventorySystem class.
    */
    Inventory inventory = new Inventory();
    
    // Main loop to display menu and handle user choices.
    while(!exit) {
      /*
      Variable choice with int data type. It will serve as a 
      storage for the value fetch from displayMenu method.
      */
      int choice = displayMenu();
      
      /*
      We'll run a block of code based on the value of choice variable.
      */
      switch(choice) {
        
        // If the value of choice is 1, we'll go inside here.
        case 1: 
          /* 
          Storing the values from addProduct method inside the 
          Product object called product.
          */
          Product product = addProduct(scan);
          /*
          Calling addProduct method of Inventory class, and passing
          the object product to add it in ArrayList of objects.
          */
          inventory.addProduct(product);
          // End
        break;
        
        // If the value of choice is 2, we'll go inside here.
        case 2: 
          /*
          Storing the value from inputProductId method inside the
          productId variable.
          */
          productId = inputProductId();
          /*
          Calling updateProductPrice method of Inventory class, and 
          passing the value inside variable productId to identify 
          which product will be updated in price.
          */
          inventory.updateProductPrice(productId);
          // End
        break;
        
        // If the value of choice is 3, we'll go inside here.
        case 3: 
          /*
          Storing the value from inputProductId method inside the
          productId variable.
          */
          productId = inputProductId();
          /*
          Calling updateProductQuantity method of Inventory class, 
          and passing the value inside variable productId to identify
          which product will be updated in quantity.
          */
          inventory.updateProductQuantity(productId);
          // End
        break;
        
        // If the value of is choice 4, we'll go inside here.
        case 4: 
          /*
          Calling displayProducts method of Inventory class, and
          displaying all products.
          */
          inventory.displayProducts();
          // End
        break;
        
        // If the value of choice is 5, we'll go inside here.
        case 5: 
          // Updating the value of exit variable to true, to exit the program.
          exit = true;
          // End
        break;
        
        // If the value of choice is not between 1 to 5, we'll go here.
        default: 
        // Prompts the user to input between 1 to 5.
          System.out.println("Invalid choice, please input between 1 to 5.");
      }
    }
  }
  
  /*
  ~ Method to display menu ~

  This method prints the menu and returns the user's choice.
  */
  public static int displayMenu() {
    // Prints 'Product Information Management System' in the console.
    System.out.println("Product Inventory Management System");
    // Prints '1. Add product' in the console.
    System.out.println("1. Add product");
    // Prints '2. Update product price' in the console.
    System.out.println("2. Update product price");
    // Prints '3. Update product quantity' in the console.
    System.out.println("3. Update product quantity");
    // Prints '4. Display products' in the console.
    System.out.println("4. Display products");
    // Prints '5. Exit' in the console.
    System.out.println("5. Exit");
    // Creates new line for formatting.
    System.out.println();
    
    // Prompts the user to enter choice.
    System.out.print("Enter choice: ");
    // Returns user choice.
    return scan.nextInt();
  }
  
  /*
  ~ Method to add a product ~

  This method prompts the user to enter product details and returns 
  a new Product object.
  */
  public static Product addProduct(Scanner scan) {
    // Creates new line for formatting 
    System.out.println();
    // Eating the new line to not cause a bug.
    scan.nextLine();
    
    // Prompts the user to enter product id.
    System.out.print("Product id: ");
    // Stores user input inside productId variable.
    String productId = scan.nextLine();
    
    // Prompts the user to enter product name.
    System.out.print("Product name: ");
    // Stores user input inside productName variable.
    String productName = scan.nextLine();
    
    // Prompts the user to enter price.
    System.out.print("Price: ");
    // Stores user input inside price variable.
    double price = scan.nextDouble();
    
    // Prompts the user to enter quantity.
    System.out.print("Quantity: ");
    // Stores user input inside quantity variable.
    int quantity = scan.nextInt();
    
    // Creating new line for formatting 
    System.out.println();
    
    /*
    Returns the value from user input as a form of an object of
    Product class.
    */
    return new Product(productId, productName, price, quantity);
  }
  
  /*
  ~ Method to input product ID ~

  This method prompts the user to enter a product ID and returns it.
  */
  private static String inputProductId() {
    // Creates new line for formatting 
    System.out.println();
    // Eating the new line to not cause a bug.
    scan.nextLine();
    
    // Prompts the user to input product id
    System.out.print("Enter product id: ");
    // Returns the user input
    return scan.nextLine();
  }
}