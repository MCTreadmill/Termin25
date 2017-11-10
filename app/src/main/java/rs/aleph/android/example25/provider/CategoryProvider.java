package rs.aleph.android.example25.provider;

import java.util.ArrayList;
import java.util.List;

import rs.aleph.android.example25.model.Category;

public class CategoryProvider {

    public static List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        categories.add(new Category(0, "Fruit"));
        categories.add(new Category(1, "Vegetable"));
        categories.add(new Category(2, "Meat"));
        categories.add(new Category(3, "Vegetarian"));
        categories.add(new Category(4, "Vegan"));
        categories.add(new Category(5, "Desert"));
        categories.add(new Category(6, "Appetizer"));
        categories.add(new Category(7, "Salad"));

        return categories;
    }
    public static List<String> getCategoryNames() {
        List<String> names = new ArrayList<>();
        names.add("Fruit");
        names.add("Vegetable");
        names.add("Meat");
        names.add("Vegetarian");
        names.add("Vegan");
        names.add("Desert");
        names.add("Appetizer");
        names.add("Salad");
        return names;
    }

    public static Category getCategoryById(int id) {
        switch (id) {
            case 0:
                return new Category(0, "Fruit");
            case 1:
                return new Category(1, "Vegetable");
            case 2:
                return new Category(2, "Meat");
            case 3:
                return new Category(3, "Vegetarian");
            case 4:
                return new Category(4, " Vegan");
            case 5:
                return new Category(5, "Desert");
            case 6:
                return new Category(6, "Appetizer");
            case 7:
                return new Category(7, "Salad");
            default:
                return null;
        }
    }
}
