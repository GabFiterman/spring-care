package spring.care.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import spring.care.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        System.out.println(dados);
    }
}

