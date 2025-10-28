package Personal.Finance.Tracking.Application.Backend.service;

import Personal.Finance.Tracking.Application.Backend.model.Transaction;
import Personal.Finance.Tracking.Application.Backend.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    public Transaction saveTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }

}
