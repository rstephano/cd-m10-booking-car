package br.com.iteris.bookingcar.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingRequest {

    private String paymentId;

    private LocalDate begin;

    private LocalDate finish;

}
