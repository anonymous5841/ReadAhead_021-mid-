public class Fiction extends Book{

    private String genre;

    public Fiction(String ISBN, Status status, String author, String title, String genre) {
        super(ISBN, status, author, title);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void showDetails(){

        System.out.println("ISBN = " + getISBN() + "Author = " + getAuthor() +  "genre = " + genre +  "Title = " + getTitle() +  "Status = " + getStatus());
    }

    public void displayCategoryDetails(){
        showDetails();
    }
}
