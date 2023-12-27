package doroshenko;

import doroshenko.bookstore.Book;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        BookShelf my_bsf = BookShelf.getInstance();
        ScannerData scan = new ScannerData();
        char box;
        menu();

        while(true){
            box = scan.scan_command();

            if(box == 'C'){
                return;
            }
            else if(box == 'G'){
                for(int i=0;i<5;i++){
                    Book b=Generator.createBook();
                    my_bsf.addBook(b);
                }
                System.out.println("Успешно сгенерировано");
            }
            else if(box == 'P'){
                if(my_bsf.checkEmpty()){
                    System.out.println("Ваша полка пуста");
                }
                else{
                    my_bsf.printContent();
                }
            }
            else if(box == 'D'){
                if(my_bsf.checkEmpty()){
                    System.out.println("Ваша полка пуста");
                }
                else{
                    my_bsf.removeBook(scan.scan_isbn());
                }
            }
            else{
                System.out.println("Неизвестная команда");
            }
        }
    }

    private static void menu(){
        System.out.println("------Меню------");
        System.out.println("Чтобы сгенерировать 5 книг на вашу полку введите G");
        System.out.println("Чтобы удалить книгу, введите D");
        System.out.println("Чтобы вывести список книг на вашей полке, введите P");
        System.out.println("Чтобы закрыть программу, введите C");
    }
}
