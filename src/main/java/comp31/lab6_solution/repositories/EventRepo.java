package comp31.lab6_solution.repositories;

import org.springframework.data.repository.ListCrudRepository;

import comp31.lab6_solution.model.Event;

public interface EventRepo extends ListCrudRepository<Event, Integer> {

}
