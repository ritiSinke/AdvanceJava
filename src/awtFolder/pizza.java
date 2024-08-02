package awtFolder;

 public class pizza {
	
	String customerName;
	String pizzaSize;
	int topping;
	
	  public pizza(String customerName, int numberOfToppings, String  size) {
	        this.customerName = customerName;
	        this.topping = numberOfToppings;
	        this.pizzaSize = size;
	    }
		
	
	public void setCustomer( String Name ) {
		customerName=Name;
		
	}
	public void setSize( String  size ) {
		pizzaSize=size;
		
	}
	
	public void setTopping( int toppings) {
		topping=toppings;
	}
	
	public String getName() {
		return customerName;
	}
	public String getSize() {
		return pizzaSize;
		
	}
	public int getTopping() {
		return topping;
	}
}


