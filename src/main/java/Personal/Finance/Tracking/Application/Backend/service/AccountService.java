package Personal.Finance.Tracking.Application.Backend.service;

import Personal.Finance.Tracking.Application.Backend.model.Account;
import Personal.Finance.Tracking.Application.Backend.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    List<String> findDistinctByAccountType() {
        // Implementation will go here
        return accountRepository.findDistinctByAccountType();
    }

    List<Account> findByAccountType(String accountType) {
        // Implementation will go here
        return accountRepository.findByAccountType(accountType);
    }
}
