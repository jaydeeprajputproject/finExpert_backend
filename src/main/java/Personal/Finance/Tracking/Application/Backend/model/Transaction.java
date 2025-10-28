package Personal.Finance.Tracking.Application.Backend.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "transactions")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Long transactionId;

    @Column(name = "transaction_type", nullable = false)
    private String transactionType;

    @JsonProperty("amount")
    @Column(name = "transaction_amount", nullable = false)
    private Double transactionAmount;

    @JsonProperty("date")
    @Column(name = "transaction_date", nullable = false)
    private LocalDate transactionDate;

    @Column(name = "account_name", nullable = false)
    private String accountName;

    @Column(name = "category")
    private String category;

    @JsonProperty("consumerType")
    @Column(name = "consumer_type")
    private String consumer;

    @JsonProperty("accountType")
    @Column(name = "account_type")
    private String paymentMode;

    @Column(name = "remarks")
    private String remarks;

    @Column(name = "created_at")
    private LocalDateTime createdAt = LocalDateTime.now();

    // 🔹 Constructors
    public Transaction() {}

    public Transaction(Long transactionId, String transactionType, Double transactionAmount,
                       LocalDate transactionDate, String accountName, String category,
                       String consumer, String paymentMode, String remarks, LocalDateTime createdAt) {
        this.transactionId = transactionId;
        this.transactionType = transactionType;
        this.transactionAmount = transactionAmount;
        this.transactionDate = transactionDate;
        this.accountName = accountName;
        this.category = category;
        this.consumer = consumer;
        this.paymentMode = paymentMode;
        this.remarks = remarks;
        this.createdAt = createdAt;
    }

    // 🔹 Getters and Setters
    public Long getTransactionId() { return transactionId; }
    public void setTransactionId(Long transactionId) { this.transactionId = transactionId; }

    public String getTransactionType() { return transactionType; }
    public void setTransactionType(String transactionType) { this.transactionType = transactionType; }

    public Double getTransactionAmount() { return transactionAmount; }
    public void setTransactionAmount(Double transactionAmount) { this.transactionAmount = transactionAmount; }

    public LocalDate getTransactionDate() { return transactionDate; }
    public void setTransactionDate(LocalDate transactionDate) { this.transactionDate = transactionDate; }

    public String getAccountName() { return accountName; }
    public void setAccountName(String accountName) { this.accountName = accountName; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getConsumer() { return consumer; }
    public void setConsumer(String consumer) { this.consumer = consumer; }

    public String getPaymentMode() { return paymentMode; }
    public void setPaymentMode(String paymentMode) { this.paymentMode = paymentMode; }

    public String getRemarks() { return remarks; }
    public void setRemarks(String remarks) { this.remarks = remarks; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
