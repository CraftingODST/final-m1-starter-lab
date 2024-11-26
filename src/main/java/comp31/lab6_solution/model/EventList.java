package comp31.lab6_solution.model;

// import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EventList extends ArrayList<Event> {

    static int nextIndex = 1;

    @Autowired
    EventTypes eventTypes;

    public EventList() {

        super();
        System.err.println(">>> Constructor: " + nextIndex);
    }

    @Override
    public boolean add(Event e) {
        // e.setEventType(eventTypes.getRandomType());
        // e.setEventName("Event " + nextIndex);
        e.setEventId(1000 + nextIndex++);
        return super.add(e);
    }
}
