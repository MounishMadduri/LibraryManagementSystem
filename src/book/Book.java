package book;


public class Book {
    private String title;
    private String author;
    private int sr_no;

    public Book(String title, String author, int sr_no) {
        this.title = title;
        this.author = author;
        this.sr_no = sr_no;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getSr_no() {
        return sr_no;
    }

}

