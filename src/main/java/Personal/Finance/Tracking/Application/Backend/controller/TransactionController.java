package Personal.Finance.Tracking.Application.Backend.controller;

import Personal.Finance.Tracking.Application.Backend.model.Transaction;
import Personal.Finance.Tracking.Application.Backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    /**
     * Adds a new transaction to the database.
     * @param transaction The transaction entity to be added.
     * @return The saved transaction entity.
     */
    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionRepository.save(transaction);
    }

    /**
     * Deletes a transaction by its ID.
     * @param id The ID of the transaction to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteTransaction(@PathVariable Long id) {
        transactionRepository.deleteById(id);
    }
}