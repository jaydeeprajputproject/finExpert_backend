package Personal.Finance.Tracking.Application.Backend.controller;

import Personal.Finance.Tracking.Application.Backend.model.Category;
import Personal.Finance.Tracking.Application.Backend.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST Controller for handling operations related to categories.
 */
@RestController
@RequestMapping("/api/categories")
@CrossOrigin(origins = "*") // Allows requests from any origin
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    /**
     * Retrieves all categories from the database.
     * @return A list of Category entities.
     */
    @GetMapping
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    /**
     * Adds a new category to the database.
     * @param category The category entity to be added.
     * @return The saved category entity.
     */
    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }

    /**
     * Deletes a category by its ID.
     * @param id The ID of the category to delete.
     */
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryRepository.deleteById(id);
    }
}