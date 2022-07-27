package it2.develhope.Angelo.APISpringRepositories01.repositories;

import it2.develhope.Angelo.APISpringRepositories01.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//defines a repository for the cars
@RepositoryRestResource
public interface CarRepository extends JpaRepository<Car, Long> {
}
