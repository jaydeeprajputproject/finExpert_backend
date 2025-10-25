package Personal.Finance.Tracking.Application.Backend.model;

import jakarta.persistence.*;
import java.math.BigDecimal;

/**
 * JPA Entity mapping to the 'accounts' PostgreSQL table.
 * Note the use of @Table(name = "accounts") to match the snake_case table name.
 * We use BigDecimal for financial data accuracy.
 */
@Entity
@Table(name = "accounts")
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "account_type", nullable = false)
    private String accountType; // BANK, CREDIT_CARD, UPI_APP

    @Column(name = "current_balance")
    private BigDecimal currentBalance; // Use BigDecimal for NUMERIC type

    // --- Getters and Setters (REQUIRED by JPA/Spring) ---

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public BigDecimal getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(BigDecimal currentBalance) {
        this.currentBalance = currentBalance;
    }
}
