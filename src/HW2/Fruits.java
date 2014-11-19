package HW2;


public class Fruits {

	private boolean fresh;
	private String type;
	private double weight, cost;
	private int quantity;
	
	public Fruits()
	{
		fresh = true;
		type = "apple";
		weight = 1.00;
		cost = 1.00;
		quantity = 100;
	}
	
	public Fruits(boolean fresh, String type, double weight, double cost, int quantity)
	{
		this.fresh = fresh;
		this.type = type;
		this.weight = weight;
		this.cost = cost;
		this.quantity = quantity;
	}
	
	public boolean isFresh() {
		return fresh;
	}
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
