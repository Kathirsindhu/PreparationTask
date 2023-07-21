package composition;

public class Mobile {
	private String brand;
	private int price;
	private Batt batte;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setBatt(Batt batte) {
		this.batte = batte;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public Batt getBatt() {
		return batte;
	}
}
