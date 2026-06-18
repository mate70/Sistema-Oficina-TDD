# Etapa 1: Requisitos do Sistema de Oficina Mecânica

# 1. Descrição do Contexto
O sistema foi desenvolvido para modernizar a gestão de uma oficina mecânica. Ele permite controlar desde o cadastro de clientes e seus veículos até o fechamento da conta (Ordem de Serviço). O foco principal é garantir que o estoque de peças seja respeitado e que o valor final cobrado do cliente esteja sempre correto, somando serviços e peças de forma automática e segura.

# 2. Classes e Responsabilidades
Cliente: Representa o dono do veículo. Responsável por guardar nome e CPF.

Veículo: Representa o carro em manutenção. Vincula a placa e o modelo ao seu proprietário.

Peça: Controla os itens do estoque. Responsável por informar o preço e validar se há quantidade suficiente para o conserto.

Serviço: Define o tipo de trabalho realizado (ex: Mão de Obra) e seu respectivo valor.

Mecânico: Identifica o profissional responsável pela execução do trabalho.

Ordem de Serviço: É o documento central. Ela une todas as informações e calcula o valor total a ser pago.

# 3. Principais Regras de Negócio (Validadas por Testes)
Cálculo Automático: O valor total da Ordem de Serviço deve ser a soma exata de todos os serviços e peças adicionados.

Controle de Estoque: O sistema impede a venda de uma peça caso a quantidade solicitada seja maior do que a disponível no estoque.

Integridade de Dados: Não é permitido criar serviços ou peças com valores negativos, nem cadastrar clientes sem nome ou CPF.

# 4. Cenários de Erro (Exceções)
Para garantir a segurança, o sistema "trava" e avisa o erro nos seguintes casos:

Erro de Estoque: Tentativa de retirar peças que não existem.

Erro de Cadastro: Tentativa de criar cliente ou veículo com dados em branco.

Erro Financeiro: Tentativa de inserir valores negativos em serviços ou produtos.