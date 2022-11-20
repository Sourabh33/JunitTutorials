package org.example.dao;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    private final List<String> database;

    public DataRepository() {
        this.database = new ArrayList<>();
    }

    public boolean save(String value) {
        return database.add(value);
    }

    public boolean checkData(String value) {
        return database.contains(value);
    }

    public String get(Integer index) {
        return database.get(index);
    }
}
