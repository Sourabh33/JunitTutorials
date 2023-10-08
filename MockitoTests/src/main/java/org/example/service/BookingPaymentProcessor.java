package org.example.service;

import java.math.BigDecimal;

public class BookingPaymentProcessor {
    private final boolean allowAnotherCurrency;
    private final String typeOfPayment;
    private final Double tax;

    public BookingPaymentProcessor() {
        this(Boolean.FALSE, "DEBIT", 2.90);
    }

    public BookingPaymentProcessor(String typeOfPayment, Double tax) {
        this(Boolean.FALSE, typeOfPayment, tax);
    }

    public BookingPaymentProcessor(boolean allowAnotherCurrency, String typeOfPayment, Double tax) {
        this.allowAnotherCurrency = allowAnotherCurrency;
        this.typeOfPayment = typeOfPayment;
        this.tax = tax;
    }

    public BigDecimal getFinalPayment(String userId, BigDecimal priceOfTicket) {
        System.out.println(this.allowAnotherCurrency + " " + this.typeOfPayment + " " + this.tax);
        System.out.println("About to charge user: " + userId);
        return BigDecimal.ZERO;
    }
}
