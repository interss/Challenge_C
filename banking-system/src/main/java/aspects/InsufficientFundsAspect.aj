// Este arquivo define o aspecto InsufficientFundsAspect, que intercepta chamadas de saque em todas as contas e verifica se o saldo é suficiente. Caso contrário, gera um log de erro informando saldo insuficiente.

aspect InsufficientFundsAspect {
    
    // Define um pointcut que intercepta a execução do método withdraw em qualquer classe dentro do pacote com.bank
    pointcut withdrawOperation(): execution(* com.bank.Account.withdraw(..));

    // Antes da execução do método withdraw, este bloco de código será executado
    before(): withdrawOperation() {
        // Obtém a instância da conta que está realizando a operação de saque
        Account account = (Account) thisJoinPoint.getTarget();
        // Obtém o valor do saque a partir dos argumentos do método
        double amount = (Double) thisJoinPoint.getArgs()[0];

        // Verifica se o saldo da conta é menor que o valor do saque
        if (account.getBalance() < amount) {
            // Se o saldo for insuficiente, imprime uma mensagem de erro no console
            System.err.println("Erro: Saldo insuficiente para realizar o saque de " + amount);
        }
    }
}