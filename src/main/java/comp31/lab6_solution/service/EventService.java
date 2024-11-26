package comp31.lab6_solution.service;

import org.springframework.stereotype.Service;

import comp31.lab6_solution.model.Event;
import comp31.lab6_solution.repositories.EventRepo;

@Service
public class EventService {

    EventRepo eventRepo;

    public EventService(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }

    public void add(Event event) {
        eventRepo.save(event);
    }

}
