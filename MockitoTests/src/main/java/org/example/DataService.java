package org.example;

import java.util.List;

public class DataService {
    private final List<String> dataRepository;

    public DataService(List<String> dataRepository) {
        this.dataRepository = dataRepository;
    }

    public boolean saveData(String value) {
        return dataRepository.add(value);
    }

    public boolean hasData(String value) {
        return dataRepository.contains(value);
    }

    public String getData(Integer index) {
        return dataRepository.get(index);
    }
}