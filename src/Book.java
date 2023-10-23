public abstract class Book {

    private String ISBN;

    private Status status;

    private String author;

    private String title;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Book(String ISBN, Status status, String author, String title) {
        this.ISBN = ISBN;
        this.status = status;
        this.author = author;
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public Status getStatus() {
        return status;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object obj) {
        Book b = (Book) obj;
        return this.ISBN == b.ISBN;
    }

    abstract void showDetails();

    @Override
    public String toString() {
        return "Book{ " + "ISBN= " + ISBN + ", status= " + status + ", author= " + author + ", title= " + title + "}";
    }
}
