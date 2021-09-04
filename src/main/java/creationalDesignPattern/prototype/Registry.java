package creationalDesignPattern.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item create(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }


    private void loadItems() {
        Book book = new Book();
        book.setPages(200);
        book.setPrice(100);
        book.setTitle("Cleancode");
        items.put("Book", book);

        Movie movie = new Movie();
        movie.setPrice(100);
        movie.setTitle("Abraham Lincoln");
        movie.setRunTime(120);
        items.put("Movie", movie);
    }
}
