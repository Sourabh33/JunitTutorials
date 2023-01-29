package org.example.service.verify;

import org.example.dao.BookingDao;
import org.example.service.EmailService;
import org.example.service.MovieBookingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class MovieBookingServiceTest {
    @Mock
    EmailService emailService;
    @Mock
    BookingDao bookingDao;
    MovieBookingService bookingService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        bookingService = new MovieBookingService(bookingDao, emailService);
    }

    /**
     * Verify with times()
     */
    @Test
    void verifyWithTimesExample() {
    }

    /**
     * Verify with atLeastOnce()
     */
    @Test
    void verifyWithAtLeastOnceExample() {
    }

    /**
     * Verify with atLeast()
     */
    @Test
    void verifyWithAtLeastExample() {
    }

    /**
     * Verify with atMostOnce()
     */
    @Test
    void verifyWithAtMostOnceExample() {
    }

    /**
     * Verify with atMost()
     */
    @Test
    void verifyWithAtMostExample() {
    }

    /**
     * Verify with never()
     */
    @Test
    void verifyWithNeverExample() {
    }

    /**
     * Verify with verifyNoInteractions()
     */
    @Test
    void verifyWithNoInteractionsExample() {
    }

    /**
     * Verify with only()
     */
    @Test
    void verifyWithOnlyExample() {
    }

    /**
     * Verify with inorder()
     */
    @Test
    void verifyWithInOrderExample() {
    }
}