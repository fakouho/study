package Product;

public class Product {
	
	// 1. 필드(속성) 생성
	private String name;
	private int unitPrice;
	private int amount;
	
	
	//메서드(생성자 포함)
	public Product(String name, int unitPrice, int amount) {
		this.name = name;
		this.unitPrice = unitPrice;
		this.amount = amount;
		
	}
	
	public String getName() {
		return name;
	}
	public int getUnitPrice() {
		return unitPrice;
	}
	public int getAmount() {
		return amount;
	}
	
	

}
