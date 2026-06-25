# Sistema de Oficina Mecânica com TDD

Este projeto implementa um sistema de gerenciamento de oficina mecânica utilizando a metodologia Test-Driven Development (TDD).

## Contexto Escolhido
O sistema gerencia os serviços prestados a veículos de clientes, desde o agendamento até a conclusão.

## Evidência do ciclo TDD

### 1 - Cliente
Fase RED: o teste falhou pois a classe cliente ainda não foi criado [Fase RED](docs/img/cliente/Cliente-RED.PNG)
Fase RED: Implementação telefone em cliente [Fase Red](docs/img/cliente/Cliente-telefone-RED.PNG)

Fase GREEN: Com a implementação do Cliente.java, o teste foi um sucesso, atribuindo nome e cpf [Fase GREEN](docs/img/cliente/Cliente-GREEN.PNG)
Fase GREEN: Com a implementação do Cliente.java, o teste foi um sucesso, atribuindo nome e cpf [Fase GREEN](docs/img/cliente/Cliente-telefone-GREEN.PNG)
## Como Executar os Testes
Para executar os testes, utilize o comando:
```bash
mvn test