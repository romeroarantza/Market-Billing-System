public class Inventory
{
   private double itemPrice;
   private int itemQuantity;
   private String itemName;
   
  public void setItemPrice(double price)
  {
    itemPrice = price; 
  }
  
  public double getItemPrice()
  {
    return itemPrice;
  }
  
  public void setItemQunatity(int quantity)
  {
    itemQuantity = quantity; 
  }
  public int getItemQuantity()
  {
    return itemQuantity;
  }
  
  public void setItemName(String name)
  {
    itemName = name; 
  }
  public String getItemName()
  {
    return itemName;
  }
}