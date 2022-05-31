package br.com.treinaweb.adoteumpet.api.pet.dtos;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetRequest {

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 255)
    private String nome;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 255)
    private String historia;

    @URL
    @NotNull
    @NotEmpty
    @Size(max = 255)
    private String foto;

}
