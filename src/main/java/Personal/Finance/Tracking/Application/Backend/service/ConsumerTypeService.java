package Personal.Finance.Tracking.Application.Backend.service;

import Personal.Finance.Tracking.Application.Backend.model.ConsumerType;
import Personal.Finance.Tracking.Application.Backend.repository.ConsumerTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerTypeService {

    private  final ConsumerTypeRepository consumerTypeRepository;

    public ConsumerTypeService(ConsumerTypeRepository consumerTypeRepository) {
        this.consumerTypeRepository = consumerTypeRepository;
    }

    public List<ConsumerType> getAllConsumerTypes() {
        return consumerTypeRepository.findAll();
    }
}
