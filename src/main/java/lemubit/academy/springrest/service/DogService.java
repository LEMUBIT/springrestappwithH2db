package lemubit.academy.springrest.service;


import lemubit.academy.springrest.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> getDogs();

    Dog getDog(long id);
}
