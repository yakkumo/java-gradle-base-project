package com.comrades.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("busi_bus_line")
public class BusLine {

    @Id
    @Column("busi_sq_bus_line")
    private Integer id;

    @NotNull
    @Column("busi_tx_code")
    private String codigo;

    @Column("busi_tx_name")
    private String nome;

}
