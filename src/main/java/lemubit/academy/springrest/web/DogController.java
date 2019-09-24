package lemubit.academy.springrest.web;

import lemubit.academy.springrest.entity.Dog;
import lemubit.academy.springrest.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService) {
        this.dogService = dogService;
    }

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getDogs() {
        List<Dog> dogs = dogService.getDogs();
        return new ResponseEntity<>(dogs, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id) {
        String breed = dogService.getDog(id).toString();
        return new ResponseEntity<>(breed,HttpStatus.OK);
    }
}
