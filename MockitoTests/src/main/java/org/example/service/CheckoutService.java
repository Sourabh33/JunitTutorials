package org.example.service;

import java.math.BigDecimal;

public class CheckoutService {

    // No Option available to inject Booking Payment Processor
    // No Constructor Injection
    // No Setter Injection

    public BigDecimal checkoutMovieTicket(String movieName, String userId) {
        BookingPaymentProcessor paymentProcessor = new BookingPaymentProcessor();
        System.out.println("Getting final payment for movie: " + movieName);
        return paymentProcessor.getFinalPayment(userId, BigDecimal.TEN);
    }
}
