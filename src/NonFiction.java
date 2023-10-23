public class NonFiction extends Book {

    private String subject;

    public NonFiction(String ISBN, Status status, String author, String title, String subject) {
        super(ISBN, status, author, title);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void showDetails() {

        System.out.println("ISBN = " + getISBN() + "Author = " + getAuthor() +  "subject = " + subject +  "Title = " + getTitle() +  "Status = " + getStatus());

    }

    public void displayCategoryDetails() {
        showDetails();
    }
}
