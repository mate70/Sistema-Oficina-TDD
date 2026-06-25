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

### 5 - Servico
Fase RED: o teste falhou pois a classe servico ainda não foi criada com os atributos nome e valor [Fase RED](docs/img/servico/servico-RED.PNG)

Fase RED: Implementação de regra de negocio "não pode valor negativo" na classe, teste falha novamente pois ainda não possui os atributos declarados [Fase Red](docs/img/peca/peca-remover-regra-RED.PNG)
git
Fase GREEN: Com a implementação do servico.java, o teste foi um sucesso, atribuindo nome e valor [Fase GREEN](docs/img/servico/servico-GREEN.PNG)

Fase GREEN: Com a implementação de regra de negócio servico.java, o teste foi um sucesso [Fase GREEN](docs/img/peca/peca-remover-regra-GREEN.PNG)

### 6 - Ordem de Serviço
Fase RED: o teste falhou pois a classe Ordem de Serviço ainda não foi criada com os atributos Cliente, Mecanico e Veiculo [Fase RED](docs/img/OS/OS-RED.PNG)

Fase RED: Implementação para Calcular os valores do serivoço e peca, e calcular o valor, teste falha novamente pois ainda não possui os atributos declarados [Fase Red](docs/img/OS/OS-calcula-servico-peca-RED.PNG)
git
Fase GREEN: Com a implementação do OrdemServico.java, o teste foi um sucesso, atribuindo cliente, mecanico e veiculo [Fase GREEN](docs/img/OS/OS-GREEN.PNG)

Fase GREEN: Com a implementação dos atributos calcular, servico e peca na classe OrdemServico.java, o teste foi um sucesso [Fase GREEN](docs/img/OS/OS-calcula-servico-peca-GREEN.PNG)



## Como Executar os Testes
Para executar os testes, utilize o comando:
```bash
mvn test
```
##  Estrutura de Pastas do Projeto
```
sistema-oficina-tdd/
├── src/
│   ├── main/java/oficina/          # Códigos de produção do sistema
│   │   ├── Cliente.java
│   │   ├── Veiculo.java
│   │   ├── Mecanico.java
│   │   ├── Peca.java
│   │   ├── Servico.java
│   │   └── OrdemServico.java
│   └── test/java/oficina/          # Suítes de testes unitários (JUnit 5)
│       ├── ClienteTest.java
│       ├── VeiculoTest.java
│       ├── MecanicoTest.java
│       ├── PecaTest.java
│       ├── ServicoTest.java
│       └── OrdemServicoTest.java
├── docs/img/                       # Evidências dos testes (Prints)
└── pom.xml                         # Configurações do Maven e Dependências
```