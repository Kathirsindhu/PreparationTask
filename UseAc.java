package composition;

public class UseAc {
	public static void main(String[] args) {
		Comp c1 = new Comp();
		c1.setCapacity(25);
		c1.setWarrenty(30);
		Ac a1 = new Ac();
		a1.setBrand("croma");
		a1.setColor("white");
		a1.setComp(c1);
		a1.setPrice(25000);
		System.out.println(a1.getBrand() + " " + a1.getcolor() + " " + a1.getPrice());
		System.out.println(a1.getCompr().getCapacity() + " " + a1.getCompr().getWarrenty());
	}
}
