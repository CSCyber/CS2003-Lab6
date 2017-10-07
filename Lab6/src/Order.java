public class Order {
	protected int order_num;
	protected String date;
	protected int cost;
	protected Customer purchaser;
	protected String[] items;
	
	public String[] getitems() {
		return items;
	}
	
	public int getCost() {
		return cost;
	}
	
	public int getOrderNum() {
		return order_num;
	}
	
	public String getCustomerName() {
		return purchaser.getName();
	}
	
	public String getOrderDate() {
		return date;
	}
}
