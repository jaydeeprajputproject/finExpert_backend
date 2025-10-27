// consumer_type/ConsumerType.java
package Personal.Finance.Tracking.Application.Backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

@Entity
@Table(name = "consumer_types") // Maps to the public.consumer_types table
public class ConsumerType {

    @Id // Denotes the primary key
    @Column(name = "consumer_id")
    private Long consumerId;

    @Column(name = "consumer_name")
    private String consumerName;

    // --- Constructors ---

    public ConsumerType() {
    }

    public ConsumerType(Long consumerId, String consumerName) {
        this.consumerId = consumerId;
        this.consumerName = consumerName;
    }

    // --- Getters and Setters ---

    public Long getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(Long consumerId) {
        this.consumerId = consumerId;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }
}