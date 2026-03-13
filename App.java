public class App{

    public static void sortBooksByYear(Book[] books) {
        int num = books.length;
        for (int i=0; i<num-1; i++) {
            boolean  ok=false;
            for (int j=0; j < num - i - 1; j++) {
                if (books[j].getYear()>books[j+1].getYear()) {
                    Book temp;
                    temp=books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                    ok=true;
                }
            }
            if (!ok){
                break;
            } 
        }
    }

    public static void sortBooksByTitle(Book[] books) {
        int num=books.length;
        for (int i=0; i<num-1; i++) {
            boolean ok=false;
            for (int j=0; j<num-i-1; j++) {
                if (books[j].getTitle().compareTo(books[j+1].getTitle())>0) {
                    Book temp;
                    temp=books[j];
                    books[j]=books[j+1];
                    books[j+1]=temp;
                    ok=true;
                }
            }
            if (!ok){
                break;
            }
        }
    }

    public static void main(String[] args){

        Book b1=new Book("Flowers", 1990);
        Book b2=new Book("The animals", 2015);
        Book b3=new Book("Maths", 2020);

        Book[] books={b1,b2,b3};


        sortBooksByYear(books);
        System.out.println("Books sorted by year:");
        for (Book book : books) {
            System.out.println(book);
        }
        
    
        sortBooksByTitle(books);
        System.out.println("Books sorted by title:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}