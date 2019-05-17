import javax.swing.*;
public class TrackPurchases
{
	public static void main(String[] args)
	{
	 GroceryStore item1 = new GroceryStore();
	 GroceryStore item2 = new GroceryStore("Drill",75.25);
	 item2.getUpdatePrice(2.75);
	 display(item1);
	 display(item2);
	 GroceryStore.getAmt();
	}

	public static void display(GroceryStore item)
	{
	 JOptionPane.showMessageDialog(null, "Item Purchased - " +
	 item.getItemPurchase() + "\n Purchase Price - " + item.getPrice()
	 + "\n Tax Amount - " + item.getTax()
	 + "\n Item Total Price - " + (item.getPrice() + item.getTax()));
	}

}