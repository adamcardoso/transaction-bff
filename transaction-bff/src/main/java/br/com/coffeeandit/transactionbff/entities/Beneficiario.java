package br.com.coffeeandit.transactionbff.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@ToString
public class Beneficiario implements Serializable {

    private static final long serialVersionUID = 2806421543985360625L;

    private Long CPF;
    private Long codigoBanco;
    private String agencia;
    private String conta;
    private String nomeFavorecido;
}
