package doroshenko.bookstore;

public class Book_fantasy  extends Book{
    Book_fantasy(){
        this.genre= "Fantasy";
    }

    @Override
    public void printContent() {
        System.out.println(this.getISBN()+":"+this.getGenre()+","+this.getPages()+"pp.");
    }
}
