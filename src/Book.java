

public class Book {
    private final String nameBook;
    private final Author author;

    private int yearPublication;

    public Book(String nameBook, Author author, int yearPublication) {
        this.nameBook = nameBook;
        this.author = author;
        this.yearPublication = yearPublication;
    }


    public void setYearPublication(int yearPublication) {

        this.yearPublication = yearPublication;
    }

    public String toString() {
        return "Книга: " + this.nameBook + " | Автор: " + this.author + " | Год публикации: " + this.yearPublication;

    }

}