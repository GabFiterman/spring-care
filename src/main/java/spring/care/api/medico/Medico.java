package spring.care.api.medico;

import jakarta.persistence.*;
import spring.care.api.endereco.Endereco;

@Table(name = "medico")
@Entity(name = "Medico")

public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded
    private Endereco endereco;

}
