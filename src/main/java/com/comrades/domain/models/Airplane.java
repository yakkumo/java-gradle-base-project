package com.comrades.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table("airp_airplane")
public class Airplane {

    @Id
    @Column("airp_sq_airplane")
    private Integer id;

    @NotNull
    @NotEmpty(message = "The name of this Airplane cannot be empty")
    @Column("airp_tx_codigo")
    private String codigo;

    @Column("airp_tx_modelo")
    private String modelo;

    @Column("airp_qt_passageiro")
    private Integer quantidadePassageiro;

    @Column("airp_dt_registro")
    private String dataRegistro;

}
