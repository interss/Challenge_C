// Este arquivo define o aspecto InsufficientFundsAspect, que intercepta chamadas de saque em todas as contas e verifica se o saldo é suficiente. Caso contrário, gera um log de erro informando saldo insuficiente.

aspect InsufficientFundsAspect {
    
    pointcut withdrawOperation(): execution(* com.bank.Account.withdraw(..));

    before(): withdrawOperation() {
        Account account = (Account) thisJoinPoint.getTarget();
        double amount = (Double) thisJoinPoint.getArgs()[0];

        if (account.getBalance() < amount) {
            System.err.println("Erro: Saldo insuficiente para realizar o saque de " + amount);
        }
    }
}