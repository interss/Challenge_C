# 💻 Prompt for Code Development / Prompt para Desenvolvimento do Código

---

## 🎯 Context / Contexto

Develop an object-oriented banking system where:  
Desenvolva um sistema bancário orientado a objetos em que:  
1. The `Conta` class is the base class, responsible for common attributes and methods.  
   A classe `Conta` seja a classe base, responsável por atributos e métodos comuns.  
2. The `ContaPoupanca` and `ContaInvestimento` classes inherit from `Conta` and implement specific maintenance fee logic.  
   As classes `ContaPoupanca` e `ContaInvestimento` herdem de `Conta` e implementem a lógica específica de tarifa de manutenção.  

---

## 🛠️ Technical Requirements / Requisitos Técnicos

### 1. Base Class (`Conta`) / Classe Base (`Conta`)

- Must contain basic attributes: `tipoConta`, `tipoCliente`, `dataAbertura`, `saldo`.  
  Deve conter atributos básicos: `tipoConta`, `tipoCliente`, `dataAbertura`, `saldo`.  
- Abstract methods:  
  Métodos abstratos:  
  - `calculaValorTarifaManutencao()`: Must be overridden by subclasses.  
    Deve ser sobrescrito pelas subclasses.  
- Concrete methods:  
  Métodos concretos:  
  - `sacar(valor)`: Deducts the value from the balance.  
    Deduz o valor do saldo.  
  - `depositar(valor)`: Adds the value to the balance.  
    Adiciona o valor ao saldo.  

### 2. Derived Classes / Classes Derivadas

- **`ContaPoupanca`:**  
  - Implements fee calculation based on a fixed percentage of the balance.  
    Implementa o cálculo de tarifas baseado em uma porcentagem fixa do saldo.  
- **`ContaInvestimento`:**  
  - Implements fee calculation based on specific rules (e.g., fixed monthly rate).  
    Implementa o cálculo de tarifas baseado em regras específicas (ex.: taxa fixa mensal).  

### 3. Relationship / Relacionamento

- Use the principle of inheritance to avoid code duplication.  
  Utilize o princípio de herança para evitar duplicação de código.  
- The base class must be abstract.  
  A classe base deve ser abstrata.  

### 4. Tests / Testes

- Create instances of `ContaPoupanca` and `ContaInvestimento`.  
  Crie instâncias de `ContaPoupanca` e `ContaInvestimento`.  
- Perform withdrawal, deposit, and fee calculation operations.  
  Realize operações de saque, depósito e cálculo das tarifas.  

---

## 🎯 Expected Result / Resultado Esperado

- Modular and reusable code.  
  Código modular e reutilizável.  
- Practical demonstration of inheritance and polymorphism.  
  Demonstração prática de herança e polimorfismo.  
- Clear output for each operation performed.  
  Saída clara para cada operação realizada.  
