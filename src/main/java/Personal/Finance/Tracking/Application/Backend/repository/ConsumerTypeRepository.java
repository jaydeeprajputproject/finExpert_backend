// consumer_type/ConsumerTypeRepository.java
package Personal.Finance.Tracking.Application.Backend.repository;

import Personal.Finance.Tracking.Application.Backend.model.ConsumerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// ConsumerType is the Entity and Long is the type of its primary key (consumerId)
@Repository
public interface ConsumerTypeRepository extends JpaRepository<ConsumerType, Long> {

    // You don't need to add any methods here for the basic SELECT * operation.
    // JpaRepository already provides:
    List<ConsumerType> findAll();
}