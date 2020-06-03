package facade.facade;

import facade.entity.Account;
import facade.repository.AccountRepository;

public class BankFacade {
    private AccountRepository accountRepository = new AccountRepository();
    public void transfer(String fromAccountNumber, String toAccountNo, Long amount) {
        Account account1 = accountRepository.findById(fromAccountNumber);
        Account account2 = accountRepository.findById(toAccountNo);

        account1.setBalance(account1.getBalance() - amount);
        account2.setBalance(account2.getBalance() + amount);

        accountRepository.update(account1);
        accountRepository.update(account2);
    }
}
