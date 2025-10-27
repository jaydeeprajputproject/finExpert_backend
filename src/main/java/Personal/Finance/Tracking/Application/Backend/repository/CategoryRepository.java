package Personal.Finance.Tracking.Application.Backend.repository;

import Personal.Finance.Tracking.Application.Backend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository interface for Category entity.
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
        List<Category> findByTransactionTypeIgnoreCase(String transactionType);

}

