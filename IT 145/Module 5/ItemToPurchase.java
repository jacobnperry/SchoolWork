public class ItemToPurchase {
   //Private fields - itemName, itemPrice, and itemQuanity
    private String itemName = "None";
    private int itemPrice = 0;
    private int itemQuantity = 0;
    
    public ItemToPurchase () {
       this.itemName = "None";
       this.itemPrice = 0;
       this.itemQuantity = 0;
    }

    
   //public member methods (mutators & accessors)
   public void setName(String name) {
      itemName = name;
   }
   public String getName() {
       return itemName;
   }

   public void setPrice(int price) {
        itemPrice = price;
    }
    public int getPrice() {
     return itemPrice;
    }

    public void setQuantity(int quantity){
        itemQuantity = quantity;
    }

    public int getQuantity(){
        return itemQuantity;
    }

    public int totalCost(){
        return (itemQuantity * itemPrice);
    }

   
   //print item to purchase
   
   public String printItemPurchase() {
      String temp = ( itemName + itemQuantity + " @ $" + itemPrice +  
                         "  $" + (itemPrice * itemQuantity));
    return temp;
   }
}
