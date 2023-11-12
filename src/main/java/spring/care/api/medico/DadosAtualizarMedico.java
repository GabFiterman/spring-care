package spring.care.api.medico;

import jakarta.validation.constraints.NotNull;
import spring.care.api.endereco.DadosEndereco;

public record DadosAtualizarMedico(

        @NotNull Long id,
        String nome,
        String email,
        String telefone,
        Especialidade especialidade,
        DadosEndereco endereco) {

}
