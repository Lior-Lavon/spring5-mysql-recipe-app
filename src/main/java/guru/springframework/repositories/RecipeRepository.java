package guru.springframework.repositories;

import guru.springframework.models.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

// Implementing JPA SpringData Repositories
public interface RecipeRepository extends CrudRepository<Recipe, Long> {

    Optional<Recipe> findByDescription(String description);

}
