package Personal.Finance.Tracking.Application.Backend.controller;



import Personal.Finance.Tracking.Application.Backend.model.Account;
import Personal.Finance.Tracking.Application.Backend.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for handling operations related to financial accounts.
 */
@RestController
@RequestMapping("/api/accounts")
@CrossOrigin(origins = "*") // FIX: Allows requests from the React development server (on a different port)
public class AccountController {

    @Autowired
    private AccountRepository accountRepository;

    /**
     * Retrieves all accounts from the database.
     * @return A list of Account entities.
     */
    @GetMapping
    public List<Account> getAllAccounts() {
        // Find all accounts using the JpaRepository
        return accountRepository.findAll();
    }

    @GetMapping("/account-types")
    public  List<String> getDistinctAccountTypes() {
        return accountRepository.findDistinctByAccountType();
    }

    @GetMapping("/by-type")
    public ResponseEntity<List<Account>> getAccountsByType(@RequestParam String accountType) {
        return ResponseEntity.ok(accountRepository.findByAccountType(accountType));
    }
}
