package adapter;

import java.util.ArrayList;
import java.util.List;

public class AdapterApp {
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();

        list.add(new Book("Pemgoraman java", "usup"));
        list.add(new Book("Pemgoraman php", "suparma"));
        list.add(new Book("Pemgoraman Python", "eko"));

        list.add(new Screencast("Web Laravel", "Usup", 100L));
        list.add(new Screencast("Web Rails", "Rudi", 200L));
        list.add(new Screencast("Web Flask", "Ardi", 150L));

        list.forEach(item -> {
            if (item instanceof Book) {
                Book book = (Book) item;
                System.out.println(book.getTitle() + "by "+ book.getAuthor());
            } else if (item instanceof Screencast) {
                Screencast screencast = (Screencast) item;
                System.out.println(screencast.getTitle() + " by "+ screencast.getAuthor());
            }
        });

        List<CatalogAdapter> catalogAdapters = new ArrayList<>();
        catalogAdapters.add(new BookCatalogAdapter(new Book("Pemgoraman java", "usup")));
        catalogAdapters.add(new BookCatalogAdapter(new Book("Pemgoraman php", "suparma")));
        catalogAdapters.add(new BookCatalogAdapter(new Book("Pemgoraman Python", "eko")));

        catalogAdapters.add(new ScreencastCatalogAdapter(new Screencast("Web Laravel", "Usup", 100L)));
        catalogAdapters.add(new ScreencastCatalogAdapter(new Screencast("Web Rails", "Rudi", 200L)));
        catalogAdapters.add(new ScreencastCatalogAdapter(new Screencast("Web Flask", "Ardi", 150L)));

        catalogAdapters.forEach(item -> {
            System.out.println(item.getCatalogTitle());
        });
    }
}
