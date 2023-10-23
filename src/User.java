public class User {

    Book borrowedBooks;

    private String password;

    private String username;

    public User( String password, String username) {
        this.password = password;
        this.username = username;
    }

    public User(Book borrowedBooks, String password, String username) {
        this.borrowedBooks = borrowedBooks;
        this.password = password;
        this.username = username;
    }

    public Book getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void borrowBook(Book b){

    }

    public void  returnBook(Book b1){

    }
}
