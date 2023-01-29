package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class BookingDetail {
    Integer id;
    String movieName;
    String seatNum;
    String theater;
    String address;
}
