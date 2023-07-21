package composition;

public class UseCar {
	public static void main(String[] args) {
		Engine e1 = new Engine();
		e1.piston = 8;
		e1.price = 27000;
		e1.hp = 140;
		e1.type = "flat";
		Car c1 = new Car();
		c1.brand = "benz";
		c1.price = 500000;
		c1.color = "green";
		c1.engine= e1;
		System.out.println(c1.engine.piston+" "+c1.engine.price);
	}

}
