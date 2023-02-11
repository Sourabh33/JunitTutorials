package org.example.service;

import org.example.BookingDetail;
import org.example.dao.BookingDao;

import java.util.Random;

public class MovieBookingService {
    EmailService emailService;
    BookingDao bookingDao;

    public MovieBookingService(BookingDao bookingDao, EmailService emailService) {
        this.emailService = emailService;
        this.bookingDao = bookingDao;
    }

    public void doBooking(String movieName, String theater) {
        bookingDao.save(getBookingDetail(movieName, theater));
        emailService.sendEmail();
    }

    private BookingDetail getBookingDetail(String movieName, String theater) {
        return BookingDetail.builder()
                .id(new Random().nextInt(100))
                .seatNum(String.valueOf(new Random().ints(0, 100).findAny().orElse(0)))
                .movieName(movieName)
                .theater(theater)
                .address("Address")
                .build();
    }
}
