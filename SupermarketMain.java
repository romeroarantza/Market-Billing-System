import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.*;
public class SupermarketMain
{
   private static final DecimalFormat df = new DecimalFormat("0.00");
   
   public static void main(String[] args)
   {
      //Inventory
      
      Inventory Apple = new Inventory();
      Apple.setItemPrice(1.23);
      Apple.setItemName("Apple");
      
      Inventory Chicken = new Inventory();
      Chicken.setItemPrice(2.32);
      Chicken.setItemName("Chicken");

      Inventory Eggs = new Inventory();
      Eggs.setItemPrice(2.51);
      Eggs.setItemName("Dozen Eggs");

      Inventory Spinach = new Inventory();
      Spinach.setItemPrice(1.50);
      Spinach.setItemName("Spinach");

      Inventory Milk = new Inventory();
      Milk.setItemPrice(3.85);
      Milk.setItemName("Milk");

      Inventory Carrots = new Inventory();
      Carrots.setItemPrice(1.99);
      Carrots.setItemName("Carrots");

      Inventory Beef = new Inventory();
      Beef.setItemPrice(6.55);
      Beef.setItemName("Beef");

      Inventory OrangeJuice = new Inventory();
      OrangeJuice.setItemPrice(4.25);
      OrangeJuice.setItemName("Orange Juice");

      Inventory Sugar = new Inventory();
      Sugar.setItemPrice(1.99);
      Sugar.setItemName("Sugar");
      
      Inventory Salt = new Inventory();
      Salt.setItemPrice(0.99);
      Salt.setItemName("Salt");
   
                   
      //showing menue
      
      JOptionPane.showMessageDialog
      (null, 
      "Thank you for choosing DHAJ Market! \nYou can order your essentials and \nReceive them within two hours.\n\n" +
      "           Menu"+
      "\nItem                Price" +
      DisplayItem(Apple) + DisplayItem(Chicken) + 
      DisplayItem(Eggs) +  DisplayItem(Spinach) +
      DisplayItem(Milk) +  DisplayItem(Carrots) +
      DisplayItem(Beef) +  DisplayItem(OrangeJuice) +
      DisplayItem(Sugar) + DisplayItem(Salt), "DHAJ Market",JOptionPane.PLAIN_MESSAGE );
            
      //input
      JTextField Field1 = new JTextField(5);
      JTextField Field2 = new JTextField(5);
      JTextField Field3 = new JTextField(5);
      JTextField Field4 = new JTextField(5);
      JTextField Field5 = new JTextField(5);
      JTextField Field6 = new JTextField(5);
      JTextField Field7 = new JTextField(5);
      JTextField Field8 = new JTextField(5);
      JTextField Field9 = new JTextField(5);
      JTextField Field10 = new JTextField(5);
        
      JPanel myPanel = new JPanel();
      myPanel.setLayout(new BoxLayout(myPanel, BoxLayout.Y_AXIS));
      
      myPanel.add(new JLabel("Enter your desired quantity 0-10\n"));
      myPanel.add(new JLabel("  "));
      myPanel.add(new JLabel("  "));
      
      myPanel.add(new JLabel("Apple ($" + Apple.getItemPrice() + ") Quantity:"));
      myPanel.add(Field1);
      
      myPanel.add(new JLabel("Chicken ($" + Chicken.getItemPrice() + ") Quantity:"));
      myPanel.add(Field2);
      
      myPanel.add(new JLabel("Dozen Eggs ($" + Eggs.getItemPrice() + ") Quantity:"));
      myPanel.add(Field3);
      
      myPanel.add(new JLabel("Spinach ($" + Eggs.getItemPrice() + ") Quantity:"));
      myPanel.add(Field4);
      
      myPanel.add(new JLabel("Milk ($" + Milk.getItemPrice() + ") Quantity:"));
      myPanel.add(Field5);
      
      myPanel.add(new JLabel("Carrots ($" + Carrots.getItemPrice() + ") Quantity:"));
      myPanel.add(Field6);
      
      myPanel.add(new JLabel("Beef ($" + Beef.getItemPrice() + ") Quantity:"));
      myPanel.add(Field7);
      
      myPanel.add(new JLabel("Orange Juice ($" + OrangeJuice.getItemPrice() + ") Quantity:"));
      myPanel.add(Field8);
      
      myPanel.add(new JLabel("Sugar ($" + Sugar.getItemPrice() + ") Quantity:"));
      myPanel.add(Field9);
      
      myPanel.add(new JLabel("Salt ($" + Salt.getItemPrice() + ") Quantity:"));
      myPanel.add(Field10);
      
      
      
      int result = JOptionPane.showConfirmDialog
      (null, myPanel, "DHAJ Market", 
      JOptionPane.OK_CANCEL_OPTION, 
      JOptionPane.PLAIN_MESSAGE);
      
      
      //Conversion
      
      int QApple = Integer.parseInt(Field1.getText());
      int QChicken = Integer.parseInt(Field2.getText());
      int QEggs = Integer.parseInt(Field3.getText());
      int QSpinach = Integer.parseInt(Field4.getText());
      int QMilk = Integer.parseInt(Field5.getText());
      int QCarrots = Integer.parseInt(Field6.getText());
      int QBeef = Integer.parseInt(Field7.getText());
      int QOrangeJuice = Integer.parseInt(Field8.getText());
      int QSugar = Integer.parseInt(Field9.getText());
      int QSalt = Integer.parseInt(Field10.getText());
      
      //item total
      double ApplesItemTotal = CalcItemTotal( Apple.getItemPrice(), QApple);
      double ChickenItemTotal = CalcItemTotal( Chicken.getItemPrice(), QChicken);
      double EggsItemTotal = CalcItemTotal( Eggs.getItemPrice(), QEggs);
      double SpinachItemTotal = CalcItemTotal( Spinach.getItemPrice(), QSpinach);
      double MilkItemTotal = CalcItemTotal( Milk.getItemPrice(), QMilk);
      double CarrotsItemTotal = CalcItemTotal( Carrots.getItemPrice(), QCarrots);
      double BeefItemTotal = CalcItemTotal( Beef.getItemPrice(), QBeef);
      double OrangeJuiceItemTotal = CalcItemTotal( OrangeJuice.getItemPrice(), QOrangeJuice);
      double SugarItemTotal = CalcItemTotal( Sugar.getItemPrice(), QSugar);
      double SaltItemTotal = CalcItemTotal( Salt.getItemPrice(), QSalt);
      
      //Other Equations
      double SubTotal = ApplesItemTotal + ChickenItemTotal + EggsItemTotal 
      + SpinachItemTotal + MilkItemTotal + CarrotsItemTotal + BeefItemTotal
      + OrangeJuiceItemTotal + SugarItemTotal + SaltItemTotal;
      
      double TAX = 0.08;
      double SalesTax = SubTotal * TAX;
      
      
      double Total = SubTotal + SalesTax;
      
      // if statement with receipt         
      if (result == JOptionPane.OK_OPTION)
      {
          String receipt = "Confirm your selection\n\n" + 
         "Item      " + "Quantity      " + "Price\n" +
         "Apple.....(" + QApple 
          + ")..........$" + ApplesItemTotal +
         "\nChicken.....(" + QChicken 
         + ")..........$" + ChickenItemTotal +
         "\nEgg Carton.....(" + QEggs +
          ")..........$" + EggsItemTotal + 
           "\nSpinach.....(" + QSpinach + 
           ")..........$" + SpinachItemTotal +
         "\nMilk.....(" + QMilk 
         + ")..........$" + MilkItemTotal +
         "\nCarrots.....(" + QCarrots +
          ")..........$" + CarrotsItemTotal +
           "\nBeef.....(" + QBeef 
          + ")..........$" + BeefItemTotal +
         "\nOrange Juice.....(" + QOrangeJuice 
         + ")..........$" + OrangeJuiceItemTotal +
         "\nSugar.....(" + QSugar +
          ")..........$" + SugarItemTotal +
          "\nSalt.....(" + QSalt +
          ")..........$" + SaltItemTotal +
         "\n\n                Subtotal = $" + df.format(SubTotal) + 
         "\n                Sales Tax = $" + df.format(SalesTax) +
         "\n                Total = $" + df.format(Total) +
         "\n\nProceed with checkout?";
         
         int checkout = JOptionPane.showConfirmDialog
         (null, receipt, 
         "DHAJ Market Receipt", 
         JOptionPane.OK_CANCEL_OPTION, 
         JOptionPane.PLAIN_MESSAGE);  
         
         //if statement with payment option
         if (checkout == JOptionPane.YES_OPTION)
         {
            
            JTextField payment = new JTextField(5);
            JPanel payPanel = new JPanel();
            payPanel.add(new JLabel("Enter cash payment amount: $"));
            payPanel.add(payment);
            
            int payBox = JOptionPane.showConfirmDialog(null, 
            payPanel, "DHAJ Market Payment", 
            JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
            double Cash = Double.parseDouble(payment.getText());
            
            //If statement for change
            if (payBox == JOptionPane.OK_OPTION)
            {
               double Change = Cash - Total;
               int changeBack = JOptionPane.showConfirmDialog
                  (null,"Your change is $" + df.format(Change),
                  "DHAJ Market",JOptionPane.OK_CANCEL_OPTION , JOptionPane.PLAIN_MESSAGE); //still showing icon
               
               //if statement with final receipt
               if (changeBack == JOptionPane.OK_OPTION)
               {
                   String bill = "Final Purchase\n\n" + 
                  "Item      " + "Quantity      " + "Price\n" +
                  "Apple.....(" + QApple 
                   + ")..........$" + ApplesItemTotal +
                  "\nChicken.....(" + QChicken 
                  + ")..........$" + ChickenItemTotal +
                  "\nEgg Carton.....(" + QEggs +
                   ")..........$" + EggsItemTotal + 
                    "\nSpinach.....(" + QSpinach + 
                    ")..........$" + SpinachItemTotal +
                  "\nMilk.....(" + QMilk 
                  + ")..........$" + MilkItemTotal +
                  "\nCarrots.....(" + QCarrots +
                   ")..........$" + CarrotsItemTotal +
                    "\nBeef.....(" + QBeef 
                   + ")..........$" + BeefItemTotal +
                  "\nOrange Juice.....(" + QOrangeJuice 
                  + ")..........$" + OrangeJuiceItemTotal +
                  "\nSugar.....(" + QSugar +
                   ")..........$" + SugarItemTotal +
                   "\nSalt.....(" + QSalt +
                   ")..........$" + SaltItemTotal +
                   
                  "\n\n               Subtotal = $" + df.format(SubTotal) + 
                  "\n               Sales Tax = $" + df.format(SalesTax) +
                  "\n               Total = $" + df.format(Total) +
                  "\n               Payment = $" + df.format(Cash) +
                  "\n               Change = $" + df.format(Change) +
                  "\n\nThank you for your business!" +
                  "\nSee you soon!";
                   
                   JOptionPane.showConfirmDialog
                   (null, bill,
                  "DHAJ Market Receipt", 
                  JOptionPane.OK_CANCEL_OPTION, 
                  JOptionPane.PLAIN_MESSAGE);  
               
                      
               }//4th if statement
            }//3rd if statement
         }//2nd if statement  
      }//end 1st of if statment    
      
      
    }//end main statement

   public static String DisplayItem(Inventory anyItem) 
    {
      String properties = "\n" + anyItem.getItemName() + "...................$" + anyItem.getItemPrice() ;
      return properties;
    }
    
    public static double CalcItemTotal(double price, int quantity)
   {
      double ItemTotal = price * quantity;
      return ItemTotal;
   }

}
