package org.example.dao;

import org.example.BookingDetail;

import java.util.ArrayList;
import java.util.List;

public class BookingDao {
    List<BookingDetail> data = new ArrayList<>();

    public void save(BookingDetail detail) {
        data.add(detail);
    }

    public List<BookingDetail> getAll() {
        return data;
    }
}
