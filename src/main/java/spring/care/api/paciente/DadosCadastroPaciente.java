package spring.care.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import spring.care.api.endereco.DadosEndereco;

public record DadosCadastroPaciente(

        @NotBlank String nome,
        @NotBlank String email,
        @NotBlank String telefone,
        @NotBlank String cpf,
        @NotNull @Valid DadosEndereco endereco) {

}
