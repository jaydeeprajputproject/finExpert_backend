package Personal.Finance.Tracking.Application.Backend.repository;

import Personal.Finance.Tracking.Application.Backend.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * Repository interface for Transaction entity.
 */
@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    public Transaction save(Transaction transaction);



}