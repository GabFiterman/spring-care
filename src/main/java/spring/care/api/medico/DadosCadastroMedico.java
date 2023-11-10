package spring.care.api.medico;

import spring.care.api.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String senha, String crm, Especialidade especialidade, DadosEndereco endereco) {

}
