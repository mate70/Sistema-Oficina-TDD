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

### 2 - Veiculo
Fase RED: o teste falhou pois a classe Veiculo ainda não foi criada [Fase RED](docs/img/veiculo/veiculo-RED.PNG)

Fase RED: Implementação modelo e em Veiculo, teste falha novamente pois a classe não possuir os atributos declarados [Fase Red](docs/img/veiculo/veiculo-modelo-RED.PNG)

Fase GREEN: Com a implementação do Veiculo.java, o teste foi um sucesso, atribuindo placa e dono [Fase GREEN](docs/img/cliente/Cliente-GREEN.PNG)

Fase GREEN: Com a implementação dos atribuos à Veiculo.java, o teste foi um sucesso, atribuindo modelo [Fase GREEN](docs/img/veiculo/veiculo-modelo-GREEN.PNG)

### 3 - Mecanico
Fase RED: o teste falhou pois a classe mecanico ainda não foi criada [Fase RED](docs/img/mecanico/mecanico-RED.PNG)

Fase RED: Implementação nome em mecanico, teste falha novamente pois a classe não possui os atributos declarados [Fase Red](docs/img/mecanico/mecanico-matri-espe-RED.PNG)

Fase GREEN: Com a implementação do mecanico.java, o teste foi um sucesso, atribuindo nome [Fase GREEN](docs/img/mecanico/mecanico-GREEN.PNG)

Fase GREEN: Com a implementação dos atribuos à Veiculo.java, o teste foi um sucesso, atribuindo modelo [Fase GREEN](docs/img/mecanico/mecanico-matri-espe-GREEN.PNG)

### 4 - Peca
Fase RED: o teste falhou pois a classe peca ainda não foi criada com os atributos nome, quantidade e valor [Fase RED](docs/img/peca/peca-RED.PNG)

Fase RED: Implementação de regra de negocio "remover" na classe peca, teste falha novamente pois ainda não possui os atributos declarados [Fase Red](docs/img/peca/peca-remover-regra-RED.PNG)

Fase GREEN: Com a implementação do peca.java, o teste foi um sucesso, atribuindo nome, quatidade e valor [Fase GREEN](docs/img/peca/peca-GREEN.PNG)

Fase GREEN: Com a implementação de regra de negócio peca.java, o teste foi um sucesso [Fase GREEN](docs/img/peca/peca-remover-regra-GREEN.PNG)

## Como Executar os Testes
Para executar os testes, utilize o comando:
```bash
mvn test