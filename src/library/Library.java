package library;

import book.Book;

import java.util.HashMap;

public class Library {
    private HashMap<Integer, Book> library = new HashMap<>();

    public void addBooks(String title, String author, int sr_no) {
        Book book = new Book(title, author, sr_no);
        library.put(sr_no, book);
    }

    public void removeBooks(int sr_no) {
    	library.remove(sr_no);
    }
    public Boolean isAvailable(int sr_no) {
    	for(int no: library.keySet()) {
    		if(no == sr_no) {
    			return true;
    		}
    	}
    	return false;
    }
    public void printLibrary() {
        System.out.println("Library contents:");
        for (Integer sr_no : library.keySet()) {
            Book book = library.get(sr_no);
            System.out.println("Serial Number: " + sr_no +
                    ", Book Name: " + book.getTitle() +
                    ", Author: " + book.getAuthor());
//            System.out.println(library);
        }
    }
    
}
