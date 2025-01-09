# Prompt para Desenvolvimento do Código

## Contexto
Desenvolva um sistema bancário orientado a objetos em que:
1. A classe `Conta` seja a classe base, responsável por atributos e métodos comuns.
2. As classes `ContaPoupanca` e `ContaInvestimento` herdem de `Conta` e implementem a lógica específica de tarifa de manutenção.

## Requisitos Técnicos
1. **Classe Base (`Conta`):**
   - Deve conter atributos básicos: `tipoConta`, `tipoCliente`, `dataAbertura`, `saldo`.
   - Métodos abstratos:
     - `calculaValorTarifaManutencao()`: Deve ser sobrescrito pelas subclasses.
   - Métodos concretos:
     - `sacar(valor)`: Deduz o valor do saldo.
     - `depositar(valor)`: Adiciona o valor ao saldo.

2. **Classes Derivadas:**
   - **`ContaPoupanca`:**
     - Implementa o cálculo de tarifas baseado em uma porcentagem fixa do saldo.
   - **`ContaInvestimento`:**
     - Implementa o cálculo de tarifas baseado em regras específicas (ex.: taxa fixa mensal).

3. **Relacionamento:**
   - Utilize o princípio de herança para evitar duplicação de código.
   - A classe base deve ser abstrata.

4. **Testes:**
   - Crie instâncias de `ContaPoupanca` e `ContaInvestimento`.
   - Realize operações de saque, depósito e cálculo das tarifas.

---

## Resultado Esperado
- Código modular e reutilizável.
- Demonstração prática de herança e polimorfismo.
- Saída clara para cada operação realizada.
