# Spring-Care
Repositório dedicado ao aprendizado de desenvolvimento backend java, utilizando o framework SpringBoot

## Atualização deste README
### 12/11/2022

### [DESCREVER PASSO A PASSO DE BAIXAR E RODAR O PROJETO]

Neste momento tenho todo o CRUD funcional para as entidades medicos e pacientes, com regras de negócio aplicadas;
Sendo que:
- Aplicação roda na porta 8081
- Requisições dos tipos:
    - GET
    - POST
    - PUT
    - DELETE (exclusão lógica do cadastro!)
- Para os endpoints:
    - medicos
    - pacientes

Cada um com suas próprias regras e nuances.

Estou utilizando o DB postgres em localhost mesmo

**Preciso adicionar Docker ao projeto, o quanto antes**

Para rodar o projeto (ainda sem docker), preciso basicamente:
- Criar banco de dados Postgres, ``springCare``
- Estabelecer conexão padrão (puxando da env, com senha padrão salva no Bitwarden)
- Rodar o projeto e testar conexões.

----

# Próximos passos
Será muito interessante adicionar alguns elementos interessantes, por exemplo:
- Respostas às requisições
- Tratamento de erros
- Camada(s) de segurança
    - Autenticação
    - Tokens JTW