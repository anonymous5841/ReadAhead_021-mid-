public class Main {
    public static void main(String[] args) {

        LibraryManager libraryManager = new LibraryManager();

        libraryManager.addBook(new Fiction("001A", Status.AVAILABLE , "Maria", "Clean Code" , "Coding"));
        libraryManager.addBook(new Fiction("002A", Status.AVAILABLE , "Tom", "Cracking the Coding Interview" , "Coding"));
        libraryManager.addBook(new Fiction("003A", Status.AVAILABLE , "Edison", "The pragmatic programmer" , "Coding"));

        System.out.println("====  ADD A BOOK =====");
        libraryManager.addBook(new Fiction("003A", Status.AVAILABLE , "Edison", "YOU DONT KNOW JS" , "Coding"));

        System.out.println("====  SEARCH FOR A BOOK =====");
        libraryManager.searchBook( "Clean Code");

        System.out.println("====  BORROW  A BOOK =====");
        libraryManager.borrowBook(new User("Flag1","user" ),new Fiction("003A", Status.AVAILABLE , "Edison", "YOU DONT KNOW JS" , "Coding"));


        System.out.println("====  RETURN A BORROW  A BOOK =====");
        libraryManager.returnBook(new User("Flag1","user" ),new Fiction("002A", Status.AVAILABLE , "Tom", "Cracking the Coding Interview" , "Coding"));

        System.out.println("====  GENERATE REPORT =====");
                libraryManager.generateReport();
    }
}