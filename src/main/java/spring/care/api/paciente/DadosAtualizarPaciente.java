package spring.care.api.paciente;

import jakarta.validation.constraints.NotNull;
import spring.care.api.endereco.DadosEndereco;

public record DadosAtualizarPaciente(

        @NotNull Long id,
        String nome,
        String telefone,
        String email,
        DadosEndereco endereco) {

}
