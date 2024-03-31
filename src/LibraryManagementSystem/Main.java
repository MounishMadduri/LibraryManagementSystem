package LibraryManagementSystem;
import library.Library;

public class Main {

	public static void main(String[] args) {
		Library gprec = new Library();
		gprec.addBooks("kill the thought of sucide Part-1","mounish", 1011);
		gprec.addBooks("kill the thought of sucide Part-2","mounish", 1012);
		gprec.printLibrary();
		System.out.println("book with sr.no 1012 is available: "+gprec.isAvailable(1012));
		gprec.removeBooks(1012);
		System.out.println("book with sr.no 1012 is available: "+gprec.isAvailable(1012));
		gprec.printLibrary();
	}

}
