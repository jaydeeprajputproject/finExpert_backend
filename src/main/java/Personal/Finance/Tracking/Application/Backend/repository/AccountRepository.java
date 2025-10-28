package Personal.Finance.Tracking.Application.Backend.repository;


import Personal.Finance.Tracking.Application.Backend.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Spring Data JPA Repository for the Account entity.
 * Provides basic CRUD operations automatically.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
    // Phase 1 MVP: findAll() is inherited
    //List<Account> findAll(Long userId);

    @Query("SELECT DISTINCT a.accountType FROM Account a")
    List<String> findDistinctByAccountType();

    List<Account> findByAccountType(String accountType);
}
