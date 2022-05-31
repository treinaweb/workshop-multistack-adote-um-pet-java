package br.com.treinaweb.adoteumpet.api.adocao.dtos;

import java.math.BigDecimal;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.PropertyNamingStrategies.SnakeCaseStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import br.com.treinaweb.adoteumpet.api.pet.validators.PetExistsById;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonNaming(SnakeCaseStrategy.class)
public class AdocaoRequest {

    @Email
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String email;

    @NotNull
    @Min(10)
    @Max(100)
    private BigDecimal valor;

    @NotNull
    @Positive
    @PetExistsById
    private Long petId;

}
