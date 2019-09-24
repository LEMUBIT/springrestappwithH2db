package lemubit.academy.springrest.service;

import lemubit.academy.springrest.entity.Dog;
import lemubit.academy.springrest.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;

    @Override
    public List<Dog> getDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    @Override
    public Dog getDog(long id) {
        Optional<Dog> optionalBreed = Optional.ofNullable(dogRepository.findById(id).get());
        return optionalBreed.orElseThrow(DogNotFoundException::new);
    }

}
