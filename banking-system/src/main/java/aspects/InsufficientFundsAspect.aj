// This file defines the InsufficientFundsAspect aspect, which intercepts withdrawal calls on all accounts and checks if the balance is sufficient. Otherwise, it logs an error message indicating insufficient funds.
// Este arquivo define o aspecto InsufficientFundsAspect, que intercepta chamadas de saque em todas as contas e verifica se o saldo é suficiente. Caso contrário, gera um log de erro informando saldo insuficiente.

aspect InsufficientFundsAspect {
    
    // Defines a pointcut that intercepts the execution of the withdraw method in any class within the com.bank package
    // Define um pointcut que intercepta a execução do método withdraw em qualquer classe dentro do pacote com.bank
    pointcut withdrawOperation(): execution(* com.bank.Account.withdraw(..));

    // Before the execution of the withdraw method, this block of code will be executed
    // Antes da execução do método withdraw, este bloco de código será executado
    before(): withdrawOperation() {
        // Gets the instance of the account performing the withdrawal operation
        // Obtém a instância da conta que está realizando a operação de saque
        Account account = (Account) thisJoinPoint.getTarget();
        // Gets the withdrawal amount from the method arguments
        // Obtém o valor do saque a partir dos argumentos do método
        double amount = (Double) thisJoinPoint.getArgs()[0];

        // Checks if the account balance is less than the withdrawal amount
        // Verifica se o saldo da conta é menor que o valor do saque
        if (account.getBalance() < amount) {
            // If the balance is insufficient, prints an error message to the console
            // Se o saldo for insuficiente, imprime uma mensagem de erro no console
            System.err.println("Error: Insufficient funds to withdraw " + amount);
            // Erro: Saldo insuficiente para realizar o saque de " + amount);
        }
    }
}