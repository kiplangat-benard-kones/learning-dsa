package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author bkones
 */
public class ListToMap {

    public static void main(String[] args) {
        List<Hosting> list = new ArrayList<>();

        list.add(new Hosting(1, "amazon.com", 20000));
        list.add(new Hosting(2, "google.com", 80000));
        list.add(new Hosting(3, "facebook.com", 60000));
        list.add(new Hosting(4, "twitter.com", 100000));
        list.add(new Hosting(5, "quora.com", 200000));

        Map<String, Long> results1 = list.stream()
                .collect(Collectors.toMap(Hosting::getWebsites, Hosting::getAmount));
        System.out.println("" + results1);
        
        List<Hosting> list2 = new ArrayList<>();
        list2.add(new Hosting(1, "amazon.com", 20000));
        list2.add(new Hosting(2, "google.com", 80000));
        list2.add(new Hosting(3, "facebook.com", 60000));
        list2.add(new Hosting(4, "twitter.com", 100000));
        list2.add(new Hosting(5, "google.com", 200000));
        /**
         * if duplicate key
         */
        Map<String, Long> results = list2.stream()
                .collect(Collectors.toMap(Hosting::getWebsites, Hosting::getAmount, (oldKey, newKey) -> oldKey));
        System.out.println("" + results);
    }
}

class Hosting {

    private int Id;
    private String websites;
    private long amount;

    public Hosting(int Id, String websites, long amount) {
        this.Id = Id;
        this.websites = websites;
        this.amount = amount;

    }

    public int getId() {
        return Id;
    }

    public String getWebsites() {
        return websites;
    }

    public long getAmount() {
        return amount;
    }

}
