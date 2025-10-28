package Personal.Finance.Tracking.Application.Backend.controller;

import Personal.Finance.Tracking.Application.Backend.model.Transaction;
import Personal.Finance.Tracking.Application.Backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for handling operations related to financial transactions.
 */
@RestController
@RequestMapping("/api/transactions")
@CrossOrigin(origins = "*") // Allows requests from any origin
public class TransactionController {

    @Autowired
    private TransactionRepository transactionRepository;

    /**
     * Retrieves all transactions from the database.
     * @return A list of Transaction entities.
     */
    @PostMapping
    public ResponseEntity<Transaction> addTransaction(@RequestBody Transaction transaction) {
        Transaction saved = transactionRepository.save(transaction);
        return ResponseEntity.ok(saved);
    }


}