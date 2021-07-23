package br.com.iteris.bookingcar.integrations.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payment {

    private String id;

    private String token;

    private BigDecimal value;

}
