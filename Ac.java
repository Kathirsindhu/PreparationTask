package composition;

public class Ac {
	private String brand;
	private int price;
	private String color;
	private Comp compr;

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setComp(Comp compr) {
		this.compr = compr;
	}

	public String getBrand() {
		return brand;
	}

	public int getPrice() {
		return price;
	}

	public String getcolor() {
		return color;
	}

	public Comp getCompr() {
		return compr;
	}
}
