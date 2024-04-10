package com.example.olioprojekti;




import java.util.ArrayList;
import java.util.List;

public class ListGrocery {
    private static ListGrocery instance;
    private final List<Grocery> groceries;

    private ListGrocery() {
        groceries = new ArrayList<>();
    }

    public static synchronized ListGrocery getInstance() {
        if (instance == null) {
            instance = new ListGrocery();
        }
        return instance;
    }

    public void addGrocery(String name, String note, boolean important) {
        Grocery grocery = new Grocery(name, note, important);
        groceries.add(grocery);
    }

    public List<Grocery> getGroceries() {
        return groceries;
    }

}
