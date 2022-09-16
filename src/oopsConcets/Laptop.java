package oopsConcets;

public class Laptop {
	private String brand;
	private int price;
	private String ram;
	Battery battery;

	public Laptop(String brand,int price,String ram,Battery battery ) {
		this.brand=brand;
		this.price=price;
		this.ram=ram;
		this.battery=battery;
	}
	public String toString() {
		return brand+","+price+","+ram+","+"BATTERY="+battery;
	}
	
}
	


