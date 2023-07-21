package composition;

public class UseMobile {
	public static void main(String[] args) {
		Batt b1 = new Batt();
		b1.setCapacity(4500);
		b1.setPrice(1500);
		Mobile m1 = new Mobile();
		m1.setBrand("poco");
		m1.setPrice(15000);
		m1.setBatt(b1);
		System.out.println(m1.getBrand() + " " + m1.getPrice());
		System.out.println(m1.getBatt().getCapacity() + " " + m1.getBatt().getprice());
	}
}
