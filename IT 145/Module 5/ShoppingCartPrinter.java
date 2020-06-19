import java.util.Scanner;

public class ShoppingCartPrinter {
   public static void main(String[] args) {

      Scanner scnr = new Scanner(System.in);
      int i = 0;
      String productName;
      int productPrice = 0;
      int productQuantity = 0;
      int cartTotal = 0;
  
      ItemToPurchase item1 = new ItemToPurchase();
      ItemToPurchase item2 = new ItemToPurchase();

      // Get item 1 details from user, create itemToPurchase object
      System.out.println("Item 1");
      System.out.println("Enter the item name: ");
      productName = scnr.next();
      item1.setName(productName);
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      item1.setPrice(productPrice);
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      item1.setQuantity(productQuantity);

      scnr.nextLine();

      System.out.println("Item 2");
      System.out.println("Enter the item name: ");
      productName = scnr.next();
      item2.setName(productName);
      System.out.println("Enter the item price: ");
      productPrice = scnr.nextInt();
      item2.setPrice(productPrice);
      System.out.println("Enter the item quantity: ");
      productQuantity = scnr.nextInt();
      item2.setQuantity(productQuantity);
      

      System.out.println("TOTAL COST");
      System.out.println(item1.printItemPurchase());
      System.out.println(item2.printItemPurchase());

      System.out.println("Total: " + (item1.totalCost() + item2.totalCost()));
 
      // Get item 2 details from user, create itemToPurchase object

      
      // Add costs of two items and print total
      // cartTotal = item one price + item two price
      // Totoal Cost
      // item one information
      // item two information
      // Total output
      
      return;
   }
}