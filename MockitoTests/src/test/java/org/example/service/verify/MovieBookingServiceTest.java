package org.example.service.verify;

import org.example.BookingDetail;
import org.example.dao.BookingDao;
import org.example.service.EmailService;
import org.example.service.MovieBookingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

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
        Mockito.verify(bookingDao).save(any(BookingDetail.class));
    }

    /**
     * Verify with times()
     */
    @Test
    void verifyWithTimesExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        bookingService.doBooking("Avengers: EndGame", 5);
        Mockito.verify(bookingDao, Mockito.times(2)).save(any(BookingDetail.class));
    }

    /**
     * Verify with atLeastOnce()
     */
    @Test
    void verifyWithAtLeastOnceExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        Mockito.verify(bookingDao, Mockito.atLeastOnce()).save(any(BookingDetail.class));
    }

    /**
     * Verify with atLeast()
     */
    @Test
    void verifyWithAtLeastExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        Mockito.verify(bookingDao, Mockito.atLeast(1)).save(any(BookingDetail.class));
    }

    /**
     * Verify with atMostOnce()
     */
    @Test
    void verifyWithAtMostOnceExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        Mockito.verify(emailService, Mockito.atMostOnce()).sendEmail();
    }

    /**
     * Verify with atMost()
     */
    @Test
    void verifyWithAtMostExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        Mockito.verify(emailService, Mockito.atMost(1)).sendEmail();
    }

    /**
     * Verify with never()
     */
    @Test
    void verifyWithNeverExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        Mockito.verify(bookingDao, Mockito.never()).getAll();
    }

    /**
     * Verify with verifyNoInteractions()
     */
    @Test
    void verifyWithNoInteractionsExample() {
        Mockito.verifyNoInteractions(bookingDao, emailService);
        bookingService.doBooking("Avatar: The Way of Water", 2);
        Mockito.verifyNoInteractions(bookingDao, emailService);
    }

    /**
     * Verify with only()
     */
    @Test
    void verifyWithOnlyExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        Mockito.verify(bookingDao, Mockito.only()).save(any(BookingDetail.class));
    }

    /**
     * Verify with inorder()
     */
    @Test
    void verifyWithInOrderExample() {
        bookingService.doBooking("Avatar: The Way of Water", 2);
        InOrder inOrder = Mockito.inOrder(bookingDao, emailService);
        inOrder.verify(emailService).sendEmail();
        inOrder.verify(bookingDao).save(any());
    }
}