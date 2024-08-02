
package awtFolder;

public class pizza {
	
	String customerName;
	int pizzaSize;
	String topping;
	
		
	
	public void setCustomer( String Name ) {
		customerName=Name;
		
	}
	public void setSize( int  size ) {
		pizzaSize=size;
		
	}
	
	public void setTopping( String toppings) {
		topping=toppings;
	}
	
	public String getName() {
		return customerName;
	}
	public int getSize() {
		return pizzaSize;
		
	}
	public String getTopping() {
		return topping;
	}
}


