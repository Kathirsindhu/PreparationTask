package composition;

public class Student {
	private String name;
	private int id;
	private long mobileno;
	private int marks;

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;

	}

	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}

	public void setMark(int marks) {
		this.marks = marks;

	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;

	}

	public long getMobileno() {
		return mobileno;
	}

	public int getMarks() {
		return marks;
	}
}