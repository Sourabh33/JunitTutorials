package org.example.service.constructortest;

import org.example.service.BookingPaymentProcessor;
import org.example.service.CheckoutService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.MockedConstruction;
import org.mockito.Mockito;

import java.math.BigDecimal;
import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;

public class CheckoutServiceTest {

    @Test
    void testCheckoutMovieTicket() {
        try (MockedConstruction<BookingPaymentProcessor> mocked = Mockito.mockConstruction(BookingPaymentProcessor.class, (mock, context) -> {
            Mockito.when(mock.getFinalPayment(anyString(), any())).thenReturn(BigDecimal.TEN);
        })) {
//            BookingPaymentProcessor paymentProcessor = new BookingPaymentProcessor();
//            Mockito.when(paymentProcessor.getFinalPayment(anyString(), any())).thenReturn(BigDecimal.TEN);
            CheckoutService service = new CheckoutService();
            BigDecimal finalPrice = service.checkoutMovieTicket("movie name", "10");
            Assertions.assertEquals(BigDecimal.TEN, finalPrice);
        }
    }

    @Test
    void testGetMockForBookingPaymentProcessor() {
        try (MockedConstruction<BookingPaymentProcessor> mocked = Mockito.mockConstruction(BookingPaymentProcessor.class)) {
            BookingPaymentProcessor paymentProcessor = new BookingPaymentProcessor();
            Mockito.when(paymentProcessor.getFinalPayment(anyString(), any())).thenReturn(BigDecimal.TEN);
            Assertions.assertEquals(BigDecimal.TEN, paymentProcessor.getFinalPayment(anyString(), any()));
            List<BookingPaymentProcessor> constructed = mocked.constructed();
            Assertions.assertEquals(1, constructed.size());
        }
    }

    @Test
    void testGetFinalPaymentWithMultipleObjects() {
        try (MockedConstruction<BookingPaymentProcessor> mocked = Mockito.mockConstruction(BookingPaymentProcessor.class)) {
            BookingPaymentProcessor paymentProcessor1 = new BookingPaymentProcessor();
            BookingPaymentProcessor paymentProcessor2 = new BookingPaymentProcessor();

            Mockito.when(paymentProcessor1.getFinalPayment(anyString(), any())).thenReturn(BigDecimal.TEN);
            Mockito.when(paymentProcessor2.getFinalPayment(anyString(), any())).thenReturn(BigDecimal.ZERO);

            Assertions.assertEquals(BigDecimal.TEN, paymentProcessor1.getFinalPayment("10", BigDecimal.valueOf(100)));
            Assertions.assertEquals(BigDecimal.ZERO, paymentProcessor2.getFinalPayment("10", BigDecimal.valueOf(40)));

            List<BookingPaymentProcessor> constructed = mocked.constructed();
            Assertions.assertEquals(2, constructed.size());
        }
    }

    @Test
    void testGetFinalPaymentWithMockConstructionAnswers() {
        try (MockedConstruction<BookingPaymentProcessor> mocked = Mockito.mockConstructionWithAnswer(BookingPaymentProcessor.class,
                invocation -> BigDecimal.valueOf(500),
                invocation -> BigDecimal.valueOf(42))) {
            BookingPaymentProcessor paymentProcessor1 = new BookingPaymentProcessor();
            BookingPaymentProcessor paymentProcessor2 = new BookingPaymentProcessor();
            BookingPaymentProcessor paymentProcessor3 = new BookingPaymentProcessor();

//            Mockito.when(paymentProcessor1.getFinalPayment(anyString(), any())).thenReturn(BigDecimal.TEN);
//            Mockito.when(paymentProcessor2.getFinalPayment(anyString(), any())).thenReturn(BigDecimal.ZERO);

            Assertions.assertEquals(BigDecimal.valueOf(500), paymentProcessor1.getFinalPayment("10", BigDecimal.valueOf(100)));
            Assertions.assertEquals(BigDecimal.valueOf(42), paymentProcessor2.getFinalPayment("10", BigDecimal.valueOf(40)));
            Assertions.assertEquals(BigDecimal.valueOf(42), paymentProcessor3.getFinalPayment("10", BigDecimal.valueOf(40)));

        }
    }
}
