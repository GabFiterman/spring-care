package spring.care.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import spring.care.api.paciente.DadosCadastroPaciente;
import spring.care.api.paciente.DadosListagemPaciente;
import spring.care.api.paciente.Paciente;
import spring.care.api.paciente.PacienteRepository;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;
    
    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public List<DadosListagemPaciente> listar() {
        return repository.findAll().stream()
                .map(DadosListagemPaciente::new)
                .toList();
    }
}
