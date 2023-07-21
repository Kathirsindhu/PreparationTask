package composition;

public class UseStudnet {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("kathir");
		s1.setId(1190);
		s1.setMobileno(1234567890);
		s1.setMark(100);
		System.out.println(s1.getName() + " " + s1.getId() + " " + s1.getMarks() + " " + s1.getMobileno());
	}
}
