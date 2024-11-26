package comp31.lab6_solution.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import comp31.lab6_solution.model.Event;
import comp31.lab6_solution.model.EventList;

@Service
public class InitService {

    EventService eventService;

    public InitService(EventService eventService) {
        this.eventService = eventService;
    }

    public void initEvents() {
        Event event = new Event();
        event.setEventType("Jazz");
        event.setEventName("Duke Ellington");
        event.setEventLocation("Cotton Club, Harlem,NYC, NY");
        event.setEventDate(LocalDate.of(1932, 7, 7));
        eventService.add(event);

        event = new Event();

        event.setEventType("Jazz");
        event.setEventName("Benny Goodman");
        event.setEventLocation("Carnegie Hall, New York City, NY");
        event.setEventDate(LocalDate.of(1938, 1, 16));
        eventService.add(event);

        event = new Event();
        event.setEventType("Jazz");
        event.setEventName("Miles Davis Quintet");
        event.setEventLocation("Newport Jazz Festival, Newport, RI");
        event.setEventDate(LocalDate.of(1961, 8, 5));
        eventService.add(event);

        event = new Event();
        event.setEventType("Jazz");
        event.setEventName("John Coltrane Quartet");
        event.setEventLocation("Village Vanguard, New York City, NY");
        event.setEventDate(LocalDate.of(1961, 11, 5));
        eventService.add(event);

    }

}
