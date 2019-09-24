package lemubit.academy.springrest.repository;
import lemubit.academy.springrest.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {

}

