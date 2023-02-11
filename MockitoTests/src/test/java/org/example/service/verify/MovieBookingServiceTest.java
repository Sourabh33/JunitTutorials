package org.example.service.verify;

import org.example.dao.BookingDao;
import org.example.service.EmailService;
import org.example.service.MovieBookingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

/**
 * Verify Examples
 * <p>
 * verifySimple
 * verifyWithTimesExample
 * verifyWithAtLeastOnceExample
 * verifyWithAtLeastExample
 * verifyWithAtMostOnceExample
 * verifyWithAtMostExample
 * verifyWithNeverExample
 * verifyWithNoInteractionsExample
 * verifyWithOnlyExample
 * verifyWithInOrderExample
 */
class MovieBookingServiceTest {
    @Mock
    EmailService emailService;
    @Mock
    BookingDao bookingDao;
    @InjectMocks
    MovieBookingService bookingService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    /**
     * Verify simple()
     */
    @Test
    public void verifySimple() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
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