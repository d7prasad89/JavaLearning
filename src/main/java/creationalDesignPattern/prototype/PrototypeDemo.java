package creationalDesignPattern.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {

        Registry registry = new Registry();
        Movie movie = (Movie) registry.create("Movie");
        movie.setRunTime(130);
        System.out.println(movie);

        Movie movie2 = (Movie) registry.create("Movie");
        movie2.setRunTime(130);
        System.out.println(movie2);

        Book book = (Book) registry.create("Book");
        book.setTitle("Sherlock Holmes");
        System.out.println(book);

    }
}
