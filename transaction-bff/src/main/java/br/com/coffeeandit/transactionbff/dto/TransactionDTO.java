package br.com.coffeeandit.transactionbff.dto;

import br.com.coffeeandit.transactionbff.dto.enums.SituacaoEnum;
import br.com.coffeeandit.transactionbff.dto.enums.TipoTransacao;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode(of = "uuid")
public class TransactionDTO {

    @Schema(description = "Código de identificação da transação")
    private UUID uuid;
    @Schema(description = "Valor da transação")
    @NotNull(message = "Informar o valor da transação")
    private BigDecimal valor;
    @Schema(description = "Data/hora/minuto e segundo da transação")
    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime data;
    @NotNull(message = "Informar a conta de origem da transação")
    @Schema(description = "Conta de origem da transação")
    @Valid
    private ContaDTO contaDTO;
    @Schema(description = "Beneficiário da transação")
    @Valid
    private BeneficiarioDTO beneficiario;
    @NotNull(message = "Informar o tipo da transação")
    @Schema(description = "Tipo de transação")
    private TipoTransacao tipoTransacao;
    @Schema(description = "Situação da transação")
    private SituacaoEnum situacao;
}
