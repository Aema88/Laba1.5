package doroshenko.bookstore;

public class Book_thriller extends Book {
    Book_thriller(){
        this.genre= "History";
    }

    @Override
    public void printContent() {
        System.out.println(this.getISBN()+":"+this.getGenre()+","+this.getPages()+"pp.");
    }
}
