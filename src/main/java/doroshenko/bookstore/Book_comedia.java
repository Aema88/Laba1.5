package doroshenko.bookstore;

public class Book_comedia  extends Book{
    private boolean color;
    Book_comedia(){
        this.genre= "Comedia book";
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    @Override
    public void printContent() {
        System.out.println(this.getISBN()+": color print ["+this.color+"], "+this.getGenre()+","+this.getPages()+"pp.");
    }
}
