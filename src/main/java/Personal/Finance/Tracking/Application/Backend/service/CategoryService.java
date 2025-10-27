package Personal.Finance.Tracking.Application.Backend.service;


import Personal.Finance.Tracking.Application.Backend.model.Category;
import Personal.Finance.Tracking.Application.Backend.repository.CategoryRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getCategoriesByTransactionType(String transactionType) {
        return categoryRepository.findByTransactionTypeIgnoreCase(transactionType);
    }
}
