package rs.aleph.android.example25.provider;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Luke Skywalker on 09.11.2017.
 */

public class ImageProvider {

    public static List<String> getImageNames() {
        List<String> names = new ArrayList<>();
        names.add("apples.jpg");
        names.add("bananas.jpg");
        names.add("oranges.jpg");
        return names;
    }
}
