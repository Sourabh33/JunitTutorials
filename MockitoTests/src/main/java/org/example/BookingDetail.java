package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class BookingDetail {
    Integer id;
    String movieName;
    String seatNum;
    Integer numberOfTickets;
    String theater;
    String address;
}
