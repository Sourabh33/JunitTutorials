package org.example;

import org.example.dao.DataRepository;

public class DataService {
    private final DataRepository dataRepository;

    public DataService(DataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public boolean saveData(String value) {
        return dataRepository.save(value);
    }

    public boolean hasData(String value) {
        return dataRepository.checkData(value);
    }

    public String getData(Integer index) {
        return dataRepository.get(index);
    }
}