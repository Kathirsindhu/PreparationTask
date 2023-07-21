package composition;

public class UseLibrary {
	public static void main(String[] arg) {
		Book b1 = new Book();
		b1.author = "maruthan";
		b1.price = 250;
		b1.publish = "maruthan publications";
		b1.title = "mavo";
		Library l1 = new Library();
		l1.book = b1;
		l1.location = "chennai";
		l1.rack = 30;
		l1.isNewsPaper = true;
		System.out.println(l1.book.author + " " + l1.book.title + " " + l1.book.price + " " + l1.book.publish );
	}
}
