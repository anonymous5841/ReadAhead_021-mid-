public class LibraryManager {

    Book libraryinventory[] = new Book[5];

    User users[] = new User[5];


    public void borrowBook(User user, Book b){
        users[0] = new User("Flag1","user");
        int flag = 0;
        for (int i = 0; i < libraryinventory.length ; i++) {

            if(libraryinventory[i] != null){
                if( String.valueOf(b.getStatus()) == "AVAILABLE"){
                    b.setStatus(Status.BORROWED);
                    flag =1;
                    System.out.println("book successfully borrowed");
                    for (int j = 0; j < users.length; j++) {
                        if(users[i] == null){
                            users[i] = new User(users[i].borrowedBooks = b,user.getPassword(),user.getUsername());
                            break;
                        }
                    }
                    break;
                }

            }
        }
        if(flag == 0){
            System.out.println("Sorry " + b.getTitle() + " isn't Available");
        }

    }

    public void addBook(Book b)throws NullPointerException{
        int index = 0;
        int flag = 0;
        for (int i = 0; i < libraryinventory.length ; i++){
        if(libraryinventory[i] == null){
                libraryinventory[i] = b;
                index = i;
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(" Inventory is full ");
        }
        else {
            System.out.println("Book added successfully: " + libraryinventory[index]);
        }
    }

    public void generateReport(){
        for (int i = 0; i < libraryinventory.length; i++) {
            try{
            System.out.println(libraryinventory[i].toString());
        }
            catch (NullPointerException e){
                if(libraryinventory[i] != null){
                    System.out.println(libraryinventory[i].toString());
                }
            }
        }

    }

    public void searchBook(String  s){

        int index = 0;
        for (int i = 0; i < libraryinventory.length ; i++){
            if(libraryinventory[i] != null){
                if(libraryinventory[i].getTitle().equals(s)){
                    index = i;
                    break;
                }
            }
        }
        System.out.println("Book found:" + libraryinventory[index].toString());

    }

    public void returnBook(User user, Book b){


        if( String.valueOf(b.getStatus()) == "BORROWED") {
                    b.setStatus(Status.AVAILABLE);


            for (int i = 0; i < users.length; i++) {
                if(users[i] != null){
                    if(b.equals(users[i].borrowedBooks) == true){
                        users[i].borrowedBooks = null;
                    }
                    System.out.println(b.equals(users[i].borrowedBooks));
                }
            }
            System.out.println("Book has successfully returned");
                }
        else{
            System.out.println("The book is already available");
        }

    }
}
