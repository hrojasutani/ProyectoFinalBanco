package com.nttdata.banco.model.banco;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.bancodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "cars")
public class ClientModel {

    @Id
    private String id;
    private String model;
    private Integer year;
    private BigDecimal price;
    private String currency;

}
