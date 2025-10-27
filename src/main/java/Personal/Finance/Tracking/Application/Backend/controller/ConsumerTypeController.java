// consumer_type/ConsumerTypeController.java
package Personal.Finance.Tracking.Application.Backend.controller;

import Personal.Finance.Tracking.Application.Backend.model.ConsumerType;
import Personal.Finance.Tracking.Application.Backend.repository.ConsumerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/consumer-types")
@CrossOrigin(origins = "*") // Allows requests from any origin
public class ConsumerTypeController {

    private final ConsumerTypeRepository consumerTypeRepository;

    // Spring Boot automatically injects the repository implementation
    @Autowired
    public ConsumerTypeController(ConsumerTypeRepository consumerTypeRepository) {
        this.consumerTypeRepository = consumerTypeRepository;
    }

    /**
     * Handles GET requests to /api/v1/consumer-types
     * Executes the SQL: SELECT consumer_id, consumer_name FROM consumer_types
     * Returns a List of ConsumerType objects as JSON.
     */
    @GetMapping
    public List<ConsumerType> getAllConsumerTypes() {
        // JpaRepository's findAll() method provides the implementation for your SQL query
        return consumerTypeRepository.findAll();
    }
}