# 🏦 Banking System / Sistema Bancário

This project is an implementation of a banking system using the Object-Oriented Programming and Aspect-Oriented Programming paradigms. The system allows the creation of different types of bank accounts and the execution of operations such as deposits and withdrawals, with insufficient balance verification through aspects. 
 
Este projeto é uma implementação de um sistema bancário utilizando o paradigma de Programação Orientada a Objetos e Programação Orientada a Aspectos. O sistema permite a criação de diferentes tipos de contas bancárias e a realização de operações como depósito e saque, com verificação de saldo insuficiente através de aspectos.  

---

## 🗂️ Project Structure / Estrutura do Projeto

The project has the following directory structure:  
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


## 📄 File Descriptions / Descrição dos Arquivos

- **Account.java**: Defines the base class `Account`, representing a generic bank account with properties such as balance and methods for depositing and withdrawing money.  
  Define a classe base `Account`, representando uma conta bancária genérica com propriedades como saldo e métodos para depositar e sacar dinheiro.  

- **CheckingAccount.java**: Extends the `Account` class and implements specific functionalities for checking accounts.  
  Extende a classe `Account` e implementa funcionalidades específicas para contas correntes.  

- **SavingsAccount.java**: Extends the `Account` class and implements specific functionalities for savings accounts.  
  Extende a classe `Account` e implementa funcionalidades específicas para contas de poupança.  

- **InvestmentAccount.java**: Extends the `Account` class and implements specific functionalities for investment accounts.  
  Extende a classe `Account` e implementa funcionalidades específicas para contas de investimento.  

- **SalaryAccount.java**: Extends the `Account` class and implements specific functionalities for salary accounts.  
  Extende a classe `Account` e implementa funcionalidades específicas para contas salário.  

- **InsufficientFundsAspect.aj**: Defines the aspect that intercepts withdrawal calls in all accounts, checking if the balance is sufficient and generating an error log in case of insufficient funds.  
  Define o aspecto que intercepta chamadas de saque em todas as contas, verificando se o saldo é suficiente e gerando um log de erro em caso de saldo insuficiente.  

- **AccountTest.java**: Contains unit tests for the `Account` class and its subclasses, ensuring that the deposit, withdrawal, and balance verification functionalities are correct.  
  Contém testes unitários para a classe `Account` e suas subclasses, garantindo que as funcionalidades de depósito, saque e verificação de saldo estejam corretas.  

- **pom.xml**: Maven configuration file, which defines project dependencies, plugins, and build settings.  
  Arquivo de configuração do Maven, que define as dependências do projeto, plugins e configurações de compilação.  

---

## 🚀 How to Run / Como Executar

1. Clone the repository.  
   Clone o repositório.  
2. Navigate to the project directory.  
   Navegue até o diretório do projeto.  
3. Run the command `mvn clean install` to compile the project and its dependencies.  
   Execute o comando `mvn clean install` para compilar o projeto e suas dependências.  
4. Use a compatible development environment to run the project.  
   Utilize um ambiente de desenvolvimento compatível para executar o projeto.  

---

## 🤝 Contributions / Contribuições

Contributions are welcome! Feel free to open issues or pull requests for improvements and fixes.  
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests para melhorias e correções.  

Copiar

Escutar
Regerar
Continuar