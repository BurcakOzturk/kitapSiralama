import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Book> book = new TreeSet<>();

        book.add(new Book("Dune","Frank Herbert",712,1965));
        book.add(new Book("Sonsuzluğun Sonu","Isaac Asimov",240,1955));
        book.add(new Book("Otostopçunun Galaksi Rehberi","Douglas Adams",248,1979));
        book.add(new Book("Serenad","Zülfü Livaneli",484,2016));
        book.add(new Book("Beyoğlunun En Güzel Abisi","Ahmet Ümit",456,2013));

        System.out.println("Alfabetik Sıralama:");
        for (Book i : book){
            System.out.println("Book Name: " + i.getBookName() + " " + " Author: " +
                    i.getAuthor() + " " + " Page Number: " + i.getPageNumber() +
                    " " + " Publish Time: " + i.getPublishDate());
        }

        System.out.println("\n\nSayfa Sayısıne Göre Sıralama:");
        Set<Book> bookPage = new TreeSet<>(Comparator.comparing(Book::getPageNumber));
        bookPage.addAll(book);
        for (Book j : bookPage){
            System.out.println(" Page Number: " + j.getPageNumber() + " " + "Book Name: " + j.getBookName() +  " Author: " +
                    j.getAuthor() + " " +  " " + " Publish Time: " + j.getPublishDate());
        }


    }

}