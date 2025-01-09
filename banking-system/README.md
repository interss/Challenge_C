# Sistema Bancário

Este projeto é uma implementação de um sistema bancário utilizando o paradigma de Programação Orientada a Objetos e Programação Orientada a Aspectos. O sistema permite a criação de diferentes tipos de contas bancárias e a realização de operações como depósito e saque, com verificação de saldo insuficiente através de aspectos.

## Estrutura do Projeto

O projeto possui a seguinte estrutura de diretórios:

```
banking-system
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   └── bank
│   │   │   │       ├── Account.java
│   │   │   │       ├── CheckingAccount.java
│   │   │   │       ├── SavingsAccount.java
│   │   │   │       ├── InvestmentAccount.java
│   │   │   │       └── SalaryAccount.java
│   │   │   └── aspects
│   │   │       └── InsufficientFundsAspect.aj
│   │   └── resources
│   └── test
│       └── java
│           └── com
│               └── bank
│                   └── AccountTest.java
├── pom.xml
└── README.md
```

## Descrição dos Arquivos

- **Account.java**: Define a classe base `Account`, representando uma conta bancária genérica com propriedades como saldo e métodos para depositar e sacar dinheiro.
  
- **CheckingAccount.java**: Extende a classe `Account` e implementa funcionalidades específicas para contas correntes.

- **SavingsAccount.java**: Extende a classe `Account` e implementa funcionalidades específicas para contas de poupança.

- **InvestmentAccount.java**: Extende a classe `Account` e implementa funcionalidades específicas para contas de investimento.

- **SalaryAccount.java**: Extende a classe `Account` e implementa funcionalidades específicas para contas salário.

- **InsufficientFundsAspect.aj**: Define o aspecto que intercepta chamadas de saque em todas as contas, verificando se o saldo é suficiente e gerando um log de erro em caso de saldo insuficiente.

- **AccountTest.java**: Contém testes unitários para a classe `Account` e suas subclasses, garantindo que as funcionalidades de depósito, saque e verificação de saldo estejam corretas.

- **pom.xml**: Arquivo de configuração do Maven, que define as dependências do projeto, plugins e configurações de compilação.

## Como Executar

1. Clone o repositório.
2. Navegue até o diretório do projeto.
3. Execute o comando `mvn clean install` para compilar o projeto e suas dependências.
4. Utilize um ambiente de desenvolvimento compatível para executar o projeto.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias e correções.