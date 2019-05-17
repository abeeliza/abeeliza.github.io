import javax.swing.*;
public class GroceryStore
{
 private String itemPurchase;
 private double price;
 private double tax;
 final private double taxRate = 0.085;
 private static double totAmtSold;
 private static int totItemsSold=0;

 public GroceryStore()
 {
  itemPurchase = "Milk";
  price = 2.69;

  tax = price * taxRate;
  totAmtSold = totAmtSold + tax + price;
  totItemsSold = totItemsSold + 1;
 }

 public GroceryStore(String itemPurchase,double price)
 {
  this.itemPurchase = itemPurchase;
  this.price = price;

  tax = price * taxRate;
  totAmtSold = totAmtSold + tax + price;
  totItemsSold = totItemsSold + 1;
 }


 public void getUpdatePrice(double updatePrice)
 {
  totAmtSold = totAmtSold - price - tax;
  this.price = updatePrice;
  tax = price * taxRate;
  totAmtSold = totAmtSold + tax + price;
 }


 public String getItemPurchase()
 {
  return itemPurchase;
 }

 public double getPrice()
 {
  return price;
 }

 public double getTax()
 {
  return tax;
 }

 public static void getAmt()
 {
  JOptionPane.showMessageDialog(null, " Total amount purchased = " + totAmtSold +
  "\n Number of items purchased = " + totItemsSold);
 }
}